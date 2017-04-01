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
@Table(schema="CD",name="CM_CUST_GROUP")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"resourceId","custId","groupId","groupType","memberCustId","usecustId","removeTag","soDate","soNbr","createDate","validDate","expireDate","remark"})
public class CmCustGroup extends DataObject{


	@Id
	@Column(name="RESOURCE_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="resourceId")
	private Long resourceId;

	@Id
	@Column(name="CUST_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="custId")
	private Long custId;

	@Column(name="GROUP_ID",columnDefinition="Varchar",length=40)
	@XmlElement(name="groupId")
	private String groupId;

	@Column(name="GROUP_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="groupType")
	private Integer groupType;

	@Column(name="MEMBER_CUST_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="memberCustId")
	private Long memberCustId;

	@Column(name="USECUST_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="usecustId")
	private Long usecustId;

	@Column(name="REMOVE_TAG",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="removeTag")
	private Integer removeTag;

	@Column(name="SO_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="soDate")
	private Date soDate;

	@Id
	@Column(name="SO_NBR",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="soNbr")
	private Long soNbr;

	@Column(name="CREATE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="createDate")
	private Date createDate;

	@Id
	@Column(name="VALID_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="validDate")
	private Date validDate;

	@Column(name="EXPIRE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="expireDate")
	private Date expireDate;

	@Column(name="REMARK",columnDefinition="Varchar",length=255)
	@XmlElement(name="remark")
	private String remark;

	public void setResourceId(Long obj){
		this.resourceId = obj;
	}

	public Long getResourceId(){
		return resourceId;
	}

	public void setCustId(Long obj){
		this.custId = obj;
	}

	public Long getCustId(){
		return custId;
	}

	public void setGroupId(String obj){
		this.groupId = obj;
	}

	public String getGroupId(){
		return groupId;
	}

	public void setGroupType(Integer obj){
		this.groupType = obj;
	}

	public Integer getGroupType(){
		return groupType;
	}

	public void setMemberCustId(Long obj){
		this.memberCustId = obj;
	}

	public Long getMemberCustId(){
		return memberCustId;
	}

	public void setUsecustId(Long obj){
		this.usecustId = obj;
	}

	public Long getUsecustId(){
		return usecustId;
	}

	public void setRemoveTag(Integer obj){
		this.removeTag = obj;
	}

	public Integer getRemoveTag(){
		return removeTag;
	}

	public void setSoDate(Date obj){
		this.soDate = obj;
	}

	public Date getSoDate(){
		return soDate;
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

	public void setRemark(String obj){
		this.remark = obj;
	}

	public String getRemark(){
		return remark;
	}

	public CmCustGroup(){
	}

	public CmCustGroup(Long resourceId,Long custId,Long soNbr,Date validDate){
		this.resourceId = resourceId;
		this.custId = custId;
		this.soNbr = soNbr;
		this.validDate = validDate;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		CmCustGroup rhs=(CmCustGroup)rhs0;
		if(!ObjectUtils.equals(custId, rhs.custId)) return false;
		if(!ObjectUtils.equals(resourceId, rhs.resourceId)) return false;
		if(!ObjectUtils.equals(validDate, rhs.validDate)) return false;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(custId)
		.append(resourceId)
		.append(validDate)
		.append(soNbr)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{resourceId,custId,groupId,groupType,memberCustId,usecustId,removeTag,soDate,soNbr,createDate,validDate,expireDate,remark}
}