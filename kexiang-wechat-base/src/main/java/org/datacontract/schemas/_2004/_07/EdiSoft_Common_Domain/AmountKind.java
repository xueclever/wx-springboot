/**
 * AmountKind.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain;

public class AmountKind implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AmountKind(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _Price1 = "Price1";
    public static final java.lang.String _Price2 = "Price2";
    public static final java.lang.String _Price3 = "Price3";
    public static final java.lang.String _InsuranceValue = "InsuranceValue";
    public static final java.lang.String _CodAmount = "CodAmount";
    public static final java.lang.String _CarrierSpecifiedPrice = "CarrierSpecifiedPrice";
    public static final java.lang.String _CarrierSpecifiedCodAmount = "CarrierSpecifiedCodAmount";
    public static final java.lang.String _InsuranceAmountPerPackage = "InsuranceAmountPerPackage";
    public static final java.lang.String _FixedPrice = "FixedPrice";
    public static final java.lang.String _InvoiceAmount = "InvoiceAmount";
    public static final java.lang.String _CodAmountOriginal = "CodAmountOriginal";
    public static final java.lang.String _ThirdPartyInsurance = "ThirdPartyInsurance";
    public static final AmountKind Unknown = new AmountKind(_Unknown);
    public static final AmountKind Price1 = new AmountKind(_Price1);
    public static final AmountKind Price2 = new AmountKind(_Price2);
    public static final AmountKind Price3 = new AmountKind(_Price3);
    public static final AmountKind InsuranceValue = new AmountKind(_InsuranceValue);
    public static final AmountKind CodAmount = new AmountKind(_CodAmount);
    public static final AmountKind CarrierSpecifiedPrice = new AmountKind(_CarrierSpecifiedPrice);
    public static final AmountKind CarrierSpecifiedCodAmount = new AmountKind(_CarrierSpecifiedCodAmount);
    public static final AmountKind InsuranceAmountPerPackage = new AmountKind(_InsuranceAmountPerPackage);
    public static final AmountKind FixedPrice = new AmountKind(_FixedPrice);
    public static final AmountKind InvoiceAmount = new AmountKind(_InvoiceAmount);
    public static final AmountKind CodAmountOriginal = new AmountKind(_CodAmountOriginal);
    public static final AmountKind ThirdPartyInsurance = new AmountKind(_ThirdPartyInsurance);
    public java.lang.String getValue() { return _value_;}
    public static AmountKind fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AmountKind enumeration = (AmountKind)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AmountKind fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AmountKind.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "AmountKind"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
