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
 * 
 */
@NotModified
@Entity
@Table(schema="JD",name="I_USER")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"userId","userType","paymentMode","phoneId","userCode","brand","userSegment","regionCode","countyCode","smsLanguage","ivrLanguage","ussdLanguage","activeDate","accessWay","validDate","expireDate","operType","soNbr","commitDate","longTermList","isEcard","groupMemLevel","isSendCard","resClass","custId","dummyTag","serialNumber","changeuserDate"})
public class IUser extends DataObject{


	@Column(name="USER_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="userId")
	private Long userId;

	@Column(name="USER_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="userType")
	private Integer userType;

	@Column(name="PAYMENT_MODE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="paymentMode")
	private Integer paymentMode;

	@Column(name="PHONE_ID",columnDefinition="Varchar",length=64)
	@XmlElement(name="phoneId")
	private String phoneId;

	@Column(name="USER_CODE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="userCode")
	private Integer userCode;

	@Column(name="BRAND",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="brand")
	private Integer brand;

	@Column(name="USER_SEGMENT",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="userSegment")
	private Integer userSegment;

	@Column(name="REGION_CODE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="regionCode")
	private Integer regionCode;

	@Column(name="COUNTY_CODE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="countyCode")
	private Integer countyCode;

	@Column(name="SMS_LANGUAGE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="smsLanguage")
	private Integer smsLanguage;

	@Column(name="IVR_LANGUAGE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="ivrLanguage")
	private Integer ivrLanguage;

	@Column(name="USSD_LANGUAGE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="ussdLanguage")
	private Integer ussdLanguage;

	@Column(name="ACTIVE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="activeDate")
	private Date activeDate;

	@Column(name="ACCESS_WAY",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="accessWay")
	private Integer accessWay;

	@Column(name="VALID_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="validDate")
	private Date validDate;

	@Column(name="EXPIRE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="expireDate")
	private Date expireDate;

	@Column(name="OPER_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="operType")
	private Integer operType;

	@Column(name="SO_NBR",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="soNbr")
	private Long soNbr;

	@Column(name="COMMIT_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="commitDate")
	private Date commitDate;

	@Column(name="LONG_TERM_LIST",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="longTermList")
	private Integer longTermList;

	@Column(name="IS_ECARD",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="isEcard")
	private Integer isEcard;

	@Column(name="GROUP_MEM_LEVEL",columnDefinition="Varchar",length=6)
	@XmlElement(name="groupMemLevel")
	private String groupMemLevel;

	@Column(name="IS_SEND_CARD",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="isSendCard")
	private Integer isSendCard;

	@Column(name="RES_CLASS",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="resClass")
	private Integer resClass;

	@Column(name="CUST_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="custId")
	private Long custId;

	@Column(name="DUMMY_TAG",columnDefinition="Varchar",length=1)
	@XmlElement(name="dummyTag")
	private String dummyTag;

	@Column(name="SERIAL_NUMBER",columnDefinition="Varchar",length=40)
	@XmlElement(name="serialNumber")
	private String serialNumber;

	@Column(name="CHANGEUSER_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="changeuserDate")
	private Date changeuserDate;

	public void setUserId(Long obj){
		this.userId = obj;
	}

	public Long getUserId(){
		return userId;
	}

	public void setUserType(Integer obj){
		this.userType = obj;
	}

	public Integer getUserType(){
		return userType;
	}

	public void setPaymentMode(Integer obj){
		this.paymentMode = obj;
	}

	public Integer getPaymentMode(){
		return paymentMode;
	}

	public void setPhoneId(String obj){
		this.phoneId = obj;
	}

	public String getPhoneId(){
		return phoneId;
	}

	public void setUserCode(Integer obj){
		this.userCode = obj;
	}

	public Integer getUserCode(){
		return userCode;
	}

	public void setBrand(Integer obj){
		this.brand = obj;
	}

	public Integer getBrand(){
		return brand;
	}

	public void setUserSegment(Integer obj){
		this.userSegment = obj;
	}

	public Integer getUserSegment(){
		return userSegment;
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

	public void setSmsLanguage(Integer obj){
		this.smsLanguage = obj;
	}

	public Integer getSmsLanguage(){
		return smsLanguage;
	}

	public void setIvrLanguage(Integer obj){
		this.ivrLanguage = obj;
	}

	public Integer getIvrLanguage(){
		return ivrLanguage;
	}

	public void setUssdLanguage(Integer obj){
		this.ussdLanguage = obj;
	}

	public Integer getUssdLanguage(){
		return ussdLanguage;
	}

	public void setActiveDate(Date obj){
		this.activeDate = obj;
	}

	public Date getActiveDate(){
		return activeDate;
	}

	public void setAccessWay(Integer obj){
		this.accessWay = obj;
	}

	public Integer getAccessWay(){
		return accessWay;
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

	public void setLongTermList(Integer obj){
		this.longTermList = obj;
	}

	public Integer getLongTermList(){
		return longTermList;
	}

	public void setIsEcard(Integer obj){
		this.isEcard = obj;
	}

	public Integer getIsEcard(){
		return isEcard;
	}

	public void setGroupMemLevel(String obj){
		this.groupMemLevel = obj;
	}

	public String getGroupMemLevel(){
		return groupMemLevel;
	}

	public void setIsSendCard(Integer obj){
		this.isSendCard = obj;
	}

	public Integer getIsSendCard(){
		return isSendCard;
	}

	public void setResClass(Integer obj){
		this.resClass = obj;
	}

	public Integer getResClass(){
		return resClass;
	}

	public void setCustId(Long obj){
		this.custId = obj;
	}

	public Long getCustId(){
		return custId;
	}

	public void setDummyTag(String obj){
		this.dummyTag = obj;
	}

	public String getDummyTag(){
		return dummyTag;
	}

	public void setSerialNumber(String obj){
		this.serialNumber = obj;
	}

	public String getSerialNumber(){
		return serialNumber;
	}

	public void setChangeuserDate(Date obj){
		this.changeuserDate = obj;
	}

	public Date getChangeuserDate(){
		return changeuserDate;
	}

	public IUser(){
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		IUser rhs=(IUser)rhs0;
		if(!ObjectUtils.equals(userId, rhs.userId)) return false;
		if(!ObjectUtils.equals(userType, rhs.userType)) return false;
		if(!ObjectUtils.equals(paymentMode, rhs.paymentMode)) return false;
		if(!ObjectUtils.equals(phoneId, rhs.phoneId)) return false;
		if(!ObjectUtils.equals(userCode, rhs.userCode)) return false;
		if(!ObjectUtils.equals(brand, rhs.brand)) return false;
		if(!ObjectUtils.equals(userSegment, rhs.userSegment)) return false;
		if(!ObjectUtils.equals(regionCode, rhs.regionCode)) return false;
		if(!ObjectUtils.equals(countyCode, rhs.countyCode)) return false;
		if(!ObjectUtils.equals(smsLanguage, rhs.smsLanguage)) return false;
		if(!ObjectUtils.equals(ivrLanguage, rhs.ivrLanguage)) return false;
		if(!ObjectUtils.equals(ussdLanguage, rhs.ussdLanguage)) return false;
		if(!ObjectUtils.equals(activeDate, rhs.activeDate)) return false;
		if(!ObjectUtils.equals(accessWay, rhs.accessWay)) return false;
		if(!ObjectUtils.equals(validDate, rhs.validDate)) return false;
		if(!ObjectUtils.equals(expireDate, rhs.expireDate)) return false;
		if(!ObjectUtils.equals(operType, rhs.operType)) return false;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		if(!ObjectUtils.equals(commitDate, rhs.commitDate)) return false;
		if(!ObjectUtils.equals(longTermList, rhs.longTermList)) return false;
		if(!ObjectUtils.equals(isEcard, rhs.isEcard)) return false;
		if(!ObjectUtils.equals(groupMemLevel, rhs.groupMemLevel)) return false;
		if(!ObjectUtils.equals(isSendCard, rhs.isSendCard)) return false;
		if(!ObjectUtils.equals(resClass, rhs.resClass)) return false;
		if(!ObjectUtils.equals(custId, rhs.custId)) return false;
		if(!ObjectUtils.equals(dummyTag, rhs.dummyTag)) return false;
		if(!ObjectUtils.equals(serialNumber, rhs.serialNumber)) return false;
		if(!ObjectUtils.equals(changeuserDate, rhs.changeuserDate)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(userId)
		.append(userType)
		.append(paymentMode)
		.append(phoneId)
		.append(userCode)
		.append(brand)
		.append(userSegment)
		.append(regionCode)
		.append(countyCode)
		.append(smsLanguage)
		.append(ivrLanguage)
		.append(ussdLanguage)
		.append(activeDate)
		.append(accessWay)
		.append(validDate)
		.append(expireDate)
		.append(operType)
		.append(soNbr)
		.append(commitDate)
		.append(longTermList)
		.append(isEcard)
		.append(groupMemLevel)
		.append(isSendCard)
		.append(resClass)
		.append(custId)
		.append(dummyTag)
		.append(serialNumber)
		.append(changeuserDate)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{userId,userType,paymentMode,phoneId,userCode,brand,userSegment,regionCode,countyCode,smsLanguage,ivrLanguage,ussdLanguage,activeDate,accessWay,validDate,expireDate,operType,soNbr,commitDate,longTermList,isEcard,groupMemLevel,isSendCard,resClass,custId,dummyTag,serialNumber,changeuserDate}
}