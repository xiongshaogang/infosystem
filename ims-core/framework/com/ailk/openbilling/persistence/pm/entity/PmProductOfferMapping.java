package com.ailk.openbilling.persistence.pm.entity;

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
 */
@NotModified
@Entity
@Table(schema="PD",name="PM_PRODUCT_OFFER_MAPPING")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"id","productOfferingId","refMainOffering","relProductOffering","relationTypeId","validDate","expireDate"})
public class PmProductOfferMapping extends DataObject{


	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Id
	@Column(name="ID",precision=9,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="id")
	private int id;

	/**
	 * CRM????
	 */
	@Column(name="PRODUCT_OFFERING_ID",precision=9,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="productOfferingId")
	private int productOfferingId;

	/**
	 * ????? ??-1 ?????
	 */
	@Column(name="REF_MAIN_OFFERING",precision=9,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="refMainOffering")
	private int refMainOffering;

	/**
	 * BOSS?????
	 */
	@Column(name="REL_PRODUCT_OFFERING",precision=9,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="relProductOffering")
	private int relProductOffering;

	/**
	 * ???? 0:??????? ?CRM??A,BOSS????????B?C 1:????????? ??????A??????B BOSS????????C
	 */
	@Column(name="RELATION_TYPE_ID",precision=4,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="relationTypeId")
	private int relationTypeId;

	/**
	 * effective date
	 */
	@Column(name="VALID_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="validDate")
	private Date validDate;

	/**
	 * expiring date
	 */
	@Column(name="EXPIRE_DATE",columnDefinition="TimeStamp")
	@XmlElement(name="expireDate")
	private Date expireDate;

	public void setId(int obj){
		this.id = obj;
	}

	public int getId(){
		return id;
	}

	public void setProductOfferingId(int obj){
		this.productOfferingId = obj;
	}

	public int getProductOfferingId(){
		return productOfferingId;
	}

	public void setRefMainOffering(int obj){
		this.refMainOffering = obj;
	}

	public int getRefMainOffering(){
		return refMainOffering;
	}

	public void setRelProductOffering(int obj){
		this.relProductOffering = obj;
	}

	public int getRelProductOffering(){
		return relProductOffering;
	}

	public void setRelationTypeId(int obj){
		this.relationTypeId = obj;
	}

	public int getRelationTypeId(){
		return relationTypeId;
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

	public PmProductOfferMapping(){
	}

	public PmProductOfferMapping(int id){
		this.id = id;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		PmProductOfferMapping rhs=(PmProductOfferMapping)rhs0;
		if(!ObjectUtils.equals(id, rhs.id)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(id)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{id,productOfferingId,refMainOffering,relProductOffering,relationTypeId,validDate,expireDate}
}