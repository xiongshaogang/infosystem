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
 */
@NotModified
@Entity
@Table(schema="CD",name="CO_PROD_BILLING_CYCLE")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"productId","deductFlag","firstBillDate","cycleUnit","cycleType","validDate","expireDate","soNbr","createDate","soDate","objectId","objectType","cycleSyncFlag","acctId","cycleNum"})
public class CoProdBillingCycle extends DataObject{


	/**
	 * Product instance serial number
	 */
	@Column(name="PRODUCT_ID",precision=15,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="productId")
	private Long productId;

	/**
	 * ีหฮ๑ทัำรฟทัทฝสฝ 0--ิคฟ 1--บ๓ฟ
	 */
	@Column(name="DEDUCT_FLAG",precision=2,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="deductFlag")
	private Integer deductFlag;

	/**
	 * สืึฦฺฝุึนศีฦฺ
	 */
	@Column(name="FIRST_BILL_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="firstBillDate")
	private Date firstBillDate;

	/**
	 * Specific cycle ,for example one cycle is 3 days ,so that the value of this column  is 3
	 */
	@Column(name="CYCLE_UNIT",precision=4,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="cycleUnit")
	private Integer cycleUnit;

	/**
	 * Type of cycle  1:using calendar day as cycle type 2:using calendar week as cycle type 3:using calendar month as cycle type 4:using calendar year as cycle type 5:using dynamic month as cycle typeฃฌsuch as ORACLE provides the function of  add_months() 6:using the offset of  hours as cycle type 7:using the offset of (calendar) month as cycle type  at present,store accumulative total by day ,the min of accumulative cycle is day
	 */
	@Column(name="CYCLE_TYPE",precision=4,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="cycleType")
	private Integer cycleType;

	/**
	 * valid date
	 */
	@Column(name="VALID_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="validDate")
	private Date validDate;

	/**
	 * expire date
	 */
	@Column(name="EXPIRE_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="expireDate")
	private Date expireDate;

	/**
	 * The serial number
	 */
	@Column(name="SO_NBR",precision=15,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="soNbr")
	private Long soNbr;

	@Column(name="CREATE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="createDate")
	private Date createDate;

	@Column(name="SO_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="soDate")
	private Date soDate;

	@Column(name="OBJECT_ID",precision=15,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="objectId")
	private Long objectId;

	@Column(name="OBJECT_TYPE",precision=4,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="objectType")
	private Integer objectType;

	@Column(name="CYCLE_SYNC_FLAG",precision=1,columnDefinition="NUMBER")
	@XmlElement(name="cycleSyncFlag")
	private Integer cycleSyncFlag;

	@Column(name="CYCLE_NUM",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="cycleNum")
	private Integer cycleNum;

	/**
	 * 分表字段
	 */
	@XmlElement(name="acctId")
	@Column(name="ACCT_ID")
	private Long acctId;

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

	public void setFirstBillDate(Date obj){
		this.firstBillDate = obj;
	}

	public Date getFirstBillDate(){
		return firstBillDate;
	}

	public void setCycleUnit(Integer obj){
		this.cycleUnit = obj;
	}

	public Integer getCycleUnit(){
		return cycleUnit;
	}

	public void setCycleType(Integer obj){
		this.cycleType = obj;
	}

	public Integer getCycleType(){
		return cycleType;
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

	public void setObjectId(Long obj){
		this.objectId = obj;
	}

	public Long getObjectId(){
		return objectId;
	}

	public void setObjectType(Integer obj){
		this.objectType = obj;
	}

	public Integer getObjectType(){
		return objectType;
	}

	public void setCycleSyncFlag(Integer obj){
		this.cycleSyncFlag = obj;
	}

	public Integer getCycleSyncFlag(){
		return cycleSyncFlag;
	}

	public void setCycleNum(Integer obj){
		this.cycleNum = obj;
	}

	public Integer getCycleNum(){
		return cycleNum;
	}

	public CoProdBillingCycle(){
	}

	public void setAcctId(Long obj){
		this.acctId = obj;
	}

	public Long getAcctId(){
		return acctId;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		CoProdBillingCycle rhs=(CoProdBillingCycle)rhs0;
		if(!ObjectUtils.equals(productId, rhs.productId)) return false;
		if(!ObjectUtils.equals(deductFlag, rhs.deductFlag)) return false;
		if(!ObjectUtils.equals(firstBillDate, rhs.firstBillDate)) return false;
		if(!ObjectUtils.equals(cycleUnit, rhs.cycleUnit)) return false;
		if(!ObjectUtils.equals(cycleType, rhs.cycleType)) return false;
		if(!ObjectUtils.equals(validDate, rhs.validDate)) return false;
		if(!ObjectUtils.equals(expireDate, rhs.expireDate)) return false;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		if(!ObjectUtils.equals(createDate, rhs.createDate)) return false;
		if(!ObjectUtils.equals(soDate, rhs.soDate)) return false;
		if(!ObjectUtils.equals(objectId, rhs.objectId)) return false;
		if(!ObjectUtils.equals(objectType, rhs.objectType)) return false;
		if(!ObjectUtils.equals(cycleSyncFlag, rhs.cycleSyncFlag)) return false;
		if(!ObjectUtils.equals(cycleNum, rhs.cycleNum)) return false;
		if(!ObjectUtils.equals(acctId, rhs.acctId)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(productId)
		.append(deductFlag)
		.append(firstBillDate)
		.append(cycleUnit)
		.append(cycleType)
		.append(validDate)
		.append(expireDate)
		.append(soNbr)
		.append(createDate)
		.append(soDate)
		.append(objectId)
		.append(objectType)
		.append(cycleSyncFlag)
		.append(cycleNum)
		.append(acctId)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{productId,deductFlag,firstBillDate,cycleUnit,cycleType,validDate,expireDate,soNbr,createDate,soDate,objectId,objectType,cycleSyncFlag,cycleNum}
}