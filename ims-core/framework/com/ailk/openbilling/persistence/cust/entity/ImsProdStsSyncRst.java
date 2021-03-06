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
@Table(schema="CD",name="IMS_PROD_STS_SYNC_RST")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"id","acctId","phoneId","productId","deductFlag","statusBefore","statusAfter","oldCycleDate","newCycleDate","previousBalance","currentBalance","lastTryFlag","prorateDays","productSequenceId","chargeAmount","splitChargeAmount","deductTime","failReason","soNbr","createDate","dealDate","sts","dealDesc","dealAgainDate","newProductId","newProductSeqId","newProductValidDate","newProductExpireDate","changePriceFlag","priceDesc","changeMainFlag","errorMsg","errorCode","dealCount","firstCycleFalg"})
public class ImsProdStsSyncRst extends DataObject{


	/**
	 * าตฮ๑สพฑํตฤid
	 */
	@Column(name="ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="id")
	private Long id;

	@Column(name="ACCT_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="acctId")
	private Long acctId;

	@Column(name="PHONE_ID",columnDefinition="Varchar",length=30)
	@XmlElement(name="phoneId")
	private String phoneId;

	@Column(name="PRODUCT_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="productId")
	private Long productId;

	@Column(name="DEDUCT_FLAG",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="deductFlag")
	private Integer deductFlag;

	@Column(name="STATUS_BEFORE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="statusBefore")
	private Integer statusBefore;

	@Column(name="STATUS_AFTER",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="statusAfter")
	private Integer statusAfter;

	@Column(name="OLD_CYCLE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="oldCycleDate")
	private Date oldCycleDate;

	@Column(name="NEW_CYCLE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="newCycleDate")
	private Date newCycleDate;

	@Column(name="PREVIOUS_BALANCE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="previousBalance")
	private Long previousBalance;

	@Column(name="CURRENT_BALANCE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="currentBalance")
	private Long currentBalance;

	/**
	 * The flag of last try, if not try, last_try_flag=1,otherwise flag=0 (default)
	 */
	@Column(name="LAST_TRY_FLAG",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="lastTryFlag")
	private Integer lastTryFlag;

	@Column(name="PRORATE_DAYS",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="prorateDays")
	private Integer prorateDays;

	@Column(name="PRODUCT_SEQUENCE_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="productSequenceId")
	private Long productSequenceId;

	@Column(name="CHARGE_AMOUNT",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="chargeAmount")
	private Integer chargeAmount;

	@Column(name="SPLIT_CHARGE_AMOUNT",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="splitChargeAmount")
	private Integer splitChargeAmount;

	@Column(name="DEDUCT_TIME",columnDefinition="TimeStamp")
	@XmlElement(name="deductTime")
	private Date deductTime;

	@Column(name="FAIL_REASON",columnDefinition="Varchar",length=255)
	@XmlElement(name="failReason")
	private String failReason;

	/**
	 * done_code
	 */
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

	@Column(name="NEW_PRODUCT_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="newProductId")
	private Integer newProductId;

	@Column(name="NEW_PRODUCT_SEQ_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="newProductSeqId")
	private Integer newProductSeqId;

	@Column(name="NEW_PRODUCT_VALID_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="newProductValidDate")
	private Date newProductValidDate;

	@Column(name="NEW_PRODUCT_EXPIRE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="newProductExpireDate")
	private Date newProductExpireDate;

	@Column(name="CHANGE_PRICE_FLAG",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="changePriceFlag")
	private Integer changePriceFlag;

	@Column(name="PRICE_DESC",columnDefinition="Varchar",length=255)
	@XmlElement(name="priceDesc")
	private String priceDesc;

	@Column(name="CHANGE_MAIN_FLAG",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="changeMainFlag")
	private Integer changeMainFlag;

	@Column(name="ERROR_MSG",columnDefinition="Varchar",length=256)
	@XmlElement(name="errorMsg")
	private String errorMsg;

	@Column(name="ERROR_CODE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="errorCode")
	private Integer errorCode;

	@Column(name="DEAL_COUNT",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="dealCount")
	private Integer dealCount;

	@Column(name="FIRST_CYCLE_FALG",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="firstCycleFalg")
	private Integer firstCycleFalg;

	public void setId(Long obj){
		this.id = obj;
	}

	public Long getId(){
		return id;
	}

	public void setAcctId(Long obj){
		this.acctId = obj;
	}

	public Long getAcctId(){
		return acctId;
	}

	public void setPhoneId(String obj){
		this.phoneId = obj;
	}

	public String getPhoneId(){
		return phoneId;
	}

	public void setProductId(Long obj){
		this.productId = obj;
	}

	public Long getProductId(){
		return productId;
	}

	public void setDeductFlag(Integer obj){
		this.deductFlag = obj;
	}

	public Integer getDeductFlag(){
		return deductFlag;
	}

	public void setStatusBefore(Integer obj){
		this.statusBefore = obj;
	}

	public Integer getStatusBefore(){
		return statusBefore;
	}

	public void setStatusAfter(Integer obj){
		this.statusAfter = obj;
	}

	public Integer getStatusAfter(){
		return statusAfter;
	}

	public void setOldCycleDate(Date obj){
		this.oldCycleDate = obj;
	}

	public Date getOldCycleDate(){
		return oldCycleDate;
	}

	public void setNewCycleDate(Date obj){
		this.newCycleDate = obj;
	}

	public Date getNewCycleDate(){
		return newCycleDate;
	}

	public void setPreviousBalance(Long obj){
		this.previousBalance = obj;
	}

	public Long getPreviousBalance(){
		return previousBalance;
	}

	public void setCurrentBalance(Long obj){
		this.currentBalance = obj;
	}

	public Long getCurrentBalance(){
		return currentBalance;
	}

	public void setLastTryFlag(Integer obj){
		this.lastTryFlag = obj;
	}

	public Integer getLastTryFlag(){
		return lastTryFlag;
	}

	public void setProrateDays(Integer obj){
		this.prorateDays = obj;
	}

	public Integer getProrateDays(){
		return prorateDays;
	}

	public void setProductSequenceId(Long obj){
		this.productSequenceId = obj;
	}

	public Long getProductSequenceId(){
		return productSequenceId;
	}

	public void setChargeAmount(Integer obj){
		this.chargeAmount = obj;
	}

	public Integer getChargeAmount(){
		return chargeAmount;
	}

	public void setSplitChargeAmount(Integer obj){
		this.splitChargeAmount = obj;
	}

	public Integer getSplitChargeAmount(){
		return splitChargeAmount;
	}

	public void setDeductTime(Date obj){
		this.deductTime = obj;
	}

	public Date getDeductTime(){
		return deductTime;
	}

	public void setFailReason(String obj){
		this.failReason = obj;
	}

	public String getFailReason(){
		return failReason;
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

	public void setNewProductId(Integer obj){
		this.newProductId = obj;
	}

	public Integer getNewProductId(){
		return newProductId;
	}

	public void setNewProductSeqId(Integer obj){
		this.newProductSeqId = obj;
	}

	public Integer getNewProductSeqId(){
		return newProductSeqId;
	}

	public void setNewProductValidDate(Date obj){
		this.newProductValidDate = obj;
	}

	public Date getNewProductValidDate(){
		return newProductValidDate;
	}

	public void setNewProductExpireDate(Date obj){
		this.newProductExpireDate = obj;
	}

	public Date getNewProductExpireDate(){
		return newProductExpireDate;
	}

	public void setChangePriceFlag(Integer obj){
		this.changePriceFlag = obj;
	}

	public Integer getChangePriceFlag(){
		return changePriceFlag;
	}

	public void setPriceDesc(String obj){
		this.priceDesc = obj;
	}

	public String getPriceDesc(){
		return priceDesc;
	}

	public void setChangeMainFlag(Integer obj){
		this.changeMainFlag = obj;
	}

	public Integer getChangeMainFlag(){
		return changeMainFlag;
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

	public void setFirstCycleFalg(Integer obj){
		this.firstCycleFalg = obj;
	}

	public Integer getFirstCycleFalg(){
		return firstCycleFalg;
	}

	public ImsProdStsSyncRst(){
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		ImsProdStsSyncRst rhs=(ImsProdStsSyncRst)rhs0;
		if(!ObjectUtils.equals(id, rhs.id)) return false;
		if(!ObjectUtils.equals(acctId, rhs.acctId)) return false;
		if(!ObjectUtils.equals(phoneId, rhs.phoneId)) return false;
		if(!ObjectUtils.equals(productId, rhs.productId)) return false;
		if(!ObjectUtils.equals(deductFlag, rhs.deductFlag)) return false;
		if(!ObjectUtils.equals(statusBefore, rhs.statusBefore)) return false;
		if(!ObjectUtils.equals(statusAfter, rhs.statusAfter)) return false;
		if(!ObjectUtils.equals(oldCycleDate, rhs.oldCycleDate)) return false;
		if(!ObjectUtils.equals(newCycleDate, rhs.newCycleDate)) return false;
		if(!ObjectUtils.equals(previousBalance, rhs.previousBalance)) return false;
		if(!ObjectUtils.equals(currentBalance, rhs.currentBalance)) return false;
		if(!ObjectUtils.equals(lastTryFlag, rhs.lastTryFlag)) return false;
		if(!ObjectUtils.equals(prorateDays, rhs.prorateDays)) return false;
		if(!ObjectUtils.equals(productSequenceId, rhs.productSequenceId)) return false;
		if(!ObjectUtils.equals(chargeAmount, rhs.chargeAmount)) return false;
		if(!ObjectUtils.equals(splitChargeAmount, rhs.splitChargeAmount)) return false;
		if(!ObjectUtils.equals(deductTime, rhs.deductTime)) return false;
		if(!ObjectUtils.equals(failReason, rhs.failReason)) return false;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		if(!ObjectUtils.equals(createDate, rhs.createDate)) return false;
		if(!ObjectUtils.equals(dealDate, rhs.dealDate)) return false;
		if(!ObjectUtils.equals(sts, rhs.sts)) return false;
		if(!ObjectUtils.equals(dealDesc, rhs.dealDesc)) return false;
		if(!ObjectUtils.equals(dealAgainDate, rhs.dealAgainDate)) return false;
		if(!ObjectUtils.equals(newProductId, rhs.newProductId)) return false;
		if(!ObjectUtils.equals(newProductSeqId, rhs.newProductSeqId)) return false;
		if(!ObjectUtils.equals(newProductValidDate, rhs.newProductValidDate)) return false;
		if(!ObjectUtils.equals(newProductExpireDate, rhs.newProductExpireDate)) return false;
		if(!ObjectUtils.equals(changePriceFlag, rhs.changePriceFlag)) return false;
		if(!ObjectUtils.equals(priceDesc, rhs.priceDesc)) return false;
		if(!ObjectUtils.equals(changeMainFlag, rhs.changeMainFlag)) return false;
		if(!ObjectUtils.equals(errorMsg, rhs.errorMsg)) return false;
		if(!ObjectUtils.equals(errorCode, rhs.errorCode)) return false;
		if(!ObjectUtils.equals(dealCount, rhs.dealCount)) return false;
		if(!ObjectUtils.equals(firstCycleFalg, rhs.firstCycleFalg)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(id)
		.append(acctId)
		.append(phoneId)
		.append(productId)
		.append(deductFlag)
		.append(statusBefore)
		.append(statusAfter)
		.append(oldCycleDate)
		.append(newCycleDate)
		.append(previousBalance)
		.append(currentBalance)
		.append(lastTryFlag)
		.append(prorateDays)
		.append(productSequenceId)
		.append(chargeAmount)
		.append(splitChargeAmount)
		.append(deductTime)
		.append(failReason)
		.append(soNbr)
		.append(createDate)
		.append(dealDate)
		.append(sts)
		.append(dealDesc)
		.append(dealAgainDate)
		.append(newProductId)
		.append(newProductSeqId)
		.append(newProductValidDate)
		.append(newProductExpireDate)
		.append(changePriceFlag)
		.append(priceDesc)
		.append(changeMainFlag)
		.append(errorMsg)
		.append(errorCode)
		.append(dealCount)
		.append(firstCycleFalg)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{id,acctId,phoneId,productId,deductFlag,statusBefore,statusAfter,oldCycleDate,newCycleDate,previousBalance,currentBalance,lastTryFlag,prorateDays,productSequenceId,chargeAmount,splitChargeAmount,deductTime,failReason,soNbr,createDate,dealDate,sts,dealDesc,dealAgainDate,newProductId,newProductSeqId,newProductValidDate,newProductExpireDate,changePriceFlag,priceDesc,changeMainFlag,errorMsg,errorCode,dealCount,firstCycleFalg}
}