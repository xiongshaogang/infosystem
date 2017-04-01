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
@Table(schema="JD",name="I_ACCT_PAY_CHANNEL")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"acctId","paymentType","bankId","bankAcctNbr","phoneId","userId","dayFixMoney","timeFixMoney","bindType","platForm","validDate","expireDate","operType","soNbr","commitDate"})
public class IAcctPayChannel extends DataObject{


	@Column(name="ACCT_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="acctId")
	private Long acctId;

	/**
	 * 1：现金 2：信用卡代扣 3：银行托收 5：银行卡绑定充值 6：手机支付自动交话费 7：代缴
	 */
	@Column(name="PAYMENT_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="paymentType")
	private Integer paymentType;

	@Column(name="BANK_ID",columnDefinition="Varchar",length=8,nullable=false)
	@XmlElement(name="bankId")
	private String bankId;

	@Column(name="BANK_ACCT_NBR",columnDefinition="Varchar",length=64,nullable=false)
	@XmlElement(name="bankAcctNbr")
	private String bankAcctNbr;

	@Column(name="PHONE_ID",columnDefinition="Varchar",length=28,nullable=false)
	@XmlElement(name="phoneId")
	private String phoneId;

	/**
	 * 手机号码对应的用户编号，可空
	 */
	@Column(name="USER_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="userId")
	private Long userId;

	@Column(name="DAY_FIX_MONEY",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="dayFixMoney")
	private Long dayFixMoney;

	@Column(name="TIME_FIX_MONEY",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="timeFixMoney")
	private Long timeFixMoney;

	/**
	 * 1：预付费的充值绑定  2：后付费的付账单绑定
	 */
	@Column(name="BIND_TYPE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="bindType")
	private Integer bindType;

	@Column(name="PLAT_FORM",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="platForm")
	private Integer platForm;

	@Column(name="VALID_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="validDate")
	private Date validDate;

	@Column(name="EXPIRE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="expireDate")
	private Date expireDate;

	/**
	 * 1：新增 2：修改 3：删除
	 */
	@Column(name="OPER_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="operType")
	private Integer operType;

	@Column(name="SO_NBR",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="soNbr")
	private Long soNbr;

	@Column(name="COMMIT_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="commitDate")
	private Date commitDate;

	public void setAcctId(Long obj){
		this.acctId = obj;
	}

	public Long getAcctId(){
		return acctId;
	}

	public void setPaymentType(Integer obj){
		this.paymentType = obj;
	}

	public Integer getPaymentType(){
		return paymentType;
	}

	public void setBankId(String obj){
		this.bankId = obj;
	}

	public String getBankId(){
		return bankId;
	}

	public void setBankAcctNbr(String obj){
		this.bankAcctNbr = obj;
	}

	public String getBankAcctNbr(){
		return bankAcctNbr;
	}

	public void setPhoneId(String obj){
		this.phoneId = obj;
	}

	public String getPhoneId(){
		return phoneId;
	}

	public void setUserId(Long obj){
		this.userId = obj;
	}

	public Long getUserId(){
		return userId;
	}

	public void setDayFixMoney(Long obj){
		this.dayFixMoney = obj;
	}

	public Long getDayFixMoney(){
		return dayFixMoney;
	}

	public void setTimeFixMoney(Long obj){
		this.timeFixMoney = obj;
	}

	public Long getTimeFixMoney(){
		return timeFixMoney;
	}

	public void setBindType(Integer obj){
		this.bindType = obj;
	}

	public Integer getBindType(){
		return bindType;
	}

	public void setPlatForm(Integer obj){
		this.platForm = obj;
	}

	public Integer getPlatForm(){
		return platForm;
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

	public IAcctPayChannel(){
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		IAcctPayChannel rhs=(IAcctPayChannel)rhs0;
		if(!ObjectUtils.equals(acctId, rhs.acctId)) return false;
		if(!ObjectUtils.equals(paymentType, rhs.paymentType)) return false;
		if(!ObjectUtils.equals(bankId, rhs.bankId)) return false;
		if(!ObjectUtils.equals(bankAcctNbr, rhs.bankAcctNbr)) return false;
		if(!ObjectUtils.equals(phoneId, rhs.phoneId)) return false;
		if(!ObjectUtils.equals(userId, rhs.userId)) return false;
		if(!ObjectUtils.equals(dayFixMoney, rhs.dayFixMoney)) return false;
		if(!ObjectUtils.equals(timeFixMoney, rhs.timeFixMoney)) return false;
		if(!ObjectUtils.equals(bindType, rhs.bindType)) return false;
		if(!ObjectUtils.equals(platForm, rhs.platForm)) return false;
		if(!ObjectUtils.equals(validDate, rhs.validDate)) return false;
		if(!ObjectUtils.equals(expireDate, rhs.expireDate)) return false;
		if(!ObjectUtils.equals(operType, rhs.operType)) return false;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		if(!ObjectUtils.equals(commitDate, rhs.commitDate)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(acctId)
		.append(paymentType)
		.append(bankId)
		.append(bankAcctNbr)
		.append(phoneId)
		.append(userId)
		.append(dayFixMoney)
		.append(timeFixMoney)
		.append(bindType)
		.append(platForm)
		.append(validDate)
		.append(expireDate)
		.append(operType)
		.append(soNbr)
		.append(commitDate)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{acctId,paymentType,bankId,bankAcctNbr,phoneId,userId,dayFixMoney,timeFixMoney,bindType,platForm,validDate,expireDate,operType,soNbr,commitDate}
}