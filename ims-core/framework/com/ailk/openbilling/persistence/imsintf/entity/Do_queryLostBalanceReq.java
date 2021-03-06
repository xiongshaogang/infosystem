package com.ailk.openbilling.persistence.imsintf.entity;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.builder.HashCodeBuilder;
import com.ailk.easyframe.web.common.dal.IComplexEntity;
import jef.codegen.support.NotModified;
/**
 * This class is generated automatically by Asiainfo-Linkage EasyFrame.
 */
@NotModified
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"phone_id","start_date","end_date"})
public class Do_queryLostBalanceReq implements IComplexEntity{


	@XmlElement(name="phone_id")
	private String phone_id;

	@XmlElement(name="start_date")
	private String start_date;

	@XmlElement(name="end_date")
	private String end_date;

	public void setPhone_id(String obj){
		this.phone_id = obj;
	}

	public String getPhone_id(){
		return phone_id;
	}

	public void setStart_date(String obj){
		this.start_date = obj;
	}

	public String getStart_date(){
		return start_date;
	}

	public void setEnd_date(String obj){
		this.end_date = obj;
	}

	public String getEnd_date(){
		return end_date;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		Do_queryLostBalanceReq rhs=(Do_queryLostBalanceReq)rhs0;
		if(!ObjectUtils.equals(phone_id, rhs.phone_id)) return false;
		if(!ObjectUtils.equals(start_date, rhs.start_date)) return false;
		if(!ObjectUtils.equals(end_date, rhs.end_date)) return false;
		return true;
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(phone_id)
		.append(start_date)
		.append(end_date)
		.toHashCode();
	}


}