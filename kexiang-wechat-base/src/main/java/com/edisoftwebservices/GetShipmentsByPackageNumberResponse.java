/**
 * GetShipmentsByPackageNumberResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.edisoftwebservices;

public class GetShipmentsByPackageNumberResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment[] getShipmentsByPackageNumberResult;

    public GetShipmentsByPackageNumberResponse() {
    }

    public GetShipmentsByPackageNumberResponse(
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment[] getShipmentsByPackageNumberResult) {
           this.getShipmentsByPackageNumberResult = getShipmentsByPackageNumberResult;
    }


    /**
     * Gets the getShipmentsByPackageNumberResult value for this GetShipmentsByPackageNumberResponse.
     * 
     * @return getShipmentsByPackageNumberResult
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment[] getGetShipmentsByPackageNumberResult() {
        return getShipmentsByPackageNumberResult;
    }


    /**
     * Sets the getShipmentsByPackageNumberResult value for this GetShipmentsByPackageNumberResponse.
     * 
     * @param getShipmentsByPackageNumberResult
     */
    public void setGetShipmentsByPackageNumberResult(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment[] getShipmentsByPackageNumberResult) {
        this.getShipmentsByPackageNumberResult = getShipmentsByPackageNumberResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetShipmentsByPackageNumberResponse)) return false;
        GetShipmentsByPackageNumberResponse other = (GetShipmentsByPackageNumberResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getShipmentsByPackageNumberResult==null && other.getGetShipmentsByPackageNumberResult()==null) || 
             (this.getShipmentsByPackageNumberResult!=null &&
              java.util.Arrays.equals(this.getShipmentsByPackageNumberResult, other.getGetShipmentsByPackageNumberResult())));
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
        if (getGetShipmentsByPackageNumberResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetShipmentsByPackageNumberResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetShipmentsByPackageNumberResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetShipmentsByPackageNumberResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edisoftwebservices.com/", ">GetShipmentsByPackageNumberResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getShipmentsByPackageNumberResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "GetShipmentsByPackageNumberResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Shipment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Shipment"));
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
