package com.ailk.openbilling.persistence.acct.entity;

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
 * 
 */
@NotModified
@Entity
@Table(schema="AD",name="CA_ASSET")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"assetId","assetType","acctId","validDate","expireDate","createDate","soNbr","soDate"})
public class CaAsset extends DataObject{


	@Id
	@Column(name="ASSET_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="assetId")
	private Long assetId;

	@Column(name="ASSET_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="assetType")
	private Long assetType;

	@Column(name="ACCT_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="acctId")
	private Long acctId;

	@Id
	@Column(name="VALID_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="validDate")
	private Date validDate;

	@Column(name="EXPIRE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="expireDate")
	private Date expireDate;

	@Column(name="CREATE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="createDate")
	private Date createDate;

	@Id
	@Column(name="SO_NBR",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="soNbr")
	private Long soNbr;

	@Column(name="SO_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="soDate")
	private Date soDate;

	public void setAssetId(Long obj){
		this.assetId = obj;
	}

	public Long getAssetId(){
		return assetId;
	}

	public void setAssetType(Long obj){
		this.assetType = obj;
	}

	public Long getAssetType(){
		return assetType;
	}

	public void setAcctId(Long obj){
		this.acctId = obj;
	}

	public Long getAcctId(){
		return acctId;
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

	public void setCreateDate(Date obj){
		this.createDate = obj;
	}

	public Date getCreateDate(){
		return createDate;
	}

	public void setSoNbr(Long obj){
		this.soNbr = obj;
	}

	public Long getSoNbr(){
		return soNbr;
	}

	public void setSoDate(Date obj){
		this.soDate = obj;
	}

	public Date getSoDate(){
		return soDate;
	}

	public CaAsset(){
	}

	public CaAsset(Long assetId,Date validDate,Long soNbr){
		this.assetId = assetId;
		this.validDate = validDate;
		this.soNbr = soNbr;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		CaAsset rhs=(CaAsset)rhs0;
		if(!ObjectUtils.equals(assetId, rhs.assetId)) return false;
		if(!ObjectUtils.equals(validDate, rhs.validDate)) return false;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(assetId)
		.append(validDate)
		.append(soNbr)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{assetId,assetType,acctId,validDate,expireDate,createDate,soNbr,soDate}
}