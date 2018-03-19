/**
 * PortalDataServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.edisoftwebservices;

public class PortalDataServiceLocator extends org.apache.axis.client.Service implements com.edisoftwebservices.PortalDataService {

    public PortalDataServiceLocator() {
    }


    public PortalDataServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PortalDataServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IPortalData
    private java.lang.String BasicHttpBinding_IPortalData_address = "http://portaldata.consignorportal.cn:8000/PortalData/PortalData.svc";

    public java.lang.String getBasicHttpBinding_IPortalDataAddress() {
        return BasicHttpBinding_IPortalData_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IPortalDataWSDDServiceName = "BasicHttpBinding_IPortalData";

    public java.lang.String getBasicHttpBinding_IPortalDataWSDDServiceName() {
        return BasicHttpBinding_IPortalDataWSDDServiceName;
    }

    public void setBasicHttpBinding_IPortalDataWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IPortalDataWSDDServiceName = name;
    }

    public com.edisoftwebservices.IPortalData getBasicHttpBinding_IPortalData() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IPortalData_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IPortalData(endpoint);
    }

    public com.edisoftwebservices.IPortalData getBasicHttpBinding_IPortalData(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.edisoftwebservices.BasicHttpBinding_IPortalDataStub _stub = new com.edisoftwebservices.BasicHttpBinding_IPortalDataStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IPortalDataWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IPortalDataEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IPortalData_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.edisoftwebservices.IPortalData.class.isAssignableFrom(serviceEndpointInterface)) {
                com.edisoftwebservices.BasicHttpBinding_IPortalDataStub _stub = new com.edisoftwebservices.BasicHttpBinding_IPortalDataStub(new java.net.URL(BasicHttpBinding_IPortalData_address), this);
                _stub.setPortName(getBasicHttpBinding_IPortalDataWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_IPortalData".equals(inputPortName)) {
            return getBasicHttpBinding_IPortalData();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://edisoftwebservices.com/", "PortalDataService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "BasicHttpBinding_IPortalData"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IPortalData".equals(portName)) {
            setBasicHttpBinding_IPortalDataEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
