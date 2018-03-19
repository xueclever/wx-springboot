/**
 * Reference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain;

public class Reference  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.ReferenceDetails details;

    private java.lang.Integer kind;

    private java.lang.String kindText;

    private java.lang.String value;

    public Reference() {
    }

    public Reference(
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.ReferenceDetails details,
           java.lang.Integer kind,
           java.lang.String kindText,
           java.lang.String value) {
           this.details = details;
           this.kind = kind;
           this.kindText = kindText;
           this.value = value;
    }


    /**
     * Gets the details value for this Reference.
     * 
     * @return details
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.ReferenceDetails getDetails() {
        return details;
    }


    /**
     * Sets the details value for this Reference.
     * 
     * @param details
     */
    public void setDetails(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.ReferenceDetails details) {
        this.details = details;
    }


    /**
     * Gets the kind value for this Reference.
     * 
     * @return kind
     */
    public java.lang.Integer getKind() {
        return kind;
    }


    /**
     * Sets the kind value for this Reference.
     * 
     * @param kind
     */
    public void setKind(java.lang.Integer kind) {
        this.kind = kind;
    }


    /**
     * Gets the kindText value for this Reference.
     * 
     * @return kindText
     */
    public java.lang.String getKindText() {
        return kindText;
    }


    /**
     * Sets the kindText value for this Reference.
     * 
     * @param kindText
     */
    public void setKindText(java.lang.String kindText) {
        this.kindText = kindText;
    }


    /**
     * Gets the value value for this Reference.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Reference.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Reference)) return false;
        Reference other = (Reference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              this.details.equals(other.getDetails()))) &&
            ((this.kind==null && other.getKind()==null) || 
             (this.kind!=null &&
              this.kind.equals(other.getKind()))) &&
            ((this.kindText==null && other.getKindText()==null) || 
             (this.kindText!=null &&
              this.kindText.equals(other.getKindText()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getDetails() != null) {
            _hashCode += getDetails().hashCode();
        }
        if (getKind() != null) {
            _hashCode += getKind().hashCode();
        }
        if (getKindText() != null) {
            _hashCode += getKindText().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Reference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", ">Reference>Details"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Kind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kindText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "KindText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Value"));
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
