/**
 * CheckHealthResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.edisoftwebservices;

public class CheckHealthResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.EDISoft_Portal_Endpoints_Services_PortalDataWS.HealthResponse checkHealthResult;

    public CheckHealthResponse() {
    }

    public CheckHealthResponse(
           org.datacontract.schemas._2004._07.EDISoft_Portal_Endpoints_Services_PortalDataWS.HealthResponse checkHealthResult) {
           this.checkHealthResult = checkHealthResult;
    }


    /**
     * Gets the checkHealthResult value for this CheckHealthResponse.
     * 
     * @return checkHealthResult
     */
    public org.datacontract.schemas._2004._07.EDISoft_Portal_Endpoints_Services_PortalDataWS.HealthResponse getCheckHealthResult() {
        return checkHealthResult;
    }


    /**
     * Sets the checkHealthResult value for this CheckHealthResponse.
     * 
     * @param checkHealthResult
     */
    public void setCheckHealthResult(org.datacontract.schemas._2004._07.EDISoft_Portal_Endpoints_Services_PortalDataWS.HealthResponse checkHealthResult) {
        this.checkHealthResult = checkHealthResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckHealthResponse)) return false;
        CheckHealthResponse other = (CheckHealthResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkHealthResult==null && other.getCheckHealthResult()==null) || 
             (this.checkHealthResult!=null &&
              this.checkHealthResult.equals(other.getCheckHealthResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCheckHealthResult() != null) {
            _hashCode += getCheckHealthResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckHealthResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edisoftwebservices.com/", ">CheckHealthResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkHealthResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "CheckHealthResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EDISoft.Portal.Endpoints.Services.PortalDataWS", "HealthResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
