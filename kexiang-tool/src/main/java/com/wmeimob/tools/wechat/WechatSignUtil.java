package com.wmeimob.tools.wechat;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class WechatSignUtil {
    // 与接口配置信息中的Token要一致

    /**
     * 验证签名
     *
     * @param signature
     * @param timestamp
     * @param nonce
     * @return
     */
    public static boolean checkSignature(String token, String signature, String timestamp, String nonce) {
        String[] arr = new String[]{token, timestamp, nonce};
        // 将token、timestamp、nonce三个参数进行字典序排序
        try {
            Arrays.sort(arr);
            StringBuilder content = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                content.append(arr[i]);
            }
            MessageDigest md = null;
            String tmpStr = null;

            try {
                md = MessageDigest.getInstance("SHA-1");
                // 将三个参数字符串拼接成一个字符串进行sha1加密
                byte[] digest = md.digest(content.toString().getBytes());
                tmpStr = byteToStr(digest);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }

            content = null;
            // 将sha1加密后的字符串可与signature对比，标识该请求来源于微信
            return tmpStr != null ? tmpStr.equals(signature.toUpperCase()) : false;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 将字节数组转换为十六进制字符串
     *
     * @param byteArray
     * @return
     */
    private static String byteToStr(byte[] byteArray) {
        String strDigest = "";
        for (int i = 0; i < byteArray.length; i++) {
            strDigest += byteToHexStr(byteArray[i]);
        }
        return strDigest;
    }

    /**
     * 将字节转换为十六进制字符串
     *
     * @param mByte
     * @return
     */
    private static String byteToHexStr(byte mByte) {
        char[] Digit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] tempArr = new char[2];
        tempArr[0] = Digit[(mByte >>> 4) & 0X0F];
        tempArr[1] = Digit[mByte & 0X0F];

        String s = new String(tempArr);
        return s;
    }
    public static String SHA1(String decript) throws NoSuchAlgorithmException {
        MessageDigest digest =MessageDigest.getInstance("SHA-1");
        byte[] messageDigest = digest.digest(decript.getBytes());
        String result = byteToStr(messageDigest);
        return result;

    }



    public static void main(String[] args) {
//    	String shastr = WechatSignUtil.SHA1("U00QUfV1CRfIIU0NkcUCnA=="+ "258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
//    	System.out.println(shastr);
    }
}
