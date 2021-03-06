package com.ailk.openbilling.persistence.itable.entity;

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
 */
@NotModified
@Entity
@Table(schema="JD",name="I_USER_CONFIRM")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"userId","busiType","identity","servType","spCode","operatorCode","serviceCode","billFlag","thirdMsisdn","billProp","regionCode","confirmResult","confirmTime","alarmTime","alarmDoneCode","sequenceNo","srcType","extendFlag","remark","soDate","validDate","expireDate","operType","soNbr","commitDate"})
public class IUserConfirm extends DataObject{


	@Column(name="USER_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="userId")
	private Long userId;

	@Column(name="BUSI_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="busiType")
	private Integer busiType;

	@Column(name="IDENTITY",columnDefinition="Varchar",length=64)
	@XmlElement(name="identity")
	private String identity;

	@Column(name="SERV_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="servType")
	private Integer servType;

	@Column(name="SP_CODE",columnDefinition="Varchar",length=32)
	@XmlElement(name="spCode")
	private String spCode;

	@Column(name="OPERATOR_CODE",columnDefinition="Varchar",length=32)
	@XmlElement(name="operatorCode")
	private String operatorCode;

	@Column(name="SERVICE_CODE",columnDefinition="Varchar",length=32)
	@XmlElement(name="serviceCode")
	private String serviceCode;

	@Column(name="BILL_FLAG",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="billFlag")
	private Integer billFlag;

	@Column(name="THIRD_MSISDN",columnDefinition="Varchar",length=15)
	@XmlElement(name="thirdMsisdn")
	private String thirdMsisdn;

	@Column(name="BILL_PROP",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="billProp")
	private Integer billProp;

	@Column(name="REGION_CODE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="regionCode")
	private Integer regionCode;

	@Column(name="CONFIRM_RESULT",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="confirmResult")
	private Integer confirmResult;

	@Column(name="CONFIRM_TIME",columnDefinition="TimeStamp")
	@XmlElement(name="confirmTime")
	private Date confirmTime;

	@Column(name="ALARM_TIME",columnDefinition="TimeStamp")
	@XmlElement(name="alarmTime")
	private Date alarmTime;

	@Column(name="ALARM_DONE_CODE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="alarmDoneCode")
	private Long alarmDoneCode;

	@Column(name="SEQUENCE_NO",columnDefinition="Varchar",length=32)
	@XmlElement(name="sequenceNo")
	private String sequenceNo;

	@Column(name="SRC_TYPE",columnDefinition="Varchar",length=64)
	@XmlElement(name="srcType")
	private String srcType;

	@Column(name="EXTEND_FLAG",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="extendFlag")
	private Integer extendFlag;

	@Column(name="REMARK",columnDefinition="Varchar",length=256,nullable=false)
	@XmlElement(name="remark")
	private String remark;

	@Column(name="SO_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="soDate")
	private Date soDate;

	@Column(name="VALID_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="validDate")
	private Date validDate;

	@Column(name="EXPIRE_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="expireDate")
	private Date expireDate;

	@Column(name="OPER_TYPE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="operType")
	private Integer operType;

	@Column(name="SO_NBR",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="soNbr")
	private Long soNbr;

	@Column(name="COMMIT_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="commitDate")
	private Date commitDate;

	public void setUserId(Long obj){
		this.userId = obj;
	}

	public Long getUserId(){
		return userId;
	}

	public void setBusiType(Integer obj){
		this.busiType = obj;
	}

	public Integer getBusiType(){
		return busiType;
	}

	public void setIdentity(String obj){
		this.identity = obj;
	}

	public String getIdentity(){
		return identity;
	}

	public void setServType(Integer obj){
		this.servType = obj;
	}

	public Integer getServType(){
		return servType;
	}

	public void setSpCode(String obj){
		this.spCode = obj;
	}

	public String getSpCode(){
		return spCode;
	}

	public void setOperatorCode(String obj){
		this.operatorCode = obj;
	}

	public String getOperatorCode(){
		return operatorCode;
	}

	public void setServiceCode(String obj){
		this.serviceCode = obj;
	}

	public String getServiceCode(){
		return serviceCode;
	}

	public void setBillFlag(Integer obj){
		this.billFlag = obj;
	}

	public Integer getBillFlag(){
		return billFlag;
	}

	public void setThirdMsisdn(String obj){
		this.thirdMsisdn = obj;
	}

	public String getThirdMsisdn(){
		return thirdMsisdn;
	}

	public void setBillProp(Integer obj){
		this.billProp = obj;
	}

	public Integer getBillProp(){
		return billProp;
	}

	public void setRegionCode(Integer obj){
		this.regionCode = obj;
	}

	public Integer getRegionCode(){
		return regionCode;
	}

	public void setConfirmResult(Integer obj){
		this.confirmResult = obj;
	}

	public Integer getConfirmResult(){
		return confirmResult;
	}

	public void setConfirmTime(Date obj){
		this.confirmTime = obj;
	}

	public Date getConfirmTime(){
		return confirmTime;
	}

	public void setAlarmTime(Date obj){
		this.alarmTime = obj;
	}

	public Date getAlarmTime(){
		return alarmTime;
	}

	public void setAlarmDoneCode(Long obj){
		this.alarmDoneCode = obj;
	}

	public Long getAlarmDoneCode(){
		return alarmDoneCode;
	}

	public void setSequenceNo(String obj){
		this.sequenceNo = obj;
	}

	public String getSequenceNo(){
		return sequenceNo;
	}

	public void setSrcType(String obj){
		this.srcType = obj;
	}

	public String getSrcType(){
		return srcType;
	}

	public void setExtendFlag(Integer obj){
		this.extendFlag = obj;
	}

	public Integer getExtendFlag(){
		return extendFlag;
	}

	public void setRemark(String obj){
		this.remark = obj;
	}

	public String getRemark(){
		return remark;
	}

	public void setSoDate(Date obj){
		this.soDate = obj;
	}

	public Date getSoDate(){
		return soDate;
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

	public void setOperType(Integer obj){
		this.operType = obj;
	}

	public Integer getOperType(){
		return operType;
	}

	public void setSoNbr(Long obj){
		this.soNbr = obj;
	}

	public Long getSoNbr(){
		return soNbr;
	}

	public void setCommitDate(Date obj){
		this.commitDate = obj;
	}

	public Date getCommitDate(){
		return commitDate;
	}

	public IUserConfirm(){
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		IUserConfirm rhs=(IUserConfirm)rhs0;
		if(!ObjectUtils.equals(userId, rhs.userId)) return false;
		if(!ObjectUtils.equals(busiType, rhs.busiType)) return false;
		if(!ObjectUtils.equals(identity, rhs.identity)) return false;
		if(!ObjectUtils.equals(servType, rhs.servType)) return false;
		if(!ObjectUtils.equals(spCode, rhs.spCode)) return false;
		if(!ObjectUtils.equals(operatorCode, rhs.operatorCode)) return false;
		if(!ObjectUtils.equals(serviceCode, rhs.serviceCode)) return false;
		if(!ObjectUtils.equals(billFlag, rhs.billFlag)) return false;
		if(!ObjectUtils.equals(thirdMsisdn, rhs.thirdMsisdn)) return false;
		if(!ObjectUtils.equals(billProp, rhs.billProp)) return false;
		if(!ObjectUtils.equals(regionCode, rhs.regionCode)) return false;
		if(!ObjectUtils.equals(confirmResult, rhs.confirmResult)) return false;
		if(!ObjectUtils.equals(confirmTime, rhs.confirmTime)) return false;
		if(!ObjectUtils.equals(alarmTime, rhs.alarmTime)) return false;
		if(!ObjectUtils.equals(alarmDoneCode, rhs.alarmDoneCode)) return false;
		if(!ObjectUtils.equals(sequenceNo, rhs.sequenceNo)) return false;
		if(!ObjectUtils.equals(srcType, rhs.srcType)) return false;
		if(!ObjectUtils.equals(extendFlag, rhs.extendFlag)) return false;
		if(!ObjectUtils.equals(remark, rhs.remark)) return false;
		if(!ObjectUtils.equals(soDate, rhs.soDate)) return false;
		if(!ObjectUtils.equals(validDate, rhs.validDate)) return false;
		if(!ObjectUtils.equals(expireDate, rhs.expireDate)) return false;
		if(!ObjectUtils.equals(operType, rhs.operType)) return false;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		if(!ObjectUtils.equals(commitDate, rhs.commitDate)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(userId)
		.append(busiType)
		.append(identity)
		.append(servType)
		.append(spCode)
		.append(operatorCode)
		.append(serviceCode)
		.append(billFlag)
		.append(thirdMsisdn)
		.append(billProp)
		.append(regionCode)
		.append(confirmResult)
		.append(confirmTime)
		.append(alarmTime)
		.append(alarmDoneCode)
		.append(sequenceNo)
		.append(srcType)
		.append(extendFlag)
		.append(remark)
		.append(soDate)
		.append(validDate)
		.append(expireDate)
		.append(operType)
		.append(soNbr)
		.append(commitDate)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{userId,busiType,identity,servType,spCode,operatorCode,serviceCode,billFlag,thirdMsisdn,billProp,regionCode,confirmResult,confirmTime,alarmTime,alarmDoneCode,sequenceNo,srcType,extendFlag,remark,soDate,validDate,expireDate,operType,soNbr,commitDate}
}