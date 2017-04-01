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
import jef.codegen.support.NotModified;
/**
 * This class was generated by EasyFrame according to the table in database.
 * You need to modify the type of primary key field, to the strategy your own.
 * 
 */
@NotModified
@Entity
@Table(schema="CD",name="CM_ID_MAPPING")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"mapType","outerId","innerId"})
public class CmIdMapping extends DataObject{


	/**
	 * 1:CUST_ID;2:ACCT_ID;3:GROUP_ID
	 */
	@Column(name="MAP_TYPE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="mapType")
	private Integer mapType;

	/**
	 * 外部ID
	 */
	@Column(name="OUTER_ID",columnDefinition="Varchar",length=64,nullable=false)
	@XmlElement(name="outerId")
	private String outerId;

	/**
	 * 内部ID
	 */
	@Column(name="INNER_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="innerId")
	private Long innerId;

	public void setMapType(Integer obj){
		this.mapType = obj;
	}

	public Integer getMapType(){
		return mapType;
	}

	public void setOuterId(String obj){
		this.outerId = obj;
	}

	public String getOuterId(){
		return outerId;
	}

	public void setInnerId(Long obj){
		this.innerId = obj;
	}

	public Long getInnerId(){
		return innerId;
	}

	public CmIdMapping(){
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		CmIdMapping rhs=(CmIdMapping)rhs0;
		if(!ObjectUtils.equals(mapType, rhs.mapType)) return false;
		if(!ObjectUtils.equals(outerId, rhs.outerId)) return false;
		if(!ObjectUtils.equals(innerId, rhs.innerId)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(mapType)
		.append(outerId)
		.append(innerId)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{mapType,outerId,innerId}
}