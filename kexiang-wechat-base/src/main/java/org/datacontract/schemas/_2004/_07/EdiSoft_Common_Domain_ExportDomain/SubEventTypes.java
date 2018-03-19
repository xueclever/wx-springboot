/**
 * SubEventTypes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain;

public class SubEventTypes implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SubEventTypes(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Simple = "Simple";
    public static final java.lang.String _Text = "Text";
    public static final java.lang.String _Image = "Image";
    public static final java.lang.String _Date = "Date";
    public static final java.lang.String _Time = "Time";
    public static final java.lang.String _DateTime = "DateTime";
    public static final java.lang.String _Number = "Number";
    public static final SubEventTypes Simple = new SubEventTypes(_Simple);
    public static final SubEventTypes Text = new SubEventTypes(_Text);
    public static final SubEventTypes Image = new SubEventTypes(_Image);
    public static final SubEventTypes Date = new SubEventTypes(_Date);
    public static final SubEventTypes Time = new SubEventTypes(_Time);
    public static final SubEventTypes DateTime = new SubEventTypes(_DateTime);
    public static final SubEventTypes Number = new SubEventTypes(_Number);
    public java.lang.String getValue() { return _value_;}
    public static SubEventTypes fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SubEventTypes enumeration = (SubEventTypes)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SubEventTypes fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SubEventTypes.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SubEventTypes"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
