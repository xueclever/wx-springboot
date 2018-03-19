package com.wmeimob.tools.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shinez on 2017/1/19.
 */
public class RequestResponseTools {

    public static void cleanResponse(HttpServletResponse response) throws IOException {
        response.getWriter().flush();
        response.getWriter().close();
    }

    public static Map<String, String> convertRequestMap(Map<String, String[]> requestMap) {
        Map<String, String> map = new HashMap<>();
        Map.Entry entry;
        String key;
        Object valueObj;
        for (Object o : requestMap.entrySet()) {
            entry = (Map.Entry) o;
            key = (String) entry.getKey();
            valueObj = entry.getValue();
            map.put(key, ((String[]) valueObj)[0]);
        }
        return map;
    }

    public static Map<String, String> convertRequestMap(String queryString) {
        if (queryString==null)
            return null;
        String[] params = queryString.split("&");
        if (params.length>0) {
            Map<String, String> paramMap = new HashMap<>();
            String[] keyValueArray;
            for (String keyValue:params){
                keyValueArray = keyValue.split("=");
                paramMap.put(keyValueArray[0],keyValueArray[1]);
            }
            return paramMap;
        }
        return null;
    }

    /***
     * 获取 request 中 json 字符串的内容
     *
     * @param request
     * @return : <code>byte[]</code>
     * @throws IOException
     */
    public static String getRequestJsonString(HttpServletRequest request)
            throws IOException {
        String submitMehtod = request.getMethod();
        // GET
        if (submitMehtod.equals("GET")) {
            return new String(request.getQueryString().getBytes("iso-8859-1"),"utf-8").replaceAll("%22", "\"");
            // POST
        } else {
            return getRequestPostStr(request);
        }
    }

    /**
     * 描述:获取 post 请求的 byte[] 数组
     * <pre>
     * 举例：
     * </pre>
     * @param request
     * @return
     * @throws IOException
     */
    public static byte[] getRequestPostBytes(HttpServletRequest request)
            throws IOException {
        int contentLength = request.getContentLength();
        if(contentLength<0){
            return null;
        }
        byte buffer[] = new byte[contentLength];
        for (int i = 0; i < contentLength;) {

            int readlen = request.getInputStream().read(buffer, i,
                    contentLength - i);
            if (readlen == -1) {
                break;
            }
            i += readlen;
        }
        return buffer;
    }

    /**
     * 描述:获取 post 请求内容
     * <pre>
     * 举例：
     * </pre>
     * @param request
     * @return
     * @throws IOException
     */
    public static String getRequestPostStr(HttpServletRequest request)
            throws IOException {
        byte buffer[] = getRequestPostBytes(request);
        String charEncoding = request.getCharacterEncoding();
        if (charEncoding == null) {
            charEncoding = "UTF-8";
        }
        return new String(buffer, charEncoding);
    }

}
