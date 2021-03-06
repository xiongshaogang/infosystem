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
import java.util.Date;
import jef.codegen.support.NotModified;
/**
 * This class was generated by EasyFrame according to the table in database.
 * You need to modify the type of primary key field, to the strategy your own.
 */
@NotModified
@Entity
@Table(schema="PD",name="PM_PRODUCT_SPEC_CHAR_USE")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"prodSpecId","specCharId","charValueId","name","description","isUnique","isPackage","canBeOveridden","minCardinality","maxCardinality","isExtensible","validDate","expireDate"})
public class PmProductSpecCharUse extends DataObject{


	/**
	 * An identification number assigned to uniquely identify the specification.
	 */
	@Id
	@Column(name="PROD_SPEC_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="prodSpecId")
	private Integer prodSpecId;

	/**
	 * A unique identifier for the product specification characteristic.
	 */
	@Id
	@Column(name="SPEC_CHAR_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="specCharId")
	private Integer specCharId;

	/**
	 * characteristic value ID
	 */
	@Id
	@Column(name="CHAR_VALUE_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="charValueId")
	private Integer charValueId;

	/**
	 * name
	 */
	@Column(name="NAME",columnDefinition="Varchar",length=256)
	@XmlElement(name="name")
	private String name;

	/**
	 * description
	 */
	@Column(name="DESCRIPTION",columnDefinition="Varchar",length=1024)
	@XmlElement(name="description")
	private String description;

	/**
	 * unique value or not  enum： 0：no 1：yes
	 */
	@Column(name="IS_UNIQUE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="isUnique")
	private Integer isUnique;

	/**
	 * necessary characteristic binding in specification or not  0：no 1：yes
	 */
	@Column(name="IS_PACKAGE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="isPackage")
	private Integer isPackage;

	/**
	 * values can be covered or not  value： 0：no 1：yes
	 */
	@Column(name="CAN_BE_OVERIDDEN",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="canBeOveridden")
	private Integer canBeOveridden;

	/**
	 * minimum cardinality to values
	 */
	@Column(name="MIN_CARDINALITY",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="minCardinality")
	private Long minCardinality;

	/**
	 * maximum cardinality to values
	 */
	@Column(name="MAX_CARDINALITY",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="maxCardinality")
	private Long maxCardinality;

	/**
	 * values can be extended or not  0：no 1：yes
	 */
	@Column(name="IS_EXTENSIBLE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="isExtensible")
	private Integer isExtensible;

	/**
	 * effective date
	 */
	@Column(name="VALID_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="validDate")
	private Date validDate;

	/**
	 * expiring date
	 */
	@Column(name="EXPIRE_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="expireDate")
	private Date expireDate;

	public void setProdSpecId(Integer obj){
		this.prodSpecId = obj;
	}

	public Integer getProdSpecId(){
		return prodSpecId;
	}

	public void setSpecCharId(Integer obj){
		this.specCharId = obj;
	}

	public Integer getSpecCharId(){
		return specCharId;
	}

	public void setCharValueId(Integer obj){
		this.charValueId = obj;
	}

	public Integer getCharValueId(){
		return charValueId;
	}

	public void setName(String obj){
		this.name = obj;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String obj){
		this.description = obj;
	}

	public String getDescription(){
		return description;
	}

	public void setIsUnique(Integer obj){
		this.isUnique = obj;
	}

	public Integer getIsUnique(){
		return isUnique;
	}

	public void setIsPackage(Integer obj){
		this.isPackage = obj;
	}

	public Integer getIsPackage(){
		return isPackage;
	}

	public void setCanBeOveridden(Integer obj){
		this.canBeOveridden = obj;
	}

	public Integer getCanBeOveridden(){
		return canBeOveridden;
	}

	public void setMinCardinality(Long obj){
		this.minCardinality = obj;
	}

	public Long getMinCardinality(){
		return minCardinality;
	}

	public void setMaxCardinality(Long obj){
		this.maxCardinality = obj;
	}

	public Long getMaxCardinality(){
		return maxCardinality;
	}

	public void setIsExtensible(Integer obj){
		this.isExtensible = obj;
	}

	public Integer getIsExtensible(){
		return isExtensible;
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

	public PmProductSpecCharUse(){
	}

	public PmProductSpecCharUse(Integer prodSpecId,Integer specCharId,Integer charValueId){
		this.prodSpecId = prodSpecId;
		this.specCharId = specCharId;
		this.charValueId = charValueId;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		PmProductSpecCharUse rhs=(PmProductSpecCharUse)rhs0;
		if(!ObjectUtils.equals(charValueId, rhs.charValueId)) return false;
		if(!ObjectUtils.equals(prodSpecId, rhs.prodSpecId)) return false;
		if(!ObjectUtils.equals(specCharId, rhs.specCharId)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(charValueId)
		.append(prodSpecId)
		.append(specCharId)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{prodSpecId,specCharId,charValueId,name,description,isUnique,isPackage,canBeOveridden,minCardinality,maxCardinality,isExtensible,validDate,expireDate}
}