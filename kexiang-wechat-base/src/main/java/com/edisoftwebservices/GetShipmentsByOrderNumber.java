/**
 * GetShipmentsByOrderNumber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.edisoftwebservices;

public class GetShipmentsByOrderNumber  implements java.io.Serializable {
    private java.lang.String userName;

    private java.lang.String password;

    private java.lang.String installationValue;

    private int[] actors;

    private java.lang.String referenceNumber;

    private java.util.Calendar startDateTime;

    private java.util.Calendar endDateTime;

    private java.lang.String[] requestConfig;

    public GetShipmentsByOrderNumber() {
    }

    public GetShipmentsByOrderNumber(
           java.lang.String userName,
           java.lang.String password,
           java.lang.String installationValue,
           int[] actors,
           java.lang.String referenceNumber,
           java.util.Calendar startDateTime,
           java.util.Calendar endDateTime,
           java.lang.String[] requestConfig) {
           this.userName = userName;
           this.password = password;
           this.installationValue = installationValue;
           this.actors = actors;
           this.referenceNumber = referenceNumber;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.requestConfig = requestConfig;
    }


    /**
     * Gets the userName value for this GetShipmentsByOrderNumber.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this GetShipmentsByOrderNumber.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the password value for this GetShipmentsByOrderNumber.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this GetShipmentsByOrderNumber.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the installationValue value for this GetShipmentsByOrderNumber.
     * 
     * @return installationValue
     */
    public java.lang.String getInstallationValue() {
        return installationValue;
    }


    /**
     * Sets the installationValue value for this GetShipmentsByOrderNumber.
     * 
     * @param installationValue
     */
    public void setInstallationValue(java.lang.String installationValue) {
        this.installationValue = installationValue;
    }


    /**
     * Gets the actors value for this GetShipmentsByOrderNumber.
     * 
     * @return actors
     */
    public int[] getActors() {
        return actors;
    }


    /**
     * Sets the actors value for this GetShipmentsByOrderNumber.
     * 
     * @param actors
     */
    public void setActors(int[] actors) {
        this.actors = actors;
    }


    /**
     * Gets the referenceNumber value for this GetShipmentsByOrderNumber.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this GetShipmentsByOrderNumber.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the startDateTime value for this GetShipmentsByOrderNumber.
     * 
     * @return startDateTime
     */
    public java.util.Calendar getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this GetShipmentsByOrderNumber.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.util.Calendar startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this GetShipmentsByOrderNumber.
     * 
     * @return endDateTime
     */
    public java.util.Calendar getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this GetShipmentsByOrderNumber.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(java.util.Calendar endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the requestConfig value for this GetShipmentsByOrderNumber.
     * 
     * @return requestConfig
     */
    public java.lang.String[] getRequestConfig() {
        return requestConfig;
    }


    /**
     * Sets the requestConfig value for this GetShipmentsByOrderNumber.
     * 
     * @param requestConfig
     */
    public void setRequestConfig(java.lang.String[] requestConfig) {
        this.requestConfig = requestConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetShipmentsByOrderNumber)) return false;
        GetShipmentsByOrderNumber other = (GetShipmentsByOrderNumber) obj;
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
            ((this.installationValue==null && other.getInstallationValue()==null) || 
             (this.installationValue!=null &&
              this.installationValue.equals(other.getInstallationValue()))) &&
            ((this.actors==null && other.getActors()==null) || 
             (this.actors!=null &&
              java.util.Arrays.equals(this.actors, other.getActors()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.requestConfig==null && other.getRequestConfig()==null) || 
             (this.requestConfig!=null &&
              java.util.Arrays.equals(this.requestConfig, other.getRequestConfig())));
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
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getRequestConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestConfig(), i);
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
        new org.apache.axis.description.TypeDesc(GetShipmentsByOrderNumber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://edisoftwebservices.com/", ">GetShipmentsByOrderNumber"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://edisoftwebservices.com/", "requestConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EDISoft.Portal.Endpoints.Services.PortalDataWS.Configuration", "RequestConfiguration"));
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
