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
 * 
 */
@NotModified
@Entity
@Table(schema="CD",name="CM_BUSI_ORDER")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"soNbr","origSoNbr","specId","productId","operType","objectType","busiFlag","objectId","originType","originId","sts","cancelDate","doneDate","remark"})
public class CmBusiOrder extends DataObject{


	@Column(name="SO_NBR",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="soNbr")
	private Long soNbr;

	/**
	 * 原始变更前的流水号，如果是新增的这个和so_nbr一样
	 */
	@Column(name="ORIG_SO_NBR",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="origSoNbr")
	private Long origSoNbr;

	/**
	 * 业务规格
	 */
	@Column(name="SPEC_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="specId")
	private Long specId;

	/**
	 * 产品实例编号
	 */
	@Column(name="PRODUCT_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="productId")
	private Long productId;

	/**
	 * 操作，表示0-新增、1-删除, 2修改 3-延期
	 */
	@Column(name="OPER_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="operType")
	private Integer operType;

	/**
	 * 对象类型，0-dev；1-acct;2-gca
	 */
	@Column(name="OBJECT_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="objectType")
	private Integer objectType;

	/**
	 * 产品的业务标识
	 */
	@Column(name="BUSI_FLAG",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="busiFlag")
	private Integer busiFlag;

	/**
	 * 对象编号
	 */
	@Column(name="OBJECT_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="objectId")
	private Long objectId;

	/**
	 * 来源，0-普通的产品订购,1-奖励
	 */
	@Column(name="ORIGIN_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="originType")
	private Integer originType;

	/**
	 * 如果是因为订购了某个产品送的奖励，记录对应的产品编号,
如果是某种操作，比如首次激活赠送的，可以填0
	 */
	@Column(name="ORIGIN_ID",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="originId")
	private Long originId;

	/**
	 * 0-正常工单，1-已撤单工单
	 */
	@Column(name="STS",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="sts")
	private Integer sts;

	/**
	 * 撤单时间
	 */
	@Column(name="CANCEL_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="cancelDate")
	private Date cancelDate;

	/**
	 * 操作时间
	 */
	@Column(name="DONE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="doneDate")
	private Date doneDate;

	@Column(name="REMARK",columnDefinition="Varchar",length=255)
	@XmlElement(name="remark")
	private String remark;

	public void setSoNbr(Long obj){
		this.soNbr = obj;
	}

	public Long getSoNbr(){
		return soNbr;
	}

	public void setOrigSoNbr(Long obj){
		this.origSoNbr = obj;
	}

	public Long getOrigSoNbr(){
		return origSoNbr;
	}

	public void setSpecId(Long obj){
		this.specId = obj;
	}

	public Long getSpecId(){
		return specId;
	}

	public void setProductId(Long obj){
		this.productId = obj;
	}

	public Long getProductId(){
		return productId;
	}

	public void setOperType(Integer obj){
		this.operType = obj;
	}

	public Integer getOperType(){
		return operType;
	}

	public void setObjectType(Integer obj){
		this.objectType = obj;
	}

	public Integer getObjectType(){
		return objectType;
	}

	public void setBusiFlag(Integer obj){
		this.busiFlag = obj;
	}

	public Integer getBusiFlag(){
		return busiFlag;
	}

	public void setObjectId(Long obj){
		this.objectId = obj;
	}

	public Long getObjectId(){
		return objectId;
	}

	public void setOriginType(Integer obj){
		this.originType = obj;
	}

	public Integer getOriginType(){
		return originType;
	}

	public void setOriginId(Long obj){
		this.originId = obj;
	}

	public Long getOriginId(){
		return originId;
	}

	public void setSts(Integer obj){
		this.sts = obj;
	}

	public Integer getSts(){
		return sts;
	}

	public void setCancelDate(Date obj){
		this.cancelDate = obj;
	}

	public Date getCancelDate(){
		return cancelDate;
	}

	public void setDoneDate(Date obj){
		this.doneDate = obj;
	}

	public Date getDoneDate(){
		return doneDate;
	}

	public void setRemark(String obj){
		this.remark = obj;
	}

	public String getRemark(){
		return remark;
	}

	public CmBusiOrder(){
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		CmBusiOrder rhs=(CmBusiOrder)rhs0;
		if(!ObjectUtils.equals(soNbr, rhs.soNbr)) return false;
		if(!ObjectUtils.equals(origSoNbr, rhs.origSoNbr)) return false;
		if(!ObjectUtils.equals(specId, rhs.specId)) return false;
		if(!ObjectUtils.equals(productId, rhs.productId)) return false;
		if(!ObjectUtils.equals(operType, rhs.operType)) return false;
		if(!ObjectUtils.equals(objectType, rhs.objectType)) return false;
		if(!ObjectUtils.equals(busiFlag, rhs.busiFlag)) return false;
		if(!ObjectUtils.equals(objectId, rhs.objectId)) return false;
		if(!ObjectUtils.equals(originType, rhs.originType)) return false;
		if(!ObjectUtils.equals(originId, rhs.originId)) return false;
		if(!ObjectUtils.equals(sts, rhs.sts)) return false;
		if(!ObjectUtils.equals(cancelDate, rhs.cancelDate)) return false;
		if(!ObjectUtils.equals(doneDate, rhs.doneDate)) return false;
		if(!ObjectUtils.equals(remark, rhs.remark)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(soNbr)
		.append(origSoNbr)
		.append(specId)
		.append(productId)
		.append(operType)
		.append(objectType)
		.append(busiFlag)
		.append(objectId)
		.append(originType)
		.append(originId)
		.append(sts)
		.append(cancelDate)
		.append(doneDate)
		.append(remark)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{soNbr,origSoNbr,specId,productId,operType,objectType,busiFlag,objectId,originType,originId,sts,cancelDate,doneDate,remark}
}