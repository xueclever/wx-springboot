/**
 * GetShipmentsByShipmentNumberResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.edisoftwebservices;

public class GetShipmentsByShipmentNumberResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment[] getShipmentsByShipmentNumberResult;

    public GetShipmentsByShipmentNumberResponse() {
    }

    public GetShipmentsByShipmentNumberResponse(
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment[] getShipmentsByShipmentNumberResult) {
           this.getShipmentsByShipmentNumberResult = getShipmentsByShipmentNumberResult;
    }


    /**
     * Gets the getShipmentsByShipmentNumberResult value for this GetShipmentsByShipmentNumberResponse.
     * 
     * @return getShipmentsByShipmentNumberResult
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment[] getGetShipmentsByShipmentNumberResult() {
        return getShipmentsByShipmentNumberResult;
    }


    /**
     * Sets the getShipmentsByShipmentNumberResult value for this GetShipmentsByShipmentNumberResponse.
     * 
     * @param getShipmentsByShipmentNumberResult
     */
    public void setGetShipmentsByShipmentNumberResult(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment[] getShipmentsByShipmentNumberResult) {
        this.getShipmentsByShipmentNumberResult = getShipmentsByShipmentNumberResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetShipmentsByShipmentNumberResponse)) return false;
        GetShipmentsByShipmentNumberResponse other = (GetShipmentsByShipmentNumberResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getShipmentsByShipmentNumberResult==null && other.getGetShipmentsByShipmentNumberResult()==null) || 
             (this.getShipmentsByShipmentNumberResult!=null &&
              java.util.Arrays.equals(this.getShipmentsByShipmentNumberResult, other.getGetShipmentsByShipmentNumberResult())));
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
        if (getGetShipmentsByShipmentNumberResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetShipmentsByShipmentNumberResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetShipmentsByShipmentNumberResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetShipmentsByShipmentNumberResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edisoftwebservices.com/", ">GetShipmentsByShipmentNumberResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getShipmentsByShipmentNumberResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "GetShipmentsByShipmentNumberResult"));
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
