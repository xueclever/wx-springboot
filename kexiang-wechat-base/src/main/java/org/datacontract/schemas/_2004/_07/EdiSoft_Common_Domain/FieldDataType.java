/**
 * FieldDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain;

public class FieldDataType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FieldDataType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _efkString = "efkString";
    public static final java.lang.String _efkCountry = "efkCountry";
    public static final java.lang.String _efkCurrency = "efkCurrency";
    public static final java.lang.String _efkInt = "efkInt";
    public static final java.lang.String _efkFloat = "efkFloat";
    public static final java.lang.String _efkDate = "efkDate";
    public static final java.lang.String _efkTime = "efkTime";
    public static final java.lang.String _efkDateTime = "efkDateTime";
    public static final java.lang.String _efkNone = "efkNone";
    public static final FieldDataType efkString = new FieldDataType(_efkString);
    public static final FieldDataType efkCountry = new FieldDataType(_efkCountry);
    public static final FieldDataType efkCurrency = new FieldDataType(_efkCurrency);
    public static final FieldDataType efkInt = new FieldDataType(_efkInt);
    public static final FieldDataType efkFloat = new FieldDataType(_efkFloat);
    public static final FieldDataType efkDate = new FieldDataType(_efkDate);
    public static final FieldDataType efkTime = new FieldDataType(_efkTime);
    public static final FieldDataType efkDateTime = new FieldDataType(_efkDateTime);
    public static final FieldDataType efkNone = new FieldDataType(_efkNone);
    public java.lang.String getValue() { return _value_;}
    public static FieldDataType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FieldDataType enumeration = (FieldDataType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FieldDataType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldDataType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "FieldDataType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
