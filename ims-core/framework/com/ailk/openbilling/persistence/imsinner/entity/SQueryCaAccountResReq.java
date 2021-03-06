package com.ailk.openbilling.persistence.imsinner.entity;

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
@XmlType(propOrder={"user_id"})
public class SQueryCaAccountResReq implements IComplexEntity{


	@XmlElement(name="user_id")
	private Long user_id;

	public void setUser_id(Long obj){
		this.user_id = obj;
	}

	public Long getUser_id(){
		return user_id;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		SQueryCaAccountResReq rhs=(SQueryCaAccountResReq)rhs0;
		if(!ObjectUtils.equals(user_id, rhs.user_id)) return false;
		return true;
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(user_id)
		.toHashCode();
	}


}