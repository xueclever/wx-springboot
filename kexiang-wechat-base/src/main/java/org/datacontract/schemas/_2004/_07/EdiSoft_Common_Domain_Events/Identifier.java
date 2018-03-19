/**
 * Identifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_Events;

public class Identifier  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_Events.IdentifierType identifierType;

    private java.lang.String identifierValue;

    public Identifier() {
    }

    public Identifier(
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_Events.IdentifierType identifierType,
           java.lang.String identifierValue) {
           this.identifierType = identifierType;
           this.identifierValue = identifierValue;
    }


    /**
     * Gets the identifierType value for this Identifier.
     * 
     * @return identifierType
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_Events.IdentifierType getIdentifierType() {
        return identifierType;
    }


    /**
     * Sets the identifierType value for this Identifier.
     * 
     * @param identifierType
     */
    public void setIdentifierType(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_Events.IdentifierType identifierType) {
        this.identifierType = identifierType;
    }


    /**
     * Gets the identifierValue value for this Identifier.
     * 
     * @return identifierValue
     */
    public java.lang.String getIdentifierValue() {
        return identifierValue;
    }


    /**
     * Sets the identifierValue value for this Identifier.
     * 
     * @param identifierValue
     */
    public void setIdentifierValue(java.lang.String identifierValue) {
        this.identifierValue = identifierValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Identifier)) return false;
        Identifier other = (Identifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifierType==null && other.getIdentifierType()==null) || 
             (this.identifierType!=null &&
              this.identifierType.equals(other.getIdentifierType()))) &&
            ((this.identifierValue==null && other.getIdentifierValue()==null) || 
             (this.identifierValue!=null &&
              this.identifierValue.equals(other.getIdentifierValue())));
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
        if (getIdentifierType() != null) {
            _hashCode += getIdentifierType().hashCode();
        }
        if (getIdentifierValue() != null) {
            _hashCode += getIdentifierValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Identifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.Events", "Identifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifierType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.Events", "IdentifierType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.Events", "IdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifierValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.Events", "IdentifierValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
