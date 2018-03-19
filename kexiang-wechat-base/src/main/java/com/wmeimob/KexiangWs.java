package com.wmeimob;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * 无法处理
 * @author Administrator
 *
 */

public class KexiangWs {
	
	

	public static void main(String[] args) {
		JaxWsDynamicClientFactory dcf  = JaxWsDynamicClientFactory.newInstance();
		/**String wsdlUrl = "http://edi.zjs.com.cn/svst/tracking.asmx?WSDL";  //宅急送webservice
		Client client = dcf.createClient(wsdlUrl);
		
		try {
		Object[]	obj = client.invoke("Get", "Ye_Hua","<BatchQueryRequest><logisticProviderID>Ye_Hua</logisticProviderID><orders><order><mailNo>A005156513574</mailNo></order></orders></BatchQueryRequest>","h5wa42c4a00cf09952282ea17h5wa");
		System.out.println("宅急送webservice测试結果："+obj[0].toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		String wsdlUrl = "https://portaldata.consignorportal.cn:8000/PortalData/PortalData.svc?singleWsdl";
		Client client = dcf.createClient(wsdlUrl);
		
		
	}
}
