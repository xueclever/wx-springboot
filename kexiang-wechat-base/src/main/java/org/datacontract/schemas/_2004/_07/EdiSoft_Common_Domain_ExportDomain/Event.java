/**
 * Event.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain;

public class Event  implements java.io.Serializable {
    private java.lang.String baseEventGuid;

    private java.lang.String carrierName;

    private java.lang.String cityName;

    private java.lang.String comments;

    private java.lang.String country;

    private java.util.Calendar date;

    private java.lang.String deviceId;

    private java.math.BigDecimal discountAmount;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.DynamicProperty[] dynamicList;

    private java.lang.String epiNumber;

    private java.lang.String extraFieldValue;

    private java.lang.String fileBase64;

    private java.lang.String fileUrl;

    private java.lang.Double gpsLatitude;

    private java.lang.Double gpsLongitude;

    private java.lang.Integer height;

    private java.lang.Integer kindId;

    private java.lang.Integer length;

    private java.lang.Integer loadMeter;

    private java.lang.String locationDesc;

    private java.lang.Integer locationId;

    private java.lang.String mobileEventCode;

    private java.lang.String nameInSignature;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_Events_Interfaces.BaseEventEventOrigin origin;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.EventParent parent;

    private java.lang.String postalCode;

    private java.math.BigDecimal priceBruto;

    private java.math.BigDecimal priceNetto;

    private java.util.Calendar serverDate;

    private java.lang.String signatureUrl;

    private java.lang.String statusCode;

    private java.lang.String statusState;

    private java.lang.String statusText;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.SubEvent subEventList;

    private java.lang.String[] type;

    private java.lang.Integer userId;

    private java.lang.Long volume;

    private java.lang.Integer weight;

    private java.lang.Integer width;

    public Event() {
    }

    public Event(
           java.lang.String baseEventGuid,
           java.lang.String carrierName,
           java.lang.String cityName,
           java.lang.String comments,
           java.lang.String country,
           java.util.Calendar date,
           java.lang.String deviceId,
           java.math.BigDecimal discountAmount,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.DynamicProperty[] dynamicList,
           java.lang.String epiNumber,
           java.lang.String extraFieldValue,
           java.lang.String fileBase64,
           java.lang.String fileUrl,
           java.lang.Double gpsLatitude,
           java.lang.Double gpsLongitude,
           java.lang.Integer height,
           java.lang.Integer kindId,
           java.lang.Integer length,
           java.lang.Integer loadMeter,
           java.lang.String locationDesc,
           java.lang.Integer locationId,
           java.lang.String mobileEventCode,
           java.lang.String nameInSignature,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_Events_Interfaces.BaseEventEventOrigin origin,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.EventParent parent,
           java.lang.String postalCode,
           java.math.BigDecimal priceBruto,
           java.math.BigDecimal priceNetto,
           java.util.Calendar serverDate,
           java.lang.String signatureUrl,
           java.lang.String statusCode,
           java.lang.String statusState,
           java.lang.String statusText,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.SubEvent subEventList,
           java.lang.String[] type,
           java.lang.Integer userId,
           java.lang.Long volume,
           java.lang.Integer weight,
           java.lang.Integer width) {
           this.baseEventGuid = baseEventGuid;
           this.carrierName = carrierName;
           this.cityName = cityName;
           this.comments = comments;
           this.country = country;
           this.date = date;
           this.deviceId = deviceId;
           this.discountAmount = discountAmount;
           this.dynamicList = dynamicList;
           this.epiNumber = epiNumber;
           this.extraFieldValue = extraFieldValue;
           this.fileBase64 = fileBase64;
           this.fileUrl = fileUrl;
           this.gpsLatitude = gpsLatitude;
           this.gpsLongitude = gpsLongitude;
           this.height = height;
           this.kindId = kindId;
           this.length = length;
           this.loadMeter = loadMeter;
           this.locationDesc = locationDesc;
           this.locationId = locationId;
           this.mobileEventCode = mobileEventCode;
           this.nameInSignature = nameInSignature;
           this.origin = origin;
           this.parent = parent;
           this.postalCode = postalCode;
           this.priceBruto = priceBruto;
           this.priceNetto = priceNetto;
           this.serverDate = serverDate;
           this.signatureUrl = signatureUrl;
           this.statusCode = statusCode;
           this.statusState = statusState;
           this.statusText = statusText;
           this.subEventList = subEventList;
           this.type = type;
           this.userId = userId;
           this.volume = volume;
           this.weight = weight;
           this.width = width;
    }


    /**
     * Gets the baseEventGuid value for this Event.
     * 
     * @return baseEventGuid
     */
    public java.lang.String getBaseEventGuid() {
        return baseEventGuid;
    }


    /**
     * Sets the baseEventGuid value for this Event.
     * 
     * @param baseEventGuid
     */
    public void setBaseEventGuid(java.lang.String baseEventGuid) {
        this.baseEventGuid = baseEventGuid;
    }


    /**
     * Gets the carrierName value for this Event.
     * 
     * @return carrierName
     */
    public java.lang.String getCarrierName() {
        return carrierName;
    }


    /**
     * Sets the carrierName value for this Event.
     * 
     * @param carrierName
     */
    public void setCarrierName(java.lang.String carrierName) {
        this.carrierName = carrierName;
    }


    /**
     * Gets the cityName value for this Event.
     * 
     * @return cityName
     */
    public java.lang.String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this Event.
     * 
     * @param cityName
     */
    public void setCityName(java.lang.String cityName) {
        this.cityName = cityName;
    }


    /**
     * Gets the comments value for this Event.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Event.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the country value for this Event.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Event.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the date value for this Event.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this Event.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the deviceId value for this Event.
     * 
     * @return deviceId
     */
    public java.lang.String getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this Event.
     * 
     * @param deviceId
     */
    public void setDeviceId(java.lang.String deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the discountAmount value for this Event.
     * 
     * @return discountAmount
     */
    public java.math.BigDecimal getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this Event.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(java.math.BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }


    /**
     * Gets the dynamicList value for this Event.
     * 
     * @return dynamicList
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.DynamicProperty[] getDynamicList() {
        return dynamicList;
    }


    /**
     * Sets the dynamicList value for this Event.
     * 
     * @param dynamicList
     */
    public void setDynamicList(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.DynamicProperty[] dynamicList) {
        this.dynamicList = dynamicList;
    }


    /**
     * Gets the epiNumber value for this Event.
     * 
     * @return epiNumber
     */
    public java.lang.String getEpiNumber() {
        return epiNumber;
    }


    /**
     * Sets the epiNumber value for this Event.
     * 
     * @param epiNumber
     */
    public void setEpiNumber(java.lang.String epiNumber) {
        this.epiNumber = epiNumber;
    }


    /**
     * Gets the extraFieldValue value for this Event.
     * 
     * @return extraFieldValue
     */
    public java.lang.String getExtraFieldValue() {
        return extraFieldValue;
    }


    /**
     * Sets the extraFieldValue value for this Event.
     * 
     * @param extraFieldValue
     */
    public void setExtraFieldValue(java.lang.String extraFieldValue) {
        this.extraFieldValue = extraFieldValue;
    }


    /**
     * Gets the fileBase64 value for this Event.
     * 
     * @return fileBase64
     */
    public java.lang.String getFileBase64() {
        return fileBase64;
    }


    /**
     * Sets the fileBase64 value for this Event.
     * 
     * @param fileBase64
     */
    public void setFileBase64(java.lang.String fileBase64) {
        this.fileBase64 = fileBase64;
    }


    /**
     * Gets the fileUrl value for this Event.
     * 
     * @return fileUrl
     */
    public java.lang.String getFileUrl() {
        return fileUrl;
    }


    /**
     * Sets the fileUrl value for this Event.
     * 
     * @param fileUrl
     */
    public void setFileUrl(java.lang.String fileUrl) {
        this.fileUrl = fileUrl;
    }


    /**
     * Gets the gpsLatitude value for this Event.
     * 
     * @return gpsLatitude
     */
    public java.lang.Double getGpsLatitude() {
        return gpsLatitude;
    }


    /**
     * Sets the gpsLatitude value for this Event.
     * 
     * @param gpsLatitude
     */
    public void setGpsLatitude(java.lang.Double gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }


    /**
     * Gets the gpsLongitude value for this Event.
     * 
     * @return gpsLongitude
     */
    public java.lang.Double getGpsLongitude() {
        return gpsLongitude;
    }


    /**
     * Sets the gpsLongitude value for this Event.
     * 
     * @param gpsLongitude
     */
    public void setGpsLongitude(java.lang.Double gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }


    /**
     * Gets the height value for this Event.
     * 
     * @return height
     */
    public java.lang.Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this Event.
     * 
     * @param height
     */
    public void setHeight(java.lang.Integer height) {
        this.height = height;
    }


    /**
     * Gets the kindId value for this Event.
     * 
     * @return kindId
     */
    public java.lang.Integer getKindId() {
        return kindId;
    }


    /**
     * Sets the kindId value for this Event.
     * 
     * @param kindId
     */
    public void setKindId(java.lang.Integer kindId) {
        this.kindId = kindId;
    }


    /**
     * Gets the length value for this Event.
     * 
     * @return length
     */
    public java.lang.Integer getLength() {
        return length;
    }


    /**
     * Sets the length value for this Event.
     * 
     * @param length
     */
    public void setLength(java.lang.Integer length) {
        this.length = length;
    }


    /**
     * Gets the loadMeter value for this Event.
     * 
     * @return loadMeter
     */
    public java.lang.Integer getLoadMeter() {
        return loadMeter;
    }


    /**
     * Sets the loadMeter value for this Event.
     * 
     * @param loadMeter
     */
    public void setLoadMeter(java.lang.Integer loadMeter) {
        this.loadMeter = loadMeter;
    }


    /**
     * Gets the locationDesc value for this Event.
     * 
     * @return locationDesc
     */
    public java.lang.String getLocationDesc() {
        return locationDesc;
    }


    /**
     * Sets the locationDesc value for this Event.
     * 
     * @param locationDesc
     */
    public void setLocationDesc(java.lang.String locationDesc) {
        this.locationDesc = locationDesc;
    }


    /**
     * Gets the locationId value for this Event.
     * 
     * @return locationId
     */
    public java.lang.Integer getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this Event.
     * 
     * @param locationId
     */
    public void setLocationId(java.lang.Integer locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the mobileEventCode value for this Event.
     * 
     * @return mobileEventCode
     */
    public java.lang.String getMobileEventCode() {
        return mobileEventCode;
    }


    /**
     * Sets the mobileEventCode value for this Event.
     * 
     * @param mobileEventCode
     */
    public void setMobileEventCode(java.lang.String mobileEventCode) {
        this.mobileEventCode = mobileEventCode;
    }


    /**
     * Gets the nameInSignature value for this Event.
     * 
     * @return nameInSignature
     */
    public java.lang.String getNameInSignature() {
        return nameInSignature;
    }


    /**
     * Sets the nameInSignature value for this Event.
     * 
     * @param nameInSignature
     */
    public void setNameInSignature(java.lang.String nameInSignature) {
        this.nameInSignature = nameInSignature;
    }


    /**
     * Gets the origin value for this Event.
     * 
     * @return origin
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_Events_Interfaces.BaseEventEventOrigin getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this Event.
     * 
     * @param origin
     */
    public void setOrigin(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_Events_Interfaces.BaseEventEventOrigin origin) {
        this.origin = origin;
    }


    /**
     * Gets the parent value for this Event.
     * 
     * @return parent
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.EventParent getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Event.
     * 
     * @param parent
     */
    public void setParent(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.EventParent parent) {
        this.parent = parent;
    }


    /**
     * Gets the postalCode value for this Event.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this Event.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the priceBruto value for this Event.
     * 
     * @return priceBruto
     */
    public java.math.BigDecimal getPriceBruto() {
        return priceBruto;
    }


    /**
     * Sets the priceBruto value for this Event.
     * 
     * @param priceBruto
     */
    public void setPriceBruto(java.math.BigDecimal priceBruto) {
        this.priceBruto = priceBruto;
    }


    /**
     * Gets the priceNetto value for this Event.
     * 
     * @return priceNetto
     */
    public java.math.BigDecimal getPriceNetto() {
        return priceNetto;
    }


    /**
     * Sets the priceNetto value for this Event.
     * 
     * @param priceNetto
     */
    public void setPriceNetto(java.math.BigDecimal priceNetto) {
        this.priceNetto = priceNetto;
    }


    /**
     * Gets the serverDate value for this Event.
     * 
     * @return serverDate
     */
    public java.util.Calendar getServerDate() {
        return serverDate;
    }


    /**
     * Sets the serverDate value for this Event.
     * 
     * @param serverDate
     */
    public void setServerDate(java.util.Calendar serverDate) {
        this.serverDate = serverDate;
    }


    /**
     * Gets the signatureUrl value for this Event.
     * 
     * @return signatureUrl
     */
    public java.lang.String getSignatureUrl() {
        return signatureUrl;
    }


    /**
     * Sets the signatureUrl value for this Event.
     * 
     * @param signatureUrl
     */
    public void setSignatureUrl(java.lang.String signatureUrl) {
        this.signatureUrl = signatureUrl;
    }


    /**
     * Gets the statusCode value for this Event.
     * 
     * @return statusCode
     */
    public java.lang.String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this Event.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusState value for this Event.
     * 
     * @return statusState
     */
    public java.lang.String getStatusState() {
        return statusState;
    }


    /**
     * Sets the statusState value for this Event.
     * 
     * @param statusState
     */
    public void setStatusState(java.lang.String statusState) {
        this.statusState = statusState;
    }


    /**
     * Gets the statusText value for this Event.
     * 
     * @return statusText
     */
    public java.lang.String getStatusText() {
        return statusText;
    }


    /**
     * Sets the statusText value for this Event.
     * 
     * @param statusText
     */
    public void setStatusText(java.lang.String statusText) {
        this.statusText = statusText;
    }


    /**
     * Gets the subEventList value for this Event.
     * 
     * @return subEventList
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.SubEvent getSubEventList() {
        return subEventList;
    }


    /**
     * Sets the subEventList value for this Event.
     * 
     * @param subEventList
     */
    public void setSubEventList(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.SubEvent subEventList) {
        this.subEventList = subEventList;
    }


    /**
     * Gets the type value for this Event.
     * 
     * @return type
     */
    public java.lang.String[] getType() {
        return type;
    }


    /**
     * Sets the type value for this Event.
     * 
     * @param type
     */
    public void setType(java.lang.String[] type) {
        this.type = type;
    }


    /**
     * Gets the userId value for this Event.
     * 
     * @return userId
     */
    public java.lang.Integer getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this Event.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Integer userId) {
        this.userId = userId;
    }


    /**
     * Gets the volume value for this Event.
     * 
     * @return volume
     */
    public java.lang.Long getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this Event.
     * 
     * @param volume
     */
    public void setVolume(java.lang.Long volume) {
        this.volume = volume;
    }


    /**
     * Gets the weight value for this Event.
     * 
     * @return weight
     */
    public java.lang.Integer getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this Event.
     * 
     * @param weight
     */
    public void setWeight(java.lang.Integer weight) {
        this.weight = weight;
    }


    /**
     * Gets the width value for this Event.
     * 
     * @return width
     */
    public java.lang.Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this Event.
     * 
     * @param width
     */
    public void setWidth(java.lang.Integer width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Event)) return false;
        Event other = (Event) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseEventGuid==null && other.getBaseEventGuid()==null) || 
             (this.baseEventGuid!=null &&
              this.baseEventGuid.equals(other.getBaseEventGuid()))) &&
            ((this.carrierName==null && other.getCarrierName()==null) || 
             (this.carrierName!=null &&
              this.carrierName.equals(other.getCarrierName()))) &&
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount()))) &&
            ((this.dynamicList==null && other.getDynamicList()==null) || 
             (this.dynamicList!=null &&
              java.util.Arrays.equals(this.dynamicList, other.getDynamicList()))) &&
            ((this.epiNumber==null && other.getEpiNumber()==null) || 
             (this.epiNumber!=null &&
              this.epiNumber.equals(other.getEpiNumber()))) &&
            ((this.extraFieldValue==null && other.getExtraFieldValue()==null) || 
             (this.extraFieldValue!=null &&
              this.extraFieldValue.equals(other.getExtraFieldValue()))) &&
            ((this.fileBase64==null && other.getFileBase64()==null) || 
             (this.fileBase64!=null &&
              this.fileBase64.equals(other.getFileBase64()))) &&
            ((this.fileUrl==null && other.getFileUrl()==null) || 
             (this.fileUrl!=null &&
              this.fileUrl.equals(other.getFileUrl()))) &&
            ((this.gpsLatitude==null && other.getGpsLatitude()==null) || 
             (this.gpsLatitude!=null &&
              this.gpsLatitude.equals(other.getGpsLatitude()))) &&
            ((this.gpsLongitude==null && other.getGpsLongitude()==null) || 
             (this.gpsLongitude!=null &&
              this.gpsLongitude.equals(other.getGpsLongitude()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.kindId==null && other.getKindId()==null) || 
             (this.kindId!=null &&
              this.kindId.equals(other.getKindId()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.loadMeter==null && other.getLoadMeter()==null) || 
             (this.loadMeter!=null &&
              this.loadMeter.equals(other.getLoadMeter()))) &&
            ((this.locationDesc==null && other.getLocationDesc()==null) || 
             (this.locationDesc!=null &&
              this.locationDesc.equals(other.getLocationDesc()))) &&
            ((this.locationId==null && other.getLocationId()==null) || 
             (this.locationId!=null &&
              this.locationId.equals(other.getLocationId()))) &&
            ((this.mobileEventCode==null && other.getMobileEventCode()==null) || 
             (this.mobileEventCode!=null &&
              this.mobileEventCode.equals(other.getMobileEventCode()))) &&
            ((this.nameInSignature==null && other.getNameInSignature()==null) || 
             (this.nameInSignature!=null &&
              this.nameInSignature.equals(other.getNameInSignature()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.priceBruto==null && other.getPriceBruto()==null) || 
             (this.priceBruto!=null &&
              this.priceBruto.equals(other.getPriceBruto()))) &&
            ((this.priceNetto==null && other.getPriceNetto()==null) || 
             (this.priceNetto!=null &&
              this.priceNetto.equals(other.getPriceNetto()))) &&
            ((this.serverDate==null && other.getServerDate()==null) || 
             (this.serverDate!=null &&
              this.serverDate.equals(other.getServerDate()))) &&
            ((this.signatureUrl==null && other.getSignatureUrl()==null) || 
             (this.signatureUrl!=null &&
              this.signatureUrl.equals(other.getSignatureUrl()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.statusState==null && other.getStatusState()==null) || 
             (this.statusState!=null &&
              this.statusState.equals(other.getStatusState()))) &&
            ((this.statusText==null && other.getStatusText()==null) || 
             (this.statusText!=null &&
              this.statusText.equals(other.getStatusText()))) &&
            ((this.subEventList==null && other.getSubEventList()==null) || 
             (this.subEventList!=null &&
              this.subEventList.equals(other.getSubEventList()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth())));
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
        if (getBaseEventGuid() != null) {
            _hashCode += getBaseEventGuid().hashCode();
        }
        if (getCarrierName() != null) {
            _hashCode += getCarrierName().hashCode();
        }
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
        }
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
        }
        if (getDynamicList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDynamicList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDynamicList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEpiNumber() != null) {
            _hashCode += getEpiNumber().hashCode();
        }
        if (getExtraFieldValue() != null) {
            _hashCode += getExtraFieldValue().hashCode();
        }
        if (getFileBase64() != null) {
            _hashCode += getFileBase64().hashCode();
        }
        if (getFileUrl() != null) {
            _hashCode += getFileUrl().hashCode();
        }
        if (getGpsLatitude() != null) {
            _hashCode += getGpsLatitude().hashCode();
        }
        if (getGpsLongitude() != null) {
            _hashCode += getGpsLongitude().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getKindId() != null) {
            _hashCode += getKindId().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getLoadMeter() != null) {
            _hashCode += getLoadMeter().hashCode();
        }
        if (getLocationDesc() != null) {
            _hashCode += getLocationDesc().hashCode();
        }
        if (getLocationId() != null) {
            _hashCode += getLocationId().hashCode();
        }
        if (getMobileEventCode() != null) {
            _hashCode += getMobileEventCode().hashCode();
        }
        if (getNameInSignature() != null) {
            _hashCode += getNameInSignature().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getPriceBruto() != null) {
            _hashCode += getPriceBruto().hashCode();
        }
        if (getPriceNetto() != null) {
            _hashCode += getPriceNetto().hashCode();
        }
        if (getServerDate() != null) {
            _hashCode += getServerDate().hashCode();
        }
        if (getSignatureUrl() != null) {
            _hashCode += getSignatureUrl().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getStatusState() != null) {
            _hashCode += getStatusState().hashCode();
        }
        if (getStatusText() != null) {
            _hashCode += getStatusText().hashCode();
        }
        if (getSubEventList() != null) {
            _hashCode += getSubEventList().hashCode();
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Event.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Event"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseEventGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "BaseEventGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "CarrierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "CityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DeviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DiscountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DynamicList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DynamicProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DynamicProperty"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("epiNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "EpiNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraFieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ExtraFieldValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileBase64");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "FileBase64"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "FileUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gpsLatitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "GpsLatitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gpsLongitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "GpsLongitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kindId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "KindId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadMeter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "LoadMeter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "LocationDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "LocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileEventCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "MobileEventCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameInSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "NameInSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.Events.Interfaces", "BaseEvent.EventOrigin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "EventParent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceBruto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PriceBruto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceNetto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PriceNetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ServerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SignatureUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "StatusState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "StatusText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subEventList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SubEventList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SubEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.Events.Interfaces", "BaseEvent.EventType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "UserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
