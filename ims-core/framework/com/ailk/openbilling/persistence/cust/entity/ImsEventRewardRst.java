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
@Table(schema="cd",name="IMS_EVENT_REWARD_RST")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"id","custId","acctId","resourceId","specId","billingType","createDate","soNbr","dealDate","sts","dealCount","errorCode","errorMsg"})
public class ImsEventRewardRst extends DataObject{


	@Column(name="ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="id")
	private Long id;

	@Column(name="CUST_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="custId")
	private Long custId;

	@Column(name="ACCT_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="acctId")
	private Long acctId;

	@Column(name="RESOURCE_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="resourceId")
	private Long resourceId;

	@Column(name="SPEC_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="specId")
	private Long specId;

	@Column(name="BILLING_TYPE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="billingType")
	private Integer billingType;

	@Column(name="CREATE_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="createDate")
	private Date createDate;

	@Column(name="SO_NBR",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="soNbr")
	private Long soNbr;

	@Column(name="DEAL_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="dealDate")
	private Date dealDate;

	@Column(name="STS",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="sts")
	private Integer sts;

	@Column(name="DEAL_COUNT",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="dealCount")
	private Integer dealCount;

	@Column(name="ERROR_CODE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="errorCode")
	private Integer errorCode;

	@Column(name="ERROR_MSG",columnDefinition="Varchar",length=256)
	@XmlElement(name="errorMsg")
	private String errorMsg;

	public void setId(Long obj){
		this.id = obj;
	}

	public Long getId(){
		return id;
	}

	public void setCustId(Long obj){
		this.custId = obj;
	}

	public Long getCustId(){
		return custId;
	}

	public void setAcctId(Long obj){
		this.acctId = obj;
	}

	public Long getAcctId(){
		return acctId;
	}

	public void setResourceId(Long obj){
		this.resourceId = obj;
	}

	public Long getResourceId(){
		return resourceId;
	}

	public void setSpecId(Long obj){
		this.specId = obj;
	}

	public Long getSpecId(){
		return specId;
	}

	public void setBillingType(Integer obj){
		this.billingType = obj;
	}

	public Integer getBillingType(){
		return billingType;
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

	public void setDealDate(Date obj){
		this.dealDate = obj;
	}

	public Date getDealDate(){
		return dealDate;
	}

	public void setSts(Integer obj){
		this.sts = obj;
	}

	public Integer getSts(){
		return sts;
	}

	public void setDealCount(Integer obj){
		this.dealCount = obj;
	}

	public Integer getDealCount(){
		return dealCount;
	}

	public void setErrorCode(Integer obj){
		this.errorCode = obj;
	}

	public Integer getErrorCode(){
		return errorCode;
	}

	public void setErrorMsg(String obj){
		this.errorMsg = obj;
	}

	public String getErrorMsg(){
		return errorMsg;
	}

	public ImsEventRewardRst(){
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		ImsEventRewardRst rhs=(ImsEventRewardRst)rhs0;
		if(!ObjectUtils.equals(id, rhs.id)) return false;
		if(!ObjectUtils.equals(custId, rhs.custId)) return false;
		if(!ObjectUtils.equals(acctId, rhs.acctId)) return false;
		if(!ObjectUtils.equals(resourceId, rhs.resourceId)) return false;
		if(!ObjectUtils.equals(specId, rhs.specId)) return false;
		if(!ObjectUtils.equals(billingType, rhs.billingType)) return false;
		if(!ObjectUtils.equals(createDate, rhs.createDate)) return false;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		if(!ObjectUtils.equals(dealDate, rhs.dealDate)) return false;
		if(!ObjectUtils.equals(sts, rhs.sts)) return false;
		if(!ObjectUtils.equals(dealCount, rhs.dealCount)) return false;
		if(!ObjectUtils.equals(errorCode, rhs.errorCode)) return false;
		if(!ObjectUtils.equals(errorMsg, rhs.errorMsg)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(id)
		.append(custId)
		.append(acctId)
		.append(resourceId)
		.append(specId)
		.append(billingType)
		.append(createDate)
		.append(soNbr)
		.append(dealDate)
		.append(sts)
		.append(dealCount)
		.append(errorCode)
		.append(errorMsg)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{id,custId,acctId,resourceId,specId,billingType,createDate,soNbr,dealDate,sts,dealCount,errorCode,errorMsg}
}