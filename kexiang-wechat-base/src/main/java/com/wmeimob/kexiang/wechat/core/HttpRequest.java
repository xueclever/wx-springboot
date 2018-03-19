package com.wmeimob.kexiang.wechat.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.JsonObject;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HttpRequest {
	 /**
     * 向指定URL发送GET方法的请求
     * 
     * @param url
     *            发送请求的URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static JSONObject sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try {
			return new JSONObject(result);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
    
    /**
     * 向指定 URL 发送POST方法的请求
     * 
     * @param url
     *            发送请求的 URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, String param) {
    	 System.out.println(param); 
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！"+e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return result;
    }    
    
    
    public static String string2Unicode(String string) {
    	 
        StringBuffer unicode = new StringBuffer();
     
        for (int i = 0; i < string.length(); i++) {
     
            // 取出每一个字符
            char c = string.charAt(i);
     
            // 转换为unicode
            unicode.append("\\u" + Integer.toHexString(c));
        }
     
        return unicode.toString();
    }
    
    /** 
     * 发送HttpPost请求 
     *  
     * @param strURL 
     *            服务地址 
     * @param params 
     *            json字符串,例如: "{ \"id\":\"12345\" }" ;其中属性名必须带双引号<br/> 
     * @return 成功:返回json字符串<br/> 
     */  
    public static String post(String strURL, String params) {  
        System.out.println(strURL);  
        System.out.println(params); 
        OutputStreamWriter out = null;
        BufferedReader  in = null;
        String result = "";
        try {  
            URL url = new URL(strURL);// 创建连接  
            HttpURLConnection connection = (HttpURLConnection) url  
                    .openConnection();  
            connection.setDoOutput(true);  
            connection.setDoInput(true);  
            connection.setUseCaches(false);  
            connection.setInstanceFollowRedirects(true);  
            connection.setRequestMethod("POST"); // 设置请求方式  
            connection.setRequestProperty("Accept", "application/json"); // 设置接收数据的格式  
            connection.setRequestProperty("Content-Type", "application/json"); // 设置发送数据的格式  
            connection.connect();  
            out = new OutputStreamWriter(  
                    connection.getOutputStream(), "UTF-8"); // utf-8编码  
            out.append(params);  
            out.flush();  
            out.close();  
            // 读取响应 
            in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } 
        
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return result; // 自定义错误信息  
    }  
    
    
    public static String sendPost1(String url,String param) {
    	OkHttpClient client = new OkHttpClient();
    	System.out.println(param);
    	MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
    	RequestBody body = RequestBody.create(mediaType, param);
    	Request request = new Request.Builder()
    	  .url(url)
    	  .post(body)
    	  .addHeader("Content-Type", "application/x-www-form-urlencoded")
    	  .addHeader("Cache-Control", "no-cache")
    	  .addHeader("Postman-Token", "d981cb76-5b99-173e-ef6f-2d16e3ee7b84")
    	  .build();

    	Response response = null;
		try {
			response = client.newCall(request).execute();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			return response.body().string();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
    
    public static void main(String[] args) {
    	String url = "http://sstest.consignor.com/ship/ShipmentServerModule.dll";
    	String param = "actor=63&command=GetProducts&key=sample";
    	JSONObject json = new JSONObject(sendPost(url, param)); 
    	System.out.println(new JSONArray(json.get("Carriers")));
    	
    	
    	/*String option = null;
    	String dta = null;
    	option = "{\"Label\":\"none\"}";
    	dta = "{\r\n" + 
    			"    \"Kind\": 1,\r\n" + 
    			"    \"ActorCSID\": 63,\r\n" + 
    			"    \"ProdConceptID\": 1032,\r\n" + 
    			"    \"Addresses\": [\r\n" + 
    			"        {\r\n" + 
    			"            \"Kind\": 2,\r\n" + 
    			"            \"Name1\": \"Test Sender\",\r\n" + 
    			"            \"Street1\": \"Test address 1\",\r\n" + 
    			"            \"Street2\": \"Test address  2\",\r\n" + 
    			"            \"PostCode\": \"0580\",\r\n" + 
    			"            \"City\": \"OSLO\",\r\n" + 
    			"            \"CountryCode\": \"NO\"\r\n" + 
    			"        },\r\n" + 
    			"        {\r\n" + 
    			"            \"Kind\": 1,\r\n" + 
    			"            \"Name1\": \"John Doe\",\r\n" + 
    			"            \"Street1\": \"Test address 1\",\r\n" + 
    			"            \"Street2\": \"Test address 2\",\r\n" + 
    			"            \"PostCode\": \"0580\",\r\n" + 
    			"            \"City\": \"OSLO\",\r\n" + 
    			"            \"CountryCode\": \"NO\"\r\n" + 
    			"        }\r\n" + 
    			"    ],\r\n" + 
    			"    \"Lines\": [\r\n" + 
    			"        {\r\n" + 
    			"            \"PkgWeight\": 5000,\r\n" + 
    			"            \"Pkgs\": [\r\n" + 
    			"                {\r\n" + 
    			"                    \"ItemNo\": 1\r\n" + 
    			"                }\r\n" + 
    			"            ]\r\n" + 
    			"        }\r\n" + 
    			"    ]\r\n" + 
    			"}";
    	 
    	String param = "actor=63&command=SubmitShipment&key=sample&options="+URLEncoder.encode(option)+"&data="+URLEncoder.encode(dta);
//    	System.out.println(post(url, param));
    	System.out.println(sendPost(url,param));*/
    	
    	
    	// 获取token值
//    	 String url = "http://meepo-ws1.alta.elenet.me/kunkka-svr/openapi/agency/validate";
//    	String param = "token=NVhJKJG4Px0Wxcm/sXXLu/3UhhjCZRgE0dgqLoDItOXLc1FkLDYHGy8Z8x5AkU1Z7DO/ot/oMfLnHKPm6TDBbv43tNbJuy+WWuNgj7d0IsrA5eBEZ1XPjNGHdbrqCYB76BlyUHPVFMXBpzsnICsHyvE00uLLXpO4sdznjKVNvULigDC7HMXdrJlIh1ZLlZGg4OPHlQQH4bIgUQe16Maji2u+PHn/H7qc2JXyYQPKKjvQUnpanBYFd5safvJdjd3voKjqYHMwgCexpRFX8+cDojKIveOhQ8ZzUpR00vX73cUOA+iwdKfqxSHc0zVova4k/qDdMZCK+sC6JZwaZ1cngQY6IAaynlRTW5qNXqy2yEARLDAR1WJkAlypDaOAJgQLNhCjS3AkKUTa1XhSevq8BuTQ6iLy2pH6yTN9mZY55fOT6NFlPBjNsfg3KBBTCs9SuGQyksR5kya9M/YGICTlo21Krhd5sooLo0GUBFD8XqU8NltVpadONtNctiYuu+nAz6qwXlzhprgqcFO6BJQqZvS3ibLw54BuGENQHJ1UhUVH0TvOa+rpcPpSe/5JqXHUntcf6A4uA/erYkBmvwWEzA==";
//    	JSONObject json  = sendGet(url,param);
//    	System.out.println(json.toString());
    	
//    	try {
//			JSONObject object = new JSONObject(result);
//			System.out.println(object);
//			System.out.println(object.getString("code"));
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	String param = "[{\"agencyId\":\"DFB4bFrl%2FOEXvRy2mPM+nw%3D%3D\",\"userId\":\"vD4kwEi1UejhS31BqFOoHA%3D%3D\",\"matType\":\"FNWZ-0001\",\"matCount\":1,\"createdAt\":\"1517312076771\",\"token\":\"PBE_1.0_120d68040fbd8d362b28fff4cd4eef7e92038a6de961633a1b271812a1f8e27991363517b801cf004c76a85c86195468b682ae5b88598be70288b67e1314318c3f803d99aa99ca375a6295b4587880742b7f68c5112f0724b7064f41dacb99911c711097b709661eeed21dec1737d292d1d0127e00e8a9718dce66bcb308276598d141f9117aefda102ef45e402dca2d774eebc433070ae8c08101176c120477831ec3e863d3f006a5ae3bc8d09e5848c775bc75dae2db27ca8212163a366163878e3927fd5bcd22d6708fe176141789\"}]";
//    	String url = "http://meepo-ws1.alta.elenet.me/kunkka-svr/openapi/agency/order/push";
//    	String result = post(url,param);
//    	JSONObject jObject = null;
//    	try {
//    		jObject = new JSONObject(result);
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	try {
//    		System.out.println(jObject.toString());
//			System.out.println(jObject.getString("err_code"));
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    }
}
