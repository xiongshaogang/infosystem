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
 */
@NotModified
@Entity
@Table(schema="CD",name="CM_RES_AUTH")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"resourceId","hplmn","nationalRoaming","internationalRoaming","roamingAuthority","irsmsAuthority","interIntraAuthority","interIntraFlag","irpromptFlag","fraudState","fraudTimes","soNbr","createDate","soDate","expireDate","validDate"})
public class CmResAuth extends DataObject{


	@Id
	@Column(name="RESOURCE_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="resourceId")
	private Long resourceId;

	@Column(name="HPLMN",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="hplmn")
	private Integer hplmn;

	@Column(name="NATIONAL_ROAMING",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="nationalRoaming")
	private Integer nationalRoaming;

	@Column(name="INTERNATIONAL_ROAMING",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="internationalRoaming")
	private Integer internationalRoaming;

	@Column(name="ROAMING_AUTHORITY",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="roamingAuthority")
	private Integer roamingAuthority;

	@Column(name="IRSMS_AUTHORITY",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="irsmsAuthority")
	private Integer irsmsAuthority;

	@Column(name="INTER_INTRA_AUTHORITY",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="interIntraAuthority")
	private Integer interIntraAuthority;

	@Column(name="INTER_INTRA_FLAG",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="interIntraFlag")
	private Integer interIntraFlag;

	@Column(name="IRPROMPT_FLAG",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="irpromptFlag")
	private Integer irpromptFlag;

	@Column(name="FRAUD_STATE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="fraudState")
	private Integer fraudState;

	@Column(name="FRAUD_TIMES",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="fraudTimes")
	private Integer fraudTimes;

	/**
	 * The serial order which cause the state changing
	 */
	@Id
	@Column(name="SO_NBR",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="soNbr")
	private Long soNbr;

	@Column(name="CREATE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="createDate")
	private Date createDate;

	/**
	 * Modify Date
	 */
	@Column(name="SO_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="soDate")
	private Date soDate;

	/**
	 * Expired Date
	 */
	@Column(name="EXPIRE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="expireDate")
	private Date expireDate;

	/**
	 * Effective Date
	 */
	@Id
	@Column(name="VALID_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="validDate")
	private Date validDate;

	public void setResourceId(Long obj){
		this.resourceId = obj;
	}

	public Long getResourceId(){
		return resourceId;
	}

	public void setHplmn(Integer obj){
		this.hplmn = obj;
	}

	public Integer getHplmn(){
		return hplmn;
	}

	public void setNationalRoaming(Integer obj){
		this.nationalRoaming = obj;
	}

	public Integer getNationalRoaming(){
		return nationalRoaming;
	}

	public void setInternationalRoaming(Integer obj){
		this.internationalRoaming = obj;
	}

	public Integer getInternationalRoaming(){
		return internationalRoaming;
	}

	public void setRoamingAuthority(Integer obj){
		this.roamingAuthority = obj;
	}

	public Integer getRoamingAuthority(){
		return roamingAuthority;
	}

	public void setIrsmsAuthority(Integer obj){
		this.irsmsAuthority = obj;
	}

	public Integer getIrsmsAuthority(){
		return irsmsAuthority;
	}

	public void setInterIntraAuthority(Integer obj){
		this.interIntraAuthority = obj;
	}

	public Integer getInterIntraAuthority(){
		return interIntraAuthority;
	}

	public void setInterIntraFlag(Integer obj){
		this.interIntraFlag = obj;
	}

	public Integer getInterIntraFlag(){
		return interIntraFlag;
	}

	public void setIrpromptFlag(Integer obj){
		this.irpromptFlag = obj;
	}

	public Integer getIrpromptFlag(){
		return irpromptFlag;
	}

	public void setFraudState(Integer obj){
		this.fraudState = obj;
	}

	public Integer getFraudState(){
		return fraudState;
	}

	public void setFraudTimes(Integer obj){
		this.fraudTimes = obj;
	}

	public Integer getFraudTimes(){
		return fraudTimes;
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

	public void setExpireDate(Date obj){
		this.expireDate = obj;
	}

	public Date getExpireDate(){
		return expireDate;
	}

	public void setValidDate(Date obj){
		this.validDate = obj;
	}

	public Date getValidDate(){
		return validDate;
	}

	public CmResAuth(){
	}

	public CmResAuth(Long resourceId,Long soNbr,Date validDate){
		this.resourceId = resourceId;
		this.soNbr = soNbr;
		this.validDate = validDate;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		CmResAuth rhs=(CmResAuth)rhs0;
		if(!ObjectUtils.equals(resourceId, rhs.resourceId)) return false;
		if(!ObjectUtils.equals(validDate, rhs.validDate)) return false;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(resourceId)
		.append(validDate)
		.append(soNbr)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{resourceId,hplmn,nationalRoaming,internationalRoaming,roamingAuthority,irsmsAuthority,interIntraAuthority,interIntraFlag,irpromptFlag,fraudState,fraudTimes,soNbr,createDate,soDate,expireDate,validDate}
}