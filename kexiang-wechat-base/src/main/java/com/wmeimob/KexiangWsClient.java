package com.wmeimob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class KexiangWsClient {

	public static void main(String[] args) throws IOException {
		 //第一步：创建服务地址，不是WSDL地址  
        URL url = new URL("https://portaldata.consignorportal.cn:8000/PortalData/PortalData.svc");  
        //第二步：打开一个通向服务地址的连接  
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();  
        //第三步：设置参数  
        //3.1发送方式设置：POST必须大写  
        connection.setRequestMethod("POST");  
        //3.2设置数据格式：content-type  
        connection.setRequestProperty("content-type", "text/xml;charset=utf-8");  
        //3.3设置输入输出，因为默认新创建的connection没有读写权限，  
        connection.setDoInput(true);  
        connection.setDoOutput(true);  
  
        //第四步：组织SOAP数据，发送请求  
        String soapXML = getXML();  
        OutputStream os = connection.getOutputStream();  
        os.write(soapXML.getBytes());  
        //第五步：接收服务端响应，打印  
        int responseCode = connection.getResponseCode();  
        if(200 == responseCode){//表示服务端响应成功  
            InputStream is = connection.getInputStream();  
            InputStreamReader isr = new InputStreamReader(is);  
            BufferedReader br = new BufferedReader(isr);  
              
            StringBuilder sb = new StringBuilder();  
            String temp = null;  
            while(null != (temp = br.readLine())){  
                sb.append(temp);  
            }  
            System.out.println(sb.toString());  
              
            is.close();  
            isr.close();  
            br.close();  
        }  
        os.close();  
    }  

 public static String getXML() {
	 
	 
	 String soapXML = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:edis=\"http://edisoftwebservices.com/\" xmlns:arr=\"http://schemas.microsoft.com/2003/10/Serialization/Arrays\">\r\n" + 
	 		"   <soapenv:Header/>" + 
	 		"   <soapenv:Body>" + 
	 		"      <edis:GetShipmentsByShipmentNumber>" + 
	 		"         <!--Optional:-->" + 
	 		"         <edis:userName>dltest</edis:userName>" + 
	 		"         <!--Optional:-->" + 
	 		"         <edis:password>dltest123</edis:password>" + 
	 		"         <!--Optional:-->" + 
	 		"         <edis:installationValue>20002441523</edis:installationValue>" + 
	 		"         <!--Optional:-->" + 
	 		"         <edis:actors>" + 
	 		"         </edis:actors>" + 
	 		"         <edis:shipmentNumber>40170716484085121664</edis:shipmentNumber>" + 
	 		"         <edis:startDateTime>2017-04-01T11:04:05.1111698+02:00</edis:startDateTime>" + 
	 		"         <edis:endDateTime>2017-04-25T11:04:05.1111698+02:00</edis:endDateTime>" + 
	 		"      </edis:GetShipmentsByShipmentNumber>" + 
	 		"   </soapenv:Body>" + 
	 		"</soapenv:Envelope>";
	return soapXML;
 }
}
