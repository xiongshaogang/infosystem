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
@Table(schema="CD",name="CM_RES_IDENTITY")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"resourceId","identity","identityType","identityAttr","resourcePasswd","validDate","expireDate","soNbr","createDate","soDate","serialNo","relIdentity"})
public class CmResIdentity extends DataObject{


	/**
	 * Resource Numbering
	 */
	@Id
	@Column(name="RESOURCE_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="resourceId")
	private Long resourceId;

	/**
	 * Resource Identifier String
e.g :
The number string of phone number
IMSI number string
Broadband network account string,etc
	 */
	@Id
	@Column(name="IDENTITY",columnDefinition="Varchar",length=64,nullable=false)
	@XmlElement(name="identity")
	private String identity;

	/**
	 * Number Identifier Type
0: Phone number
1:IMSI
2: Fixed number
3: Broadband account ID
4: WLAN account ID
	 */
	@Id
	@Column(name="IDENTITY_TYPE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="identityType")
	private Integer identityType;

	/**
	 * The Related Properties of Identifier Number
Identify by digit
The first digit is 0: the main numberฃจattr & 0x01 == 0ฃฉ
The first digit is 1: the sub-numberฃจattr & 0x01 == 1ฃฉฃจthe secondกขthe thirdกฃกฃกฃกฃฃฉ
The second digit is 1: MNP port inฃจattr & 0x02 == 1ฃฉ
The third digit is 1: MNP port out ฃจattr & 0x04 == 1ฃฉ
	 */
	@Column(name="IDENTITY_ATTR",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="identityAttr")
	private Integer identityAttr;

	/**
	 * The password of resource identifier string
	 */
	@Column(name="RESOURCE_PASSWD",columnDefinition="Varchar",length=32)
	@XmlElement(name="resourcePasswd")
	private String resourcePasswd;

	/**
	 * Effective Date
	 */
	@Id
	@Column(name="VALID_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="validDate")
	private Date validDate;

	/**
	 * Expired Date
	 */
	@Column(name="EXPIRE_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="expireDate")
	private Date expireDate;

	/**
	 * The serial number
	 */
	@Column(name="SO_NBR",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="soNbr")
	private Long soNbr;

	@Column(name="CREATE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="createDate")
	private Date createDate;

	@Column(name="SO_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="soDate")
	private Date soDate;

	@Column(name="SERIAL_NO",columnDefinition="Varchar",length=64)
	@XmlElement(name="serialNo")
	private String serialNo;

	@Column(name="REL_IDENTITY",columnDefinition="Varchar",length=64,nullable=false)
	@XmlElement(name="relIdentity")
	private String relIdentity;

	public void setResourceId(Long obj){
		this.resourceId = obj;
	}

	public Long getResourceId(){
		return resourceId;
	}

	public void setIdentity(String obj){
		this.identity = obj;
	}

	public String getIdentity(){
		return identity;
	}

	public void setIdentityType(Integer obj){
		this.identityType = obj;
	}

	public Integer getIdentityType(){
		return identityType;
	}

	public void setIdentityAttr(Integer obj){
		this.identityAttr = obj;
	}

	public Integer getIdentityAttr(){
		return identityAttr;
	}

	public void setResourcePasswd(String obj){
		this.resourcePasswd = obj;
	}

	public String getResourcePasswd(){
		return resourcePasswd;
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

	public void setSerialNo(String obj){
		this.serialNo = obj;
	}

	public String getSerialNo(){
		return serialNo;
	}

	public void setRelIdentity(String obj){
		this.relIdentity = obj;
	}

	public String getRelIdentity(){
		return relIdentity;
	}

	public CmResIdentity(){
	}

	public CmResIdentity(Long resourceId,String identity,Integer identityType,Date validDate){
		this.resourceId = resourceId;
		this.identity = identity;
		this.identityType = identityType;
		this.validDate = validDate;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		CmResIdentity rhs=(CmResIdentity)rhs0;
		if(!ObjectUtils.equals(identity, rhs.identity)) return false;
		if(!ObjectUtils.equals(identityType, rhs.identityType)) return false;
		if(!ObjectUtils.equals(resourceId, rhs.resourceId)) return false;
		if(!ObjectUtils.equals(validDate, rhs.validDate)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(identity)
		.append(identityType)
		.append(resourceId)
		.append(validDate)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{resourceId,identity,identityType,identityAttr,resourcePasswd,validDate,expireDate,soNbr,createDate,soDate,serialNo,relIdentity}
}