/**
 * DangerousGoods.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain;

public class DangerousGoods  implements java.io.Serializable {
    private java.lang.String ADRtankSpecialProvision;

    private java.lang.String ADRtankTankCode;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DangerousGoodsClass _class;

    private java.lang.String classification;

    private java.lang.Integer count;

    private java.lang.String description;

    private java.lang.String EMSNo;

    private java.lang.String exceptedQuantities;

    private java.lang.String flashPoint;

    private java.lang.Integer goodsLineId;

    private java.lang.Integer grossWeight;

    private java.lang.String identificationNo;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DangerousGoodsKind kind;

    private java.lang.Integer LQCount;

    private java.lang.Integer LQGrossWeight;

    private java.lang.String labels;

    private java.lang.String limitedQuantities;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DangerousGoodsMarinePollutant marinePollutant;

    private java.lang.String mfagNo;

    private java.lang.String mixedPackingProvision;

    private java.lang.String name;

    private java.lang.Integer netWeight;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DangerousGoodsPackingGroup packingGroup;

    private java.lang.String packingInstructions;

    private java.lang.String packingTypeKey;

    private java.lang.String packingTypeName;

    private java.lang.String pageNo;

    private java.lang.String portTankBulkContInstructions;

    private java.lang.String portTankBulkContSpecialProvisions;

    private java.lang.String secondaryClasses;

    private java.lang.String shortName;

    private java.lang.String specialPackingProvision;

    private java.lang.String specialProvisions;

    private java.lang.String specialProvisionsBulk;

    private java.lang.String specialProvisionsHandling;

    private java.lang.String specialProvisionsOperation;

    private java.lang.String specialProvisionsPackages;

    private java.lang.String stowingCategory;

    private java.lang.String transportCategory;

    private java.lang.Integer UN;

    private java.lang.String vehicle;

    private java.lang.Integer vol;

    public DangerousGoods() {
    }

    public DangerousGoods(
           java.lang.String ADRtankSpecialProvision,
           java.lang.String ADRtankTankCode,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DangerousGoodsClass _class,
           java.lang.String classification,
           java.lang.Integer count,
           java.lang.String description,
           java.lang.String EMSNo,
           java.lang.String exceptedQuantities,
           java.lang.String flashPoint,
           java.lang.Integer goodsLineId,
           java.lang.Integer grossWeight,
           java.lang.String identificationNo,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DangerousGoodsKind kind,
           java.lang.Integer LQCount,
           java.lang.Integer LQGrossWeight,
           java.lang.String labels,
           java.lang.String limitedQuantities,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DangerousGoodsMarinePollutant marinePollutant,
           java.lang.String mfagNo,
           java.lang.String mixedPackingProvision,
           java.lang.String name,
           java.lang.Integer netWeight,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DangerousGoodsPackingGroup packingGroup,
           java.lang.String packingInstructions,
           java.lang.String packingTypeKey,
           java.lang.String packingTypeName,
           java.lang.String pageNo,
           java.lang.String portTankBulkContInstructions,
           java.lang.String portTankBulkContSpecialProvisions,
           java.lang.String secondaryClasses,
           java.lang.String shortName,
           java.lang.String specialPackingProvision,
           java.lang.String specialProvisions,
           java.lang.String specialProvisionsBulk,
           java.lang.String specialProvisionsHandling,
           java.lang.String specialProvisionsOperation,
           java.lang.String specialProvisionsPackages,
           java.lang.String stowingCategory,
           java.lang.String transportCategory,
           java.lang.Integer UN,
           java.lang.String vehicle,
           java.lang.Integer vol) {
           this.ADRtankSpecialProvision = ADRtankSpecialProvision;
           this.ADRtankTankCode = ADRtankTankCode;
           this._class = _class;
           this.classification = classification;
           this.count = count;
           this.description = description;
           this.EMSNo = EMSNo;
           this.exceptedQuantities = exceptedQuantities;
           this.flashPoint = flashPoint;
           this.goodsLineId = goodsLineId;
           this.grossWeight = grossWeight;
           this.identificationNo = identificationNo;
           this.kind = kind;
           this.LQCount = LQCount;
           this.LQGrossWeight = LQGrossWeight;
           this.labels = labels;
           this.limitedQuantities = limitedQuantities;
           this.marinePollutant = marinePollutant;
           this.mfagNo = mfagNo;
           this.mixedPackingProvision = mixedPackingProvision;
           this.name = name;
           this.netWeight = netWeight;
           this.packingGroup = packingGroup;
           this.packingInstructions = packingInstructions;
           this.packingTypeKey = packingTypeKey;
           this.packingTypeName = packingTypeName;
           this.pageNo = pageNo;
           this.portTankBulkContInstructions = portTankBulkContInstructions;
           this.portTankBulkContSpecialProvisions = portTankBulkContSpecialProvisions;
           this.secondaryClasses = secondaryClasses;
           this.shortName = shortName;
           this.specialPackingProvision = specialPackingProvision;
           this.specialProvisions = specialProvisions;
           this.specialProvisionsBulk = specialProvisionsBulk;
           this.specialProvisionsHandling = specialProvisionsHandling;
           this.specialProvisionsOperation = specialProvisionsOperation;
           this.specialProvisionsPackages = specialProvisionsPackages;
           this.stowingCategory = stowingCategory;
           this.transportCategory = transportCategory;
           this.UN = UN;
           this.vehicle = vehicle;
           this.vol = vol;
    }


    /**
     * Gets the ADRtankSpecialProvision value for this DangerousGoods.
     * 
     * @return ADRtankSpecialProvision
     */
    public java.lang.String getADRtankSpecialProvision() {
        return ADRtankSpecialProvision;
    }


    /**
     * Sets the ADRtankSpecialProvision value for this DangerousGoods.
     * 
     * @param ADRtankSpecialProvision
     */
    public void setADRtankSpecialProvision(java.lang.String ADRtankSpecialProvision) {
        this.ADRtankSpecialProvision = ADRtankSpecialProvision;
    }


    /**
     * Gets the ADRtankTankCode value for this DangerousGoods.
     * 
     * @return ADRtankTankCode
     */
    public java.lang.String getADRtankTankCode() {
        return ADRtankTankCode;
    }


    /**
     * Sets the ADRtankTankCode value for this DangerousGoods.
     * 
     * @param ADRtankTankCode
     */
    public void setADRtankTankCode(java.lang.String ADRtankTankCode) {
        this.ADRtankTankCode = ADRtankTankCode;
    }


    /**
     * Gets the _class value for this DangerousGoods.
     * 
     * @return _class
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DangerousGoodsClass get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this DangerousGoods.
     * 
     * @param _class
     */
    public void set_class(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DangerousGoodsClass _class) {
        this._class = _class;
    }


    /**
     * Gets the classification value for this DangerousGoods.
     * 
     * @return classification
     */
    public java.lang.String getClassification() {
        return classification;
    }


    /**
     * Sets the classification value for this DangerousGoods.
     * 
     * @param classification
     */
    public void setClassification(java.lang.String classification) {
        this.classification = classification;
    }


    /**
     * Gets the count value for this DangerousGoods.
     * 
     * @return count
     */
    public java.lang.Integer getCount() {
        return count;
    }


    /**
     * Sets the count value for this DangerousGoods.
     * 
     * @param count
     */
    public void setCount(java.lang.Integer count) {
        this.count = count;
    }


    /**
     * Gets the description value for this DangerousGoods.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DangerousGoods.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the EMSNo value for this DangerousGoods.
     * 
     * @return EMSNo
     */
    public java.lang.String getEMSNo() {
        return EMSNo;
    }


    /**
     * Sets the EMSNo value for this DangerousGoods.
     * 
     * @param EMSNo
     */
    public void setEMSNo(java.lang.String EMSNo) {
        this.EMSNo = EMSNo;
    }


    /**
     * Gets the exceptedQuantities value for this DangerousGoods.
     * 
     * @return exceptedQuantities
     */
    public java.lang.String getExceptedQuantities() {
        return exceptedQuantities;
    }


    /**
     * Sets the exceptedQuantities value for this DangerousGoods.
     * 
     * @param exceptedQuantities
     */
    public void setExceptedQuantities(java.lang.String exceptedQuantities) {
        this.exceptedQuantities = exceptedQuantities;
    }


    /**
     * Gets the flashPoint value for this DangerousGoods.
     * 
     * @return flashPoint
     */
    public java.lang.String getFlashPoint() {
        return flashPoint;
    }


    /**
     * Sets the flashPoint value for this DangerousGoods.
     * 
     * @param flashPoint
     */
    public void setFlashPoint(java.lang.String flashPoint) {
        this.flashPoint = flashPoint;
    }


    /**
     * Gets the goodsLineId value for this DangerousGoods.
     * 
     * @return goodsLineId
     */
    public java.lang.Integer getGoodsLineId() {
        return goodsLineId;
    }


    /**
     * Sets the goodsLineId value for this DangerousGoods.
     * 
     * @param goodsLineId
     */
    public void setGoodsLineId(java.lang.Integer goodsLineId) {
        this.goodsLineId = goodsLineId;
    }


    /**
     * Gets the grossWeight value for this DangerousGoods.
     * 
     * @return grossWeight
     */
    public java.lang.Integer getGrossWeight() {
        return grossWeight;
    }


    /**
     * Sets the grossWeight value for this DangerousGoods.
     * 
     * @param grossWeight
     */
    public void setGrossWeight(java.lang.Integer grossWeight) {
        this.grossWeight = grossWeight;
    }


    /**
     * Gets the identificationNo value for this DangerousGoods.
     * 
     * @return identificationNo
     */
    public java.lang.String getIdentificationNo() {
        return identificationNo;
    }


    /**
     * Sets the identificationNo value for this DangerousGoods.
     * 
     * @param identificationNo
     */
    public void setIdentificationNo(java.lang.String identificationNo) {
        this.identificationNo = identificationNo;
    }


    /**
     * Gets the kind value for this DangerousGoods.
     * 
     * @return kind
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DangerousGoodsKind getKind() {
        return kind;
    }


    /**
     * Sets the kind value for this DangerousGoods.
     * 
     * @param kind
     */
    public void setKind(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DangerousGoodsKind kind) {
        this.kind = kind;
    }


    /**
     * Gets the LQCount value for this DangerousGoods.
     * 
     * @return LQCount
     */
    public java.lang.Integer getLQCount() {
        return LQCount;
    }


    /**
     * Sets the LQCount value for this DangerousGoods.
     * 
     * @param LQCount
     */
    public void setLQCount(java.lang.Integer LQCount) {
        this.LQCount = LQCount;
    }


    /**
     * Gets the LQGrossWeight value for this DangerousGoods.
     * 
     * @return LQGrossWeight
     */
    public java.lang.Integer getLQGrossWeight() {
        return LQGrossWeight;
    }


    /**
     * Sets the LQGrossWeight value for this DangerousGoods.
     * 
     * @param LQGrossWeight
     */
    public void setLQGrossWeight(java.lang.Integer LQGrossWeight) {
        this.LQGrossWeight = LQGrossWeight;
    }


    /**
     * Gets the labels value for this DangerousGoods.
     * 
     * @return labels
     */
    public java.lang.String getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this DangerousGoods.
     * 
     * @param labels
     */
    public void setLabels(java.lang.String labels) {
        this.labels = labels;
    }


    /**
     * Gets the limitedQuantities value for this DangerousGoods.
     * 
     * @return limitedQuantities
     */
    public java.lang.String getLimitedQuantities() {
        return limitedQuantities;
    }


    /**
     * Sets the limitedQuantities value for this DangerousGoods.
     * 
     * @param limitedQuantities
     */
    public void setLimitedQuantities(java.lang.String limitedQuantities) {
        this.limitedQuantities = limitedQuantities;
    }


    /**
     * Gets the marinePollutant value for this DangerousGoods.
     * 
     * @return marinePollutant
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DangerousGoodsMarinePollutant getMarinePollutant() {
        return marinePollutant;
    }


    /**
     * Sets the marinePollutant value for this DangerousGoods.
     * 
     * @param marinePollutant
     */
    public void setMarinePollutant(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DangerousGoodsMarinePollutant marinePollutant) {
        this.marinePollutant = marinePollutant;
    }


    /**
     * Gets the mfagNo value for this DangerousGoods.
     * 
     * @return mfagNo
     */
    public java.lang.String getMfagNo() {
        return mfagNo;
    }


    /**
     * Sets the mfagNo value for this DangerousGoods.
     * 
     * @param mfagNo
     */
    public void setMfagNo(java.lang.String mfagNo) {
        this.mfagNo = mfagNo;
    }


    /**
     * Gets the mixedPackingProvision value for this DangerousGoods.
     * 
     * @return mixedPackingProvision
     */
    public java.lang.String getMixedPackingProvision() {
        return mixedPackingProvision;
    }


    /**
     * Sets the mixedPackingProvision value for this DangerousGoods.
     * 
     * @param mixedPackingProvision
     */
    public void setMixedPackingProvision(java.lang.String mixedPackingProvision) {
        this.mixedPackingProvision = mixedPackingProvision;
    }


    /**
     * Gets the name value for this DangerousGoods.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DangerousGoods.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the netWeight value for this DangerousGoods.
     * 
     * @return netWeight
     */
    public java.lang.Integer getNetWeight() {
        return netWeight;
    }


    /**
     * Sets the netWeight value for this DangerousGoods.
     * 
     * @param netWeight
     */
    public void setNetWeight(java.lang.Integer netWeight) {
        this.netWeight = netWeight;
    }


    /**
     * Gets the packingGroup value for this DangerousGoods.
     * 
     * @return packingGroup
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DangerousGoodsPackingGroup getPackingGroup() {
        return packingGroup;
    }


    /**
     * Sets the packingGroup value for this DangerousGoods.
     * 
     * @param packingGroup
     */
    public void setPackingGroup(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.DangerousGoodsPackingGroup packingGroup) {
        this.packingGroup = packingGroup;
    }


    /**
     * Gets the packingInstructions value for this DangerousGoods.
     * 
     * @return packingInstructions
     */
    public java.lang.String getPackingInstructions() {
        return packingInstructions;
    }


    /**
     * Sets the packingInstructions value for this DangerousGoods.
     * 
     * @param packingInstructions
     */
    public void setPackingInstructions(java.lang.String packingInstructions) {
        this.packingInstructions = packingInstructions;
    }


    /**
     * Gets the packingTypeKey value for this DangerousGoods.
     * 
     * @return packingTypeKey
     */
    public java.lang.String getPackingTypeKey() {
        return packingTypeKey;
    }


    /**
     * Sets the packingTypeKey value for this DangerousGoods.
     * 
     * @param packingTypeKey
     */
    public void setPackingTypeKey(java.lang.String packingTypeKey) {
        this.packingTypeKey = packingTypeKey;
    }


    /**
     * Gets the packingTypeName value for this DangerousGoods.
     * 
     * @return packingTypeName
     */
    public java.lang.String getPackingTypeName() {
        return packingTypeName;
    }


    /**
     * Sets the packingTypeName value for this DangerousGoods.
     * 
     * @param packingTypeName
     */
    public void setPackingTypeName(java.lang.String packingTypeName) {
        this.packingTypeName = packingTypeName;
    }


    /**
     * Gets the pageNo value for this DangerousGoods.
     * 
     * @return pageNo
     */
    public java.lang.String getPageNo() {
        return pageNo;
    }


    /**
     * Sets the pageNo value for this DangerousGoods.
     * 
     * @param pageNo
     */
    public void setPageNo(java.lang.String pageNo) {
        this.pageNo = pageNo;
    }


    /**
     * Gets the portTankBulkContInstructions value for this DangerousGoods.
     * 
     * @return portTankBulkContInstructions
     */
    public java.lang.String getPortTankBulkContInstructions() {
        return portTankBulkContInstructions;
    }


    /**
     * Sets the portTankBulkContInstructions value for this DangerousGoods.
     * 
     * @param portTankBulkContInstructions
     */
    public void setPortTankBulkContInstructions(java.lang.String portTankBulkContInstructions) {
        this.portTankBulkContInstructions = portTankBulkContInstructions;
    }


    /**
     * Gets the portTankBulkContSpecialProvisions value for this DangerousGoods.
     * 
     * @return portTankBulkContSpecialProvisions
     */
    public java.lang.String getPortTankBulkContSpecialProvisions() {
        return portTankBulkContSpecialProvisions;
    }


    /**
     * Sets the portTankBulkContSpecialProvisions value for this DangerousGoods.
     * 
     * @param portTankBulkContSpecialProvisions
     */
    public void setPortTankBulkContSpecialProvisions(java.lang.String portTankBulkContSpecialProvisions) {
        this.portTankBulkContSpecialProvisions = portTankBulkContSpecialProvisions;
    }


    /**
     * Gets the secondaryClasses value for this DangerousGoods.
     * 
     * @return secondaryClasses
     */
    public java.lang.String getSecondaryClasses() {
        return secondaryClasses;
    }


    /**
     * Sets the secondaryClasses value for this DangerousGoods.
     * 
     * @param secondaryClasses
     */
    public void setSecondaryClasses(java.lang.String secondaryClasses) {
        this.secondaryClasses = secondaryClasses;
    }


    /**
     * Gets the shortName value for this DangerousGoods.
     * 
     * @return shortName
     */
    public java.lang.String getShortName() {
        return shortName;
    }


    /**
     * Sets the shortName value for this DangerousGoods.
     * 
     * @param shortName
     */
    public void setShortName(java.lang.String shortName) {
        this.shortName = shortName;
    }


    /**
     * Gets the specialPackingProvision value for this DangerousGoods.
     * 
     * @return specialPackingProvision
     */
    public java.lang.String getSpecialPackingProvision() {
        return specialPackingProvision;
    }


    /**
     * Sets the specialPackingProvision value for this DangerousGoods.
     * 
     * @param specialPackingProvision
     */
    public void setSpecialPackingProvision(java.lang.String specialPackingProvision) {
        this.specialPackingProvision = specialPackingProvision;
    }


    /**
     * Gets the specialProvisions value for this DangerousGoods.
     * 
     * @return specialProvisions
     */
    public java.lang.String getSpecialProvisions() {
        return specialProvisions;
    }


    /**
     * Sets the specialProvisions value for this DangerousGoods.
     * 
     * @param specialProvisions
     */
    public void setSpecialProvisions(java.lang.String specialProvisions) {
        this.specialProvisions = specialProvisions;
    }


    /**
     * Gets the specialProvisionsBulk value for this DangerousGoods.
     * 
     * @return specialProvisionsBulk
     */
    public java.lang.String getSpecialProvisionsBulk() {
        return specialProvisionsBulk;
    }


    /**
     * Sets the specialProvisionsBulk value for this DangerousGoods.
     * 
     * @param specialProvisionsBulk
     */
    public void setSpecialProvisionsBulk(java.lang.String specialProvisionsBulk) {
        this.specialProvisionsBulk = specialProvisionsBulk;
    }


    /**
     * Gets the specialProvisionsHandling value for this DangerousGoods.
     * 
     * @return specialProvisionsHandling
     */
    public java.lang.String getSpecialProvisionsHandling() {
        return specialProvisionsHandling;
    }


    /**
     * Sets the specialProvisionsHandling value for this DangerousGoods.
     * 
     * @param specialProvisionsHandling
     */
    public void setSpecialProvisionsHandling(java.lang.String specialProvisionsHandling) {
        this.specialProvisionsHandling = specialProvisionsHandling;
    }


    /**
     * Gets the specialProvisionsOperation value for this DangerousGoods.
     * 
     * @return specialProvisionsOperation
     */
    public java.lang.String getSpecialProvisionsOperation() {
        return specialProvisionsOperation;
    }


    /**
     * Sets the specialProvisionsOperation value for this DangerousGoods.
     * 
     * @param specialProvisionsOperation
     */
    public void setSpecialProvisionsOperation(java.lang.String specialProvisionsOperation) {
        this.specialProvisionsOperation = specialProvisionsOperation;
    }


    /**
     * Gets the specialProvisionsPackages value for this DangerousGoods.
     * 
     * @return specialProvisionsPackages
     */
    public java.lang.String getSpecialProvisionsPackages() {
        return specialProvisionsPackages;
    }


    /**
     * Sets the specialProvisionsPackages value for this DangerousGoods.
     * 
     * @param specialProvisionsPackages
     */
    public void setSpecialProvisionsPackages(java.lang.String specialProvisionsPackages) {
        this.specialProvisionsPackages = specialProvisionsPackages;
    }


    /**
     * Gets the stowingCategory value for this DangerousGoods.
     * 
     * @return stowingCategory
     */
    public java.lang.String getStowingCategory() {
        return stowingCategory;
    }


    /**
     * Sets the stowingCategory value for this DangerousGoods.
     * 
     * @param stowingCategory
     */
    public void setStowingCategory(java.lang.String stowingCategory) {
        this.stowingCategory = stowingCategory;
    }


    /**
     * Gets the transportCategory value for this DangerousGoods.
     * 
     * @return transportCategory
     */
    public java.lang.String getTransportCategory() {
        return transportCategory;
    }


    /**
     * Sets the transportCategory value for this DangerousGoods.
     * 
     * @param transportCategory
     */
    public void setTransportCategory(java.lang.String transportCategory) {
        this.transportCategory = transportCategory;
    }


    /**
     * Gets the UN value for this DangerousGoods.
     * 
     * @return UN
     */
    public java.lang.Integer getUN() {
        return UN;
    }


    /**
     * Sets the UN value for this DangerousGoods.
     * 
     * @param UN
     */
    public void setUN(java.lang.Integer UN) {
        this.UN = UN;
    }


    /**
     * Gets the vehicle value for this DangerousGoods.
     * 
     * @return vehicle
     */
    public java.lang.String getVehicle() {
        return vehicle;
    }


    /**
     * Sets the vehicle value for this DangerousGoods.
     * 
     * @param vehicle
     */
    public void setVehicle(java.lang.String vehicle) {
        this.vehicle = vehicle;
    }


    /**
     * Gets the vol value for this DangerousGoods.
     * 
     * @return vol
     */
    public java.lang.Integer getVol() {
        return vol;
    }


    /**
     * Sets the vol value for this DangerousGoods.
     * 
     * @param vol
     */
    public void setVol(java.lang.Integer vol) {
        this.vol = vol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DangerousGoods)) return false;
        DangerousGoods other = (DangerousGoods) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ADRtankSpecialProvision==null && other.getADRtankSpecialProvision()==null) || 
             (this.ADRtankSpecialProvision!=null &&
              this.ADRtankSpecialProvision.equals(other.getADRtankSpecialProvision()))) &&
            ((this.ADRtankTankCode==null && other.getADRtankTankCode()==null) || 
             (this.ADRtankTankCode!=null &&
              this.ADRtankTankCode.equals(other.getADRtankTankCode()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.classification==null && other.getClassification()==null) || 
             (this.classification!=null &&
              this.classification.equals(other.getClassification()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.EMSNo==null && other.getEMSNo()==null) || 
             (this.EMSNo!=null &&
              this.EMSNo.equals(other.getEMSNo()))) &&
            ((this.exceptedQuantities==null && other.getExceptedQuantities()==null) || 
             (this.exceptedQuantities!=null &&
              this.exceptedQuantities.equals(other.getExceptedQuantities()))) &&
            ((this.flashPoint==null && other.getFlashPoint()==null) || 
             (this.flashPoint!=null &&
              this.flashPoint.equals(other.getFlashPoint()))) &&
            ((this.goodsLineId==null && other.getGoodsLineId()==null) || 
             (this.goodsLineId!=null &&
              this.goodsLineId.equals(other.getGoodsLineId()))) &&
            ((this.grossWeight==null && other.getGrossWeight()==null) || 
             (this.grossWeight!=null &&
              this.grossWeight.equals(other.getGrossWeight()))) &&
            ((this.identificationNo==null && other.getIdentificationNo()==null) || 
             (this.identificationNo!=null &&
              this.identificationNo.equals(other.getIdentificationNo()))) &&
            ((this.kind==null && other.getKind()==null) || 
             (this.kind!=null &&
              this.kind.equals(other.getKind()))) &&
            ((this.LQCount==null && other.getLQCount()==null) || 
             (this.LQCount!=null &&
              this.LQCount.equals(other.getLQCount()))) &&
            ((this.LQGrossWeight==null && other.getLQGrossWeight()==null) || 
             (this.LQGrossWeight!=null &&
              this.LQGrossWeight.equals(other.getLQGrossWeight()))) &&
            ((this.labels==null && other.getLabels()==null) || 
             (this.labels!=null &&
              this.labels.equals(other.getLabels()))) &&
            ((this.limitedQuantities==null && other.getLimitedQuantities()==null) || 
             (this.limitedQuantities!=null &&
              this.limitedQuantities.equals(other.getLimitedQuantities()))) &&
            ((this.marinePollutant==null && other.getMarinePollutant()==null) || 
             (this.marinePollutant!=null &&
              this.marinePollutant.equals(other.getMarinePollutant()))) &&
            ((this.mfagNo==null && other.getMfagNo()==null) || 
             (this.mfagNo!=null &&
              this.mfagNo.equals(other.getMfagNo()))) &&
            ((this.mixedPackingProvision==null && other.getMixedPackingProvision()==null) || 
             (this.mixedPackingProvision!=null &&
              this.mixedPackingProvision.equals(other.getMixedPackingProvision()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.netWeight==null && other.getNetWeight()==null) || 
             (this.netWeight!=null &&
              this.netWeight.equals(other.getNetWeight()))) &&
            ((this.packingGroup==null && other.getPackingGroup()==null) || 
             (this.packingGroup!=null &&
              this.packingGroup.equals(other.getPackingGroup()))) &&
            ((this.packingInstructions==null && other.getPackingInstructions()==null) || 
             (this.packingInstructions!=null &&
              this.packingInstructions.equals(other.getPackingInstructions()))) &&
            ((this.packingTypeKey==null && other.getPackingTypeKey()==null) || 
             (this.packingTypeKey!=null &&
              this.packingTypeKey.equals(other.getPackingTypeKey()))) &&
            ((this.packingTypeName==null && other.getPackingTypeName()==null) || 
             (this.packingTypeName!=null &&
              this.packingTypeName.equals(other.getPackingTypeName()))) &&
            ((this.pageNo==null && other.getPageNo()==null) || 
             (this.pageNo!=null &&
              this.pageNo.equals(other.getPageNo()))) &&
            ((this.portTankBulkContInstructions==null && other.getPortTankBulkContInstructions()==null) || 
             (this.portTankBulkContInstructions!=null &&
              this.portTankBulkContInstructions.equals(other.getPortTankBulkContInstructions()))) &&
            ((this.portTankBulkContSpecialProvisions==null && other.getPortTankBulkContSpecialProvisions()==null) || 
             (this.portTankBulkContSpecialProvisions!=null &&
              this.portTankBulkContSpecialProvisions.equals(other.getPortTankBulkContSpecialProvisions()))) &&
            ((this.secondaryClasses==null && other.getSecondaryClasses()==null) || 
             (this.secondaryClasses!=null &&
              this.secondaryClasses.equals(other.getSecondaryClasses()))) &&
            ((this.shortName==null && other.getShortName()==null) || 
             (this.shortName!=null &&
              this.shortName.equals(other.getShortName()))) &&
            ((this.specialPackingProvision==null && other.getSpecialPackingProvision()==null) || 
             (this.specialPackingProvision!=null &&
              this.specialPackingProvision.equals(other.getSpecialPackingProvision()))) &&
            ((this.specialProvisions==null && other.getSpecialProvisions()==null) || 
             (this.specialProvisions!=null &&
              this.specialProvisions.equals(other.getSpecialProvisions()))) &&
            ((this.specialProvisionsBulk==null && other.getSpecialProvisionsBulk()==null) || 
             (this.specialProvisionsBulk!=null &&
              this.specialProvisionsBulk.equals(other.getSpecialProvisionsBulk()))) &&
            ((this.specialProvisionsHandling==null && other.getSpecialProvisionsHandling()==null) || 
             (this.specialProvisionsHandling!=null &&
              this.specialProvisionsHandling.equals(other.getSpecialProvisionsHandling()))) &&
            ((this.specialProvisionsOperation==null && other.getSpecialProvisionsOperation()==null) || 
             (this.specialProvisionsOperation!=null &&
              this.specialProvisionsOperation.equals(other.getSpecialProvisionsOperation()))) &&
            ((this.specialProvisionsPackages==null && other.getSpecialProvisionsPackages()==null) || 
             (this.specialProvisionsPackages!=null &&
              this.specialProvisionsPackages.equals(other.getSpecialProvisionsPackages()))) &&
            ((this.stowingCategory==null && other.getStowingCategory()==null) || 
             (this.stowingCategory!=null &&
              this.stowingCategory.equals(other.getStowingCategory()))) &&
            ((this.transportCategory==null && other.getTransportCategory()==null) || 
             (this.transportCategory!=null &&
              this.transportCategory.equals(other.getTransportCategory()))) &&
            ((this.UN==null && other.getUN()==null) || 
             (this.UN!=null &&
              this.UN.equals(other.getUN()))) &&
            ((this.vehicle==null && other.getVehicle()==null) || 
             (this.vehicle!=null &&
              this.vehicle.equals(other.getVehicle()))) &&
            ((this.vol==null && other.getVol()==null) || 
             (this.vol!=null &&
              this.vol.equals(other.getVol())));
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
        if (getADRtankSpecialProvision() != null) {
            _hashCode += getADRtankSpecialProvision().hashCode();
        }
        if (getADRtankTankCode() != null) {
            _hashCode += getADRtankTankCode().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getClassification() != null) {
            _hashCode += getClassification().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEMSNo() != null) {
            _hashCode += getEMSNo().hashCode();
        }
        if (getExceptedQuantities() != null) {
            _hashCode += getExceptedQuantities().hashCode();
        }
        if (getFlashPoint() != null) {
            _hashCode += getFlashPoint().hashCode();
        }
        if (getGoodsLineId() != null) {
            _hashCode += getGoodsLineId().hashCode();
        }
        if (getGrossWeight() != null) {
            _hashCode += getGrossWeight().hashCode();
        }
        if (getIdentificationNo() != null) {
            _hashCode += getIdentificationNo().hashCode();
        }
        if (getKind() != null) {
            _hashCode += getKind().hashCode();
        }
        if (getLQCount() != null) {
            _hashCode += getLQCount().hashCode();
        }
        if (getLQGrossWeight() != null) {
            _hashCode += getLQGrossWeight().hashCode();
        }
        if (getLabels() != null) {
            _hashCode += getLabels().hashCode();
        }
        if (getLimitedQuantities() != null) {
            _hashCode += getLimitedQuantities().hashCode();
        }
        if (getMarinePollutant() != null) {
            _hashCode += getMarinePollutant().hashCode();
        }
        if (getMfagNo() != null) {
            _hashCode += getMfagNo().hashCode();
        }
        if (getMixedPackingProvision() != null) {
            _hashCode += getMixedPackingProvision().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNetWeight() != null) {
            _hashCode += getNetWeight().hashCode();
        }
        if (getPackingGroup() != null) {
            _hashCode += getPackingGroup().hashCode();
        }
        if (getPackingInstructions() != null) {
            _hashCode += getPackingInstructions().hashCode();
        }
        if (getPackingTypeKey() != null) {
            _hashCode += getPackingTypeKey().hashCode();
        }
        if (getPackingTypeName() != null) {
            _hashCode += getPackingTypeName().hashCode();
        }
        if (getPageNo() != null) {
            _hashCode += getPageNo().hashCode();
        }
        if (getPortTankBulkContInstructions() != null) {
            _hashCode += getPortTankBulkContInstructions().hashCode();
        }
        if (getPortTankBulkContSpecialProvisions() != null) {
            _hashCode += getPortTankBulkContSpecialProvisions().hashCode();
        }
        if (getSecondaryClasses() != null) {
            _hashCode += getSecondaryClasses().hashCode();
        }
        if (getShortName() != null) {
            _hashCode += getShortName().hashCode();
        }
        if (getSpecialPackingProvision() != null) {
            _hashCode += getSpecialPackingProvision().hashCode();
        }
        if (getSpecialProvisions() != null) {
            _hashCode += getSpecialProvisions().hashCode();
        }
        if (getSpecialProvisionsBulk() != null) {
            _hashCode += getSpecialProvisionsBulk().hashCode();
        }
        if (getSpecialProvisionsHandling() != null) {
            _hashCode += getSpecialProvisionsHandling().hashCode();
        }
        if (getSpecialProvisionsOperation() != null) {
            _hashCode += getSpecialProvisionsOperation().hashCode();
        }
        if (getSpecialProvisionsPackages() != null) {
            _hashCode += getSpecialProvisionsPackages().hashCode();
        }
        if (getStowingCategory() != null) {
            _hashCode += getStowingCategory().hashCode();
        }
        if (getTransportCategory() != null) {
            _hashCode += getTransportCategory().hashCode();
        }
        if (getUN() != null) {
            _hashCode += getUN().hashCode();
        }
        if (getVehicle() != null) {
            _hashCode += getVehicle().hashCode();
        }
        if (getVol() != null) {
            _hashCode += getVol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DangerousGoods.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DangerousGoods"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADRtankSpecialProvision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ADRtankSpecialProvision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADRtankTankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ADRtankTankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "DangerousGoodsClass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Classification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMSNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "EMSNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptedQuantities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ExceptedQuantities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "FlashPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goodsLineId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "GoodsLineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "GrossWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "IdentificationNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Kind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "DangerousGoodsKind"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LQCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "LQCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LQGrossWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "LQGrossWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitedQuantities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "LimitedQuantities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marinePollutant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "MarinePollutant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "DangerousGoodsMarinePollutant"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mfagNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "MfagNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mixedPackingProvision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "MixedPackingProvision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "NetWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PackingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "DangerousGoodsPackingGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PackingInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingTypeKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PackingTypeKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PackingTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PageNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portTankBulkContInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PortTankBulkContInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portTankBulkContSpecialProvisions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PortTankBulkContSpecialProvisions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryClasses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SecondaryClasses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ShortName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialPackingProvision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SpecialPackingProvision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialProvisions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SpecialProvisions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialProvisionsBulk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SpecialProvisionsBulk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialProvisionsHandling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SpecialProvisionsHandling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialProvisionsOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SpecialProvisionsOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialProvisionsPackages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SpecialProvisionsPackages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stowingCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "StowingCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transportCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "TransportCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "UN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Vehicle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Vol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
