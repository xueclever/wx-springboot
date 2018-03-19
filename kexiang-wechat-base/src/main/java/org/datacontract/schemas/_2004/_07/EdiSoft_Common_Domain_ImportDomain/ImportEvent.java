/**
 * ImportEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ImportDomain;

public class ImportEvent  implements java.io.Serializable {
    private byte[] attachmentByte;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ImportDomain.AttachmentType attachmentType;

    private java.util.Calendar date;

    private java.lang.Integer offset;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_Events.Identifier parentIdentifier;

    private java.lang.String statusCode;

    private java.lang.Boolean statusIsClosed;

    private java.lang.String statusText;

    public ImportEvent() {
    }

    public ImportEvent(
           byte[] attachmentByte,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ImportDomain.AttachmentType attachmentType,
           java.util.Calendar date,
           java.lang.Integer offset,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_Events.Identifier parentIdentifier,
           java.lang.String statusCode,
           java.lang.Boolean statusIsClosed,
           java.lang.String statusText) {
           this.attachmentByte = attachmentByte;
           this.attachmentType = attachmentType;
           this.date = date;
           this.offset = offset;
           this.parentIdentifier = parentIdentifier;
           this.statusCode = statusCode;
           this.statusIsClosed = statusIsClosed;
           this.statusText = statusText;
    }


    /**
     * Gets the attachmentByte value for this ImportEvent.
     * 
     * @return attachmentByte
     */
    public byte[] getAttachmentByte() {
        return attachmentByte;
    }


    /**
     * Sets the attachmentByte value for this ImportEvent.
     * 
     * @param attachmentByte
     */
    public void setAttachmentByte(byte[] attachmentByte) {
        this.attachmentByte = attachmentByte;
    }


    /**
     * Gets the attachmentType value for this ImportEvent.
     * 
     * @return attachmentType
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ImportDomain.AttachmentType getAttachmentType() {
        return attachmentType;
    }


    /**
     * Sets the attachmentType value for this ImportEvent.
     * 
     * @param attachmentType
     */
    public void setAttachmentType(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ImportDomain.AttachmentType attachmentType) {
        this.attachmentType = attachmentType;
    }


    /**
     * Gets the date value for this ImportEvent.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this ImportEvent.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the offset value for this ImportEvent.
     * 
     * @return offset
     */
    public java.lang.Integer getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this ImportEvent.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Integer offset) {
        this.offset = offset;
    }


    /**
     * Gets the parentIdentifier value for this ImportEvent.
     * 
     * @return parentIdentifier
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_Events.Identifier getParentIdentifier() {
        return parentIdentifier;
    }


    /**
     * Sets the parentIdentifier value for this ImportEvent.
     * 
     * @param parentIdentifier
     */
    public void setParentIdentifier(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_Events.Identifier parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
    }


    /**
     * Gets the statusCode value for this ImportEvent.
     * 
     * @return statusCode
     */
    public java.lang.String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this ImportEvent.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusIsClosed value for this ImportEvent.
     * 
     * @return statusIsClosed
     */
    public java.lang.Boolean getStatusIsClosed() {
        return statusIsClosed;
    }


    /**
     * Sets the statusIsClosed value for this ImportEvent.
     * 
     * @param statusIsClosed
     */
    public void setStatusIsClosed(java.lang.Boolean statusIsClosed) {
        this.statusIsClosed = statusIsClosed;
    }


    /**
     * Gets the statusText value for this ImportEvent.
     * 
     * @return statusText
     */
    public java.lang.String getStatusText() {
        return statusText;
    }


    /**
     * Sets the statusText value for this ImportEvent.
     * 
     * @param statusText
     */
    public void setStatusText(java.lang.String statusText) {
        this.statusText = statusText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImportEvent)) return false;
        ImportEvent other = (ImportEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attachmentByte==null && other.getAttachmentByte()==null) || 
             (this.attachmentByte!=null &&
              java.util.Arrays.equals(this.attachmentByte, other.getAttachmentByte()))) &&
            ((this.attachmentType==null && other.getAttachmentType()==null) || 
             (this.attachmentType!=null &&
              this.attachmentType.equals(other.getAttachmentType()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.parentIdentifier==null && other.getParentIdentifier()==null) || 
             (this.parentIdentifier!=null &&
              this.parentIdentifier.equals(other.getParentIdentifier()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.statusIsClosed==null && other.getStatusIsClosed()==null) || 
             (this.statusIsClosed!=null &&
              this.statusIsClosed.equals(other.getStatusIsClosed()))) &&
            ((this.statusText==null && other.getStatusText()==null) || 
             (this.statusText!=null &&
              this.statusText.equals(other.getStatusText())));
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
        if (getAttachmentByte() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachmentByte());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachmentByte(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttachmentType() != null) {
            _hashCode += getAttachmentType().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getParentIdentifier() != null) {
            _hashCode += getParentIdentifier().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getStatusIsClosed() != null) {
            _hashCode += getStatusIsClosed().hashCode();
        }
        if (getStatusText() != null) {
            _hashCode += getStatusText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImportEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ImportDomain", "ImportEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentByte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ImportDomain", "AttachmentByte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ImportDomain", "AttachmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ImportDomain", "AttachmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ImportDomain", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ImportDomain", "Offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ImportDomain", "ParentIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.Events", "Identifier"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ImportDomain", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusIsClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ImportDomain", "StatusIsClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ImportDomain", "StatusText"));
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
