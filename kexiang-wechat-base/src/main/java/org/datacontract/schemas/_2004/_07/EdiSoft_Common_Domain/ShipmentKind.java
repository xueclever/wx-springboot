/**
 * ShipmentKind.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain;

public class ShipmentKind implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ShipmentKind(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _Normal = "Normal";
    public static final java.lang.String _Comeback = "Comeback";
    public static final java.lang.String _Group = "Group";
    public static final java.lang.String _Incomming = "Incomming";
    public static final java.lang.String _CHOD = "CHOD";
    public static final java.lang.String _ScanAppMatched = "ScanAppMatched";
    public static final java.lang.String _CustomCreated = "CustomCreated";
    public static final ShipmentKind Unknown = new ShipmentKind(_Unknown);
    public static final ShipmentKind Normal = new ShipmentKind(_Normal);
    public static final ShipmentKind Comeback = new ShipmentKind(_Comeback);
    public static final ShipmentKind Group = new ShipmentKind(_Group);
    public static final ShipmentKind Incomming = new ShipmentKind(_Incomming);
    public static final ShipmentKind CHOD = new ShipmentKind(_CHOD);
    public static final ShipmentKind ScanAppMatched = new ShipmentKind(_ScanAppMatched);
    public static final ShipmentKind CustomCreated = new ShipmentKind(_CustomCreated);
    public java.lang.String getValue() { return _value_;}
    public static ShipmentKind fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ShipmentKind enumeration = (ShipmentKind)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ShipmentKind fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ShipmentKind.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "ShipmentKind"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
