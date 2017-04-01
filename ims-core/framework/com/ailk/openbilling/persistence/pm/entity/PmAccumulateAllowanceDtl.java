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
 * 
 */
@NotModified
@Entity
@Table(schema="pd",name="PM_ACCUMULATE_ALLOWANCE_DTL")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"priceId","allowanceRuleId"})
public class PmAccumulateAllowanceDtl extends DataObject{


	/**
	 * ID of pricing which associate with PM_ACCUMULATE_ALLOWANCE_RULE.PRICE_ID
	 */
	@Id
	@Column(name="PRICE_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="priceId")
	private Integer priceId;

	/**
	 * Rule for reward of  free resource
	 */
	@Id
	@Column(name="ALLOWANCE_RULE_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="allowanceRuleId")
	private Integer allowanceRuleId;

	public void setPriceId(Integer obj){
		this.priceId = obj;
	}

	public Integer getPriceId(){
		return priceId;
	}

	public void setAllowanceRuleId(Integer obj){
		this.allowanceRuleId = obj;
	}

	public Integer getAllowanceRuleId(){
		return allowanceRuleId;
	}

	public PmAccumulateAllowanceDtl(){
	}

	public PmAccumulateAllowanceDtl(Integer priceId,Integer allowanceRuleId){
		this.priceId = priceId;
		this.allowanceRuleId = allowanceRuleId;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		PmAccumulateAllowanceDtl rhs=(PmAccumulateAllowanceDtl)rhs0;
		if(!ObjectUtils.equals(priceId, rhs.priceId)) return false;
		if(!ObjectUtils.equals(allowanceRuleId, rhs.allowanceRuleId)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(priceId)
		.append(allowanceRuleId)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{priceId,allowanceRuleId}
}