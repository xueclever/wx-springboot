/**
 * ShipmentDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain;

public class ShipmentDocument  extends org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.GenericEntity  implements java.io.Serializable {
    private java.lang.Integer count;

    private java.util.Calendar datePrinted;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.BinaryContent docContent;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DocumentAccess documentAccess;

    private java.lang.Integer documentAccessId;

    private java.lang.Boolean manualPrint;

    private java.lang.Integer offset;

    private java.lang.Integer printBox;

    private java.lang.String printerPath;

    private java.lang.Integer shipmentId;

    public ShipmentDocument() {
    }

    public ShipmentDocument(
           java.lang.Integer id,
           byte[] timeStamp,
           java.lang.Integer count,
           java.util.Calendar datePrinted,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.BinaryContent docContent,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DocumentAccess documentAccess,
           java.lang.Integer documentAccessId,
           java.lang.Boolean manualPrint,
           java.lang.Integer offset,
           java.lang.Integer printBox,
           java.lang.String printerPath,
           java.lang.Integer shipmentId) {
        super(
            id,
            timeStamp);
        this.count = count;
        this.datePrinted = datePrinted;
        this.docContent = docContent;
        this.documentAccess = documentAccess;
        this.documentAccessId = documentAccessId;
        this.manualPrint = manualPrint;
        this.offset = offset;
        this.printBox = printBox;
        this.printerPath = printerPath;
        this.shipmentId = shipmentId;
    }


    /**
     * Gets the count value for this ShipmentDocument.
     * 
     * @return count
     */
    public java.lang.Integer getCount() {
        return count;
    }


    /**
     * Sets the count value for this ShipmentDocument.
     * 
     * @param count
     */
    public void setCount(java.lang.Integer count) {
        this.count = count;
    }


    /**
     * Gets the datePrinted value for this ShipmentDocument.
     * 
     * @return datePrinted
     */
    public java.util.Calendar getDatePrinted() {
        return datePrinted;
    }


    /**
     * Sets the datePrinted value for this ShipmentDocument.
     * 
     * @param datePrinted
     */
    public void setDatePrinted(java.util.Calendar datePrinted) {
        this.datePrinted = datePrinted;
    }


    /**
     * Gets the docContent value for this ShipmentDocument.
     * 
     * @return docContent
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.BinaryContent getDocContent() {
        return docContent;
    }


    /**
     * Sets the docContent value for this ShipmentDocument.
     * 
     * @param docContent
     */
    public void setDocContent(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.BinaryContent docContent) {
        this.docContent = docContent;
    }


    /**
     * Gets the documentAccess value for this ShipmentDocument.
     * 
     * @return documentAccess
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DocumentAccess getDocumentAccess() {
        return documentAccess;
    }


    /**
     * Sets the documentAccess value for this ShipmentDocument.
     * 
     * @param documentAccess
     */
    public void setDocumentAccess(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DocumentAccess documentAccess) {
        this.documentAccess = documentAccess;
    }


    /**
     * Gets the documentAccessId value for this ShipmentDocument.
     * 
     * @return documentAccessId
     */
    public java.lang.Integer getDocumentAccessId() {
        return documentAccessId;
    }


    /**
     * Sets the documentAccessId value for this ShipmentDocument.
     * 
     * @param documentAccessId
     */
    public void setDocumentAccessId(java.lang.Integer documentAccessId) {
        this.documentAccessId = documentAccessId;
    }


    /**
     * Gets the manualPrint value for this ShipmentDocument.
     * 
     * @return manualPrint
     */
    public java.lang.Boolean getManualPrint() {
        return manualPrint;
    }


    /**
     * Sets the manualPrint value for this ShipmentDocument.
     * 
     * @param manualPrint
     */
    public void setManualPrint(java.lang.Boolean manualPrint) {
        this.manualPrint = manualPrint;
    }


    /**
     * Gets the offset value for this ShipmentDocument.
     * 
     * @return offset
     */
    public java.lang.Integer getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this ShipmentDocument.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Integer offset) {
        this.offset = offset;
    }


    /**
     * Gets the printBox value for this ShipmentDocument.
     * 
     * @return printBox
     */
    public java.lang.Integer getPrintBox() {
        return printBox;
    }


    /**
     * Sets the printBox value for this ShipmentDocument.
     * 
     * @param printBox
     */
    public void setPrintBox(java.lang.Integer printBox) {
        this.printBox = printBox;
    }


    /**
     * Gets the printerPath value for this ShipmentDocument.
     * 
     * @return printerPath
     */
    public java.lang.String getPrinterPath() {
        return printerPath;
    }


    /**
     * Sets the printerPath value for this ShipmentDocument.
     * 
     * @param printerPath
     */
    public void setPrinterPath(java.lang.String printerPath) {
        this.printerPath = printerPath;
    }


    /**
     * Gets the shipmentId value for this ShipmentDocument.
     * 
     * @return shipmentId
     */
    public java.lang.Integer getShipmentId() {
        return shipmentId;
    }


    /**
     * Sets the shipmentId value for this ShipmentDocument.
     * 
     * @param shipmentId
     */
    public void setShipmentId(java.lang.Integer shipmentId) {
        this.shipmentId = shipmentId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentDocument)) return false;
        ShipmentDocument other = (ShipmentDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.datePrinted==null && other.getDatePrinted()==null) || 
             (this.datePrinted!=null &&
              this.datePrinted.equals(other.getDatePrinted()))) &&
            ((this.docContent==null && other.getDocContent()==null) || 
             (this.docContent!=null &&
              this.docContent.equals(other.getDocContent()))) &&
            ((this.documentAccess==null && other.getDocumentAccess()==null) || 
             (this.documentAccess!=null &&
              this.documentAccess.equals(other.getDocumentAccess()))) &&
            ((this.documentAccessId==null && other.getDocumentAccessId()==null) || 
             (this.documentAccessId!=null &&
              this.documentAccessId.equals(other.getDocumentAccessId()))) &&
            ((this.manualPrint==null && other.getManualPrint()==null) || 
             (this.manualPrint!=null &&
              this.manualPrint.equals(other.getManualPrint()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.printBox==null && other.getPrintBox()==null) || 
             (this.printBox!=null &&
              this.printBox.equals(other.getPrintBox()))) &&
            ((this.printerPath==null && other.getPrinterPath()==null) || 
             (this.printerPath!=null &&
              this.printerPath.equals(other.getPrinterPath()))) &&
            ((this.shipmentId==null && other.getShipmentId()==null) || 
             (this.shipmentId!=null &&
              this.shipmentId.equals(other.getShipmentId())));
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
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getDatePrinted() != null) {
            _hashCode += getDatePrinted().hashCode();
        }
        if (getDocContent() != null) {
            _hashCode += getDocContent().hashCode();
        }
        if (getDocumentAccess() != null) {
            _hashCode += getDocumentAccess().hashCode();
        }
        if (getDocumentAccessId() != null) {
            _hashCode += getDocumentAccessId().hashCode();
        }
        if (getManualPrint() != null) {
            _hashCode += getManualPrint().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getPrintBox() != null) {
            _hashCode += getPrintBox().hashCode();
        }
        if (getPrinterPath() != null) {
            _hashCode += getPrinterPath().hashCode();
        }
        if (getShipmentId() != null) {
            _hashCode += getShipmentId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "ShipmentDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "Count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePrinted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "DatePrinted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "DocContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "BinaryContent"));
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
        elemField.setFieldName("manualPrint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "ManualPrint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "Offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printBox");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "PrintBox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printerPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "PrinterPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
