/**
 * Line.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain;

public class Line  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.DangerousGoods[] dangerousGoods;

    private java.lang.Integer dimensionalWeight;

    private java.lang.Integer goodsTypeId;

    private java.lang.String goodsTypeKey1;

    private java.lang.String goodsTypeKey2;

    private java.lang.String goodsTypeName;

    private java.lang.Integer height;

    private java.lang.Integer length;

    private java.lang.Integer lineNumberOfPackages;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.LineUnit[] lineUnits;

    private java.lang.Long lineVolume;

    private java.lang.Integer lineWeight;

    private java.lang.Integer loadmeter;

    private java.lang.Integer number;

    private java.lang.Long packageVolume;

    private java.lang.Integer packageWeight;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain._package[] packages;

    private java.lang.Integer recycleCount;

    private java.lang.String recycleTypeCode;

    private java.lang.Integer recycleTypeId;

    private java.lang.String recycleTypeName;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Reference[] references;

    private java.lang.Integer width;

    public Line() {
    }

    public Line(
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.DangerousGoods[] dangerousGoods,
           java.lang.Integer dimensionalWeight,
           java.lang.Integer goodsTypeId,
           java.lang.String goodsTypeKey1,
           java.lang.String goodsTypeKey2,
           java.lang.String goodsTypeName,
           java.lang.Integer height,
           java.lang.Integer length,
           java.lang.Integer lineNumberOfPackages,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.LineUnit[] lineUnits,
           java.lang.Long lineVolume,
           java.lang.Integer lineWeight,
           java.lang.Integer loadmeter,
           java.lang.Integer number,
           java.lang.Long packageVolume,
           java.lang.Integer packageWeight,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain._package[] packages,
           java.lang.Integer recycleCount,
           java.lang.String recycleTypeCode,
           java.lang.Integer recycleTypeId,
           java.lang.String recycleTypeName,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Reference[] references,
           java.lang.Integer width) {
           this.dangerousGoods = dangerousGoods;
           this.dimensionalWeight = dimensionalWeight;
           this.goodsTypeId = goodsTypeId;
           this.goodsTypeKey1 = goodsTypeKey1;
           this.goodsTypeKey2 = goodsTypeKey2;
           this.goodsTypeName = goodsTypeName;
           this.height = height;
           this.length = length;
           this.lineNumberOfPackages = lineNumberOfPackages;
           this.lineUnits = lineUnits;
           this.lineVolume = lineVolume;
           this.lineWeight = lineWeight;
           this.loadmeter = loadmeter;
           this.number = number;
           this.packageVolume = packageVolume;
           this.packageWeight = packageWeight;
           this.packages = packages;
           this.recycleCount = recycleCount;
           this.recycleTypeCode = recycleTypeCode;
           this.recycleTypeId = recycleTypeId;
           this.recycleTypeName = recycleTypeName;
           this.references = references;
           this.width = width;
    }


    /**
     * Gets the dangerousGoods value for this Line.
     * 
     * @return dangerousGoods
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.DangerousGoods[] getDangerousGoods() {
        return dangerousGoods;
    }


    /**
     * Sets the dangerousGoods value for this Line.
     * 
     * @param dangerousGoods
     */
    public void setDangerousGoods(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.DangerousGoods[] dangerousGoods) {
        this.dangerousGoods = dangerousGoods;
    }


    /**
     * Gets the dimensionalWeight value for this Line.
     * 
     * @return dimensionalWeight
     */
    public java.lang.Integer getDimensionalWeight() {
        return dimensionalWeight;
    }


    /**
     * Sets the dimensionalWeight value for this Line.
     * 
     * @param dimensionalWeight
     */
    public void setDimensionalWeight(java.lang.Integer dimensionalWeight) {
        this.dimensionalWeight = dimensionalWeight;
    }


    /**
     * Gets the goodsTypeId value for this Line.
     * 
     * @return goodsTypeId
     */
    public java.lang.Integer getGoodsTypeId() {
        return goodsTypeId;
    }


    /**
     * Sets the goodsTypeId value for this Line.
     * 
     * @param goodsTypeId
     */
    public void setGoodsTypeId(java.lang.Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }


    /**
     * Gets the goodsTypeKey1 value for this Line.
     * 
     * @return goodsTypeKey1
     */
    public java.lang.String getGoodsTypeKey1() {
        return goodsTypeKey1;
    }


    /**
     * Sets the goodsTypeKey1 value for this Line.
     * 
     * @param goodsTypeKey1
     */
    public void setGoodsTypeKey1(java.lang.String goodsTypeKey1) {
        this.goodsTypeKey1 = goodsTypeKey1;
    }


    /**
     * Gets the goodsTypeKey2 value for this Line.
     * 
     * @return goodsTypeKey2
     */
    public java.lang.String getGoodsTypeKey2() {
        return goodsTypeKey2;
    }


    /**
     * Sets the goodsTypeKey2 value for this Line.
     * 
     * @param goodsTypeKey2
     */
    public void setGoodsTypeKey2(java.lang.String goodsTypeKey2) {
        this.goodsTypeKey2 = goodsTypeKey2;
    }


    /**
     * Gets the goodsTypeName value for this Line.
     * 
     * @return goodsTypeName
     */
    public java.lang.String getGoodsTypeName() {
        return goodsTypeName;
    }


    /**
     * Sets the goodsTypeName value for this Line.
     * 
     * @param goodsTypeName
     */
    public void setGoodsTypeName(java.lang.String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }


    /**
     * Gets the height value for this Line.
     * 
     * @return height
     */
    public java.lang.Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this Line.
     * 
     * @param height
     */
    public void setHeight(java.lang.Integer height) {
        this.height = height;
    }


    /**
     * Gets the length value for this Line.
     * 
     * @return length
     */
    public java.lang.Integer getLength() {
        return length;
    }


    /**
     * Sets the length value for this Line.
     * 
     * @param length
     */
    public void setLength(java.lang.Integer length) {
        this.length = length;
    }


    /**
     * Gets the lineNumberOfPackages value for this Line.
     * 
     * @return lineNumberOfPackages
     */
    public java.lang.Integer getLineNumberOfPackages() {
        return lineNumberOfPackages;
    }


    /**
     * Sets the lineNumberOfPackages value for this Line.
     * 
     * @param lineNumberOfPackages
     */
    public void setLineNumberOfPackages(java.lang.Integer lineNumberOfPackages) {
        this.lineNumberOfPackages = lineNumberOfPackages;
    }


    /**
     * Gets the lineUnits value for this Line.
     * 
     * @return lineUnits
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.LineUnit[] getLineUnits() {
        return lineUnits;
    }


    /**
     * Sets the lineUnits value for this Line.
     * 
     * @param lineUnits
     */
    public void setLineUnits(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain.LineUnit[] lineUnits) {
        this.lineUnits = lineUnits;
    }


    /**
     * Gets the lineVolume value for this Line.
     * 
     * @return lineVolume
     */
    public java.lang.Long getLineVolume() {
        return lineVolume;
    }


    /**
     * Sets the lineVolume value for this Line.
     * 
     * @param lineVolume
     */
    public void setLineVolume(java.lang.Long lineVolume) {
        this.lineVolume = lineVolume;
    }


    /**
     * Gets the lineWeight value for this Line.
     * 
     * @return lineWeight
     */
    public java.lang.Integer getLineWeight() {
        return lineWeight;
    }


    /**
     * Sets the lineWeight value for this Line.
     * 
     * @param lineWeight
     */
    public void setLineWeight(java.lang.Integer lineWeight) {
        this.lineWeight = lineWeight;
    }


    /**
     * Gets the loadmeter value for this Line.
     * 
     * @return loadmeter
     */
    public java.lang.Integer getLoadmeter() {
        return loadmeter;
    }


    /**
     * Sets the loadmeter value for this Line.
     * 
     * @param loadmeter
     */
    public void setLoadmeter(java.lang.Integer loadmeter) {
        this.loadmeter = loadmeter;
    }


    /**
     * Gets the number value for this Line.
     * 
     * @return number
     */
    public java.lang.Integer getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Line.
     * 
     * @param number
     */
    public void setNumber(java.lang.Integer number) {
        this.number = number;
    }


    /**
     * Gets the packageVolume value for this Line.
     * 
     * @return packageVolume
     */
    public java.lang.Long getPackageVolume() {
        return packageVolume;
    }


    /**
     * Sets the packageVolume value for this Line.
     * 
     * @param packageVolume
     */
    public void setPackageVolume(java.lang.Long packageVolume) {
        this.packageVolume = packageVolume;
    }


    /**
     * Gets the packageWeight value for this Line.
     * 
     * @return packageWeight
     */
    public java.lang.Integer getPackageWeight() {
        return packageWeight;
    }


    /**
     * Sets the packageWeight value for this Line.
     * 
     * @param packageWeight
     */
    public void setPackageWeight(java.lang.Integer packageWeight) {
        this.packageWeight = packageWeight;
    }


    /**
     * Gets the packages value for this Line.
     * 
     * @return packages
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain._package[] getPackages() {
        return packages;
    }


    /**
     * Sets the packages value for this Line.
     * 
     * @param packages
     */
    public void setPackages(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain._package[] packages) {
        this.packages = packages;
    }


    /**
     * Gets the recycleCount value for this Line.
     * 
     * @return recycleCount
     */
    public java.lang.Integer getRecycleCount() {
        return recycleCount;
    }


    /**
     * Sets the recycleCount value for this Line.
     * 
     * @param recycleCount
     */
    public void setRecycleCount(java.lang.Integer recycleCount) {
        this.recycleCount = recycleCount;
    }


    /**
     * Gets the recycleTypeCode value for this Line.
     * 
     * @return recycleTypeCode
     */
    public java.lang.String getRecycleTypeCode() {
        return recycleTypeCode;
    }


    /**
     * Sets the recycleTypeCode value for this Line.
     * 
     * @param recycleTypeCode
     */
    public void setRecycleTypeCode(java.lang.String recycleTypeCode) {
        this.recycleTypeCode = recycleTypeCode;
    }


    /**
     * Gets the recycleTypeId value for this Line.
     * 
     * @return recycleTypeId
     */
    public java.lang.Integer getRecycleTypeId() {
        return recycleTypeId;
    }


    /**
     * Sets the recycleTypeId value for this Line.
     * 
     * @param recycleTypeId
     */
    public void setRecycleTypeId(java.lang.Integer recycleTypeId) {
        this.recycleTypeId = recycleTypeId;
    }


    /**
     * Gets the recycleTypeName value for this Line.
     * 
     * @return recycleTypeName
     */
    public java.lang.String getRecycleTypeName() {
        return recycleTypeName;
    }


    /**
     * Sets the recycleTypeName value for this Line.
     * 
     * @param recycleTypeName
     */
    public void setRecycleTypeName(java.lang.String recycleTypeName) {
        this.recycleTypeName = recycleTypeName;
    }


    /**
     * Gets the references value for this Line.
     * 
     * @return references
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Reference[] getReferences() {
        return references;
    }


    /**
     * Sets the references value for this Line.
     * 
     * @param references
     */
    public void setReferences(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Reference[] references) {
        this.references = references;
    }


    /**
     * Gets the width value for this Line.
     * 
     * @return width
     */
    public java.lang.Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this Line.
     * 
     * @param width
     */
    public void setWidth(java.lang.Integer width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Line)) return false;
        Line other = (Line) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dangerousGoods==null && other.getDangerousGoods()==null) || 
             (this.dangerousGoods!=null &&
              java.util.Arrays.equals(this.dangerousGoods, other.getDangerousGoods()))) &&
            ((this.dimensionalWeight==null && other.getDimensionalWeight()==null) || 
             (this.dimensionalWeight!=null &&
              this.dimensionalWeight.equals(other.getDimensionalWeight()))) &&
            ((this.goodsTypeId==null && other.getGoodsTypeId()==null) || 
             (this.goodsTypeId!=null &&
              this.goodsTypeId.equals(other.getGoodsTypeId()))) &&
            ((this.goodsTypeKey1==null && other.getGoodsTypeKey1()==null) || 
             (this.goodsTypeKey1!=null &&
              this.goodsTypeKey1.equals(other.getGoodsTypeKey1()))) &&
            ((this.goodsTypeKey2==null && other.getGoodsTypeKey2()==null) || 
             (this.goodsTypeKey2!=null &&
              this.goodsTypeKey2.equals(other.getGoodsTypeKey2()))) &&
            ((this.goodsTypeName==null && other.getGoodsTypeName()==null) || 
             (this.goodsTypeName!=null &&
              this.goodsTypeName.equals(other.getGoodsTypeName()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.lineNumberOfPackages==null && other.getLineNumberOfPackages()==null) || 
             (this.lineNumberOfPackages!=null &&
              this.lineNumberOfPackages.equals(other.getLineNumberOfPackages()))) &&
            ((this.lineUnits==null && other.getLineUnits()==null) || 
             (this.lineUnits!=null &&
              java.util.Arrays.equals(this.lineUnits, other.getLineUnits()))) &&
            ((this.lineVolume==null && other.getLineVolume()==null) || 
             (this.lineVolume!=null &&
              this.lineVolume.equals(other.getLineVolume()))) &&
            ((this.lineWeight==null && other.getLineWeight()==null) || 
             (this.lineWeight!=null &&
              this.lineWeight.equals(other.getLineWeight()))) &&
            ((this.loadmeter==null && other.getLoadmeter()==null) || 
             (this.loadmeter!=null &&
              this.loadmeter.equals(other.getLoadmeter()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.packageVolume==null && other.getPackageVolume()==null) || 
             (this.packageVolume!=null &&
              this.packageVolume.equals(other.getPackageVolume()))) &&
            ((this.packageWeight==null && other.getPackageWeight()==null) || 
             (this.packageWeight!=null &&
              this.packageWeight.equals(other.getPackageWeight()))) &&
            ((this.packages==null && other.getPackages()==null) || 
             (this.packages!=null &&
              java.util.Arrays.equals(this.packages, other.getPackages()))) &&
            ((this.recycleCount==null && other.getRecycleCount()==null) || 
             (this.recycleCount!=null &&
              this.recycleCount.equals(other.getRecycleCount()))) &&
            ((this.recycleTypeCode==null && other.getRecycleTypeCode()==null) || 
             (this.recycleTypeCode!=null &&
              this.recycleTypeCode.equals(other.getRecycleTypeCode()))) &&
            ((this.recycleTypeId==null && other.getRecycleTypeId()==null) || 
             (this.recycleTypeId!=null &&
              this.recycleTypeId.equals(other.getRecycleTypeId()))) &&
            ((this.recycleTypeName==null && other.getRecycleTypeName()==null) || 
             (this.recycleTypeName!=null &&
              this.recycleTypeName.equals(other.getRecycleTypeName()))) &&
            ((this.references==null && other.getReferences()==null) || 
             (this.references!=null &&
              java.util.Arrays.equals(this.references, other.getReferences()))) &&
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
        if (getDangerousGoods() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDangerousGoods());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDangerousGoods(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDimensionalWeight() != null) {
            _hashCode += getDimensionalWeight().hashCode();
        }
        if (getGoodsTypeId() != null) {
            _hashCode += getGoodsTypeId().hashCode();
        }
        if (getGoodsTypeKey1() != null) {
            _hashCode += getGoodsTypeKey1().hashCode();
        }
        if (getGoodsTypeKey2() != null) {
            _hashCode += getGoodsTypeKey2().hashCode();
        }
        if (getGoodsTypeName() != null) {
            _hashCode += getGoodsTypeName().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getLineNumberOfPackages() != null) {
            _hashCode += getLineNumberOfPackages().hashCode();
        }
        if (getLineUnits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineUnits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineUnits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLineVolume() != null) {
            _hashCode += getLineVolume().hashCode();
        }
        if (getLineWeight() != null) {
            _hashCode += getLineWeight().hashCode();
        }
        if (getLoadmeter() != null) {
            _hashCode += getLoadmeter().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getPackageVolume() != null) {
            _hashCode += getPackageVolume().hashCode();
        }
        if (getPackageWeight() != null) {
            _hashCode += getPackageWeight().hashCode();
        }
        if (getPackages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecycleCount() != null) {
            _hashCode += getRecycleCount().hashCode();
        }
        if (getRecycleTypeCode() != null) {
            _hashCode += getRecycleTypeCode().hashCode();
        }
        if (getRecycleTypeId() != null) {
            _hashCode += getRecycleTypeId().hashCode();
        }
        if (getRecycleTypeName() != null) {
            _hashCode += getRecycleTypeName().hashCode();
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
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Line.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Line"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dangerousGoods");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DangerousGoods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DangerousGoods"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DangerousGoods"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensionalWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DimensionalWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goodsTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "GoodsTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goodsTypeKey1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "GoodsTypeKey1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goodsTypeKey2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "GoodsTypeKey2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goodsTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "GoodsTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumberOfPackages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "LineNumberOfPackages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "LineUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "LineUnit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain", "LineUnit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "LineVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "LineWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PackageVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "PackageWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Packages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Package"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Package"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recycleCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "RecycleCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recycleTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "RecycleTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recycleTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "RecycleTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recycleTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "RecycleTypeName"));
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

}
