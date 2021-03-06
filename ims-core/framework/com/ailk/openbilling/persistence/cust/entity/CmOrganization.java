package com.ailk.openbilling.persistence.cust.entity;

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
@Table(schema="CD",name="CM_ORGANIZATION")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"partyId","industryId","type","orgSize","orgBackground","executiveInfo","superManager","isLegalEntity","beginDate","endDate","createDate","validDate","expireDate","description","soNbr","soDate","firstAddress","secondAddress","regNo","regDate"})
public class CmOrganization extends DataObject{


	/**
	 * Party ID
	 */
	@Id
	@Column(name="PARTY_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="partyId")
	private Long partyId;

	/**
	 * Adscription Industry,find it in the industry definition
	 */
	@Column(name="INDUSTRY_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="industryId")
	private Integer industryId;

	/**
	 * Organizition Type

0ฃบCompany
1ฃบDeptment
2ฃบFamilty
	 */
	@Column(name="TYPE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="type")
	private Integer type;

	/**
	 * Organizion Size


1ฃบ0~50
2ฃบ50~200
3ฃบ200~
	 */
	@Column(name="ORG_SIZE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="orgSize")
	private Integer orgSize;

	/**
	 * Organization Background
for example: Business Management Describtion
	 */
	@Column(name="ORG_BACKGROUND",columnDefinition="Varchar",length=256)
	@XmlElement(name="orgBackground")
	private String orgBackground;

	/**
	 * Organizition Principal Information
	 */
	@Column(name="EXECUTIVE_INFO",columnDefinition="Varchar",length=64)
	@XmlElement(name="executiveInfo")
	private String executiveInfo;

	/**
	 * Supervisor
	 */
	@Column(name="SUPER_MANAGER",columnDefinition="Varchar",length=64)
	@XmlElement(name="superManager")
	private String superManager;

	/**
	 * Is it a legal organization's sign

0: No
1: Yes
	 */
	@Column(name="IS_LEGAL_ENTITY",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="isLegalEntity")
	private Integer isLegalEntity;

	/**
	 * The date when the organizition created
	 */
	@Column(name="BEGIN_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="beginDate")
	private Date beginDate;

	/**
	 * The date when the organizition ended
	 */
	@Column(name="END_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="endDate")
	private Date endDate;

	/**
	 * record create date
	 */
	@Column(name="CREATE_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="createDate")
	private Date createDate;

	/**
	 * Effective Date
	 */
	@Id
	@Column(name="VALID_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="validDate")
	private Date validDate;

	/**
	 * Expired Date
	 */
	@Column(name="EXPIRE_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="expireDate")
	private Date expireDate;

	/**
	 * Describtion
	 */
	@Column(name="DESCRIPTION",columnDefinition="Varchar",length=1024)
	@XmlElement(name="description")
	private String description;

	/**
	 * The serial number
	 */
	@Id
	@Column(name="SO_NBR",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="soNbr")
	private Long soNbr;

	@Column(name="SO_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="soDate")
	private Date soDate;

	@Column(name="FIRST_ADDRESS",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="firstAddress")
	private Integer firstAddress;

	@Column(name="SECOND_ADDRESS",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="secondAddress")
	private Integer secondAddress;

	@Column(name="REG_NO",columnDefinition="Varchar",length=128)
	@XmlElement(name="regNo")
	private String regNo;

	@Column(name="REG_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="regDate")
	private Date regDate;

	public void setPartyId(Long obj){
		this.partyId = obj;
	}

	public Long getPartyId(){
		return partyId;
	}

	public void setIndustryId(Integer obj){
		this.industryId = obj;
	}

	public Integer getIndustryId(){
		return industryId;
	}

	public void setType(Integer obj){
		this.type = obj;
	}

	public Integer getType(){
		return type;
	}

	public void setOrgSize(Integer obj){
		this.orgSize = obj;
	}

	public Integer getOrgSize(){
		return orgSize;
	}

	public void setOrgBackground(String obj){
		this.orgBackground = obj;
	}

	public String getOrgBackground(){
		return orgBackground;
	}

	public void setExecutiveInfo(String obj){
		this.executiveInfo = obj;
	}

	public String getExecutiveInfo(){
		return executiveInfo;
	}

	public void setSuperManager(String obj){
		this.superManager = obj;
	}

	public String getSuperManager(){
		return superManager;
	}

	public void setIsLegalEntity(Integer obj){
		this.isLegalEntity = obj;
	}

	public Integer getIsLegalEntity(){
		return isLegalEntity;
	}

	public void setBeginDate(Date obj){
		this.beginDate = obj;
	}

	public Date getBeginDate(){
		return beginDate;
	}

	public void setEndDate(Date obj){
		this.endDate = obj;
	}

	public Date getEndDate(){
		return endDate;
	}

	public void setCreateDate(Date obj){
		this.createDate = obj;
	}

	public Date getCreateDate(){
		return createDate;
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

	public void setDescription(String obj){
		this.description = obj;
	}

	public String getDescription(){
		return description;
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

	public void setFirstAddress(Integer obj){
		this.firstAddress = obj;
	}

	public Integer getFirstAddress(){
		return firstAddress;
	}

	public void setSecondAddress(Integer obj){
		this.secondAddress = obj;
	}

	public Integer getSecondAddress(){
		return secondAddress;
	}

	public void setRegNo(String obj){
		this.regNo = obj;
	}

	public String getRegNo(){
		return regNo;
	}

	public void setRegDate(Date obj){
		this.regDate = obj;
	}

	public Date getRegDate(){
		return regDate;
	}

	public CmOrganization(){
	}

	public CmOrganization(Long partyId,Date validDate,Long soNbr){
		this.partyId = partyId;
		this.validDate = validDate;
		this.soNbr = soNbr;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		CmOrganization rhs=(CmOrganization)rhs0;
		if(!ObjectUtils.equals(partyId, rhs.partyId)) return false;
		if(!ObjectUtils.equals(validDate, rhs.validDate)) return false;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(partyId)
		.append(validDate)
		.append(soNbr)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{partyId,industryId,type,orgSize,orgBackground,executiveInfo,superManager,isLegalEntity,beginDate,endDate,createDate,validDate,expireDate,description,soNbr,soDate,firstAddress,secondAddress,regNo,regDate}
}