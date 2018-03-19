/**
 * IPortalData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.edisoftwebservices;

public interface IPortalData extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment[] getShipmentsByShipmentNumber(java.lang.String userName, java.lang.String password, java.lang.String installationValue, int[] actors, java.lang.String shipmentNumber, java.util.Calendar startDateTime, java.util.Calendar endDateTime, java.lang.String[] requestConfig) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment[] getShipmentsByOrderNumber(java.lang.String userName, java.lang.String password, java.lang.String installationValue, int[] actors, java.lang.String referenceNumber, java.util.Calendar startDateTime, java.util.Calendar endDateTime, java.lang.String[] requestConfig) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment[] getShipmentsByPackageNumber(java.lang.String userName, java.lang.String password, java.lang.String installationValue, int[] actors, java.lang.String packageNumber, java.util.Calendar startDateTime, java.util.Calendar endDateTime, java.lang.String[] requestConfig) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment[] getShipmentsByDateRange(java.lang.String userName, java.lang.String password, java.lang.String installationValue, int[] actors, java.util.Calendar startDateTime, java.util.Calendar endDateTime, java.lang.Integer pageIndex, java.lang.String[] requestConfig) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] getEvents(java.lang.String userName, java.lang.String password, java.util.Calendar eventDateTimeStart, java.util.Calendar eventDateTimeEnd) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] getCarrierEventsByEventCode(java.lang.String userName, java.lang.String password, java.util.Calendar eventDateTimeStart, java.util.Calendar eventDateTimeEnd, java.lang.String[] eventCodes, java.lang.String installationValue, int[] actors) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] getShipmentStatus(java.lang.String userName, java.lang.String password, java.lang.String shipmentNumber, java.util.Calendar startDateTime, java.util.Calendar endDateTime) throws java.rmi.RemoteException;
    public java.lang.Boolean sendEvent(java.lang.String userName, java.lang.String password, org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ImportDomain.ImportEvent submitEvent) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.StatusInfo[] isShipmentClosed(java.lang.String userName, java.lang.String password, java.lang.String barcode) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.EDISoft_Portal_Endpoints_Services_PortalDataWS.HealthResponse checkHealth() throws java.rmi.RemoteException;
    public void healthCheck() throws java.rmi.RemoteException;
}
