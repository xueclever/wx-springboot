/**
 * Shipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain;

import java.util.Arrays;

public class Shipment  implements java.io.Serializable {
    private java.lang.Integer actorCsid;

    private java.lang.String actorName;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Address[] addresses;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Amount[] amounts;

    private java.lang.String barcode1;

    private java.lang.String barcode2;

    private java.lang.Integer batchCsid;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.CarriagePayer carriagePayer;

    private java.lang.Integer carrierId;

    private java.lang.String carrierName;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.DetailsGroup[] detailGroups;

    private java.lang.Integer dimensionalWeight;

    private java.lang.Long esid;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] events;

    private java.util.Calendar expireDate;

    private java.lang.Integer freightBillsCount;

    private java.lang.Integer height;

    private java.util.Calendar importDate;

    private java.lang.String installationId;

    private java.lang.String installationName;

    private java.lang.Integer insuranceGroup;

    private java.lang.Boolean isConceptCarrier;

    private java.lang.Boolean isConceptProduct;

    private java.util.Calendar labelPrintDate;

    private java.lang.Integer labelsCount;

    private java.lang.String latestStatusText;

    private java.lang.Integer length;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Line[] lines;

    private java.math.BigDecimal linesSummedWeights;

    private java.lang.Integer loadmeter;

    private java.lang.Integer locationId;

    private java.lang.String locationName;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Message[] messages;

    private java.lang.String number;

    private java.lang.Integer numberOfPackages;

    private java.lang.String orderNumber;

    private java.lang.String originPostcode;

    private java.lang.String originTerminal;

    private java.lang.String packageUid;

    private java.lang.String payerAccountAtCarrier;

    private java.lang.String physicalInstallationId;

    private java.util.Calendar pickupDate;

    private java.lang.String pickupTerminal;

    private java.lang.Integer productId;

    private java.lang.Boolean productIsReturn;

    private java.lang.String productName;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Reference[] references;

    private java.lang.Integer returnPackaging;

    private java.lang.String searchKey;

    private java.lang.String senderAccountAtBank;

    private java.lang.String senderAccountAtCarrier;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Service[] services;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.ShipmentConnection[] shipmentConnections;

    private java.lang.Integer shipmentCsid;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.ShipmentCustomDocument[] shipmentCustomDocuments;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.ShipmentDocument[] shipmentDocuments;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.ShipmentKind shipmentKind;

    private java.lang.String shipmentStatusText;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.ShipmentTemperature shipmentTemperature;

    private java.lang.Integer stackCsid;

    private java.lang.Integer subcarrierId;

    private java.lang.String subcarrierName;

    private java.util.Calendar submitDate;

    private java.util.Calendar transmitDate;

    private java.lang.Boolean usedInstallationIsVirtual;

    private java.math.BigDecimal volumeCM;

    private java.lang.Integer width;

    public Shipment() {
    }

    public Shipment(
           java.lang.Integer actorCsid,
           java.lang.String actorName,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Address[] addresses,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Amount[] amounts,
           java.lang.String barcode1,
           java.lang.String barcode2,
           java.lang.Integer batchCsid,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.CarriagePayer carriagePayer,
           java.lang.Integer carrierId,
           java.lang.String carrierName,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.DetailsGroup[] detailGroups,
           java.lang.Integer dimensionalWeight,
           java.lang.Long esid,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] events,
           java.util.Calendar expireDate,
           java.lang.Integer freightBillsCount,
           java.lang.Integer height,
           java.util.Calendar importDate,
           java.lang.String installationId,
           java.lang.String installationName,
           java.lang.Integer insuranceGroup,
           java.lang.Boolean isConceptCarrier,
           java.lang.Boolean isConceptProduct,
           java.util.Calendar labelPrintDate,
           java.lang.Integer labelsCount,
           java.lang.String latestStatusText,
           java.lang.Integer length,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Line[] lines,
           java.math.BigDecimal linesSummedWeights,
           java.lang.Integer loadmeter,
           java.lang.Integer locationId,
           java.lang.String locationName,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Message[] messages,
           java.lang.String number,
           java.lang.Integer numberOfPackages,
           java.lang.String orderNumber,
           java.lang.String originPostcode,
           java.lang.String originTerminal,
           java.lang.String packageUid,
           java.lang.String payerAccountAtCarrier,
           java.lang.String physicalInstallationId,
           java.util.Calendar pickupDate,
           java.lang.String pickupTerminal,
           java.lang.Integer productId,
           java.lang.Boolean productIsReturn,
           java.lang.String productName,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Reference[] references,
           java.lang.Integer returnPackaging,
           java.lang.String searchKey,
           java.lang.String senderAccountAtBank,
           java.lang.String senderAccountAtCarrier,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Service[] services,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.ShipmentConnection[] shipmentConnections,
           java.lang.Integer shipmentCsid,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.ShipmentCustomDocument[] shipmentCustomDocuments,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.ShipmentDocument[] shipmentDocuments,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.ShipmentKind shipmentKind,
           java.lang.String shipmentStatusText,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.ShipmentTemperature shipmentTemperature,
           java.lang.Integer stackCsid,
           java.lang.Integer subcarrierId,
           java.lang.String subcarrierName,
           java.util.Calendar submitDate,
           java.util.Calendar transmitDate,
           java.lang.Boolean usedInstallationIsVirtual,
           java.math.BigDecimal volumeCM,
           java.lang.Integer width) {
           this.actorCsid = actorCsid;
           this.actorName = actorName;
           this.addresses = addresses;
           this.amounts = amounts;
           this.barcode1 = barcode1;
           this.barcode2 = barcode2;
           this.batchCsid = batchCsid;
           this.carriagePayer = carriagePayer;
           this.carrierId = carrierId;
           this.carrierName = carrierName;
           this.detailGroups = detailGroups;
           this.dimensionalWeight = dimensionalWeight;
           this.esid = esid;
           this.events = events;
           this.expireDate = expireDate;
           this.freightBillsCount = freightBillsCount;
           this.height = height;
           this.importDate = importDate;
           this.installationId = installationId;
           this.installationName = installationName;
           this.insuranceGroup = insuranceGroup;
           this.isConceptCarrier = isConceptCarrier;
           this.isConceptProduct = isConceptProduct;
           this.labelPrintDate = labelPrintDate;
           this.labelsCount = labelsCount;
           this.latestStatusText = latestStatusText;
           this.length = length;
           this.lines = lines;
           this.linesSummedWeights = linesSummedWeights;
           this.loadmeter = loadmeter;
           this.locationId = locationId;
           this.locationName = locationName;
           this.messages = messages;
           this.number = number;
           this.numberOfPackages = numberOfPackages;
           this.orderNumber = orderNumber;
           this.originPostcode = originPostcode;
           this.originTerminal = originTerminal;
           this.packageUid = packageUid;
           this.payerAccountAtCarrier = payerAccountAtCarrier;
           this.physicalInstallationId = physicalInstallationId;
           this.pickupDate = pickupDate;
           this.pickupTerminal = pickupTerminal;
           this.productId = productId;
           this.productIsReturn = productIsReturn;
           this.productName = productName;
           this.references = references;
           this.returnPackaging = returnPackaging;
           this.searchKey = searchKey;
           this.senderAccountAtBank = senderAccountAtBank;
           this.senderAccountAtCarrier = senderAccountAtCarrier;
           this.services = services;
           this.shipmentConnections = shipmentConnections;
           this.shipmentCsid = shipmentCsid;
           this.shipmentCustomDocuments = shipmentCustomDocuments;
           this.shipmentDocuments = shipmentDocuments;
           this.shipmentKind = shipmentKind;
           this.shipmentStatusText = shipmentStatusText;
           this.shipmentTemperature = shipmentTemperature;
           this.stackCsid = stackCsid;
           this.subcarrierId = subcarrierId;
           this.subcarrierName = subcarrierName;
           this.submitDate = submitDate;
           this.transmitDate = transmitDate;
           this.usedInstallationIsVirtual = usedInstallationIsVirtual;
           this.volumeCM = volumeCM;
           this.width = width;
    }


    /**
     * Gets the actorCsid value for this Shipment.
     * 
     * @return actorCsid
     */
    public java.lang.Integer getActorCsid() {
        return actorCsid;
    }


    /**
     * Sets the actorCsid value for this Shipment.
     * 
     * @param actorCsid
     */
    public void setActorCsid(java.lang.Integer actorCsid) {
        this.actorCsid = actorCsid;
    }


    /**
     * Gets the actorName value for this Shipment.
     * 
     * @return actorName
     */
    public java.lang.String getActorName() {
        return actorName;
    }


    /**
     * Sets the actorName value for this Shipment.
     * 
     * @param actorName
     */
    public void setActorName(java.lang.String actorName) {
        this.actorName = actorName;
    }


    /**
     * Gets the addresses value for this Shipment.
     * 
     * @return addresses
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Address[] getAddresses() {
        return addresses;
    }


    /**
     * Sets the addresses value for this Shipment.
     * 
     * @param addresses
     */
    public void setAddresses(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Address[] addresses) {
        this.addresses = addresses;
    }


    /**
     * Gets the amounts value for this Shipment.
     * 
     * @return amounts
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Amount[] getAmounts() {
        return amounts;
    }


    /**
     * Sets the amounts value for this Shipment.
     * 
     * @param amounts
     */
    public void setAmounts(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Amount[] amounts) {
        this.amounts = amounts;
    }


    /**
     * Gets the barcode1 value for this Shipment.
     * 
     * @return barcode1
     */
    public java.lang.String getBarcode1() {
        return barcode1;
    }


    /**
     * Sets the barcode1 value for this Shipment.
     * 
     * @param barcode1
     */
    public void setBarcode1(java.lang.String barcode1) {
        this.barcode1 = barcode1;
    }


    /**
     * Gets the barcode2 value for this Shipment.
     * 
     * @return barcode2
     */
    public java.lang.String getBarcode2() {
        return barcode2;
    }


    /**
     * Sets the barcode2 value for this Shipment.
     * 
     * @param barcode2
     */
    public void setBarcode2(java.lang.String barcode2) {
        this.barcode2 = barcode2;
    }


    /**
     * Gets the batchCsid value for this Shipment.
     * 
     * @return batchCsid
     */
    public java.lang.Integer getBatchCsid() {
        return batchCsid;
    }


    /**
     * Sets the batchCsid value for this Shipment.
     * 
     * @param batchCsid
     */
    public void setBatchCsid(java.lang.Integer batchCsid) {
        this.batchCsid = batchCsid;
    }


    /**
     * Gets the carriagePayer value for this Shipment.
     * 
     * @return carriagePayer
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.CarriagePayer getCarriagePayer() {
        return carriagePayer;
    }


    /**
     * Sets the carriagePayer value for this Shipment.
     * 
     * @param carriagePayer
     */
    public void setCarriagePayer(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.CarriagePayer carriagePayer) {
        this.carriagePayer = carriagePayer;
    }


    /**
     * Gets the carrierId value for this Shipment.
     * 
     * @return carrierId
     */
    public java.lang.Integer getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this Shipment.
     * 
     * @param carrierId
     */
    public void setCarrierId(java.lang.Integer carrierId) {
        this.carrierId = carrierId;
    }


    /**
     * Gets the carrierName value for this Shipment.
     * 
     * @return carrierName
     */
    public java.lang.String getCarrierName() {
        return carrierName;
    }


    /**
     * Sets the carrierName value for this Shipment.
     * 
     * @param carrierName
     */
    public void setCarrierName(java.lang.String carrierName) {
        this.carrierName = carrierName;
    }


    /**
     * Gets the detailGroups value for this Shipment.
     * 
     * @return detailGroups
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.DetailsGroup[] getDetailGroups() {
        return detailGroups;
    }


    /**
     * Sets the detailGroups value for this Shipment.
     * 
     * @param detailGroups
     */
    public void setDetailGroups(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.DetailsGroup[] detailGroups) {
        this.detailGroups = detailGroups;
    }


    /**
     * Gets the dimensionalWeight value for this Shipment.
     * 
     * @return dimensionalWeight
     */
    public java.lang.Integer getDimensionalWeight() {
        return dimensionalWeight;
    }


    /**
     * Sets the dimensionalWeight value for this Shipment.
     * 
     * @param dimensionalWeight
     */
    public void setDimensionalWeight(java.lang.Integer dimensionalWeight) {
        this.dimensionalWeight = dimensionalWeight;
    }


    /**
     * Gets the esid value for this Shipment.
     * 
     * @return esid
     */
    public java.lang.Long getEsid() {
        return esid;
    }


    /**
     * Sets the esid value for this Shipment.
     * 
     * @param esid
     */
    public void setEsid(java.lang.Long esid) {
        this.esid = esid;
    }


    /**
     * Gets the events value for this Shipment.
     * 
     * @return events
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Shipment.
     * 
     * @param events
     */
    public void setEvents(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Event[] events) {
        this.events = events;
    }


    /**
     * Gets the expireDate value for this Shipment.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this Shipment.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the freightBillsCount value for this Shipment.
     * 
     * @return freightBillsCount
     */
    public java.lang.Integer getFreightBillsCount() {
        return freightBillsCount;
    }


    /**
     * Sets the freightBillsCount value for this Shipment.
     * 
     * @param freightBillsCount
     */
    public void setFreightBillsCount(java.lang.Integer freightBillsCount) {
        this.freightBillsCount = freightBillsCount;
    }


    /**
     * Gets the height value for this Shipment.
     * 
     * @return height
     */
    public java.lang.Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this Shipment.
     * 
     * @param height
     */
    public void setHeight(java.lang.Integer height) {
        this.height = height;
    }


    /**
     * Gets the importDate value for this Shipment.
     * 
     * @return importDate
     */
    public java.util.Calendar getImportDate() {
        return importDate;
    }


    /**
     * Sets the importDate value for this Shipment.
     * 
     * @param importDate
     */
    public void setImportDate(java.util.Calendar importDate) {
        this.importDate = importDate;
    }


    /**
     * Gets the installationId value for this Shipment.
     * 
     * @return installationId
     */
    public java.lang.String getInstallationId() {
        return installationId;
    }


    /**
     * Sets the installationId value for this Shipment.
     * 
     * @param installationId
     */
    public void setInstallationId(java.lang.String installationId) {
        this.installationId = installationId;
    }


    /**
     * Gets the installationName value for this Shipment.
     * 
     * @return installationName
     */
    public java.lang.String getInstallationName() {
        return installationName;
    }


    /**
     * Sets the installationName value for this Shipment.
     * 
     * @param installationName
     */
    public void setInstallationName(java.lang.String installationName) {
        this.installationName = installationName;
    }


    /**
     * Gets the insuranceGroup value for this Shipment.
     * 
     * @return insuranceGroup
     */
    public java.lang.Integer getInsuranceGroup() {
        return insuranceGroup;
    }


    /**
     * Sets the insuranceGroup value for this Shipment.
     * 
     * @param insuranceGroup
     */
    public void setInsuranceGroup(java.lang.Integer insuranceGroup) {
        this.insuranceGroup = insuranceGroup;
    }


    /**
     * Gets the isConceptCarrier value for this Shipment.
     * 
     * @return isConceptCarrier
     */
    public java.lang.Boolean getIsConceptCarrier() {
        return isConceptCarrier;
    }


    /**
     * Sets the isConceptCarrier value for this Shipment.
     * 
     * @param isConceptCarrier
     */
    public void setIsConceptCarrier(java.lang.Boolean isConceptCarrier) {
        this.isConceptCarrier = isConceptCarrier;
    }


    /**
     * Gets the isConceptProduct value for this Shipment.
     * 
     * @return isConceptProduct
     */
    public java.lang.Boolean getIsConceptProduct() {
        return isConceptProduct;
    }


    /**
     * Sets the isConceptProduct value for this Shipment.
     * 
     * @param isConceptProduct
     */
    public void setIsConceptProduct(java.lang.Boolean isConceptProduct) {
        this.isConceptProduct = isConceptProduct;
    }


    /**
     * Gets the labelPrintDate value for this Shipment.
     * 
     * @return labelPrintDate
     */
    public java.util.Calendar getLabelPrintDate() {
        return labelPrintDate;
    }


    /**
     * Sets the labelPrintDate value for this Shipment.
     * 
     * @param labelPrintDate
     */
    public void setLabelPrintDate(java.util.Calendar labelPrintDate) {
        this.labelPrintDate = labelPrintDate;
    }


    /**
     * Gets the labelsCount value for this Shipment.
     * 
     * @return labelsCount
     */
    public java.lang.Integer getLabelsCount() {
        return labelsCount;
    }


    /**
     * Sets the labelsCount value for this Shipment.
     * 
     * @param labelsCount
     */
    public void setLabelsCount(java.lang.Integer labelsCount) {
        this.labelsCount = labelsCount;
    }


    /**
     * Gets the latestStatusText value for this Shipment.
     * 
     * @return latestStatusText
     */
    public java.lang.String getLatestStatusText() {
        return latestStatusText;
    }


    /**
     * Sets the latestStatusText value for this Shipment.
     * 
     * @param latestStatusText
     */
    public void setLatestStatusText(java.lang.String latestStatusText) {
        this.latestStatusText = latestStatusText;
    }


    /**
     * Gets the length value for this Shipment.
     * 
     * @return length
     */
    public java.lang.Integer getLength() {
        return length;
    }


    /**
     * Sets the length value for this Shipment.
     * 
     * @param length
     */
    public void setLength(java.lang.Integer length) {
        this.length = length;
    }


    /**
     * Gets the lines value for this Shipment.
     * 
     * @return lines
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Line[] getLines() {
        return lines;
    }


    /**
     * Sets the lines value for this Shipment.
     * 
     * @param lines
     */
    public void setLines(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Line[] lines) {
        this.lines = lines;
    }


    /**
     * Gets the linesSummedWeights value for this Shipment.
     * 
     * @return linesSummedWeights
     */
    public java.math.BigDecimal getLinesSummedWeights() {
        return linesSummedWeights;
    }


    /**
     * Sets the linesSummedWeights value for this Shipment.
     * 
     * @param linesSummedWeights
     */
    public void setLinesSummedWeights(java.math.BigDecimal linesSummedWeights) {
        this.linesSummedWeights = linesSummedWeights;
    }


    /**
     * Gets the loadmeter value for this Shipment.
     * 
     * @return loadmeter
     */
    public java.lang.Integer getLoadmeter() {
        return loadmeter;
    }


    /**
     * Sets the loadmeter value for this Shipment.
     * 
     * @param loadmeter
     */
    public void setLoadmeter(java.lang.Integer loadmeter) {
        this.loadmeter = loadmeter;
    }


    /**
     * Gets the locationId value for this Shipment.
     * 
     * @return locationId
     */
    public java.lang.Integer getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this Shipment.
     * 
     * @param locationId
     */
    public void setLocationId(java.lang.Integer locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the locationName value for this Shipment.
     * 
     * @return locationName
     */
    public java.lang.String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this Shipment.
     * 
     * @param locationName
     */
    public void setLocationName(java.lang.String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the messages value for this Shipment.
     * 
     * @return messages
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Message[] getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this Shipment.
     * 
     * @param messages
     */
    public void setMessages(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Message[] messages) {
        this.messages = messages;
    }


    /**
     * Gets the number value for this Shipment.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Shipment.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the numberOfPackages value for this Shipment.
     * 
     * @return numberOfPackages
     */
    public java.lang.Integer getNumberOfPackages() {
        return numberOfPackages;
    }


    /**
     * Sets the numberOfPackages value for this Shipment.
     * 
     * @param numberOfPackages
     */
    public void setNumberOfPackages(java.lang.Integer numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
    }


    /**
     * Gets the orderNumber value for this Shipment.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this Shipment.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the originPostcode value for this Shipment.
     * 
     * @return originPostcode
     */
    public java.lang.String getOriginPostcode() {
        return originPostcode;
    }


    /**
     * Sets the originPostcode value for this Shipment.
     * 
     * @param originPostcode
     */
    public void setOriginPostcode(java.lang.String originPostcode) {
        this.originPostcode = originPostcode;
    }


    /**
     * Gets the originTerminal value for this Shipment.
     * 
     * @return originTerminal
     */
    public java.lang.String getOriginTerminal() {
        return originTerminal;
    }


    /**
     * Sets the originTerminal value for this Shipment.
     * 
     * @param originTerminal
     */
    public void setOriginTerminal(java.lang.String originTerminal) {
        this.originTerminal = originTerminal;
    }


    /**
     * Gets the packageUid value for this Shipment.
     * 
     * @return packageUid
     */
    public java.lang.String getPackageUid() {
        return packageUid;
    }


    /**
     * Sets the packageUid value for this Shipment.
     * 
     * @param packageUid
     */
    public void setPackageUid(java.lang.String packageUid) {
        this.packageUid = packageUid;
    }


    /**
     * Gets the payerAccountAtCarrier value for this Shipment.
     * 
     * @return payerAccountAtCarrier
     */
    public java.lang.String getPayerAccountAtCarrier() {
        return payerAccountAtCarrier;
    }


    /**
     * Sets the payerAccountAtCarrier value for this Shipment.
     * 
     * @param payerAccountAtCarrier
     */
    public void setPayerAccountAtCarrier(java.lang.String payerAccountAtCarrier) {
        this.payerAccountAtCarrier = payerAccountAtCarrier;
    }


    /**
     * Gets the physicalInstallationId value for this Shipment.
     * 
     * @return physicalInstallationId
     */
    public java.lang.String getPhysicalInstallationId() {
        return physicalInstallationId;
    }


    /**
     * Sets the physicalInstallationId value for this Shipment.
     * 
     * @param physicalInstallationId
     */
    public void setPhysicalInstallationId(java.lang.String physicalInstallationId) {
        this.physicalInstallationId = physicalInstallationId;
    }


    /**
     * Gets the pickupDate value for this Shipment.
     * 
     * @return pickupDate
     */
    public java.util.Calendar getPickupDate() {
        return pickupDate;
    }


    /**
     * Sets the pickupDate value for this Shipment.
     * 
     * @param pickupDate
     */
    public void setPickupDate(java.util.Calendar pickupDate) {
        this.pickupDate = pickupDate;
    }


    /**
     * Gets the pickupTerminal value for this Shipment.
     * 
     * @return pickupTerminal
     */
    public java.lang.String getPickupTerminal() {
        return pickupTerminal;
    }


    /**
     * Sets the pickupTerminal value for this Shipment.
     * 
     * @param pickupTerminal
     */
    public void setPickupTerminal(java.lang.String pickupTerminal) {
        this.pickupTerminal = pickupTerminal;
    }


    /**
     * Gets the productId value for this Shipment.
     * 
     * @return productId
     */
    public java.lang.Integer getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this Shipment.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }


    /**
     * Gets the productIsReturn value for this Shipment.
     * 
     * @return productIsReturn
     */
    public java.lang.Boolean getProductIsReturn() {
        return productIsReturn;
    }


    /**
     * Sets the productIsReturn value for this Shipment.
     * 
     * @param productIsReturn
     */
    public void setProductIsReturn(java.lang.Boolean productIsReturn) {
        this.productIsReturn = productIsReturn;
    }


    /**
     * Gets the productName value for this Shipment.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this Shipment.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the references value for this Shipment.
     * 
     * @return references
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Reference[] getReferences() {
        return references;
    }


    /**
     * Sets the references value for this Shipment.
     * 
     * @param references
     */
    public void setReferences(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Reference[] references) {
        this.references = references;
    }


    /**
     * Gets the returnPackaging value for this Shipment.
     * 
     * @return returnPackaging
     */
    public java.lang.Integer getReturnPackaging() {
        return returnPackaging;
    }


    /**
     * Sets the returnPackaging value for this Shipment.
     * 
     * @param returnPackaging
     */
    public void setReturnPackaging(java.lang.Integer returnPackaging) {
        this.returnPackaging = returnPackaging;
    }


    /**
     * Gets the searchKey value for this Shipment.
     * 
     * @return searchKey
     */
    public java.lang.String getSearchKey() {
        return searchKey;
    }


    /**
     * Sets the searchKey value for this Shipment.
     * 
     * @param searchKey
     */
    public void setSearchKey(java.lang.String searchKey) {
        this.searchKey = searchKey;
    }


    /**
     * Gets the senderAccountAtBank value for this Shipment.
     * 
     * @return senderAccountAtBank
     */
    public java.lang.String getSenderAccountAtBank() {
        return senderAccountAtBank;
    }


    /**
     * Sets the senderAccountAtBank value for this Shipment.
     * 
     * @param senderAccountAtBank
     */
    public void setSenderAccountAtBank(java.lang.String senderAccountAtBank) {
        this.senderAccountAtBank = senderAccountAtBank;
    }


    /**
     * Gets the senderAccountAtCarrier value for this Shipment.
     * 
     * @return senderAccountAtCarrier
     */
    public java.lang.String getSenderAccountAtCarrier() {
        return senderAccountAtCarrier;
    }


    /**
     * Sets the senderAccountAtCarrier value for this Shipment.
     * 
     * @param senderAccountAtCarrier
     */
    public void setSenderAccountAtCarrier(java.lang.String senderAccountAtCarrier) {
        this.senderAccountAtCarrier = senderAccountAtCarrier;
    }


    /**
     * Gets the services value for this Shipment.
     * 
     * @return services
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Service[] getServices() {
        return services;
    }


    /**
     * Sets the services value for this Shipment.
     * 
     * @param services
     */
    public void setServices(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Service[] services) {
        this.services = services;
    }


    /**
     * Gets the shipmentConnections value for this Shipment.
     * 
     * @return shipmentConnections
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.ShipmentConnection[] getShipmentConnections() {
        return shipmentConnections;
    }


    /**
     * Sets the shipmentConnections value for this Shipment.
     * 
     * @param shipmentConnections
     */
    public void setShipmentConnections(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.ShipmentConnection[] shipmentConnections) {
        this.shipmentConnections = shipmentConnections;
    }


    /**
     * Gets the shipmentCsid value for this Shipment.
     * 
     * @return shipmentCsid
     */
    public java.lang.Integer getShipmentCsid() {
        return shipmentCsid;
    }


    /**
     * Sets the shipmentCsid value for this Shipment.
     * 
     * @param shipmentCsid
     */
    public void setShipmentCsid(java.lang.Integer shipmentCsid) {
        this.shipmentCsid = shipmentCsid;
    }


    /**
     * Gets the shipmentCustomDocuments value for this Shipment.
     * 
     * @return shipmentCustomDocuments
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.ShipmentCustomDocument[] getShipmentCustomDocuments() {
        return shipmentCustomDocuments;
    }


    /**
     * Sets the shipmentCustomDocuments value for this Shipment.
     * 
     * @param shipmentCustomDocuments
     */
    public void setShipmentCustomDocuments(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.ShipmentCustomDocument[] shipmentCustomDocuments) {
        this.shipmentCustomDocuments = shipmentCustomDocuments;
    }


    /**
     * Gets the shipmentDocuments value for this Shipment.
     * 
     * @return shipmentDocuments
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.ShipmentDocument[] getShipmentDocuments() {
        return shipmentDocuments;
    }


    /**
     * Sets the shipmentDocuments value for this Shipment.
     * 
     * @param shipmentDocuments
     */
    public void setShipmentDocuments(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.ShipmentDocument[] shipmentDocuments) {
        this.shipmentDocuments = shipmentDocuments;
    }


    /**
     * Gets the shipmentKind value for this Shipment.
     * 
     * @return shipmentKind
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.ShipmentKind getShipmentKind() {
        return shipmentKind;
    }


    /**
     * Sets the shipmentKind value for this Shipment.
     * 
     * @param shipmentKind
     */
    public void setShipmentKind(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.ShipmentKind shipmentKind) {
        this.shipmentKind = shipmentKind;
    }


    /**
     * Gets the shipmentStatusText value for this Shipment.
     * 
     * @return shipmentStatusText
     */
    public java.lang.String getShipmentStatusText() {
        return shipmentStatusText;
    }


    /**
     * Sets the shipmentStatusText value for this Shipment.
     * 
     * @param shipmentStatusText
     */
    public void setShipmentStatusText(java.lang.String shipmentStatusText) {
        this.shipmentStatusText = shipmentStatusText;
    }


    /**
     * Gets the shipmentTemperature value for this Shipment.
     * 
     * @return shipmentTemperature
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.ShipmentTemperature getShipmentTemperature() {
        return shipmentTemperature;
    }


    /**
     * Sets the shipmentTemperature value for this Shipment.
     * 
     * @param shipmentTemperature
     */
    public void setShipmentTemperature(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.ShipmentTemperature shipmentTemperature) {
        this.shipmentTemperature = shipmentTemperature;
    }


    /**
     * Gets the stackCsid value for this Shipment.
     * 
     * @return stackCsid
     */
    public java.lang.Integer getStackCsid() {
        return stackCsid;
    }


    /**
     * Sets the stackCsid value for this Shipment.
     * 
     * @param stackCsid
     */
    public void setStackCsid(java.lang.Integer stackCsid) {
        this.stackCsid = stackCsid;
    }


    /**
     * Gets the subcarrierId value for this Shipment.
     * 
     * @return subcarrierId
     */
    public java.lang.Integer getSubcarrierId() {
        return subcarrierId;
    }


    /**
     * Sets the subcarrierId value for this Shipment.
     * 
     * @param subcarrierId
     */
    public void setSubcarrierId(java.lang.Integer subcarrierId) {
        this.subcarrierId = subcarrierId;
    }


    /**
     * Gets the subcarrierName value for this Shipment.
     * 
     * @return subcarrierName
     */
    public java.lang.String getSubcarrierName() {
        return subcarrierName;
    }


    /**
     * Sets the subcarrierName value for this Shipment.
     * 
     * @param subcarrierName
     */
    public void setSubcarrierName(java.lang.String subcarrierName) {
        this.subcarrierName = subcarrierName;
    }


    /**
     * Gets the submitDate value for this Shipment.
     * 
     * @return submitDate
     */
    public java.util.Calendar getSubmitDate() {
        return submitDate;
    }


    /**
     * Sets the submitDate value for this Shipment.
     * 
     * @param submitDate
     */
    public void setSubmitDate(java.util.Calendar submitDate) {
        this.submitDate = submitDate;
    }


    /**
     * Gets the transmitDate value for this Shipment.
     * 
     * @return transmitDate
     */
    public java.util.Calendar getTransmitDate() {
        return transmitDate;
    }


    /**
     * Sets the transmitDate value for this Shipment.
     * 
     * @param transmitDate
     */
    public void setTransmitDate(java.util.Calendar transmitDate) {
        this.transmitDate = transmitDate;
    }


    /**
     * Gets the usedInstallationIsVirtual value for this Shipment.
     * 
     * @return usedInstallationIsVirtual
     */
    public java.lang.Boolean getUsedInstallationIsVirtual() {
        return usedInstallationIsVirtual;
    }


    /**
     * Sets the usedInstallationIsVirtual value for this Shipment.
     * 
     * @param usedInstallationIsVirtual
     */
    public void setUsedInstallationIsVirtual(java.lang.Boolean usedInstallationIsVirtual) {
        this.usedInstallationIsVirtual = usedInstallationIsVirtual;
    }


    /**
     * Gets the volumeCM value for this Shipment.
     * 
     * @return volumeCM
     */
    public java.math.BigDecimal getVolumeCM() {
        return volumeCM;
    }


    /**
     * Sets the volumeCM value for this Shipment.
     * 
     * @param volumeCM
     */
    public void setVolumeCM(java.math.BigDecimal volumeCM) {
        this.volumeCM = volumeCM;
    }


    /**
     * Gets the width value for this Shipment.
     * 
     * @return width
     */
    public java.lang.Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this Shipment.
     * 
     * @param width
     */
    public void setWidth(java.lang.Integer width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Shipment)) return false;
        Shipment other = (Shipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actorCsid==null && other.getActorCsid()==null) || 
             (this.actorCsid!=null &&
              this.actorCsid.equals(other.getActorCsid()))) &&
            ((this.actorName==null && other.getActorName()==null) || 
             (this.actorName!=null &&
              this.actorName.equals(other.getActorName()))) &&
            ((this.addresses==null && other.getAddresses()==null) || 
             (this.addresses!=null &&
              java.util.Arrays.equals(this.addresses, other.getAddresses()))) &&
            ((this.amounts==null && other.getAmounts()==null) || 
             (this.amounts!=null &&
              java.util.Arrays.equals(this.amounts, other.getAmounts()))) &&
            ((this.barcode1==null && other.getBarcode1()==null) || 
             (this.barcode1!=null &&
              this.barcode1.equals(other.getBarcode1()))) &&
            ((this.barcode2==null && other.getBarcode2()==null) || 
             (this.barcode2!=null &&
              this.barcode2.equals(other.getBarcode2()))) &&
            ((this.batchCsid==null && other.getBatchCsid()==null) || 
             (this.batchCsid!=null &&
              this.batchCsid.equals(other.getBatchCsid()))) &&
            ((this.carriagePayer==null && other.getCarriagePayer()==null) || 
             (this.carriagePayer!=null &&
              this.carriagePayer.equals(other.getCarriagePayer()))) &&
            ((this.carrierId==null && other.getCarrierId()==null) || 
             (this.carrierId!=null &&
              this.carrierId.equals(other.getCarrierId()))) &&
            ((this.carrierName==null && other.getCarrierName()==null) || 
             (this.carrierName!=null &&
              this.carrierName.equals(other.getCarrierName()))) &&
            ((this.detailGroups==null && other.getDetailGroups()==null) || 
             (this.detailGroups!=null &&
              java.util.Arrays.equals(this.detailGroups, other.getDetailGroups()))) &&
            ((this.dimensionalWeight==null && other.getDimensionalWeight()==null) || 
             (this.dimensionalWeight!=null &&
              this.dimensionalWeight.equals(other.getDimensionalWeight()))) &&
            ((this.esid==null && other.getEsid()==null) || 
             (this.esid!=null &&
              this.esid.equals(other.getEsid()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.freightBillsCount==null && other.getFreightBillsCount()==null) || 
             (this.freightBillsCount!=null &&
              this.freightBillsCount.equals(other.getFreightBillsCount()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.importDate==null && other.getImportDate()==null) || 
             (this.importDate!=null &&
              this.importDate.equals(other.getImportDate()))) &&
            ((this.installationId==null && other.getInstallationId()==null) || 
             (this.installationId!=null &&
              this.installationId.equals(other.getInstallationId()))) &&
            ((this.installationName==null && other.getInstallationName()==null) || 
             (this.installationName!=null &&
              this.installationName.equals(other.getInstallationName()))) &&
            ((this.insuranceGroup==null && other.getInsuranceGroup()==null) || 
             (this.insuranceGroup!=null &&
              this.insuranceGroup.equals(other.getInsuranceGroup()))) &&
            ((this.isConceptCarrier==null && other.getIsConceptCarrier()==null) || 
             (this.isConceptCarrier!=null &&
              this.isConceptCarrier.equals(other.getIsConceptCarrier()))) &&
            ((this.isConceptProduct==null && other.getIsConceptProduct()==null) || 
             (this.isConceptProduct!=null &&
              this.isConceptProduct.equals(other.getIsConceptProduct()))) &&
            ((this.labelPrintDate==null && other.getLabelPrintDate()==null) || 
             (this.labelPrintDate!=null &&
              this.labelPrintDate.equals(other.getLabelPrintDate()))) &&
            ((this.labelsCount==null && other.getLabelsCount()==null) || 
             (this.labelsCount!=null &&
              this.labelsCount.equals(other.getLabelsCount()))) &&
            ((this.latestStatusText==null && other.getLatestStatusText()==null) || 
             (this.latestStatusText!=null &&
              this.latestStatusText.equals(other.getLatestStatusText()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.lines==null && other.getLines()==null) || 
             (this.lines!=null &&
              java.util.Arrays.equals(this.lines, other.getLines()))) &&
            ((this.linesSummedWeights==null && other.getLinesSummedWeights()==null) || 
             (this.linesSummedWeights!=null &&
              this.linesSummedWeights.equals(other.getLinesSummedWeights()))) &&
            ((this.loadmeter==null && other.getLoadmeter()==null) || 
             (this.loadmeter!=null &&
              this.loadmeter.equals(other.getLoadmeter()))) &&
            ((this.locationId==null && other.getLocationId()==null) || 
             (this.locationId!=null &&
              this.locationId.equals(other.getLocationId()))) &&
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              java.util.Arrays.equals(this.messages, other.getMessages()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.numberOfPackages==null && other.getNumberOfPackages()==null) || 
             (this.numberOfPackages!=null &&
              this.numberOfPackages.equals(other.getNumberOfPackages()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.originPostcode==null && other.getOriginPostcode()==null) || 
             (this.originPostcode!=null &&
              this.originPostcode.equals(other.getOriginPostcode()))) &&
            ((this.originTerminal==null && other.getOriginTerminal()==null) || 
             (this.originTerminal!=null &&
              this.originTerminal.equals(other.getOriginTerminal()))) &&
            ((this.packageUid==null && other.getPackageUid()==null) || 
             (this.packageUid!=null &&
              this.packageUid.equals(other.getPackageUid()))) &&
            ((this.payerAccountAtCarrier==null && other.getPayerAccountAtCarrier()==null) || 
             (this.payerAccountAtCarrier!=null &&
              this.payerAccountAtCarrier.equals(other.getPayerAccountAtCarrier()))) &&
            ((this.physicalInstallationId==null && other.getPhysicalInstallationId()==null) || 
             (this.physicalInstallationId!=null &&
              this.physicalInstallationId.equals(other.getPhysicalInstallationId()))) &&
            ((this.pickupDate==null && other.getPickupDate()==null) || 
             (this.pickupDate!=null &&
              this.pickupDate.equals(other.getPickupDate()))) &&
            ((this.pickupTerminal==null && other.getPickupTerminal()==null) || 
             (this.pickupTerminal!=null &&
              this.pickupTerminal.equals(other.getPickupTerminal()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.productIsReturn==null && other.getProductIsReturn()==null) || 
             (this.productIsReturn!=null &&
              this.productIsReturn.equals(other.getProductIsReturn()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.references==null && other.getReferences()==null) || 
             (this.references!=null &&
              java.util.Arrays.equals(this.references, other.getReferences()))) &&
            ((this.returnPackaging==null && other.getReturnPackaging()==null) || 
             (this.returnPackaging!=null &&
              this.returnPackaging.equals(other.getReturnPackaging()))) &&
            ((this.searchKey==null && other.getSearchKey()==null) || 
             (this.searchKey!=null &&
              this.searchKey.equals(other.getSearchKey()))) &&
            ((this.senderAccountAtBank==null && other.getSenderAccountAtBank()==null) || 
             (this.senderAccountAtBank!=null &&
              this.senderAccountAtBank.equals(other.getSenderAccountAtBank()))) &&
            ((this.senderAccountAtCarrier==null && other.getSenderAccountAtCarrier()==null) || 
             (this.senderAccountAtCarrier!=null &&
              this.senderAccountAtCarrier.equals(other.getSenderAccountAtCarrier()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              java.util.Arrays.equals(this.services, other.getServices()))) &&
            ((this.shipmentConnections==null && other.getShipmentConnections()==null) || 
             (this.shipmentConnections!=null &&
              java.util.Arrays.equals(this.shipmentConnections, other.getShipmentConnections()))) &&
            ((this.shipmentCsid==null && other.getShipmentCsid()==null) || 
             (this.shipmentCsid!=null &&
              this.shipmentCsid.equals(other.getShipmentCsid()))) &&
            ((this.shipmentCustomDocuments==null && other.getShipmentCustomDocuments()==null) || 
             (this.shipmentCustomDocuments!=null &&
              java.util.Arrays.equals(this.shipmentCustomDocuments, other.getShipmentCustomDocuments()))) &&
            ((this.shipmentDocuments==null && other.getShipmentDocuments()==null) || 
             (this.shipmentDocuments!=null &&
              java.util.Arrays.equals(this.shipmentDocuments, other.getShipmentDocuments()))) &&
            ((this.shipmentKind==null && other.getShipmentKind()==null) || 
             (this.shipmentKind!=null &&
              this.shipmentKind.equals(other.getShipmentKind()))) &&
            ((this.shipmentStatusText==null && other.getShipmentStatusText()==null) || 
             (this.shipmentStatusText!=null &&
              this.shipmentStatusText.equals(other.getShipmentStatusText()))) &&
            ((this.shipmentTemperature==null && other.getShipmentTemperature()==null) || 
             (this.shipmentTemperature!=null &&
              this.shipmentTemperature.equals(other.getShipmentTemperature()))) &&
            ((this.stackCsid==null && other.getStackCsid()==null) || 
             (this.stackCsid!=null &&
              this.stackCsid.equals(other.getStackCsid()))) &&
            ((this.subcarrierId==null && other.getSubcarrierId()==null) || 
             (this.subcarrierId!=null &&
              this.subcarrierId.equals(other.getSubcarrierId()))) &&
            ((this.subcarrierName==null && other.getSubcarrierName()==null) || 
             (this.subcarrierName!=null &&
              this.subcarrierName.equals(other.getSubcarrierName()))) &&
            ((this.submitDate==null && other.getSubmitDate()==null) || 
             (this.submitDate!=null &&
              this.submitDate.equals(other.getSubmitDate()))) &&
            ((this.transmitDate==null && other.getTransmitDate()==null) || 
             (this.transmitDate!=null &&
              this.transmitDate.equals(other.getTransmitDate()))) &&
            ((this.usedInstallationIsVirtual==null && other.getUsedInstallationIsVirtual()==null) || 
             (this.usedInstallationIsVirtual!=null &&
              this.usedInstallationIsVirtual.equals(other.getUsedInstallationIsVirtual()))) &&
            ((this.volumeCM==null && other.getVolumeCM()==null) || 
             (this.volumeCM!=null &&
              this.volumeCM.equals(other.getVolumeCM()))) &&
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
        if (getActorCsid() != null) {
            _hashCode += getActorCsid().hashCode();
        }
        if (getActorName() != null) {
            _hashCode += getActorName().hashCode();
        }
        if (getAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBarcode1() != null) {
            _hashCode += getBarcode1().hashCode();
        }
        if (getBarcode2() != null) {
            _hashCode += getBarcode2().hashCode();
        }
        if (getBatchCsid() != null) {
            _hashCode += getBatchCsid().hashCode();
        }
        if (getCarriagePayer() != null) {
            _hashCode += getCarriagePayer().hashCode();
        }
        if (getCarrierId() != null) {
            _hashCode += getCarrierId().hashCode();
        }
        if (getCarrierName() != null) {
            _hashCode += getCarrierName().hashCode();
        }
        if (getDetailGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDimensionalWeight() != null) {
            _hashCode += getDimensionalWeight().hashCode();
        }
        if (getEsid() != null) {
            _hashCode += getEsid().hashCode();
        }
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getFreightBillsCount() != null) {
            _hashCode += getFreightBillsCount().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getImportDate() != null) {
            _hashCode += getImportDate().hashCode();
        }
        if (getInstallationId() != null) {
            _hashCode += getInstallationId().hashCode();
        }
        if (getInstallationName() != null) {
            _hashCode += getInstallationName().hashCode();
        }
        if (getInsuranceGroup() != null) {
            _hashCode += getInsuranceGroup().hashCode();
        }
        if (getIsConceptCarrier() != null) {
            _hashCode += getIsConceptCarrier().hashCode();
        }
        if (getIsConceptProduct() != null) {
            _hashCode += getIsConceptProduct().hashCode();
        }
        if (getLabelPrintDate() != null) {
            _hashCode += getLabelPrintDate().hashCode();
        }
        if (getLabelsCount() != null) {
            _hashCode += getLabelsCount().hashCode();
        }
        if (getLatestStatusText() != null) {
            _hashCode += getLatestStatusText().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getLines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLines(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLinesSummedWeights() != null) {
            _hashCode += getLinesSummedWeights().hashCode();
        }
        if (getLoadmeter() != null) {
            _hashCode += getLoadmeter().hashCode();
        }
        if (getLocationId() != null) {
            _hashCode += getLocationId().hashCode();
        }
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        if (getMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getNumberOfPackages() != null) {
            _hashCode += getNumberOfPackages().hashCode();
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getOriginPostcode() != null) {
            _hashCode += getOriginPostcode().hashCode();
        }
        if (getOriginTerminal() != null) {
            _hashCode += getOriginTerminal().hashCode();
        }
        if (getPackageUid() != null) {
            _hashCode += getPackageUid().hashCode();
        }
        if (getPayerAccountAtCarrier() != null) {
            _hashCode += getPayerAccountAtCarrier().hashCode();
        }
        if (getPhysicalInstallationId() != null) {
            _hashCode += getPhysicalInstallationId().hashCode();
        }
        if (getPickupDate() != null) {
            _hashCode += getPickupDate().hashCode();
        }
        if (getPickupTerminal() != null) {
            _hashCode += getPickupTerminal().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getProductIsReturn() != null) {
            _hashCode += getProductIsReturn().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReferences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReturnPackaging() != null) {
            _hashCode += getReturnPackaging().hashCode();
        }
        if (getSearchKey() != null) {
            _hashCode += getSearchKey().hashCode();
        }
        if (getSenderAccountAtBank() != null) {
            _hashCode += getSenderAccountAtBank().hashCode();
        }
        if (getSenderAccountAtCarrier() != null) {
            _hashCode += getSenderAccountAtCarrier().hashCode();
        }
        if (getServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipmentConnections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentConnections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentConnections(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipmentCsid() != null) {
            _hashCode += getShipmentCsid().hashCode();
        }
        if (getShipmentCustomDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentCustomDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentCustomDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipmentDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipmentKind() != null) {
            _hashCode += getShipmentKind().hashCode();
        }
        if (getShipmentStatusText() != null) {
            _hashCode += getShipmentStatusText().hashCode();
        }
        if (getShipmentTemperature() != null) {
            _hashCode += getShipmentTemperature().hashCode();
        }
        if (getStackCsid() != null) {
            _hashCode += getStackCsid().hashCode();
        }
        if (getSubcarrierId() != null) {
            _hashCode += getSubcarrierId().hashCode();
        }
        if (getSubcarrierName() != null) {
            _hashCode += getSubcarrierName().hashCode();
        }
        if (getSubmitDate() != null) {
            _hashCode += getSubmitDate().hashCode();
        }
        if (getTransmitDate() != null) {
            _hashCode += getTransmitDate().hashCode();
        }
        if (getUsedInstallationIsVirtual() != null) {
            _hashCode += getUsedInstallationIsVirtual().hashCode();
        }
        if (getVolumeCM() != null) {
            _hashCode += getVolumeCM().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Shipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Shipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actorCsid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ActorCsid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ActorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Address"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Amounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Amount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Amount"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcode1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Barcode1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcode2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Barcode2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchCsid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "BatchCsid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carriagePayer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "CarriagePayer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "CarriagePayer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "CarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("detailGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DetailGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DetailsGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DetailsGroup"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensionalWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DimensionalWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Esid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Event"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Event"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightBillsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "FreightBillsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ImportDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "InstallationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "InstallationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "InsuranceGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isConceptCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "IsConceptCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isConceptProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "IsConceptProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelPrintDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "LabelPrintDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "LabelsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestStatusText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "LatestStatusText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Lines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Line"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Line"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linesSummedWeights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "LinesSummedWeights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadmeter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Loadmeter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "LocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "LocationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Message"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Message"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPackages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "NumberOfPackages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "OrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originPostcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "OriginPostcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originTerminal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "OriginTerminal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageUid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PackageUid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerAccountAtCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PayerAccountAtCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalInstallationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PhysicalInstallationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PickupDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupTerminal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PickupTerminal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productIsReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ProductIsReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ProductName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("references");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "References"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Reference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Reference"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnPackaging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ReturnPackaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SearchKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderAccountAtBank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SenderAccountAtBank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderAccountAtCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SenderAccountAtCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Service"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentConnections");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ShipmentConnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ShipmentConnection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ShipmentConnection"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentCsid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ShipmentCsid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentCustomDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ShipmentCustomDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "ShipmentCustomDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "ShipmentCustomDocument"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ShipmentDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "ShipmentDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "ShipmentDocument"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentKind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ShipmentKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "ShipmentKind"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentStatusText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ShipmentStatusText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentTemperature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "ShipmentTemperature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "ShipmentTemperature"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stackCsid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "StackCsid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subcarrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SubcarrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subcarrierName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SubcarrierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "SubmitDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transmitDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "TransmitDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedInstallationIsVirtual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "UsedInstallationIsVirtual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeCM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "VolumeCM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Width"));
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

	@Override
	public String toString() {
		return "Shipment [actorCsid=" + actorCsid + ", actorName=" + actorName + ", addresses="
				+ Arrays.toString(addresses) + ", amounts=" + Arrays.toString(amounts) + ", barcode1=" + barcode1
				+ ", barcode2=" + barcode2 + ", batchCsid=" + batchCsid + ", carriagePayer=" + carriagePayer
				+ ", carrierId=" + carrierId + ", carrierName=" + carrierName + ", detailGroups="
				+ Arrays.toString(detailGroups) + ", dimensionalWeight=" + dimensionalWeight + ", esid=" + esid
				+ ", events=" + Arrays.toString(events) + ", expireDate=" + expireDate + ", freightBillsCount="
				+ freightBillsCount + ", height=" + height + ", importDate=" + importDate + ", installationId="
				+ installationId + ", installationName=" + installationName + ", insuranceGroup=" + insuranceGroup
				+ ", isConceptCarrier=" + isConceptCarrier + ", isConceptProduct=" + isConceptProduct
				+ ", labelPrintDate=" + labelPrintDate + ", labelsCount=" + labelsCount + ", latestStatusText="
				+ latestStatusText + ", length=" + length + ", lines=" + Arrays.toString(lines)
				+ ", linesSummedWeights=" + linesSummedWeights + ", loadmeter=" + loadmeter + ", locationId="
				+ locationId + ", locationName=" + locationName + ", messages=" + Arrays.toString(messages)
				+ ", number=" + number + ", numberOfPackages=" + numberOfPackages + ", orderNumber=" + orderNumber
				+ ", originPostcode=" + originPostcode + ", originTerminal=" + originTerminal + ", packageUid="
				+ packageUid + ", payerAccountAtCarrier=" + payerAccountAtCarrier + ", physicalInstallationId="
				+ physicalInstallationId + ", pickupDate=" + pickupDate + ", pickupTerminal=" + pickupTerminal
				+ ", productId=" + productId + ", productIsReturn=" + productIsReturn + ", productName=" + productName
				+ ", references=" + Arrays.toString(references) + ", returnPackaging=" + returnPackaging
				+ ", searchKey=" + searchKey + ", senderAccountAtBank=" + senderAccountAtBank
				+ ", senderAccountAtCarrier=" + senderAccountAtCarrier + ", services=" + Arrays.toString(services)
				+ ", shipmentConnections=" + Arrays.toString(shipmentConnections) + ", shipmentCsid=" + shipmentCsid
				+ ", shipmentCustomDocuments=" + Arrays.toString(shipmentCustomDocuments) + ", shipmentDocuments="
				+ Arrays.toString(shipmentDocuments) + ", shipmentKind=" + shipmentKind + ", shipmentStatusText="
				+ shipmentStatusText + ", shipmentTemperature=" + shipmentTemperature + ", stackCsid=" + stackCsid
				+ ", subcarrierId=" + subcarrierId + ", subcarrierName=" + subcarrierName + ", submitDate=" + submitDate
				+ ", transmitDate=" + transmitDate + ", usedInstallationIsVirtual=" + usedInstallationIsVirtual
				+ ", volumeCM=" + volumeCM + ", width=" + width + ", __equalsCalc=" + __equalsCalc + ", __hashCodeCalc="
				+ __hashCodeCalc + "]";
	}
}
