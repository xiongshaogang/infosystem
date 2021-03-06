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
@XmlType(propOrder={"member_list"})
public class Do_queryGroupMembersResponse extends BaseResponse implements IComplexEntity{


	@XmlElement(name="member_list")
	private SMemberList member_list;

	public void setMember_list(SMemberList obj){
		this.member_list = obj;
	}

	public SMemberList getMember_list(){
		return member_list;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		Do_queryGroupMembersResponse rhs=(Do_queryGroupMembersResponse)rhs0;
		if(!ObjectUtils.equals(member_list, rhs.member_list)) return false;
		return true;
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(member_list)
		.toHashCode();
	}


}