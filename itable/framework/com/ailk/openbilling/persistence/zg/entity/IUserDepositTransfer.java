package com.ailk.openbilling.persistence.zg.entity;

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
@Table(schema="zg",name="I_USER_DEPOSIT_TRANSFER")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"servId","regionCode","promoId","condId","condGroup","busiType","principalFee","prinConsumed","prinBeginDate","prinEndDate","donateFee","donaConsumed","donaBeginDate","donaEndDate","validDate","expireDate","sts","stsDate","bindImei","devUsedSts","imeiStsDate","imeiId","depositCredit","sid","soNbr"})
public class IUserDepositTransfer extends DataObject{


	@Column(name="SERV_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="servId")
	private Long servId;

	@Column(name="REGION_CODE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="regionCode")
	private Integer regionCode;

	@Column(name="PROMO_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="promoId")
	private Integer promoId;

	@Column(name="COND_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="condId")
	private Integer condId;

	@Column(name="COND_GROUP",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="condGroup")
	private Integer condGroup;

	@Column(name="BUSI_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="busiType")
	private Integer busiType;

	@Column(name="PRINCIPAL_FEE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="principalFee")
	private Long principalFee;

	@Column(name="PRIN_CONSUMED",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="prinConsumed")
	private Long prinConsumed;

	@Column(name="PRIN_BEGIN_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="prinBeginDate")
	private Date prinBeginDate;

	@Column(name="PRIN_END_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="prinEndDate")
	private Date prinEndDate;

	@Column(name="DONATE_FEE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="donateFee")
	private Long donateFee;

	@Column(name="DONA_CONSUMED",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="donaConsumed")
	private Long donaConsumed;

	@Column(name="DONA_BEGIN_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="donaBeginDate")
	private Date donaBeginDate;

	@Column(name="DONA_END_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="donaEndDate")
	private Date donaEndDate;

	@Column(name="VALID_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="validDate")
	private Date validDate;

	@Column(name="EXPIRE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="expireDate")
	private Date expireDate;

	@Column(name="STS",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="sts")
	private Integer sts;

	@Column(name="STS_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="stsDate")
	private Date stsDate;

	@Column(name="BIND_IMEI",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="bindImei")
	private Integer bindImei;

	@Column(name="DEV_USED_STS",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="devUsedSts")
	private Integer devUsedSts;

	@Column(name="IMEI_STS_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="imeiStsDate")
	private Date imeiStsDate;

	@Column(name="IMEI_ID",columnDefinition="Varchar",length=36)
	@XmlElement(name="imeiId")
	private String imeiId;

	@Column(name="DEPOSIT_CREDIT",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="depositCredit")
	private Long depositCredit;

	@Column(name="SID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="sid")
	private Integer sid;

	@Column(name="SO_NBR",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="soNbr")
	private Long soNbr;

	public void setServId(Long obj){
		this.servId = obj;
	}

	public Long getServId(){
		return servId;
	}

	public void setRegionCode(Integer obj){
		this.regionCode = obj;
	}

	public Integer getRegionCode(){
		return regionCode;
	}

	public void setPromoId(Integer obj){
		this.promoId = obj;
	}

	public Integer getPromoId(){
		return promoId;
	}

	public void setCondId(Integer obj){
		this.condId = obj;
	}

	public Integer getCondId(){
		return condId;
	}

	public void setCondGroup(Integer obj){
		this.condGroup = obj;
	}

	public Integer getCondGroup(){
		return condGroup;
	}

	public void setBusiType(Integer obj){
		this.busiType = obj;
	}

	public Integer getBusiType(){
		return busiType;
	}

	public void setPrincipalFee(Long obj){
		this.principalFee = obj;
	}

	public Long getPrincipalFee(){
		return principalFee;
	}

	public void setPrinConsumed(Long obj){
		this.prinConsumed = obj;
	}

	public Long getPrinConsumed(){
		return prinConsumed;
	}

	public void setPrinBeginDate(Date obj){
		this.prinBeginDate = obj;
	}

	public Date getPrinBeginDate(){
		return prinBeginDate;
	}

	public void setPrinEndDate(Date obj){
		this.prinEndDate = obj;
	}

	public Date getPrinEndDate(){
		return prinEndDate;
	}

	public void setDonateFee(Long obj){
		this.donateFee = obj;
	}

	public Long getDonateFee(){
		return donateFee;
	}

	public void setDonaConsumed(Long obj){
		this.donaConsumed = obj;
	}

	public Long getDonaConsumed(){
		return donaConsumed;
	}

	public void setDonaBeginDate(Date obj){
		this.donaBeginDate = obj;
	}

	public Date getDonaBeginDate(){
		return donaBeginDate;
	}

	public void setDonaEndDate(Date obj){
		this.donaEndDate = obj;
	}

	public Date getDonaEndDate(){
		return donaEndDate;
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

	public void setSts(Integer obj){
		this.sts = obj;
	}

	public Integer getSts(){
		return sts;
	}

	public void setStsDate(Date obj){
		this.stsDate = obj;
	}

	public Date getStsDate(){
		return stsDate;
	}

	public void setBindImei(Integer obj){
		this.bindImei = obj;
	}

	public Integer getBindImei(){
		return bindImei;
	}

	public void setDevUsedSts(Integer obj){
		this.devUsedSts = obj;
	}

	public Integer getDevUsedSts(){
		return devUsedSts;
	}

	public void setImeiStsDate(Date obj){
		this.imeiStsDate = obj;
	}

	public Date getImeiStsDate(){
		return imeiStsDate;
	}

	public void setImeiId(String obj){
		this.imeiId = obj;
	}

	public String getImeiId(){
		return imeiId;
	}

	public void setDepositCredit(Long obj){
		this.depositCredit = obj;
	}

	public Long getDepositCredit(){
		return depositCredit;
	}

	public void setSid(Integer obj){
		this.sid = obj;
	}

	public Integer getSid(){
		return sid;
	}

	public void setSoNbr(Long obj){
		this.soNbr = obj;
	}

	public Long getSoNbr(){
		return soNbr;
	}

	public IUserDepositTransfer(){
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		IUserDepositTransfer rhs=(IUserDepositTransfer)rhs0;
		if(!ObjectUtils.equals(servId, rhs.servId)) return false;
		if(!ObjectUtils.equals(regionCode, rhs.regionCode)) return false;
		if(!ObjectUtils.equals(promoId, rhs.promoId)) return false;
		if(!ObjectUtils.equals(condId, rhs.condId)) return false;
		if(!ObjectUtils.equals(condGroup, rhs.condGroup)) return false;
		if(!ObjectUtils.equals(busiType, rhs.busiType)) return false;
		if(!ObjectUtils.equals(principalFee, rhs.principalFee)) return false;
		if(!ObjectUtils.equals(prinConsumed, rhs.prinConsumed)) return false;
		if(!ObjectUtils.equals(prinBeginDate, rhs.prinBeginDate)) return false;
		if(!ObjectUtils.equals(prinEndDate, rhs.prinEndDate)) return false;
		if(!ObjectUtils.equals(donateFee, rhs.donateFee)) return false;
		if(!ObjectUtils.equals(donaConsumed, rhs.donaConsumed)) return false;
		if(!ObjectUtils.equals(donaBeginDate, rhs.donaBeginDate)) return false;
		if(!ObjectUtils.equals(donaEndDate, rhs.donaEndDate)) return false;
		if(!ObjectUtils.equals(validDate, rhs.validDate)) return false;
		if(!ObjectUtils.equals(expireDate, rhs.expireDate)) return false;
		if(!ObjectUtils.equals(sts, rhs.sts)) return false;
		if(!ObjectUtils.equals(stsDate, rhs.stsDate)) return false;
		if(!ObjectUtils.equals(bindImei, rhs.bindImei)) return false;
		if(!ObjectUtils.equals(devUsedSts, rhs.devUsedSts)) return false;
		if(!ObjectUtils.equals(imeiStsDate, rhs.imeiStsDate)) return false;
		if(!ObjectUtils.equals(imeiId, rhs.imeiId)) return false;
		if(!ObjectUtils.equals(depositCredit, rhs.depositCredit)) return false;
		if(!ObjectUtils.equals(sid, rhs.sid)) return false;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(servId)
		.append(regionCode)
		.append(promoId)
		.append(condId)
		.append(condGroup)
		.append(busiType)
		.append(principalFee)
		.append(prinConsumed)
		.append(prinBeginDate)
		.append(prinEndDate)
		.append(donateFee)
		.append(donaConsumed)
		.append(donaBeginDate)
		.append(donaEndDate)
		.append(validDate)
		.append(expireDate)
		.append(sts)
		.append(stsDate)
		.append(bindImei)
		.append(devUsedSts)
		.append(imeiStsDate)
		.append(imeiId)
		.append(depositCredit)
		.append(sid)
		.append(soNbr)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{servId,regionCode,promoId,condId,condGroup,busiType,principalFee,prinConsumed,prinBeginDate,prinEndDate,donateFee,donaConsumed,donaBeginDate,donaEndDate,validDate,expireDate,sts,stsDate,bindImei,devUsedSts,imeiStsDate,imeiId,depositCredit,sid,soNbr}
}