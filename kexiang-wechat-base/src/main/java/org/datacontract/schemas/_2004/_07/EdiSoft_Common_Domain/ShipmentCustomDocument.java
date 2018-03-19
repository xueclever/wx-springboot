/**
 * ShipmentCustomDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain;

public class ShipmentCustomDocument  extends org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.GenericEntity  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.BinaryContent content;

    private java.lang.String contentType;

    private java.util.Calendar creationDate;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DocumentAccess documentAccess;

    private java.lang.Integer documentAccessId;

    private java.lang.String documentName;

    private java.lang.String fileName;

    private java.lang.Integer offset;

    private java.lang.Integer shipmentId;

    private java.lang.String uploadedByUser;

    public ShipmentCustomDocument() {
    }

    public ShipmentCustomDocument(
           java.lang.Integer id,
           byte[] timeStamp,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.BinaryContent content,
           java.lang.String contentType,
           java.util.Calendar creationDate,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DocumentAccess documentAccess,
           java.lang.Integer documentAccessId,
           java.lang.String documentName,
           java.lang.String fileName,
           java.lang.Integer offset,
           java.lang.Integer shipmentId,
           java.lang.String uploadedByUser) {
        super(
            id,
            timeStamp);
        this.content = content;
        this.contentType = contentType;
        this.creationDate = creationDate;
        this.documentAccess = documentAccess;
        this.documentAccessId = documentAccessId;
        this.documentName = documentName;
        this.fileName = fileName;
        this.offset = offset;
        this.shipmentId = shipmentId;
        this.uploadedByUser = uploadedByUser;
    }


    /**
     * Gets the content value for this ShipmentCustomDocument.
     * 
     * @return content
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.BinaryContent getContent() {
        return content;
    }


    /**
     * Sets the content value for this ShipmentCustomDocument.
     * 
     * @param content
     */
    public void setContent(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.BinaryContent content) {
        this.content = content;
    }


    /**
     * Gets the contentType value for this ShipmentCustomDocument.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this ShipmentCustomDocument.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the creationDate value for this ShipmentCustomDocument.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this ShipmentCustomDocument.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the documentAccess value for this ShipmentCustomDocument.
     * 
     * @return documentAccess
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DocumentAccess getDocumentAccess() {
        return documentAccess;
    }


    /**
     * Sets the documentAccess value for this ShipmentCustomDocument.
     * 
     * @param documentAccess
     */
    public void setDocumentAccess(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DocumentAccess documentAccess) {
        this.documentAccess = documentAccess;
    }


    /**
     * Gets the documentAccessId value for this ShipmentCustomDocument.
     * 
     * @return documentAccessId
     */
    public java.lang.Integer getDocumentAccessId() {
        return documentAccessId;
    }


    /**
     * Sets the documentAccessId value for this ShipmentCustomDocument.
     * 
     * @param documentAccessId
     */
    public void setDocumentAccessId(java.lang.Integer documentAccessId) {
        this.documentAccessId = documentAccessId;
    }


    /**
     * Gets the documentName value for this ShipmentCustomDocument.
     * 
     * @return documentName
     */
    public java.lang.String getDocumentName() {
        return documentName;
    }


    /**
     * Sets the documentName value for this ShipmentCustomDocument.
     * 
     * @param documentName
     */
    public void setDocumentName(java.lang.String documentName) {
        this.documentName = documentName;
    }


    /**
     * Gets the fileName value for this ShipmentCustomDocument.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this ShipmentCustomDocument.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the offset value for this ShipmentCustomDocument.
     * 
     * @return offset
     */
    public java.lang.Integer getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this ShipmentCustomDocument.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Integer offset) {
        this.offset = offset;
    }


    /**
     * Gets the shipmentId value for this ShipmentCustomDocument.
     * 
     * @return shipmentId
     */
    public java.lang.Integer getShipmentId() {
        return shipmentId;
    }


    /**
     * Sets the shipmentId value for this ShipmentCustomDocument.
     * 
     * @param shipmentId
     */
    public void setShipmentId(java.lang.Integer shipmentId) {
        this.shipmentId = shipmentId;
    }


    /**
     * Gets the uploadedByUser value for this ShipmentCustomDocument.
     * 
     * @return uploadedByUser
     */
    public java.lang.String getUploadedByUser() {
        return uploadedByUser;
    }


    /**
     * Sets the uploadedByUser value for this ShipmentCustomDocument.
     * 
     * @param uploadedByUser
     */
    public void setUploadedByUser(java.lang.String uploadedByUser) {
        this.uploadedByUser = uploadedByUser;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentCustomDocument)) return false;
        ShipmentCustomDocument other = (ShipmentCustomDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.documentAccess==null && other.getDocumentAccess()==null) || 
             (this.documentAccess!=null &&
              this.documentAccess.equals(other.getDocumentAccess()))) &&
            ((this.documentAccessId==null && other.getDocumentAccessId()==null) || 
             (this.documentAccessId!=null &&
              this.documentAccessId.equals(other.getDocumentAccessId()))) &&
            ((this.documentName==null && other.getDocumentName()==null) || 
             (this.documentName!=null &&
              this.documentName.equals(other.getDocumentName()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.shipmentId==null && other.getShipmentId()==null) || 
             (this.shipmentId!=null &&
              this.shipmentId.equals(other.getShipmentId()))) &&
            ((this.uploadedByUser==null && other.getUploadedByUser()==null) || 
             (this.uploadedByUser!=null &&
              this.uploadedByUser.equals(other.getUploadedByUser())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getDocumentAccess() != null) {
            _hashCode += getDocumentAccess().hashCode();
        }
        if (getDocumentAccessId() != null) {
            _hashCode += getDocumentAccessId().hashCode();
        }
        if (getDocumentName() != null) {
            _hashCode += getDocumentName().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getShipmentId() != null) {
            _hashCode += getShipmentId().hashCode();
        }
        if (getUploadedByUser() != null) {
            _hashCode += getUploadedByUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentCustomDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "ShipmentCustomDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "Content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "BinaryContent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "ContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "CreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "DocumentAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "DocumentAccess"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentAccessId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "DocumentAccessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "DocumentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "Offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "ShipmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadedByUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "UploadedByUser"));
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
