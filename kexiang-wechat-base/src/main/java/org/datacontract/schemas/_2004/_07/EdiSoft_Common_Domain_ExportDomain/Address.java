/**
 * Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain;

public class Address  implements java.io.Serializable {
    private java.lang.String attention;

    private java.lang.String city;

    private java.lang.Integer countryClientId;

    private java.lang.String countryCode;

    private java.lang.String countryName;

    private java.lang.String county;

    private java.lang.String custNo;

    private java.lang.String district;

    private java.lang.String ERPRef;

    private java.lang.String email;

    private java.lang.String fax;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.AddressKind kind;

    private java.lang.String mobile;

    private java.lang.String name1;

    private java.lang.String name2;

    private java.lang.String openingHours;

    private java.lang.String POBox;

    private java.lang.String POCity;

    private java.lang.String POPostCode;

    private java.lang.String phone;

    private java.lang.String postCode;

    private java.lang.String province;

    private java.lang.String receiverRef;

    private java.lang.String region;

    private java.lang.String state;

    private java.lang.String street1;

    private java.lang.String street2;

    public Address() {
    }

    public Address(
           java.lang.String attention,
           java.lang.String city,
           java.lang.Integer countryClientId,
           java.lang.String countryCode,
           java.lang.String countryName,
           java.lang.String county,
           java.lang.String custNo,
           java.lang.String district,
           java.lang.String ERPRef,
           java.lang.String email,
           java.lang.String fax,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.AddressKind kind,
           java.lang.String mobile,
           java.lang.String name1,
           java.lang.String name2,
           java.lang.String openingHours,
           java.lang.String POBox,
           java.lang.String POCity,
           java.lang.String POPostCode,
           java.lang.String phone,
           java.lang.String postCode,
           java.lang.String province,
           java.lang.String receiverRef,
           java.lang.String region,
           java.lang.String state,
           java.lang.String street1,
           java.lang.String street2) {
           this.attention = attention;
           this.city = city;
           this.countryClientId = countryClientId;
           this.countryCode = countryCode;
           this.countryName = countryName;
           this.county = county;
           this.custNo = custNo;
           this.district = district;
           this.ERPRef = ERPRef;
           this.email = email;
           this.fax = fax;
           this.kind = kind;
           this.mobile = mobile;
           this.name1 = name1;
           this.name2 = name2;
           this.openingHours = openingHours;
           this.POBox = POBox;
           this.POCity = POCity;
           this.POPostCode = POPostCode;
           this.phone = phone;
           this.postCode = postCode;
           this.province = province;
           this.receiverRef = receiverRef;
           this.region = region;
           this.state = state;
           this.street1 = street1;
           this.street2 = street2;
    }


    /**
     * Gets the attention value for this Address.
     * 
     * @return attention
     */
    public java.lang.String getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this Address.
     * 
     * @param attention
     */
    public void setAttention(java.lang.String attention) {
        this.attention = attention;
    }


    /**
     * Gets the city value for this Address.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Address.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the countryClientId value for this Address.
     * 
     * @return countryClientId
     */
    public java.lang.Integer getCountryClientId() {
        return countryClientId;
    }


    /**
     * Sets the countryClientId value for this Address.
     * 
     * @param countryClientId
     */
    public void setCountryClientId(java.lang.Integer countryClientId) {
        this.countryClientId = countryClientId;
    }


    /**
     * Gets the countryCode value for this Address.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this Address.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the countryName value for this Address.
     * 
     * @return countryName
     */
    public java.lang.String getCountryName() {
        return countryName;
    }


    /**
     * Sets the countryName value for this Address.
     * 
     * @param countryName
     */
    public void setCountryName(java.lang.String countryName) {
        this.countryName = countryName;
    }


    /**
     * Gets the county value for this Address.
     * 
     * @return county
     */
    public java.lang.String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this Address.
     * 
     * @param county
     */
    public void setCounty(java.lang.String county) {
        this.county = county;
    }


    /**
     * Gets the custNo value for this Address.
     * 
     * @return custNo
     */
    public java.lang.String getCustNo() {
        return custNo;
    }


    /**
     * Sets the custNo value for this Address.
     * 
     * @param custNo
     */
    public void setCustNo(java.lang.String custNo) {
        this.custNo = custNo;
    }


    /**
     * Gets the district value for this Address.
     * 
     * @return district
     */
    public java.lang.String getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this Address.
     * 
     * @param district
     */
    public void setDistrict(java.lang.String district) {
        this.district = district;
    }


    /**
     * Gets the ERPRef value for this Address.
     * 
     * @return ERPRef
     */
    public java.lang.String getERPRef() {
        return ERPRef;
    }


    /**
     * Sets the ERPRef value for this Address.
     * 
     * @param ERPRef
     */
    public void setERPRef(java.lang.String ERPRef) {
        this.ERPRef = ERPRef;
    }


    /**
     * Gets the email value for this Address.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Address.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the fax value for this Address.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Address.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the kind value for this Address.
     * 
     * @return kind
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.AddressKind getKind() {
        return kind;
    }


    /**
     * Sets the kind value for this Address.
     * 
     * @param kind
     */
    public void setKind(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.AddressKind kind) {
        this.kind = kind;
    }


    /**
     * Gets the mobile value for this Address.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this Address.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the name1 value for this Address.
     * 
     * @return name1
     */
    public java.lang.String getName1() {
        return name1;
    }


    /**
     * Sets the name1 value for this Address.
     * 
     * @param name1
     */
    public void setName1(java.lang.String name1) {
        this.name1 = name1;
    }


    /**
     * Gets the name2 value for this Address.
     * 
     * @return name2
     */
    public java.lang.String getName2() {
        return name2;
    }


    /**
     * Sets the name2 value for this Address.
     * 
     * @param name2
     */
    public void setName2(java.lang.String name2) {
        this.name2 = name2;
    }


    /**
     * Gets the openingHours value for this Address.
     * 
     * @return openingHours
     */
    public java.lang.String getOpeningHours() {
        return openingHours;
    }


    /**
     * Sets the openingHours value for this Address.
     * 
     * @param openingHours
     */
    public void setOpeningHours(java.lang.String openingHours) {
        this.openingHours = openingHours;
    }


    /**
     * Gets the POBox value for this Address.
     * 
     * @return POBox
     */
    public java.lang.String getPOBox() {
        return POBox;
    }


    /**
     * Sets the POBox value for this Address.
     * 
     * @param POBox
     */
    public void setPOBox(java.lang.String POBox) {
        this.POBox = POBox;
    }


    /**
     * Gets the POCity value for this Address.
     * 
     * @return POCity
     */
    public java.lang.String getPOCity() {
        return POCity;
    }


    /**
     * Sets the POCity value for this Address.
     * 
     * @param POCity
     */
    public void setPOCity(java.lang.String POCity) {
        this.POCity = POCity;
    }


    /**
     * Gets the POPostCode value for this Address.
     * 
     * @return POPostCode
     */
    public java.lang.String getPOPostCode() {
        return POPostCode;
    }


    /**
     * Sets the POPostCode value for this Address.
     * 
     * @param POPostCode
     */
    public void setPOPostCode(java.lang.String POPostCode) {
        this.POPostCode = POPostCode;
    }


    /**
     * Gets the phone value for this Address.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Address.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the postCode value for this Address.
     * 
     * @return postCode
     */
    public java.lang.String getPostCode() {
        return postCode;
    }


    /**
     * Sets the postCode value for this Address.
     * 
     * @param postCode
     */
    public void setPostCode(java.lang.String postCode) {
        this.postCode = postCode;
    }


    /**
     * Gets the province value for this Address.
     * 
     * @return province
     */
    public java.lang.String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this Address.
     * 
     * @param province
     */
    public void setProvince(java.lang.String province) {
        this.province = province;
    }


    /**
     * Gets the receiverRef value for this Address.
     * 
     * @return receiverRef
     */
    public java.lang.String getReceiverRef() {
        return receiverRef;
    }


    /**
     * Sets the receiverRef value for this Address.
     * 
     * @param receiverRef
     */
    public void setReceiverRef(java.lang.String receiverRef) {
        this.receiverRef = receiverRef;
    }


    /**
     * Gets the region value for this Address.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this Address.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the state value for this Address.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Address.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the street1 value for this Address.
     * 
     * @return street1
     */
    public java.lang.String getStreet1() {
        return street1;
    }


    /**
     * Sets the street1 value for this Address.
     * 
     * @param street1
     */
    public void setStreet1(java.lang.String street1) {
        this.street1 = street1;
    }


    /**
     * Gets the street2 value for this Address.
     * 
     * @return street2
     */
    public java.lang.String getStreet2() {
        return street2;
    }


    /**
     * Sets the street2 value for this Address.
     * 
     * @param street2
     */
    public void setStreet2(java.lang.String street2) {
        this.street2 = street2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Address)) return false;
        Address other = (Address) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              this.attention.equals(other.getAttention()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.countryClientId==null && other.getCountryClientId()==null) || 
             (this.countryClientId!=null &&
              this.countryClientId.equals(other.getCountryClientId()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.countryName==null && other.getCountryName()==null) || 
             (this.countryName!=null &&
              this.countryName.equals(other.getCountryName()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.custNo==null && other.getCustNo()==null) || 
             (this.custNo!=null &&
              this.custNo.equals(other.getCustNo()))) &&
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            ((this.ERPRef==null && other.getERPRef()==null) || 
             (this.ERPRef!=null &&
              this.ERPRef.equals(other.getERPRef()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.kind==null && other.getKind()==null) || 
             (this.kind!=null &&
              this.kind.equals(other.getKind()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.name1==null && other.getName1()==null) || 
             (this.name1!=null &&
              this.name1.equals(other.getName1()))) &&
            ((this.name2==null && other.getName2()==null) || 
             (this.name2!=null &&
              this.name2.equals(other.getName2()))) &&
            ((this.openingHours==null && other.getOpeningHours()==null) || 
             (this.openingHours!=null &&
              this.openingHours.equals(other.getOpeningHours()))) &&
            ((this.POBox==null && other.getPOBox()==null) || 
             (this.POBox!=null &&
              this.POBox.equals(other.getPOBox()))) &&
            ((this.POCity==null && other.getPOCity()==null) || 
             (this.POCity!=null &&
              this.POCity.equals(other.getPOCity()))) &&
            ((this.POPostCode==null && other.getPOPostCode()==null) || 
             (this.POPostCode!=null &&
              this.POPostCode.equals(other.getPOPostCode()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.postCode==null && other.getPostCode()==null) || 
             (this.postCode!=null &&
              this.postCode.equals(other.getPostCode()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince()))) &&
            ((this.receiverRef==null && other.getReceiverRef()==null) || 
             (this.receiverRef!=null &&
              this.receiverRef.equals(other.getReceiverRef()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.street1==null && other.getStreet1()==null) || 
             (this.street1!=null &&
              this.street1.equals(other.getStreet1()))) &&
            ((this.street2==null && other.getStreet2()==null) || 
             (this.street2!=null &&
              this.street2.equals(other.getStreet2())));
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
        if (getAttention() != null) {
            _hashCode += getAttention().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCountryClientId() != null) {
            _hashCode += getCountryClientId().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getCountryName() != null) {
            _hashCode += getCountryName().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getCustNo() != null) {
            _hashCode += getCustNo().hashCode();
        }
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        if (getERPRef() != null) {
            _hashCode += getERPRef().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getKind() != null) {
            _hashCode += getKind().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getName1() != null) {
            _hashCode += getName1().hashCode();
        }
        if (getName2() != null) {
            _hashCode += getName2().hashCode();
        }
        if (getOpeningHours() != null) {
            _hashCode += getOpeningHours().hashCode();
        }
        if (getPOBox() != null) {
            _hashCode += getPOBox().hashCode();
        }
        if (getPOCity() != null) {
            _hashCode += getPOCity().hashCode();
        }
        if (getPOPostCode() != null) {
            _hashCode += getPOPostCode().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPostCode() != null) {
            _hashCode += getPostCode().hashCode();
        }
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        if (getReceiverRef() != null) {
            _hashCode += getReceiverRef().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStreet1() != null) {
            _hashCode += getStreet1().hashCode();
        }
        if (getStreet2() != null) {
            _hashCode += getStreet2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Address.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Address"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Attention"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryClientId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "CountryClientId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "CountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "CountryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "County"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "CustNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("district");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "District"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERPRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ERPRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Kind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "AddressKind"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Name1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Name2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openingHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "OpeningHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POBox");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "POBox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "POCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POPostCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "POPostCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PostCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("province");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Province"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ReceiverRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Street1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Street2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
