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
@Table(schema="JD",name="I_ACCT_BILL_CYCLE")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"acctId","cycleType","cycleUnit","firstBillDay","firstBillType","effectiveType","validDate","expireDate","operType","soNbr","commitDate"})
public class IAcctBillCycle extends DataObject{


	@Column(name="ACCT_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="acctId")
	private Long acctId;

	@Column(name="CYCLE_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="cycleType")
	private Integer cycleType;

	@Column(name="CYCLE_UNIT",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="cycleUnit")
	private Integer cycleUnit;

	@Column(name="FIRST_BILL_DAY",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="firstBillDay")
	private Integer firstBillDay;

	@Column(name="FIRST_BILL_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="firstBillType")
	private Integer firstBillType;

	@Column(name="EFFECTIVE_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="effectiveType")
	private Integer effectiveType;

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

	public void setAcctId(Long obj){
		this.acctId = obj;
	}

	public Long getAcctId(){
		return acctId;
	}

	public void setCycleType(Integer obj){
		this.cycleType = obj;
	}

	public Integer getCycleType(){
		return cycleType;
	}

	public void setCycleUnit(Integer obj){
		this.cycleUnit = obj;
	}

	public Integer getCycleUnit(){
		return cycleUnit;
	}

	public void setFirstBillDay(Integer obj){
		this.firstBillDay = obj;
	}

	public Integer getFirstBillDay(){
		return firstBillDay;
	}

	public void setFirstBillType(Integer obj){
		this.firstBillType = obj;
	}

	public Integer getFirstBillType(){
		return firstBillType;
	}

	public void setEffectiveType(Integer obj){
		this.effectiveType = obj;
	}

	public Integer getEffectiveType(){
		return effectiveType;
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

	public IAcctBillCycle(){
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		IAcctBillCycle rhs=(IAcctBillCycle)rhs0;
		if(!ObjectUtils.equals(acctId, rhs.acctId)) return false;
		if(!ObjectUtils.equals(cycleType, rhs.cycleType)) return false;
		if(!ObjectUtils.equals(cycleUnit, rhs.cycleUnit)) return false;
		if(!ObjectUtils.equals(firstBillDay, rhs.firstBillDay)) return false;
		if(!ObjectUtils.equals(firstBillType, rhs.firstBillType)) return false;
		if(!ObjectUtils.equals(effectiveType, rhs.effectiveType)) return false;
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
		.append(cycleType)
		.append(cycleUnit)
		.append(firstBillDay)
		.append(firstBillType)
		.append(effectiveType)
		.append(validDate)
		.append(expireDate)
		.append(operType)
		.append(soNbr)
		.append(commitDate)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{acctId,cycleType,cycleUnit,firstBillDay,firstBillType,effectiveType,validDate,expireDate,operType,soNbr,commitDate}
}