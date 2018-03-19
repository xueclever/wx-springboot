/**
 * GetCarrierEventsByEventCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.edisoftwebservices;

public class GetCarrierEventsByEventCode  implements java.io.Serializable {
    private java.lang.String userName;

    private java.lang.String password;

    private java.util.Calendar eventDateTimeStart;

    private java.util.Calendar eventDateTimeEnd;

    private java.lang.String[] eventCodes;

    private java.lang.String installationValue;

    private int[] actors;

    public GetCarrierEventsByEventCode() {
    }

    public GetCarrierEventsByEventCode(
           java.lang.String userName,
           java.lang.String password,
           java.util.Calendar eventDateTimeStart,
           java.util.Calendar eventDateTimeEnd,
           java.lang.String[] eventCodes,
           java.lang.String installationValue,
           int[] actors) {
           this.userName = userName;
           this.password = password;
           this.eventDateTimeStart = eventDateTimeStart;
           this.eventDateTimeEnd = eventDateTimeEnd;
           this.eventCodes = eventCodes;
           this.installationValue = installationValue;
           this.actors = actors;
    }


    /**
     * Gets the userName value for this GetCarrierEventsByEventCode.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this GetCarrierEventsByEventCode.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the password value for this GetCarrierEventsByEventCode.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this GetCarrierEventsByEventCode.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the eventDateTimeStart value for this GetCarrierEventsByEventCode.
     * 
     * @return eventDateTimeStart
     */
    public java.util.Calendar getEventDateTimeStart() {
        return eventDateTimeStart;
    }


    /**
     * Sets the eventDateTimeStart value for this GetCarrierEventsByEventCode.
     * 
     * @param eventDateTimeStart
     */
    public void setEventDateTimeStart(java.util.Calendar eventDateTimeStart) {
        this.eventDateTimeStart = eventDateTimeStart;
    }


    /**
     * Gets the eventDateTimeEnd value for this GetCarrierEventsByEventCode.
     * 
     * @return eventDateTimeEnd
     */
    public java.util.Calendar getEventDateTimeEnd() {
        return eventDateTimeEnd;
    }


    /**
     * Sets the eventDateTimeEnd value for this GetCarrierEventsByEventCode.
     * 
     * @param eventDateTimeEnd
     */
    public void setEventDateTimeEnd(java.util.Calendar eventDateTimeEnd) {
        this.eventDateTimeEnd = eventDateTimeEnd;
    }


    /**
     * Gets the eventCodes value for this GetCarrierEventsByEventCode.
     * 
     * @return eventCodes
     */
    public java.lang.String[] getEventCodes() {
        return eventCodes;
    }


    /**
     * Sets the eventCodes value for this GetCarrierEventsByEventCode.
     * 
     * @param eventCodes
     */
    public void setEventCodes(java.lang.String[] eventCodes) {
        this.eventCodes = eventCodes;
    }


    /**
     * Gets the installationValue value for this GetCarrierEventsByEventCode.
     * 
     * @return installationValue
     */
    public java.lang.String getInstallationValue() {
        return installationValue;
    }


    /**
     * Sets the installationValue value for this GetCarrierEventsByEventCode.
     * 
     * @param installationValue
     */
    public void setInstallationValue(java.lang.String installationValue) {
        this.installationValue = installationValue;
    }


    /**
     * Gets the actors value for this GetCarrierEventsByEventCode.
     * 
     * @return actors
     */
    public int[] getActors() {
        return actors;
    }


    /**
     * Sets the actors value for this GetCarrierEventsByEventCode.
     * 
     * @param actors
     */
    public void setActors(int[] actors) {
        this.actors = actors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCarrierEventsByEventCode)) return false;
        GetCarrierEventsByEventCode other = (GetCarrierEventsByEventCode) obj;
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
              this.eventDateTimeEnd.equals(other.getEventDateTimeEnd()))) &&
            ((this.eventCodes==null && other.getEventCodes()==null) || 
             (this.eventCodes!=null &&
              java.util.Arrays.equals(this.eventCodes, other.getEventCodes()))) &&
            ((this.installationValue==null && other.getInstallationValue()==null) || 
             (this.installationValue!=null &&
              this.installationValue.equals(other.getInstallationValue()))) &&
            ((this.actors==null && other.getActors()==null) || 
             (this.actors!=null &&
              java.util.Arrays.equals(this.actors, other.getActors())));
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
        if (getEventCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInstallationValue() != null) {
            _hashCode += getInstallationValue().hashCode();
        }
        if (getActors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActors(), i);
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
        new org.apache.axis.description.TypeDesc(GetCarrierEventsByEventCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edisoftwebservices.com/", ">GetCarrierEventsByEventCode"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "eventCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installationValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "installationValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "actors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
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
