/**
 * BaseEventEventOrigin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_Events_Interfaces;

public class BaseEventEventOrigin implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BaseEventEventOrigin(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Consignor = "Consignor";
    public static final java.lang.String _ReturnData = "ReturnData";
    public static final java.lang.String _MobileScanApp = "MobileScanApp";
    public static final java.lang.String _MobileHandheld = "MobileHandheld";
    public static final java.lang.String _PortalStatus = "PortalStatus";
    public static final java.lang.String _ClientData = "ClientData";
    public static final java.lang.String _PortalEdit = "PortalEdit";
    public static final BaseEventEventOrigin Consignor = new BaseEventEventOrigin(_Consignor);
    public static final BaseEventEventOrigin ReturnData = new BaseEventEventOrigin(_ReturnData);
    public static final BaseEventEventOrigin MobileScanApp = new BaseEventEventOrigin(_MobileScanApp);
    public static final BaseEventEventOrigin MobileHandheld = new BaseEventEventOrigin(_MobileHandheld);
    public static final BaseEventEventOrigin PortalStatus = new BaseEventEventOrigin(_PortalStatus);
    public static final BaseEventEventOrigin ClientData = new BaseEventEventOrigin(_ClientData);
    public static final BaseEventEventOrigin PortalEdit = new BaseEventEventOrigin(_PortalEdit);
    public java.lang.String getValue() { return _value_;}
    public static BaseEventEventOrigin fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BaseEventEventOrigin enumeration = (BaseEventEventOrigin)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BaseEventEventOrigin fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BaseEventEventOrigin.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.Events.Interfaces", "BaseEvent.EventOrigin"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
