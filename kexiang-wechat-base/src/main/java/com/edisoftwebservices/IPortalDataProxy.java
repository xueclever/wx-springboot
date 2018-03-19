package com.edisoftwebservices;

public class IPortalDataProxy implements com.edisoftwebservices.IPortalData {
  private String _endpoint = null;
  private com.edisoftwebservices.IPortalData iPortalData = null;
  
  public IPortalDataProxy() {
    _initIPortalDataProxy();
  }
  
  public IPortalDataProxy(String endpoint) {
    _endpoint = endpoint;
    _initIPortalDataProxy();
  }
  
  private void _initIPortalDataProxy() {
    try {
      iPortalData = (new com.edisoftwebservices.PortalDataServiceLocator()).getBasicHttpBinding_IPortalData();
      if (iPortalData != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iPortalData)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iPortalData)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iPortalData != null)
      ((javax.xml.rpc.Stub)iPortalData)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.edisoftwebservices.IPortalData getIPortalData() {
    if (iPortalData == null)
      _initIPortalDataProxy();
    return iPortalData;
  }
  
  public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment[] getShipmentsByShipmentNumber(java.lang.String userName, java.lang.String password, java.lang.String installationValue, int[] actors, java.lang.String shipmentNumber, java.util.Calendar startDateTime, java.util.Calendar endDateTime, java.lang.String[] requestConfig) throws java.rmi.RemoteException{
    if (iPortalData == null)
      _initIPortalDataProxy();
    return iPortalData.getShipmentsByShipmentNumber(userName, password, installationValue, actors, shipmentNumber, startDateTime, endDateTime, requestConfig);
  }
  
  public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment[] getShipmentsByOrderNumber(java.lang.String userName, java.lang.String password, java.lang.String installationValue, int[] actors, java.lang.String referenceNumber, java.util.Calendar startDateTime, java.util.Calendar endDateTime, java.lang.String[] requestConfig) throws java.rmi.RemoteException{
    if (iPortalData == null)
      _initIPortalDataProxy();
    return iPortalData.getShipmentsByOrderNumber(userName, password, installationValue, actors, referenceNumber, startDateTime, endDateTime, requestConfig);
  }
  
  public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment[] getShipmentsByPackageNumber(java.lang.String userName, java.lang.String password, java.lang.String installationValue, int[] actors, java.lang.String packageNumber, java.util.Calendar startDateTime, java.util.Calendar endDateTime, java.lang.String[] requestConfig) throws java.rmi.RemoteException{
    if (iPortalData == null)
      _initIPortalDataProxy();
    return iPortalData.getShipmentsByPackageNumber(userName, password, installationValue, actors, packageNumber, startDateTime, endDateTime, requestConfig);
  }
  
  public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment[] getShipmentsByDateRange(java.lang.String userName, java.lang.String password, java.lang.String installationValue, int[] actors, java.util.Calendar startDateTime, java.util.Calendar endDateTime, java.lang.Integer pageIndex, java.lang.String[] requestConfig) throws java.rmi.RemoteException{
    if (iPortalData == null)
      _initIPortalDataProxy();
    return iPortalData.getShipmentsByDateRange(userName, password, installationValue, actors, startDateTime, endDateTime, pageIndex, requestConfig);
  }
  
  public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] getEvents(java.lang.String userName, java.lang.String password, java.util.Calendar eventDateTimeStart, java.util.Calendar eventDateTimeEnd) throws java.rmi.RemoteException{
    if (iPortalData == null)
      _initIPortalDataProxy();
    return iPortalData.getEvents(userName, password, eventDateTimeStart, eventDateTimeEnd);
  }
  
  public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] getCarrierEventsByEventCode(java.lang.String userName, java.lang.String password, java.util.Calendar eventDateTimeStart, java.util.Calendar eventDateTimeEnd, java.lang.String[] eventCodes, java.lang.String installationValue, int[] actors) throws java.rmi.RemoteException{
    if (iPortalData == null)
      _initIPortalDataProxy();
    return iPortalData.getCarrierEventsByEventCode(userName, password, eventDateTimeStart, eventDateTimeEnd, eventCodes, installationValue, actors);
  }
  
  public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] getShipmentStatus(java.lang.String userName, java.lang.String password, java.lang.String shipmentNumber, java.util.Calendar startDateTime, java.util.Calendar endDateTime) throws java.rmi.RemoteException{
    if (iPortalData == null)
      _initIPortalDataProxy();
    return iPortalData.getShipmentStatus(userName, password, shipmentNumber, startDateTime, endDateTime);
  }
  
  public java.lang.Boolean sendEvent(java.lang.String userName, java.lang.String password, org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ImportDomain.ImportEvent submitEvent) throws java.rmi.RemoteException{
    if (iPortalData == null)
      _initIPortalDataProxy();
    return iPortalData.sendEvent(userName, password, submitEvent);
  }
  
  public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.StatusInfo[] isShipmentClosed(java.lang.String userName, java.lang.String password, java.lang.String barcode) throws java.rmi.RemoteException{
    if (iPortalData == null)
      _initIPortalDataProxy();
    return iPortalData.isShipmentClosed(userName, password, barcode);
  }
  
  public org.datacontract.schemas._2004._07.EDISoft_Portal_Endpoints_Services_PortalDataWS.HealthResponse checkHealth() throws java.rmi.RemoteException{
    if (iPortalData == null)
      _initIPortalDataProxy();
    return iPortalData.checkHealth();
  }
  
  public void healthCheck() throws java.rmi.RemoteException{
    if (iPortalData == null)
      _initIPortalDataProxy();
    iPortalData.healthCheck();
  }
  
  
}