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
@Table(schema="cd",name="CM_BUSI")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"soNbr","outerSoNbr","batchFlag","parentSoNbr","recType","busiSpecId","busiCode","channel","busiDirect","opId","phoneId","resourceId","acctId","custId","sts","cancelDate","origSoNbr","doneDate","otcFlag","otcSoNbr","rewardFlag","rewardSoNbr","authFlag","authSoNbr","sourceSystem","stepId","soDate","provCode","regionCode","countyCode","orgId","isMonitor","isnormal","notifyFlag"})
public class CmBusi extends DataObject{


	/**
	 * Serial number
	 */
	@Column(name="SO_NBR",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="soNbr")
	private Long soNbr;

	/**
	 * Outer serial number
	 */
	@Column(name="OUTER_SO_NBR",columnDefinition="Varchar",length=255,nullable=false)
	@XmlElement(name="outerSoNbr")
	private String outerSoNbr;

	/**
	 * Batch flag, 0 - not batch, 1 - batch
	 */
	@Column(name="BATCH_FLAG",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="batchFlag")
	private Integer batchFlag;

	/**
	 * Serial number of parent work order
	 */
	@Column(name="PARENT_SO_NBR",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="parentSoNbr")
	private Long parentSoNbr;

	/**
	 * Service record type, 0 - normal service, 1 - order cancelation service
	 */
	@Column(name="REC_TYPE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="recType")
	private Integer recType;

	/**
	 * Business ID
	 */
	@Column(name="BUSI_SPEC_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="busiSpecId")
	private Integer busiSpecId;

	@Column(name="BUSI_CODE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="busiCode")
	private Integer busiCode;

	/**
	 * Channel
	 */
	@Column(name="CHANNEL",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="channel")
	private Integer channel;

	/**
	 * Business direction, 1 - Synchronize outer system to BOS; 2 - Synchronize BOS to outer system
	 */
	@Column(name="BUSI_DIRECT",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="busiDirect")
	private Integer busiDirect;

	/**
	 * 操作员编号
	 */
	@Column(name="OP_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="opId")
	private Long opId;

	@Column(name="PHONE_ID",columnDefinition="Varchar",length=255,nullable=false)
	@XmlElement(name="phoneId")
	private String phoneId;

	@Column(name="RESOURCE_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="resourceId")
	private Long resourceId;

	/**
	 * 帐户编号
	 */
	@Column(name="ACCT_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="acctId")
	private Long acctId;

	/**
	 * 客户编码
	 */
	@Column(name="CUST_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="custId")
	private Long custId;

	/**
	 * 0 - normal work order, 1 - canceled work order
	 */
	@Column(name="STS",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="sts")
	private Integer sts;

	/**
	 * Cancelation date of work order
	 */
	@Column(name="CANCEL_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="cancelDate")
	private Date cancelDate;

	/**
	 * Serial number of original work order
	 */
	@Column(name="ORIG_SO_NBR",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="origSoNbr")
	private Long origSoNbr;

	/**
	 * Record done date
	 */
	@Column(name="DONE_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="doneDate")
	private Date doneDate;

	/**
	 * Acception flag of one time charge, 0 - not accepted, 1 - accepted
	 */
	@Column(name="OTC_FLAG",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="otcFlag")
	private Integer otcFlag;

	/**
	 * Acception work order of one time charge
	 */
	@Column(name="OTC_SO_NBR",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="otcSoNbr")
	private Long otcSoNbr;

	/**
	 * Reward acception flag, 0 - not accepted, 1 - accepted
	 */
	@Column(name="REWARD_FLAG",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="rewardFlag")
	private Integer rewardFlag;

	/**
	 * Serial number of reward acception
	 */
	@Column(name="REWARD_SO_NBR",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="rewardSoNbr")
	private Long rewardSoNbr;

	/**
	 * Authentication flag, 0 - not authenticated, 1 - authenticated
	 */
	@Column(name="AUTH_FLAG",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="authFlag")
	private Integer authFlag;

	/**
	 * Authentication serial number
	 */
	@Column(name="AUTH_SO_NBR",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="authSoNbr")
	private Long authSoNbr;

	@Column(name="SOURCE_SYSTEM",columnDefinition="Varchar",length=30,nullable=false)
	@XmlElement(name="sourceSystem")
	private String sourceSystem;

	@Column(name="STEP_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="stepId")
	private Integer stepId;

	@Column(name="SO_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="soDate")
	private Date soDate;

	@Column(name="PROV_CODE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="provCode")
	private Integer provCode;

	@Column(name="REGION_CODE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="regionCode")
	private Integer regionCode;

	@Column(name="COUNTY_CODE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="countyCode")
	private Integer countyCode;

	@Column(name="ORG_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="orgId")
	private Integer orgId;

	@Column(name="IS_MONITOR",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="isMonitor")
	private Integer isMonitor;

	@Column(name="ISNORMAL",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="isnormal")
	private Integer isnormal;

	@Column(name="NOTIFY_FLAG",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="notifyFlag")
	private Integer notifyFlag;

	public void setSoNbr(Long obj){
		this.soNbr = obj;
	}

	public Long getSoNbr(){
		return soNbr;
	}

	public void setOuterSoNbr(String obj){
		this.outerSoNbr = obj;
	}

	public String getOuterSoNbr(){
		return outerSoNbr;
	}

	public void setBatchFlag(Integer obj){
		this.batchFlag = obj;
	}

	public Integer getBatchFlag(){
		return batchFlag;
	}

	public void setParentSoNbr(Long obj){
		this.parentSoNbr = obj;
	}

	public Long getParentSoNbr(){
		return parentSoNbr;
	}

	public void setRecType(Integer obj){
		this.recType = obj;
	}

	public Integer getRecType(){
		return recType;
	}

	public void setBusiSpecId(Integer obj){
		this.busiSpecId = obj;
	}

	public Integer getBusiSpecId(){
		return busiSpecId;
	}

	public void setBusiCode(Integer obj){
		this.busiCode = obj;
	}

	public Integer getBusiCode(){
		return busiCode;
	}

	public void setChannel(Integer obj){
		this.channel = obj;
	}

	public Integer getChannel(){
		return channel;
	}

	public void setBusiDirect(Integer obj){
		this.busiDirect = obj;
	}

	public Integer getBusiDirect(){
		return busiDirect;
	}

	public void setOpId(Long obj){
		this.opId = obj;
	}

	public Long getOpId(){
		return opId;
	}

	public void setPhoneId(String obj){
		this.phoneId = obj;
	}

	public String getPhoneId(){
		return phoneId;
	}

	public void setResourceId(Long obj){
		this.resourceId = obj;
	}

	public Long getResourceId(){
		return resourceId;
	}

	public void setAcctId(Long obj){
		this.acctId = obj;
	}

	public Long getAcctId(){
		return acctId;
	}

	public void setCustId(Long obj){
		this.custId = obj;
	}

	public Long getCustId(){
		return custId;
	}

	public void setSts(Integer obj){
		this.sts = obj;
	}

	public Integer getSts(){
		return sts;
	}

	public void setCancelDate(Date obj){
		this.cancelDate = obj;
	}

	public Date getCancelDate(){
		return cancelDate;
	}

	public void setOrigSoNbr(Long obj){
		this.origSoNbr = obj;
	}

	public Long getOrigSoNbr(){
		return origSoNbr;
	}

	public void setDoneDate(Date obj){
		this.doneDate = obj;
	}

	public Date getDoneDate(){
		return doneDate;
	}

	public void setOtcFlag(Integer obj){
		this.otcFlag = obj;
	}

	public Integer getOtcFlag(){
		return otcFlag;
	}

	public void setOtcSoNbr(Long obj){
		this.otcSoNbr = obj;
	}

	public Long getOtcSoNbr(){
		return otcSoNbr;
	}

	public void setRewardFlag(Integer obj){
		this.rewardFlag = obj;
	}

	public Integer getRewardFlag(){
		return rewardFlag;
	}

	public void setRewardSoNbr(Long obj){
		this.rewardSoNbr = obj;
	}

	public Long getRewardSoNbr(){
		return rewardSoNbr;
	}

	public void setAuthFlag(Integer obj){
		this.authFlag = obj;
	}

	public Integer getAuthFlag(){
		return authFlag;
	}

	public void setAuthSoNbr(Long obj){
		this.authSoNbr = obj;
	}

	public Long getAuthSoNbr(){
		return authSoNbr;
	}

	public void setSourceSystem(String obj){
		this.sourceSystem = obj;
	}

	public String getSourceSystem(){
		return sourceSystem;
	}

	public void setStepId(Integer obj){
		this.stepId = obj;
	}

	public Integer getStepId(){
		return stepId;
	}

	public void setSoDate(Date obj){
		this.soDate = obj;
	}

	public Date getSoDate(){
		return soDate;
	}

	public void setProvCode(Integer obj){
		this.provCode = obj;
	}

	public Integer getProvCode(){
		return provCode;
	}

	public void setRegionCode(Integer obj){
		this.regionCode = obj;
	}

	public Integer getRegionCode(){
		return regionCode;
	}

	public void setCountyCode(Integer obj){
		this.countyCode = obj;
	}

	public Integer getCountyCode(){
		return countyCode;
	}

	public void setOrgId(Integer obj){
		this.orgId = obj;
	}

	public Integer getOrgId(){
		return orgId;
	}

	public void setIsMonitor(Integer obj){
		this.isMonitor = obj;
	}

	public Integer getIsMonitor(){
		return isMonitor;
	}

	public void setIsnormal(Integer obj){
		this.isnormal = obj;
	}

	public Integer getIsnormal(){
		return isnormal;
	}

	public void setNotifyFlag(Integer obj){
		this.notifyFlag = obj;
	}

	public Integer getNotifyFlag(){
		return notifyFlag;
	}

	public CmBusi(){
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		CmBusi rhs=(CmBusi)rhs0;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		if(!ObjectUtils.equals(outerSoNbr, rhs.outerSoNbr)) return false;
		if(!ObjectUtils.equals(batchFlag, rhs.batchFlag)) return false;
		if(!ObjectUtils.equals(parentSoNbr, rhs.parentSoNbr)) return false;
		if(!ObjectUtils.equals(recType, rhs.recType)) return false;
		if(!ObjectUtils.equals(busiSpecId, rhs.busiSpecId)) return false;
		if(!ObjectUtils.equals(busiCode, rhs.busiCode)) return false;
		if(!ObjectUtils.equals(channel, rhs.channel)) return false;
		if(!ObjectUtils.equals(busiDirect, rhs.busiDirect)) return false;
		if(!ObjectUtils.equals(opId, rhs.opId)) return false;
		if(!ObjectUtils.equals(phoneId, rhs.phoneId)) return false;
		if(!ObjectUtils.equals(resourceId, rhs.resourceId)) return false;
		if(!ObjectUtils.equals(acctId, rhs.acctId)) return false;
		if(!ObjectUtils.equals(custId, rhs.custId)) return false;
		if(!ObjectUtils.equals(sts, rhs.sts)) return false;
		if(!ObjectUtils.equals(cancelDate, rhs.cancelDate)) return false;
		if(!ObjectUtils.equals(origSoNbr, rhs.origSoNbr)) return false;
		if(!ObjectUtils.equals(doneDate, rhs.doneDate)) return false;
		if(!ObjectUtils.equals(otcFlag, rhs.otcFlag)) return false;
		if(!ObjectUtils.equals(otcSoNbr, rhs.otcSoNbr)) return false;
		if(!ObjectUtils.equals(rewardFlag, rhs.rewardFlag)) return false;
		if(!ObjectUtils.equals(rewardSoNbr, rhs.rewardSoNbr)) return false;
		if(!ObjectUtils.equals(authFlag, rhs.authFlag)) return false;
		if(!ObjectUtils.equals(authSoNbr, rhs.authSoNbr)) return false;
		if(!ObjectUtils.equals(sourceSystem, rhs.sourceSystem)) return false;
		if(!ObjectUtils.equals(stepId, rhs.stepId)) return false;
		if(!ObjectUtils.equals(soDate, rhs.soDate)) return false;
		if(!ObjectUtils.equals(provCode, rhs.provCode)) return false;
		if(!ObjectUtils.equals(regionCode, rhs.regionCode)) return false;
		if(!ObjectUtils.equals(countyCode, rhs.countyCode)) return false;
		if(!ObjectUtils.equals(orgId, rhs.orgId)) return false;
		if(!ObjectUtils.equals(isMonitor, rhs.isMonitor)) return false;
		if(!ObjectUtils.equals(isnormal, rhs.isnormal)) return false;
		if(!ObjectUtils.equals(notifyFlag, rhs.notifyFlag)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(soNbr)
		.append(outerSoNbr)
		.append(batchFlag)
		.append(parentSoNbr)
		.append(recType)
		.append(busiSpecId)
		.append(busiCode)
		.append(channel)
		.append(busiDirect)
		.append(opId)
		.append(phoneId)
		.append(resourceId)
		.append(acctId)
		.append(custId)
		.append(sts)
		.append(cancelDate)
		.append(origSoNbr)
		.append(doneDate)
		.append(otcFlag)
		.append(otcSoNbr)
		.append(rewardFlag)
		.append(rewardSoNbr)
		.append(authFlag)
		.append(authSoNbr)
		.append(sourceSystem)
		.append(stepId)
		.append(soDate)
		.append(provCode)
		.append(regionCode)
		.append(countyCode)
		.append(orgId)
		.append(isMonitor)
		.append(isnormal)
		.append(notifyFlag)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{soNbr,outerSoNbr,batchFlag,parentSoNbr,recType,busiSpecId,busiCode,channel,busiDirect,opId,phoneId,resourceId,acctId,custId,sts,cancelDate,origSoNbr,doneDate,otcFlag,otcSoNbr,rewardFlag,rewardSoNbr,authFlag,authSoNbr,sourceSystem,stepId,soDate,provCode,regionCode,countyCode,orgId,isMonitor,isnormal,notifyFlag}
}