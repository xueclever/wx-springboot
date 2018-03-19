/**
 * _package.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain;

public class _package  implements java.io.Serializable {
    private java.lang.String barcode1;

    private java.lang.String barcode2;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Detail[] details;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] events;

    private java.lang.Integer itemNumber;

    private java.lang.String number;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Reference[] references;

    public _package() {
    }

    public _package(
           java.lang.String barcode1,
           java.lang.String barcode2,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Detail[] details,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] events,
           java.lang.Integer itemNumber,
           java.lang.String number,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Reference[] references) {
           this.barcode1 = barcode1;
           this.barcode2 = barcode2;
           this.details = details;
           this.events = events;
           this.itemNumber = itemNumber;
           this.number = number;
           this.references = references;
    }


    /**
     * Gets the barcode1 value for this _package.
     * 
     * @return barcode1
     */
    public java.lang.String getBarcode1() {
        return barcode1;
    }


    /**
     * Sets the barcode1 value for this _package.
     * 
     * @param barcode1
     */
    public void setBarcode1(java.lang.String barcode1) {
        this.barcode1 = barcode1;
    }


    /**
     * Gets the barcode2 value for this _package.
     * 
     * @return barcode2
     */
    public java.lang.String getBarcode2() {
        return barcode2;
    }


    /**
     * Sets the barcode2 value for this _package.
     * 
     * @param barcode2
     */
    public void setBarcode2(java.lang.String barcode2) {
        this.barcode2 = barcode2;
    }


    /**
     * Gets the details value for this _package.
     * 
     * @return details
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Detail[] getDetails() {
        return details;
    }


    /**
     * Sets the details value for this _package.
     * 
     * @param details
     */
    public void setDetails(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Detail[] details) {
        this.details = details;
    }


    /**
     * Gets the events value for this _package.
     * 
     * @return events
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this _package.
     * 
     * @param events
     */
    public void setEvents(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] events) {
        this.events = events;
    }


    /**
     * Gets the itemNumber value for this _package.
     * 
     * @return itemNumber
     */
    public java.lang.Integer getItemNumber() {
        return itemNumber;
    }


    /**
     * Sets the itemNumber value for this _package.
     * 
     * @param itemNumber
     */
    public void setItemNumber(java.lang.Integer itemNumber) {
        this.itemNumber = itemNumber;
    }


    /**
     * Gets the number value for this _package.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this _package.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the references value for this _package.
     * 
     * @return references
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Reference[] getReferences() {
        return references;
    }


    /**
     * Sets the references value for this _package.
     * 
     * @param references
     */
    public void setReferences(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Reference[] references) {
        this.references = references;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _package)) return false;
        _package other = (_package) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.barcode1==null && other.getBarcode1()==null) || 
             (this.barcode1!=null &&
              this.barcode1.equals(other.getBarcode1()))) &&
            ((this.barcode2==null && other.getBarcode2()==null) || 
             (this.barcode2!=null &&
              this.barcode2.equals(other.getBarcode2()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              java.util.Arrays.equals(this.details, other.getDetails()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents()))) &&
            ((this.itemNumber==null && other.getItemNumber()==null) || 
             (this.itemNumber!=null &&
              this.itemNumber.equals(other.getItemNumber()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.references==null && other.getReferences()==null) || 
             (this.references!=null &&
              java.util.Arrays.equals(this.references, other.getReferences())));
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
        if (getBarcode1() != null) {
            _hashCode += getBarcode1().hashCode();
        }
        if (getBarcode2() != null) {
            _hashCode += getBarcode2().hashCode();
        }
        if (getDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemNumber() != null) {
            _hashCode += getItemNumber().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReferences(), i);
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
        new org.apache.axis.description.TypeDesc(_package.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Package"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcode1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Barcode1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcode2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Barcode2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Detail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Detail"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Event"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Event"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ItemNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("references");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "References"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Reference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Reference"));
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
