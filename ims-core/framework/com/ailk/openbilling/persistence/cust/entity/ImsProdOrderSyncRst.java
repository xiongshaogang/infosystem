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
@Table(schema="cd",name="IMS_PROD_ORDER_SYNC_RST")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"id","custId","acctId","userId","phoneId","reasonCode","soNbr","createDate","dealDate","sts","dealDesc","dealAgainDate","associateId","errorMsg","errorCode","dealCount","srcAction"})
public class ImsProdOrderSyncRst extends DataObject{


	/**
	 * าตฮ๑สพฑํตฤid
	 */
	@Column(name="ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="id")
	private Long id;

	@Column(name="CUST_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="custId")
	private Long custId;

	@Column(name="ACCT_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="acctId")
	private Long acctId;

	@Column(name="USER_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="userId")
	private Long userId;

	@Column(name="PHONE_ID",columnDefinition="Varchar",length=64)
	@XmlElement(name="phoneId")
	private String phoneId;

	@Column(name="REASON_CODE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="reasonCode")
	private Integer reasonCode;

	@Column(name="SO_NBR",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="soNbr")
	private Long soNbr;

	/**
	 * าตฮ๑สพฑํตฤcreate_date
	 */
	@Column(name="CREATE_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="createDate")
	private Date createDate;

	/**
	 * ดฆภํสฑผไ
	 */
	@Column(name="DEAL_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="dealDate")
	private Date dealDate;

	/**
	 * 1ฃบณษนฆ 2ฃบสงฐ 3ฃบาัิูดฆภํ
	 */
	@Column(name="STS",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="sts")
	private Integer sts;

	/**
	 * สงฐสฑฃฌดๆดขสงฐะลฯข
	 */
	@Column(name="DEAL_DESC",columnDefinition="Varchar",length=255)
	@XmlElement(name="dealDesc")
	private String dealDesc;

	/**
	 * ถิำฺสงฐผวยผตฤิูดฆภํสฑผไ
	 */
	@Column(name="DEAL_AGAIN_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="dealAgainDate")
	private Date dealAgainDate;

	@Column(name="ASSOCIATE_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="associateId")
	private Long associateId;

	@Column(name="ERROR_MSG",columnDefinition="Varchar",length=256)
	@XmlElement(name="errorMsg")
	private String errorMsg;

	@Column(name="ERROR_CODE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="errorCode")
	private Integer errorCode;

	@Column(name="DEAL_COUNT",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="dealCount")
	private Integer dealCount;

	@Column(name="SRC_ACTION",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="srcAction")
	private Integer srcAction;

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

	public void setUserId(Long obj){
		this.userId = obj;
	}

	public Long getUserId(){
		return userId;
	}

	public void setPhoneId(String obj){
		this.phoneId = obj;
	}

	public String getPhoneId(){
		return phoneId;
	}

	public void setReasonCode(Integer obj){
		this.reasonCode = obj;
	}

	public Integer getReasonCode(){
		return reasonCode;
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

	public void setDealDesc(String obj){
		this.dealDesc = obj;
	}

	public String getDealDesc(){
		return dealDesc;
	}

	public void setDealAgainDate(Date obj){
		this.dealAgainDate = obj;
	}

	public Date getDealAgainDate(){
		return dealAgainDate;
	}

	public void setAssociateId(Long obj){
		this.associateId = obj;
	}

	public Long getAssociateId(){
		return associateId;
	}

	public void setErrorMsg(String obj){
		this.errorMsg = obj;
	}

	public String getErrorMsg(){
		return errorMsg;
	}

	public void setErrorCode(Integer obj){
		this.errorCode = obj;
	}

	public Integer getErrorCode(){
		return errorCode;
	}

	public void setDealCount(Integer obj){
		this.dealCount = obj;
	}

	public Integer getDealCount(){
		return dealCount;
	}

	public void setSrcAction(Integer obj){
		this.srcAction = obj;
	}

	public Integer getSrcAction(){
		return srcAction;
	}

	public ImsProdOrderSyncRst(){
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		ImsProdOrderSyncRst rhs=(ImsProdOrderSyncRst)rhs0;
		if(!ObjectUtils.equals(id, rhs.id)) return false;
		if(!ObjectUtils.equals(custId, rhs.custId)) return false;
		if(!ObjectUtils.equals(acctId, rhs.acctId)) return false;
		if(!ObjectUtils.equals(userId, rhs.userId)) return false;
		if(!ObjectUtils.equals(phoneId, rhs.phoneId)) return false;
		if(!ObjectUtils.equals(reasonCode, rhs.reasonCode)) return false;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		if(!ObjectUtils.equals(createDate, rhs.createDate)) return false;
		if(!ObjectUtils.equals(dealDate, rhs.dealDate)) return false;
		if(!ObjectUtils.equals(sts, rhs.sts)) return false;
		if(!ObjectUtils.equals(dealDesc, rhs.dealDesc)) return false;
		if(!ObjectUtils.equals(dealAgainDate, rhs.dealAgainDate)) return false;
		if(!ObjectUtils.equals(associateId, rhs.associateId)) return false;
		if(!ObjectUtils.equals(errorMsg, rhs.errorMsg)) return false;
		if(!ObjectUtils.equals(errorCode, rhs.errorCode)) return false;
		if(!ObjectUtils.equals(dealCount, rhs.dealCount)) return false;
		if(!ObjectUtils.equals(srcAction, rhs.srcAction)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(id)
		.append(custId)
		.append(acctId)
		.append(userId)
		.append(phoneId)
		.append(reasonCode)
		.append(soNbr)
		.append(createDate)
		.append(dealDate)
		.append(sts)
		.append(dealDesc)
		.append(dealAgainDate)
		.append(associateId)
		.append(errorMsg)
		.append(errorCode)
		.append(dealCount)
		.append(srcAction)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{id,custId,acctId,userId,phoneId,reasonCode,soNbr,createDate,dealDate,sts,dealDesc,dealAgainDate,associateId,errorMsg,errorCode,dealCount,srcAction}
}