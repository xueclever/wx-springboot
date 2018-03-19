package com.wmeimob.kexiang.wechat.core;

import java.math.BigDecimal;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;

import com.wmeimob.kexiang.wechat.core.HttpRequest;
import com.wmeimob.kexiang.wechat.entity.Cargoinformation;
import com.wmeimob.kexiang.wechat.entity.Orderm;


public class OrderUtil {

	public static void main(String[] args) {

	}
	
	public static JSONObject sendOtherOrder(Orderm orderm,List<Cargoinformation> cargoinformationLt) {
//		String url = "http://sstest.consignor.com/ship/ShipmentServerModule.dll";
	    String	url ="http://www.shipmentserver.cn/shipmentservermodule.dll";
		String option = null;
    	String dta = null;
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	
    	
    	option = "{\"Label\":\"none\"}";
    	
    	dta  = "{\r\n" + 
    			"    \"Kind\": 1,\r\n" + 
    			"    \"ActorCSID\": 67,\r\n" + 
    			"    \"ProdConceptID\": "+orderm.getCarriageId()+",\r\n" + 
    			"    \"PickupDt\": \""+sdf.format(orderm.getMailTime())+"\",\r\n" + 
    			"    \"Addresses\": [\r\n" + 
    			"        {\r\n" + 
    			"            \"Name1\": \""+orderm.getMailPerson()+"\",\r\n" + 
    			"            \"Name2\": \""+orderm.getMailUnitName()+"\",\r\n" + 
    			"            \"Kind\": 2,\r\n" + 
    			"            \"Street1\": \""+orderm.getMailDetailAdress()+"\",\r\n" + 
    			"            \"State\": \""+orderm.getMailProvince()+"\",\r\n" + 
    			"            \"City\": \""+orderm.getMailCity()+"\",\r\n" + 
    			"            \"CountryCode\": \"CN\",\r\n" + 
    			"            \"Phone\": \""+orderm.getMailTel()+"\",\r\n" + 
    			"            \"PostCode\": \"000000\"\r\n" + 
    			"        },\r\n" + 
    			"        {\r\n" + 
    			"            \"Name1\": \""+orderm.getRecPerson()+"\",\r\n" + 
    			"            \"Name2\": \""+orderm.getRecUnitName()+"\",\r\n" + 
    			"            \"Kind\": 1,\r\n" + 
    			"            \"Street1\": \""+orderm.getRecDetailAdress()+"\",\r\n" + 
    			"            \"State\": \""+orderm.getRecProvince()+"\",\r\n" + 
    			"            \"City\": \""+orderm.getRecCity()+"\",\r\n" + 
    			"            \"CountryCode\": \"CN\",\r\n" + 
    			"            \"Phone\": \"15173139267\",\r\n" + 
    			"            \"PostCode\": \"000000\"\r\n" + 
    			"        },\r\n" + 
    			"        {\r\n" + 
    			"            \"Name1\": \""+orderm.getDriverName()+"\",\r\n" + 
    			"            \"Mobile\": \""+orderm.getDriverTel()+"\",\r\n" + 
    			"            \"Kind\": 3,\r\n" + 
    			"            \"Name2\": \""+orderm.getPlateNumber()+"\",\r\n" + 
    			"            \"Attention\": \""+orderm.getDriverCard()+"\",\r\n" + 
    			"            \"CountryCode\":\"CN\",\r\n" + 
    			"            \"PostCode\": \"000000\"\r\n" + 
    			"        }\r\n" + 
    			"    ],\r\n" + 
    			"    \"References\": [\r\n" + 
    			"        {\r\n" + 
    			"            \"Kind\": 242,\r\n" + 
    			"            \"Value\": "+orderm.getReceipt()+"\r\n" + 
    			"        },\r\n" + 
    			"        {\r\n" + 
    			"            \"Kind\": 243,\r\n" + 
    			"            \"Value\": \""+sdf.format(orderm.getArriveTime())+"\"\r\n" + 
    			"        },\r\n" + 
    			"        {\r\n" + 
    			"            \"Kind\": 7,\r\n" + 
    			"            \"Value\": \""+(orderm.getRecMode() == 1?"直送":"自提")+"\"\r\n" + 
    			"        },\r\n" + 
    			"        {\r\n" + 
    			"            \"Kind\": 241,\r\n" + 
    			"            \"Value\": \""+orderm.getTotalPayments()+"\"\r\n" + 
    			"        }\r\n" ;
    			if(orderm.getPrepaymentCash() != null && orderm.getPrepaymentCash().intValue() != 0) {
    				dta += "       , {\r\n" + 
    		    			"            \"Kind\": 98,\r\n" + 
    		    			"            \"Value\": \""+orderm.getPrepaymentCash()+"\"\r\n" + 
    		    			"        }\r\n" ;
    			}
    			if(orderm.getPrepaymentOilCard() != null && orderm.getPrepaymentOilCard().intValue() !=0) {
    				dta += "        ,{\r\n" + 
    		    			"            \"Kind\": 99,\r\n" + 
    		    			"            \"Value\": \""+orderm.getPrepaymentOilCard()+"\"\r\n" + 
    		    			"        }\r\n" ;
    			}
    			if(orderm.getReceiptCash() != null && orderm.getReceiptCash().intValue() != 0) {
    				dta +="        ,{\r\n" + 
    		    			"            \"Kind\": 100,\r\n" + 
    		    			"            \"Value\": \""+orderm.getReceiptCash()+"\"\r\n" + 
    		    			"        }\r\n" ;
    			}
    			if(orderm.getReceiptOilCard() != null && orderm.getReceiptOilCard().intValue() != 0) {
    				dta +="       , {\r\n" + 
    		    			"            \"Kind\": 100,\r\n" + 
    		    			"            \"Value\": \""+orderm.getReceiptOilCard()+"\"\r\n" + 
    		    			"        }\r\n" ;
    			}
    			if(orderm.getFadPayment() != null && orderm.getFadPayment().intValue() != 0) {
    				dta +="       , {\r\n" + 
    		    			"            \"Kind\": 240,\r\n" + 
    		    			"            \"Value\": \""+orderm.getFadPayment()+"\"\r\n" + 
    		    			"        }\r\n" ;
    			}
    			if(orderm.getMonthBalance() != null && orderm.getMonthBalance().intValue() !=0) {
    				dta +="       , {\r\n" + 
    		    			"            \"Kind\": 102,\r\n" + 
    		    			"            \"Value\": \""+orderm.getMonthBalance()+"\"\r\n" + 
    		    			"        }\r\n" ;
    			}
    			if(orderm.getCoolieHire() != null && orderm.getCoolieHire().intValue() !=0) {
    				dta +="       , {\r\n" + 
    		    			"            \"Kind\": 238,\r\n" + 
    		    			"            \"Value\": \""+orderm.getCoolieHire()+"\"\r\n" + 
    		    			"        }\r\n" ;
    			}
    			if(orderm.getOther() != null && orderm.getOther().intValue() !=0) {
    				dta +="        ,{\r\n" + 
    		    			"            \"Kind\": 239,\r\n" + 
    		    			"            \"Value\": \""+orderm.getOther()+"\"\r\n" + 
    		    			"        }\r\n" ; 
    			}
    			dta +="    ],\r\n" ;
    			dta +="    \"Lines\": [\r\n" ;
    			
    			for(int i=0;i<cargoinformationLt.size();i++) {
    				dta +="        {\r\n" + 
    		    			"            \"Pkgs\": [\r\n" + 
    		    			"                {\r\n" + 
    		    			"                    \"ItemNo\": 1\r\n" + 
    		    			"                }\r\n" + 
    		    			"            ],\r\n" + 
    		    			"            \"References\": [\r\n" + 
    		    			"                {\r\n" + 
    		    			"                    \"Kind\": 129,\r\n" + 
    		    			"                    \"Value\": \""+cargoinformationLt.get(i).getCargoName()+"\"\r\n" + 
    		    			"                },\r\n" + 
    		    			"                {\r\n" + 
    		    			"                    \"Kind\": 130,\r\n" + 
    		    			"                    \"Value\": \""+cargoinformationLt.get(i).getFreightUnit()+"\"\r\n" + 
    		    			"                }\r\n" + 
    		    			"            ],\r\n" ;
    		    			if(cargoinformationLt.get(i).getUnit()  == 1) {  //件
    		    				dta +=	"            \"Number\": "+cargoinformationLt.get(i).getCount()+"\r\n" ;
    		    			}else if(cargoinformationLt.get(i).getUnit()  == 2) {//吨
    		    				dta +=	"            \"LineVol\": "+cargoinformationLt.get(i).getCount()+"\r\n" ;  
    		    			}else if(cargoinformationLt.get(i).getUnit()  == 3) { //立方米
    		    				dta +=	"            \"LineWeight\": "+cargoinformationLt.get(i).getCount()+"\r\n" ;
    		    			}
    				dta +="        }\r\n" ;
    				if(cargoinformationLt.size() != i +1) {
    					dta +=",";
    				}
    			}
    			
    			dta +="    ],\r\n" + 
    			"    \"Amounts\": [\r\n";
    			if(orderm.getCoverage() != null) {
    				dta +="        {\r\n" + 
    		    			"            \"Kind\": 4,\r\n" + 
    		    			"            \"Value\": \""+orderm.getCoverage()+"\"\r\n" + 
    		    			"        },\r\n" ;
    			}
    			if(orderm.getPremium() != null) {
	    			dta +="        {\r\n" + 
	    			"            \"Kind\": 12,\r\n" + 
	    			"            \"Value\": \""+orderm.getPremium()+"\"\r\n" + 
	    			"        },\r\n" ;
    			}
    			if(orderm.getTotalFreight() != null) {
	    			dta +="        {\r\n" + 
	    			"            \"Kind\": 1,\r\n" + 
	    			"            \"Value\": \""+orderm.getTotalFreight()+"\"\r\n" + 
	    			"        }\r\n" ;
    			}
    			dta +="    ]\r\n" + 
    			"}";
    	
   /* 	dta = "{\r\n" + 
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
    	 */
    	System.out.println(dta);
    	String param = "actor=67&command=SubmitShipment&key=Slqg7UWGrF&options="+URLEncoder.encode(option)+"&data="+URLEncoder.encode(dta);
//    	System.out.println(post(url, param));
    	JSONObject jObject = null;
    	try {
    		jObject = new JSONObject(HttpRequest.sendPost(url,param));
    	}catch(Exception e) {
    		e.printStackTrace();
    		return jObject;
    	}
    	
    	return jObject;
	}
}
