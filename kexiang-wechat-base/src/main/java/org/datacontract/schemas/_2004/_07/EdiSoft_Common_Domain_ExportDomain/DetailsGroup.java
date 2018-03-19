/**
 * DetailsGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain;

public class DetailsGroup  implements java.io.Serializable {
    private java.lang.String groupDisplayName;

    private java.lang.String groupName;

    private java.lang.Integer groupOrder;

    private java.lang.Integer listing;

    private org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.DetailRow[] rows;

    public DetailsGroup() {
    }

    public DetailsGroup(
           java.lang.String groupDisplayName,
           java.lang.String groupName,
           java.lang.Integer groupOrder,
           java.lang.Integer listing,
           org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.DetailRow[] rows) {
           this.groupDisplayName = groupDisplayName;
           this.groupName = groupName;
           this.groupOrder = groupOrder;
           this.listing = listing;
           this.rows = rows;
    }


    /**
     * Gets the groupDisplayName value for this DetailsGroup.
     * 
     * @return groupDisplayName
     */
    public java.lang.String getGroupDisplayName() {
        return groupDisplayName;
    }


    /**
     * Sets the groupDisplayName value for this DetailsGroup.
     * 
     * @param groupDisplayName
     */
    public void setGroupDisplayName(java.lang.String groupDisplayName) {
        this.groupDisplayName = groupDisplayName;
    }


    /**
     * Gets the groupName value for this DetailsGroup.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this DetailsGroup.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the groupOrder value for this DetailsGroup.
     * 
     * @return groupOrder
     */
    public java.lang.Integer getGroupOrder() {
        return groupOrder;
    }


    /**
     * Sets the groupOrder value for this DetailsGroup.
     * 
     * @param groupOrder
     */
    public void setGroupOrder(java.lang.Integer groupOrder) {
        this.groupOrder = groupOrder;
    }


    /**
     * Gets the listing value for this DetailsGroup.
     * 
     * @return listing
     */
    public java.lang.Integer getListing() {
        return listing;
    }


    /**
     * Sets the listing value for this DetailsGroup.
     * 
     * @param listing
     */
    public void setListing(java.lang.Integer listing) {
        this.listing = listing;
    }


    /**
     * Gets the rows value for this DetailsGroup.
     * 
     * @return rows
     */
    public org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.DetailRow[] getRows() {
        return rows;
    }


    /**
     * Sets the rows value for this DetailsGroup.
     * 
     * @param rows
     */
    public void setRows(org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.DetailRow[] rows) {
        this.rows = rows;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetailsGroup)) return false;
        DetailsGroup other = (DetailsGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupDisplayName==null && other.getGroupDisplayName()==null) || 
             (this.groupDisplayName!=null &&
              this.groupDisplayName.equals(other.getGroupDisplayName()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.groupOrder==null && other.getGroupOrder()==null) || 
             (this.groupOrder!=null &&
              this.groupOrder.equals(other.getGroupOrder()))) &&
            ((this.listing==null && other.getListing()==null) || 
             (this.listing!=null &&
              this.listing.equals(other.getListing()))) &&
            ((this.rows==null && other.getRows()==null) || 
             (this.rows!=null &&
              java.util.Arrays.equals(this.rows, other.getRows())));
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
        if (getGroupDisplayName() != null) {
            _hashCode += getGroupDisplayName().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getGroupOrder() != null) {
            _hashCode += getGroupOrder().hashCode();
        }
        if (getListing() != null) {
            _hashCode += getListing().hashCode();
        }
        if (getRows() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRows());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRows(), i);
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
        new org.apache.axis.description.TypeDesc(DetailsGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DetailsGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "GroupDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "GroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "GroupOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Listing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rows");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "Rows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DetailRow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/EdiSoft.Common.Domain.ExportDomain", "DetailRow"));
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
