package com.ailk.openbilling.persistence.cust.entity;

import javax.persistence.Table;
import jef.database.DataObject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.Date;
import jef.codegen.support.NotModified;
/**
 * This class was generated by EasyFrame according to the table in database.
 * You need to modify the type of primary key field, to the strategy your own.
 * 
 */
@NotModified
@Entity
@Table(schema="CD",name="CO_PROD_CHAR_VALUE")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"productId","groupId","specCharId","value","validDate","expireDate","soNbr","createDate","soDate","objectId","objectType"})
public class CoProdCharValue extends DataObject{


	/**
	 * Product instance serial number
	 */
	@Column(name="PRODUCT_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="productId")
	private Long productId;

	/**
	 * The  id of CHAR_GROUP_ID  instance

If SPEC_CHAR_ID id from characteristic grouping, so grouping identifier instance need to be recorded,
if not ,filled with 0
	 */
	@Column(name="GROUP_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="groupId")
	private Long groupId;

	/**
	 * A unique identifier for the ProductSpecCharacteristic.
	 */
	@Column(name="SPEC_CHAR_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="specCharId")
	private Integer specCharId;

	/**
	 * A fact that describes a Product.
During generating the instance of product ,the specific value of specification characteristic
	 */
	@Column(name="VALUE",columnDefinition="Varchar",length=256,nullable=false)
	@XmlElement(name="value")
	private String value;

	/**
	 * valid date
	 */
	@Column(name="VALID_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="validDate")
	private Date validDate;

	/**
	 * expire date
	 */
	@Column(name="EXPIRE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="expireDate")
	private Date expireDate;

	/**
	 * The serial number
	 */
	@Column(name="SO_NBR",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="soNbr")
	private Long soNbr;

	@Column(name="CREATE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="createDate")
	private Date createDate;

	@Column(name="SO_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="soDate")
	private Date soDate;

	@Column(name="OBJECT_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="objectId")
	private Long objectId;

	@Column(name="OBJECT_TYPE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="objectType")
	private Integer objectType;

	public void setProductId(Long obj){
		this.productId = obj;
	}

	public Long getProductId(){
		return productId;
	}

	public void setGroupId(Long obj){
		this.groupId = obj;
	}

	public Long getGroupId(){
		return groupId;
	}

	public void setSpecCharId(Integer obj){
		this.specCharId = obj;
	}

	public Integer getSpecCharId(){
		return specCharId;
	}

	public void setValue(String obj){
		this.value = obj;
	}

	public String getValue(){
		return value;
	}

	public void setValidDate(Date obj){
		this.validDate = obj;
	}

	public Date getValidDate(){
		return validDate;
	}

	public void setExpireDate(Date obj){
		this.expireDate = obj;
	}

	public Date getExpireDate(){
		return expireDate;
	}

	public void setSoNbr(Long obj){
		this.soNbr = obj;
	}

	public Long getSoNbr(){
		return soNbr;
	}

	public void setCreateDate(Date obj){
		this.createDate = obj;
	}

	public Date getCreateDate(){
		return createDate;
	}

	public void setSoDate(Date obj){
		this.soDate = obj;
	}

	public Date getSoDate(){
		return soDate;
	}

	public void setObjectId(Long obj){
		this.objectId = obj;
	}

	public Long getObjectId(){
		return objectId;
	}

	public void setObjectType(Integer obj){
		this.objectType = obj;
	}

	public Integer getObjectType(){
		return objectType;
	}

	public CoProdCharValue(){
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		CoProdCharValue rhs=(CoProdCharValue)rhs0;
		if(!ObjectUtils.equals(productId, rhs.productId)) return false;
		if(!ObjectUtils.equals(groupId, rhs.groupId)) return false;
		if(!ObjectUtils.equals(specCharId, rhs.specCharId)) return false;
		if(!ObjectUtils.equals(value, rhs.value)) return false;
		if(!ObjectUtils.equals(validDate, rhs.validDate)) return false;
		if(!ObjectUtils.equals(expireDate, rhs.expireDate)) return false;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		if(!ObjectUtils.equals(createDate, rhs.createDate)) return false;
		if(!ObjectUtils.equals(soDate, rhs.soDate)) return false;
		if(!ObjectUtils.equals(objectId, rhs.objectId)) return false;
		if(!ObjectUtils.equals(objectType, rhs.objectType)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(productId)
		.append(groupId)
		.append(specCharId)
		.append(value)
		.append(validDate)
		.append(expireDate)
		.append(soNbr)
		.append(createDate)
		.append(soDate)
		.append(objectId)
		.append(objectType)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{productId,groupId,specCharId,value,validDate,expireDate,soNbr,createDate,soDate,objectId,objectType}
}