package com.ailk.openbilling.persistence.acct.entity;

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
@Table(schema="ad",name="CA_DEPOSIT_PRODUCT")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"servId","productId","busiType","promType","promoId","condId","soNbr","validDate","expireDate","soValidDate"})
public class CaDepositProduct extends DataObject{


	@Id
	@Column(name="SERV_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="servId")
	private Long servId;

	@Id
	@Column(name="PRODUCT_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="productId")
	private Long productId;

	@Column(name="BUSI_TYPE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="busiType")
	private Integer busiType;

	@Column(name="PROM_TYPE",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="promType")
	private Integer promType;

	@Column(name="PROMO_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="promoId")
	private Integer promoId;

	@Column(name="COND_ID",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="condId")
	private Integer condId;

	@Column(name="SO_NBR",precision=8,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="soNbr")
	private Long soNbr;

	@Column(name="VALID_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="validDate")
	private Date validDate;

	@Column(name="EXPIRE_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="expireDate")
	private Date expireDate;

	@Column(name="SO_VALID_DATE",columnDefinition="TimeStamp",nullable=false)
	@XmlElement(name="soValidDate")
	private Date soValidDate;

	public void setServId(Long obj){
		this.servId = obj;
	}

	public Long getServId(){
		return servId;
	}

	public void setProductId(Long obj){
		this.productId = obj;
	}

	public Long getProductId(){
		return productId;
	}

	public void setBusiType(Integer obj){
		this.busiType = obj;
	}

	public Integer getBusiType(){
		return busiType;
	}

	public void setPromType(Integer obj){
		this.promType = obj;
	}

	public Integer getPromType(){
		return promType;
	}

	public void setPromoId(Integer obj){
		this.promoId = obj;
	}

	public Integer getPromoId(){
		return promoId;
	}

	public void setCondId(Integer obj){
		this.condId = obj;
	}

	public Integer getCondId(){
		return condId;
	}

	public void setSoNbr(Long obj){
		this.soNbr = obj;
	}

	public Long getSoNbr(){
		return soNbr;
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

	public void setSoValidDate(Date obj){
		this.soValidDate = obj;
	}

	public Date getSoValidDate(){
		return soValidDate;
	}

	public CaDepositProduct(){
	}

	public CaDepositProduct(Long servId,Long productId){
		this.servId = servId;
		this.productId = productId;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		CaDepositProduct rhs=(CaDepositProduct)rhs0;
		if(!ObjectUtils.equals(servId, rhs.servId)) return false;
		if(!ObjectUtils.equals(productId, rhs.productId)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(servId)
		.append(productId)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{servId,productId,busiType,promType,promoId,condId,soNbr,validDate,expireDate,soValidDate}
}