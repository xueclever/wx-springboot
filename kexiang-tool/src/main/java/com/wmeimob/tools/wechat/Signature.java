package com.wmeimob.tools.wechat;

import com.wmeimob.tools.XmlUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * User: rizenguo
 * Date: 2014/10/29
 * Time: 15:23
 */
public class Signature {

    private String key;
    private static Signature signature;

    private Signature() {
    }

    public static Signature getInstance(String key) {
        if (signature == null) {
            signature = new Signature();
        }
        signature.key = key;
        return signature;
    }


    private static Logger logger = LoggerFactory.getLogger(Signature.class);

    /**
     * 签名算法
     *
     * @param o 要参与签名的数据对象
     * @return 签名
     * @throws IllegalAccessException
     */
    public String getSign(Object o) throws IllegalAccessException {
        ArrayList<String> list = new ArrayList<String>();
        Class<? extends Object> cls = o.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            if (f.get(o) != null && f.get(o) != "") {
                list.add(f.getName() + "=" + f.get(o) + "&");
            }
        }
        int size = list.size();
        String[] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        result += "key=" + key;
        logger.info("Sign Before MD5:" + result);
        result = DigestUtils.md5Hex(result).toUpperCase();
        logger.info("Sign Result:" + result);
        return result;
    }

//    public  String getSign(Map<String,Object> map){
//        ArrayList<String> list = new ArrayList<String>();
//        for(Map.Entry<String,Object> entry:map.entrySet()){
//            if(entry.getValue()!=""){
//                list.add(entry.getKey() + "=" + entry.getValue() + "&");
//            }
//        }
//        int size = list.size();
//        String [] arrayToSort = list.toArray(new String[size]);
//        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < size; i ++) {
//            sb.append(arrayToSort[i]);
//        }
//        String result = sb.toString();
//        result += "key=" + key;
//        logger.info("Sign Before MD5:" + result);
//        result = DigestUtils.md5Hex(result).toUpperCase();
//        logger.info("Sign Result:" + result);
//        return result;
//    }

    public String getSign(Map<String, Object> map) {
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!entry.getValue().equals("")) {
                list.add(entry.getKey() + "=" + entry.getValue() + "&");
            }
        }
        int size = list.size();
        String[] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        result += "key=" + key;
        logger.info("Sign Before MD5:" + result);
        result = DigestUtils.md5Hex(result).toUpperCase();
        logger.info("Sign Result:" + result);
        return result;
    }

    public String getSign(TreeMap<String, String> treeMap) {
        StringBuffer sb = new StringBuffer();
        for (String k : treeMap.keySet()) {
            sb.append(k);
            sb.append("=");
            sb.append(treeMap.get(k));
            sb.append("&");
        }
        sb.append("key=").append(key);
        logger.info("Sign Before MD5:" + sb);
        String sign = DigestUtils.md5Hex(sb.toString()).toUpperCase();
        logger.info("Sign Result:" + sign);
        return sign;
    }

    /**
     * 从API返回的XML数据里面重新计算一次签名
     *
     * @param responseString API返回的XML数据
     * @return 新鲜出炉的签名
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    public String getSignFromResponseString(String responseString) throws Exception {
        Map<String, Object> map = XmlUtil.readStringXmlOut(responseString);
        //清掉返回数据对象里面的Sign数据（不能把这个数据也加进去进行签名），然后用签名算法进行签名
        map.put("sign", "");
        //将API返回的数据根据用签名算法进行计算新的签名，用来跟API返回的签名进行比较
        return getSign(map);
    }


    /**
     * 检验API返回的数据里面的签名是否合法，避免数据在传输的过程中被第三方篡改
     *
     * @param responseString API返回的XML数据字符串
     * @return API签名是否合法
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    public boolean checkIsSignValidFromResponseString(String responseString) throws Exception {
        logger.info("验证签名串：\n" + responseString);
        Map<String, Object> map = XmlUtil.readStringXmlOut(responseString);
        logger.info(map.toString());
        String signFromAPIResponse = map.get("sign").toString();
        if (signFromAPIResponse == "" || signFromAPIResponse == null) {
            logger.error("API返回的数据签名数据不存在，有可能被第三方篡改!!!");
            return false;
        }
        logger.info("服务器回包里面的签名是:" + signFromAPIResponse);
        //清掉返回数据对象里面的Sign数据（不能把这个数据也加进去进行签名），然后用签名算法进行签名
        map.put("sign", "");
        //将API返回的数据根据用签名算法进行计算新的签名，用来跟API返回的签名进行比较
        String signForAPIResponse = getSign(map);

        if (!signForAPIResponse.equals(signFromAPIResponse)) {
            //签名验不过，表示这个API返回的数据有可能已经被篡改了
            logger.error("API返回的数据签名验证不通过，有可能被第三方篡改!!!");
            return false;
        }
        logger.info("恭喜，API返回的数据签名验证通过!!!");
        return true;
    }

}
