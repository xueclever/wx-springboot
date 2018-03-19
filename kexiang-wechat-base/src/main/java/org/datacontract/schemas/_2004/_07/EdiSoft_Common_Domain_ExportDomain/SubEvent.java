/**
 * SubEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain;

public class SubEvent  implements java.io.Serializable {
    private java.lang.String description;

    private org.apache.axis.types.UnsignedShort hasSpecialValue;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.SubEventTypes subEventType;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.SubEvent[] subEvents;

    private java.lang.String value;

    public SubEvent() {
    }

    public SubEvent(
           java.lang.String description,
           org.apache.axis.types.UnsignedShort hasSpecialValue,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.SubEventTypes subEventType,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.SubEvent[] subEvents,
           java.lang.String value) {
           this.description = description;
           this.hasSpecialValue = hasSpecialValue;
           this.subEventType = subEventType;
           this.subEvents = subEvents;
           this.value = value;
    }


    /**
     * Gets the description value for this SubEvent.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SubEvent.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the hasSpecialValue value for this SubEvent.
     * 
     * @return hasSpecialValue
     */
    public org.apache.axis.types.UnsignedShort getHasSpecialValue() {
        return hasSpecialValue;
    }


    /**
     * Sets the hasSpecialValue value for this SubEvent.
     * 
     * @param hasSpecialValue
     */
    public void setHasSpecialValue(org.apache.axis.types.UnsignedShort hasSpecialValue) {
        this.hasSpecialValue = hasSpecialValue;
    }


    /**
     * Gets the subEventType value for this SubEvent.
     * 
     * @return subEventType
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.SubEventTypes getSubEventType() {
        return subEventType;
    }


    /**
     * Sets the subEventType value for this SubEvent.
     * 
     * @param subEventType
     */
    public void setSubEventType(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.SubEventTypes subEventType) {
        this.subEventType = subEventType;
    }


    /**
     * Gets the subEvents value for this SubEvent.
     * 
     * @return subEvents
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.SubEvent[] getSubEvents() {
        return subEvents;
    }


    /**
     * Sets the subEvents value for this SubEvent.
     * 
     * @param subEvents
     */
    public void setSubEvents(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.SubEvent[] subEvents) {
        this.subEvents = subEvents;
    }


    /**
     * Gets the value value for this SubEvent.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this SubEvent.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubEvent)) return false;
        SubEvent other = (SubEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.hasSpecialValue==null && other.getHasSpecialValue()==null) || 
             (this.hasSpecialValue!=null &&
              this.hasSpecialValue.equals(other.getHasSpecialValue()))) &&
            ((this.subEventType==null && other.getSubEventType()==null) || 
             (this.subEventType!=null &&
              this.subEventType.equals(other.getSubEventType()))) &&
            ((this.subEvents==null && other.getSubEvents()==null) || 
             (this.subEvents!=null &&
              java.util.Arrays.equals(this.subEvents, other.getSubEvents()))) &&
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getHasSpecialValue() != null) {
            _hashCode += getHasSpecialValue().hashCode();
        }
        if (getSubEventType() != null) {
            _hashCode += getSubEventType().hashCode();
        }
        if (getSubEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SubEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasSpecialValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "HasSpecialValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subEventType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SubEventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SubEventTypes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SubEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SubEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SubEvent"));
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
