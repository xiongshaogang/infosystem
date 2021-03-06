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
 * 
 */
@NotModified
@Entity
@Table(schema="cd",name="CM_BUSI_KEY")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"soNbr","stepId","soMode","soDate","doneCode"})
public class CmBusiKey extends DataObject{


	@Id
	@Column(name="SO_NBR",columnDefinition="Varchar",length=128)
	@XmlElement(name="soNbr")
	private String soNbr;

	@Id
	@Column(name="STEP_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="stepId")
	private Integer stepId;

	@Id
	@Column(name="SO_MODE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="soMode")
	private Integer soMode;

	@Column(name="SO_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="soDate")
	private Date soDate;

	@Column(name="DONE_CODE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="doneCode")
	private Long doneCode;

	public void setSoNbr(String obj){
		this.soNbr = obj;
	}

	public String getSoNbr(){
		return soNbr;
	}

	public void setStepId(Integer obj){
		this.stepId = obj;
	}

	public Integer getStepId(){
		return stepId;
	}

	public void setSoMode(Integer obj){
		this.soMode = obj;
	}

	public Integer getSoMode(){
		return soMode;
	}

	public void setSoDate(Date obj){
		this.soDate = obj;
	}

	public Date getSoDate(){
		return soDate;
	}

	public void setDoneCode(Long obj){
		this.doneCode = obj;
	}

	public Long getDoneCode(){
		return doneCode;
	}

	public CmBusiKey(){
	}

	public CmBusiKey(String soNbr,Integer stepId,Integer soMode){
		this.soNbr = soNbr;
		this.stepId = stepId;
		this.soMode = soMode;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		CmBusiKey rhs=(CmBusiKey)rhs0;
		if(!ObjectUtils.equals(soMode, rhs.soMode)) return false;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		if(!ObjectUtils.equals(stepId, rhs.stepId)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(soMode)
		.append(soNbr)
		.append(stepId)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{soNbr,stepId,soMode,soDate,doneCode}
}