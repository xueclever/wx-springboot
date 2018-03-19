/**
 * GetEvents.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.edisoftwebservices;

public class GetEvents  implements java.io.Serializable {
    private java.lang.String userName;

    private java.lang.String password;

    private java.util.Calendar eventDateTimeStart;

    private java.util.Calendar eventDateTimeEnd;

    public GetEvents() {
    }

    public GetEvents(
           java.lang.String userName,
           java.lang.String password,
           java.util.Calendar eventDateTimeStart,
           java.util.Calendar eventDateTimeEnd) {
           this.userName = userName;
           this.password = password;
           this.eventDateTimeStart = eventDateTimeStart;
           this.eventDateTimeEnd = eventDateTimeEnd;
    }


    /**
     * Gets the userName value for this GetEvents.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this GetEvents.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the password value for this GetEvents.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this GetEvents.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the eventDateTimeStart value for this GetEvents.
     * 
     * @return eventDateTimeStart
     */
    public java.util.Calendar getEventDateTimeStart() {
        return eventDateTimeStart;
    }


    /**
     * Sets the eventDateTimeStart value for this GetEvents.
     * 
     * @param eventDateTimeStart
     */
    public void setEventDateTimeStart(java.util.Calendar eventDateTimeStart) {
        this.eventDateTimeStart = eventDateTimeStart;
    }


    /**
     * Gets the eventDateTimeEnd value for this GetEvents.
     * 
     * @return eventDateTimeEnd
     */
    public java.util.Calendar getEventDateTimeEnd() {
        return eventDateTimeEnd;
    }


    /**
     * Sets the eventDateTimeEnd value for this GetEvents.
     * 
     * @param eventDateTimeEnd
     */
    public void setEventDateTimeEnd(java.util.Calendar eventDateTimeEnd) {
        this.eventDateTimeEnd = eventDateTimeEnd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEvents)) return false;
        GetEvents other = (GetEvents) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.eventDateTimeStart==null && other.getEventDateTimeStart()==null) || 
             (this.eventDateTimeStart!=null &&
              this.eventDateTimeStart.equals(other.getEventDateTimeStart()))) &&
            ((this.eventDateTimeEnd==null && other.getEventDateTimeEnd()==null) || 
             (this.eventDateTimeEnd!=null &&
              this.eventDateTimeEnd.equals(other.getEventDateTimeEnd())));
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
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getEventDateTimeStart() != null) {
            _hashCode += getEventDateTimeStart().hashCode();
        }
        if (getEventDateTimeEnd() != null) {
            _hashCode += getEventDateTimeEnd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEvents.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edisoftwebservices.com/", ">GetEvents"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDateTimeStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "eventDateTimeStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDateTimeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "eventDateTimeEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
