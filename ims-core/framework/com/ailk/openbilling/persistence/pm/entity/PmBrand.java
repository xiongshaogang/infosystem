package com.ailk.openbilling.persistence.pm.entity;

import javax.persistence.Table;
import jef.database.DataObject;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
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
@Table(schema="PD",name="PM_BRAND")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"brandId","name","brandType","slogan","description","validDate","expireDate"})
public class PmBrand extends DataObject{


	/**
	 * Brand ID
	 */
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Id
	@Column(name="BRAND_ID",precision=10,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="brandId")
	private Integer brandId;

	/**
	 * Brand name
	 */
	@Column(name="NAME",columnDefinition="Varchar",length=256)
	@XmlElement(name="name")
	private String name;

	/**
	 * Brand type：
0：business brand
	 */
	@Column(name="BRAND_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="brandType")
	private Integer brandType;

	/**
	 * brand slogan
	 */
	@Column(name="SLOGAN",columnDefinition="Varchar",length=1024)
	@XmlElement(name="slogan")
	private String slogan;

	/**
	 * Brand information description
	 */
	@Column(name="DESCRIPTION",columnDefinition="Varchar",length=1024)
	@XmlElement(name="description")
	private String description;

	/**
	 * Effective date
	 */
	@Column(name="VALID_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="validDate")
	private Date validDate;

	/**
	 * Expired date
	 */
	@Column(name="EXPIRE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="expireDate")
	private Date expireDate;

	public void setBrandId(Integer obj){
		this.brandId = obj;
	}

	public Integer getBrandId(){
		return brandId;
	}

	public void setName(String obj){
		this.name = obj;
	}

	public String getName(){
		return name;
	}

	public void setBrandType(Integer obj){
		this.brandType = obj;
	}

	public Integer getBrandType(){
		return brandType;
	}

	public void setSlogan(String obj){
		this.slogan = obj;
	}

	public String getSlogan(){
		return slogan;
	}

	public void setDescription(String obj){
		this.description = obj;
	}

	public String getDescription(){
		return description;
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

	public PmBrand(){
	}

	public PmBrand(Integer brandId){
		this.brandId = brandId;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		PmBrand rhs=(PmBrand)rhs0;
		if(!ObjectUtils.equals(brandId, rhs.brandId)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(brandId)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{brandId,name,brandType,slogan,description,validDate,expireDate}
}