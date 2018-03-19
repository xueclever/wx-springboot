/**
 * GetCarrierEventsByEventCodeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.edisoftwebservices;

public class GetCarrierEventsByEventCodeResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] getCarrierEventsByEventCodeResult;

    public GetCarrierEventsByEventCodeResponse() {
    }

    public GetCarrierEventsByEventCodeResponse(
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] getCarrierEventsByEventCodeResult) {
           this.getCarrierEventsByEventCodeResult = getCarrierEventsByEventCodeResult;
    }


    /**
     * Gets the getCarrierEventsByEventCodeResult value for this GetCarrierEventsByEventCodeResponse.
     * 
     * @return getCarrierEventsByEventCodeResult
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] getGetCarrierEventsByEventCodeResult() {
        return getCarrierEventsByEventCodeResult;
    }


    /**
     * Sets the getCarrierEventsByEventCodeResult value for this GetCarrierEventsByEventCodeResponse.
     * 
     * @param getCarrierEventsByEventCodeResult
     */
    public void setGetCarrierEventsByEventCodeResult(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] getCarrierEventsByEventCodeResult) {
        this.getCarrierEventsByEventCodeResult = getCarrierEventsByEventCodeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCarrierEventsByEventCodeResponse)) return false;
        GetCarrierEventsByEventCodeResponse other = (GetCarrierEventsByEventCodeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCarrierEventsByEventCodeResult==null && other.getGetCarrierEventsByEventCodeResult()==null) || 
             (this.getCarrierEventsByEventCodeResult!=null &&
              java.util.Arrays.equals(this.getCarrierEventsByEventCodeResult, other.getGetCarrierEventsByEventCodeResult())));
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
        if (getGetCarrierEventsByEventCodeResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetCarrierEventsByEventCodeResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetCarrierEventsByEventCodeResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetCarrierEventsByEventCodeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edisoftwebservices.com/", ">GetCarrierEventsByEventCodeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCarrierEventsByEventCodeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "GetCarrierEventsByEventCodeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Event"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Event"));
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
