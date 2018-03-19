/**
 * GetEventsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.edisoftwebservices;

public class GetEventsResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] getEventsResult;

    public GetEventsResponse() {
    }

    public GetEventsResponse(
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] getEventsResult) {
           this.getEventsResult = getEventsResult;
    }


    /**
     * Gets the getEventsResult value for this GetEventsResponse.
     * 
     * @return getEventsResult
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] getGetEventsResult() {
        return getEventsResult;
    }


    /**
     * Sets the getEventsResult value for this GetEventsResponse.
     * 
     * @param getEventsResult
     */
    public void setGetEventsResult(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] getEventsResult) {
        this.getEventsResult = getEventsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEventsResponse)) return false;
        GetEventsResponse other = (GetEventsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getEventsResult==null && other.getGetEventsResult()==null) || 
             (this.getEventsResult!=null &&
              java.util.Arrays.equals(this.getEventsResult, other.getGetEventsResult())));
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
        if (getGetEventsResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetEventsResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetEventsResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetEventsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edisoftwebservices.com/", ">GetEventsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getEventsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "GetEventsResult"));
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
