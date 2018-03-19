package org.inter;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

import org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment;

import com.edisoftwebservices.IPortalDataProxy;

public class ShipmentClient_Gn {

	public static void main(String[] args) {
		System.out.println(getOrder("40170716480006622227"));
	}
	
	public static Shipment[] getOrder(String shpNo) {
		IPortalDataProxy proxy = new IPortalDataProxy();
		proxy.setEndpoint("https://portaldata.consignorportal.cn:8000/PortalData/PortalData.svc?singleWsdl");
		String userName = "dltest";
		String password = "dltest123";
		String installationValue = "20002476727";
		int[] actors = null;
		//"40170716480006621923"
		String shipmentNumber = shpNo;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -30);
		Calendar startDateTime = cal ; //calendar
		Calendar endDateTime = calendar; //calendars
		
		String[] requestConfig = null;
		try {
			Shipment[] shnOrder = proxy.getShipmentsByShipmentNumber(userName, password, installationValue, actors, shipmentNumber, startDateTime, endDateTime, requestConfig);
			return shnOrder;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
