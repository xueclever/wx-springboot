/**
 * AddressKind.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain;

public class AddressKind implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AddressKind(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _Receiver = "Receiver";
    public static final java.lang.String _Sender = "Sender";
    public static final java.lang.String _PickUp = "PickUp";
    public static final java.lang.String _Payer = "Payer";
    public static final java.lang.String _Buyer = "Buyer";
    public static final java.lang.String _Temporary = "Temporary";
    public static final java.lang.String _Message = "Message";
    public static final java.lang.String _Forwarder = "Forwarder";
    public static final java.lang.String _ReturnTo = "ReturnTo";
    public static final java.lang.String _DropPoint = "DropPoint";
    public static final java.lang.String _Depot = "Depot";
    public static final java.lang.String _Comeback = "Comeback";
    public static final java.lang.String _Broker = "Broker";
    public static final java.lang.String _Delivery = "Delivery";
    public static final AddressKind Unknown = new AddressKind(_Unknown);
    public static final AddressKind Receiver = new AddressKind(_Receiver);
    public static final AddressKind Sender = new AddressKind(_Sender);
    public static final AddressKind PickUp = new AddressKind(_PickUp);
    public static final AddressKind Payer = new AddressKind(_Payer);
    public static final AddressKind Buyer = new AddressKind(_Buyer);
    public static final AddressKind Temporary = new AddressKind(_Temporary);
    public static final AddressKind Message = new AddressKind(_Message);
    public static final AddressKind Forwarder = new AddressKind(_Forwarder);
    public static final AddressKind ReturnTo = new AddressKind(_ReturnTo);
    public static final AddressKind DropPoint = new AddressKind(_DropPoint);
    public static final AddressKind Depot = new AddressKind(_Depot);
    public static final AddressKind Comeback = new AddressKind(_Comeback);
    public static final AddressKind Broker = new AddressKind(_Broker);
    public static final AddressKind Delivery = new AddressKind(_Delivery);
    public java.lang.String getValue() { return _value_;}
    public static AddressKind fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AddressKind enumeration = (AddressKind)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AddressKind fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AddressKind.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "AddressKind"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
