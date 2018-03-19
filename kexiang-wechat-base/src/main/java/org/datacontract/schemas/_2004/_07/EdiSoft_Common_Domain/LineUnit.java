/**
 * LineUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain;

public class LineUnit  extends org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.GenericEntity  implements java.io.Serializable {
    private java.lang.Integer count;

    private java.lang.Integer kindId;

    private java.lang.Integer lineId;

    private java.lang.String name;

    private java.lang.Integer vol;

    private java.lang.Integer weight;

    public LineUnit() {
    }

    public LineUnit(
           java.lang.Integer id,
           byte[] timeStamp,
           java.lang.Integer count,
           java.lang.Integer kindId,
           java.lang.Integer lineId,
           java.lang.String name,
           java.lang.Integer vol,
           java.lang.Integer weight) {
        super(
            id,
            timeStamp);
        this.count = count;
        this.kindId = kindId;
        this.lineId = lineId;
        this.name = name;
        this.vol = vol;
        this.weight = weight;
    }


    /**
     * Gets the count value for this LineUnit.
     * 
     * @return count
     */
    public java.lang.Integer getCount() {
        return count;
    }


    /**
     * Sets the count value for this LineUnit.
     * 
     * @param count
     */
    public void setCount(java.lang.Integer count) {
        this.count = count;
    }


    /**
     * Gets the kindId value for this LineUnit.
     * 
     * @return kindId
     */
    public java.lang.Integer getKindId() {
        return kindId;
    }


    /**
     * Sets the kindId value for this LineUnit.
     * 
     * @param kindId
     */
    public void setKindId(java.lang.Integer kindId) {
        this.kindId = kindId;
    }


    /**
     * Gets the lineId value for this LineUnit.
     * 
     * @return lineId
     */
    public java.lang.Integer getLineId() {
        return lineId;
    }


    /**
     * Sets the lineId value for this LineUnit.
     * 
     * @param lineId
     */
    public void setLineId(java.lang.Integer lineId) {
        this.lineId = lineId;
    }


    /**
     * Gets the name value for this LineUnit.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LineUnit.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the vol value for this LineUnit.
     * 
     * @return vol
     */
    public java.lang.Integer getVol() {
        return vol;
    }


    /**
     * Sets the vol value for this LineUnit.
     * 
     * @param vol
     */
    public void setVol(java.lang.Integer vol) {
        this.vol = vol;
    }


    /**
     * Gets the weight value for this LineUnit.
     * 
     * @return weight
     */
    public java.lang.Integer getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this LineUnit.
     * 
     * @param weight
     */
    public void setWeight(java.lang.Integer weight) {
        this.weight = weight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineUnit)) return false;
        LineUnit other = (LineUnit) obj;
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
            ((this.kindId==null && other.getKindId()==null) || 
             (this.kindId!=null &&
              this.kindId.equals(other.getKindId()))) &&
            ((this.lineId==null && other.getLineId()==null) || 
             (this.lineId!=null &&
              this.lineId.equals(other.getLineId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.vol==null && other.getVol()==null) || 
             (this.vol!=null &&
              this.vol.equals(other.getVol()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight())));
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
        if (getKindId() != null) {
            _hashCode += getKindId().hashCode();
        }
        if (getLineId() != null) {
            _hashCode += getLineId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getVol() != null) {
            _hashCode += getVol().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineUnit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "LineUnit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "Count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kindId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "KindId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "LineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "Vol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "Weight"));
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
