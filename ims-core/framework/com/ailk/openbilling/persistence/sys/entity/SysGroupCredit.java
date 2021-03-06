package com.ailk.openbilling.persistence.sys.entity;

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
import jef.codegen.support.NotModified;
/**
 * This class was generated by EasyFrame according to the table in database.
 * You need to modify the type of primary key field, to the strategy your own.
 * 
 */
@NotModified
@Entity
@Table(schema="sd",name="SYS_GROUP_CREDIT")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"id","brandId","mainPromotion","policyId","creditClass","creditValue","negativeValue","measureId","maxBalance","maxValidity","notifRemainedDays","notificationId","regionCode","customerType","customerClass","customerSegment","accountType","resType","resSegment","billingType","priority","suspendDays","maxNegativeValue","balanceType","specialUserSts","formulaId"})
public class SysGroupCredit extends DataObject{


	@Id
	@Column(name="ID",precision=10,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="id")
	private Integer id;

	/**
	 * Brand ID
	 */
	@Column(name="BRAND_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="brandId")
	private Integer brandId;

	/**
	 * ?????,??-1
	 */
	@Column(name="MAIN_PROMOTION",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="mainPromotion")
	private Integer mainPromotion;

	/**
	 * Policy ID, 0 for always true.
	 */
	@Column(name="POLICY_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="policyId")
	private Integer policyId;

	/**
	 * used for mapping foreign data
	 */
	@Column(name="CREDIT_CLASS",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="creditClass")
	private Integer creditClass;

	/**
	 * amount of credit limit
	 */
	@Column(name="CREDIT_VALUE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="creditValue")
	private Long creditValue;

	/**
	 * Nagative balance,for prepaid
	 */
	@Column(name="NEGATIVE_VALUE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="negativeValue")
	private Long negativeValue;

	/**
	 * Charge measurement such as:
Dollar-->Cent
RMB-->Li
	 */
	@Column(name="MEASURE_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="measureId")
	private Integer measureId;

	@Column(name="MAX_BALANCE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="maxBalance")
	private Long maxBalance;

	@Column(name="MAX_VALIDITY",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="maxValidity")
	private Long maxValidity;

	@Column(name="NOTIF_REMAINED_DAYS",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="notifRemainedDays")
	private Integer notifRemainedDays;

	@Column(name="NOTIFICATION_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="notificationId")
	private Integer notificationId;

	@Column(name="REGION_CODE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="regionCode")
	private Integer regionCode;

	@Column(name="CUSTOMER_TYPE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="customerType")
	private Integer customerType;

	@Column(name="CUSTOMER_CLASS",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="customerClass")
	private Integer customerClass;

	@Column(name="CUSTOMER_SEGMENT",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="customerSegment")
	private Integer customerSegment;

	@Column(name="ACCOUNT_TYPE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="accountType")
	private Integer accountType;

	@Column(name="RES_TYPE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="resType")
	private Integer resType;

	@Column(name="RES_SEGMENT",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="resSegment")
	private Integer resSegment;

	@Column(name="BILLING_TYPE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="billingType")
	private Integer billingType;

	@Column(name="PRIORITY",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="priority")
	private Integer priority;

	@Column(name="SUSPEND_DAYS",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="suspendDays")
	private Integer suspendDays;

	@Column(name="MAX_NEGATIVE_VALUE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="maxNegativeValue")
	private Integer maxNegativeValue;

	@Column(name="BALANCE_TYPE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="balanceType")
	private Integer balanceType;

	/**
	 * Transformed as binary digital, and each bit (right to left) means one specific user status, value of user status:
1: active state
2: suspend state
4: disabled state
8: terminate state
	 */
	@Column(name="SPECIAL_USER_STS",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="specialUserSts")
	private Integer specialUserSts;

	@Column(name="FORMULA_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="formulaId")
	private Integer formulaId;

	public void setId(Integer obj){
		this.id = obj;
	}

	public Integer getId(){
		return id;
	}

	public void setBrandId(Integer obj){
		this.brandId = obj;
	}

	public Integer getBrandId(){
		return brandId;
	}

	public void setMainPromotion(Integer obj){
		this.mainPromotion = obj;
	}

	public Integer getMainPromotion(){
		return mainPromotion;
	}

	public void setPolicyId(Integer obj){
		this.policyId = obj;
	}

	public Integer getPolicyId(){
		return policyId;
	}

	public void setCreditClass(Integer obj){
		this.creditClass = obj;
	}

	public Integer getCreditClass(){
		return creditClass;
	}

	public void setCreditValue(Long obj){
		this.creditValue = obj;
	}

	public Long getCreditValue(){
		return creditValue;
	}

	public void setNegativeValue(Long obj){
		this.negativeValue = obj;
	}

	public Long getNegativeValue(){
		return negativeValue;
	}

	public void setMeasureId(Integer obj){
		this.measureId = obj;
	}

	public Integer getMeasureId(){
		return measureId;
	}

	public void setMaxBalance(Long obj){
		this.maxBalance = obj;
	}

	public Long getMaxBalance(){
		return maxBalance;
	}

	public void setMaxValidity(Long obj){
		this.maxValidity = obj;
	}

	public Long getMaxValidity(){
		return maxValidity;
	}

	public void setNotifRemainedDays(Integer obj){
		this.notifRemainedDays = obj;
	}

	public Integer getNotifRemainedDays(){
		return notifRemainedDays;
	}

	public void setNotificationId(Integer obj){
		this.notificationId = obj;
	}

	public Integer getNotificationId(){
		return notificationId;
	}

	public void setRegionCode(Integer obj){
		this.regionCode = obj;
	}

	public Integer getRegionCode(){
		return regionCode;
	}

	public void setCustomerType(Integer obj){
		this.customerType = obj;
	}

	public Integer getCustomerType(){
		return customerType;
	}

	public void setCustomerClass(Integer obj){
		this.customerClass = obj;
	}

	public Integer getCustomerClass(){
		return customerClass;
	}

	public void setCustomerSegment(Integer obj){
		this.customerSegment = obj;
	}

	public Integer getCustomerSegment(){
		return customerSegment;
	}

	public void setAccountType(Integer obj){
		this.accountType = obj;
	}

	public Integer getAccountType(){
		return accountType;
	}

	public void setResType(Integer obj){
		this.resType = obj;
	}

	public Integer getResType(){
		return resType;
	}

	public void setResSegment(Integer obj){
		this.resSegment = obj;
	}

	public Integer getResSegment(){
		return resSegment;
	}

	public void setBillingType(Integer obj){
		this.billingType = obj;
	}

	public Integer getBillingType(){
		return billingType;
	}

	public void setPriority(Integer obj){
		this.priority = obj;
	}

	public Integer getPriority(){
		return priority;
	}

	public void setSuspendDays(Integer obj){
		this.suspendDays = obj;
	}

	public Integer getSuspendDays(){
		return suspendDays;
	}

	public void setMaxNegativeValue(Integer obj){
		this.maxNegativeValue = obj;
	}

	public Integer getMaxNegativeValue(){
		return maxNegativeValue;
	}

	public void setBalanceType(Integer obj){
		this.balanceType = obj;
	}

	public Integer getBalanceType(){
		return balanceType;
	}

	public void setSpecialUserSts(Integer obj){
		this.specialUserSts = obj;
	}

	public Integer getSpecialUserSts(){
		return specialUserSts;
	}

	public void setFormulaId(Integer obj){
		this.formulaId = obj;
	}

	public Integer getFormulaId(){
		return formulaId;
	}

	public SysGroupCredit(){
	}

	public SysGroupCredit(Integer id){
		this.id = id;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		SysGroupCredit rhs=(SysGroupCredit)rhs0;
		if(!ObjectUtils.equals(id, rhs.id)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(id)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{id,brandId,mainPromotion,policyId,creditClass,creditValue,negativeValue,measureId,maxBalance,maxValidity,notifRemainedDays,notificationId,regionCode,customerType,customerClass,customerSegment,accountType,resType,resSegment,billingType,priority,suspendDays,maxNegativeValue,balanceType,specialUserSts,formulaId}
}