package com.wmeimob.tools;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @User: Lying
 * @Date: 2014/7/11
 * @Time: 15:40
 */
public class XmlUtil {

    public static String map2XmlString(Map<String, Object> map) {
        String xmlResult = "";
        StringBuffer sb = new StringBuffer();
        sb.append("<xml>");
        for (String key : map.keySet()) {
            String value = "<![CDATA[" + map.get(key) + "]]>";
            sb.append("<" + key + ">" + value + "</" + key + ">");
        }
        sb.append("</xml>");
        xmlResult = sb.toString();
        return xmlResult;
    }

    /**
     * @description 将xml字符串转换成map
     * @param xml
     * @return Map
     */
    public static Map<String, Object> readStringXmlOut(String xml) throws DocumentException {
        Map<String, Object> map = new HashMap<String, Object>();
        Document doc = null;
            doc = DocumentHelper.parseText(xml); // 将字符串转为XML
            Element rootElt = doc.getRootElement(); // 获取根节点
            @SuppressWarnings("unchecked")
            List<Element> list = rootElt.elements();// 获取根节点下所有节点
            for (Element element : list) { // 遍历节点
                map.put(element.getName(), element.getText()); // 节点的name为map的key，text为map的value
            }
        return map;
    }



}
