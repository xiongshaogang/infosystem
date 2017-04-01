package com.ailk.openbilling.persistence.acct.entity;

import javax.persistence.Table;
import jef.database.DataObject;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
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
@Table(schema="AD",name="CA_CYCLE_SERVICE_NOTIFY")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"soNbr","resourceId","serviceSpecId","sts","validDate","expireDate","soDate","createDate"})
public class CaCycleServiceNotify extends DataObject{


	/**
	 * handle the number of work order
	 */
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Id
	@Column(name="SO_NBR",precision=10,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="soNbr")
	private Long soNbr;

	/**
	 * Resource ID
	 */
	@Column(name="RESOURCE_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="resourceId")
	private Long resourceId;

	/**
	 * Service ID
	 */
	@Column(name="SERVICE_SPEC_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="serviceSpecId")
	private Integer serviceSpecId;

	/**
	 * Status
0 --- Activation Period
1 --- Promotional Period
2 --- Validity Period
3 --- Grace Period
4 --- Recharge Period
5 --- Grace before Recycle
	 */
	@Column(name="STS",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="sts")
	private Integer sts;

	/**
	 * validation date
	 */
	@Column(name="VALID_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="validDate")
	private Date validDate;

	/**
	 * invalidation date
	 */
	@Column(name="EXPIRE_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="expireDate")
	private Date expireDate;

	@Column(name="SO_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="soDate")
	private Date soDate;

	@Column(name="CREATE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="createDate")
	private Date createDate;

	public void setSoNbr(Long obj){
		this.soNbr = obj;
	}

	public Long getSoNbr(){
		return soNbr;
	}

	public void setResourceId(Long obj){
		this.resourceId = obj;
	}

	public Long getResourceId(){
		return resourceId;
	}

	public void setServiceSpecId(Integer obj){
		this.serviceSpecId = obj;
	}

	public Integer getServiceSpecId(){
		return serviceSpecId;
	}

	public void setSts(Integer obj){
		this.sts = obj;
	}

	public Integer getSts(){
		return sts;
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

	public void setSoDate(Date obj){
		this.soDate = obj;
	}

	public Date getSoDate(){
		return soDate;
	}

	public void setCreateDate(Date obj){
		this.createDate = obj;
	}

	public Date getCreateDate(){
		return createDate;
	}

	public CaCycleServiceNotify(){
	}

	public CaCycleServiceNotify(Long soNbr){
		this.soNbr = soNbr;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		CaCycleServiceNotify rhs=(CaCycleServiceNotify)rhs0;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(soNbr)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{soNbr,resourceId,serviceSpecId,sts,validDate,expireDate,soDate,createDate}
}