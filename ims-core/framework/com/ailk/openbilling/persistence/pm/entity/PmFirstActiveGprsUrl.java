package com.ailk.openbilling.persistence.pm.entity;

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
 */
@NotModified
@Entity
@Table(schema="PD",name="PM_FIRST_ACTIVE_GPRS_URL")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"priceRuleId","successUrl","failureUrl"})
public class PmFirstActiveGprsUrl extends DataObject{


	/**
	 * rating rule id
	 */
	@Id
	@Column(name="PRICE_RULE_ID",precision=10,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="priceRuleId")
	private Integer priceRuleId;

	/**
	 * success url
	 */
	@Column(name="SUCCESS_URL",columnDefinition="Varchar",length=256)
	@XmlElement(name="successUrl")
	private String successUrl;

	/**
	 * failure url
	 */
	@Column(name="FAILURE_URL",columnDefinition="Varchar",length=256)
	@XmlElement(name="failureUrl")
	private String failureUrl;

	public void setPriceRuleId(Integer obj){
		this.priceRuleId = obj;
	}

	public Integer getPriceRuleId(){
		return priceRuleId;
	}

	public void setSuccessUrl(String obj){
		this.successUrl = obj;
	}

	public String getSuccessUrl(){
		return successUrl;
	}

	public void setFailureUrl(String obj){
		this.failureUrl = obj;
	}

	public String getFailureUrl(){
		return failureUrl;
	}

	public PmFirstActiveGprsUrl(){
	}

	public PmFirstActiveGprsUrl(Integer priceRuleId){
		this.priceRuleId = priceRuleId;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		PmFirstActiveGprsUrl rhs=(PmFirstActiveGprsUrl)rhs0;
		if(!ObjectUtils.equals(priceRuleId, rhs.priceRuleId)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(priceRuleId)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{priceRuleId,successUrl,failureUrl}
}