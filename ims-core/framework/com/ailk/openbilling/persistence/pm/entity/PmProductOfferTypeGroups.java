package com.ailk.openbilling.persistence.pm.entity;

import javax.persistence.Table;
import jef.database.DataObject;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.builder.HashCodeBuilder;
import jef.codegen.support.NotModified;
/**
 * This class was generated by EasyFrame according to the table in database.
 * You need to modify the type of primary key field, to the strategy your own.
 * 
 */
@NotModified
@Entity
@Table(schema="PD",name="PM_PRODUCT_OFFER_TYPE_GROUPS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"productOfferingId","offerType"})
public class PmProductOfferTypeGroups extends DataObject{


	/**
	 * A unique identifier for the product offering.
	 */
	@Id
	@Column(name="PRODUCT_OFFERING_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="productOfferingId")
	private Integer productOfferingId;

	/**
	 * 销售品类型标识
	 */
	@Id
	@Column(name="OFFER_TYPE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="offerType")
	private Integer offerType;

	public void setProductOfferingId(Integer obj){
		this.productOfferingId = obj;
	}

	public Integer getProductOfferingId(){
		return productOfferingId;
	}

	public void setOfferType(Integer obj){
		this.offerType = obj;
	}

	public Integer getOfferType(){
		return offerType;
	}

	public PmProductOfferTypeGroups(){
	}

	public PmProductOfferTypeGroups(Integer productOfferingId,Integer offerType){
		this.productOfferingId = productOfferingId;
		this.offerType = offerType;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		PmProductOfferTypeGroups rhs=(PmProductOfferTypeGroups)rhs0;
		if(!ObjectUtils.equals(offerType, rhs.offerType)) return false;
		if(!ObjectUtils.equals(productOfferingId, rhs.productOfferingId)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(offerType)
		.append(productOfferingId)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{productOfferingId,offerType}
}