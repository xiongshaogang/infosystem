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
@XmlType(propOrder={"sUserResultList_Item"})
public class SUserResultList implements IComplexEntity{


	@XmlElement(name="sUserResultList_Item")
	private SUserResult[] sUserResultList_Item;

	public void setSUserResultList_Item(SUserResult[] obj){
		this.sUserResultList_Item = obj;
	}

	public SUserResult[] getSUserResultList_Item(){
		return sUserResultList_Item;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		SUserResultList rhs=(SUserResultList)rhs0;
		if(!ObjectUtils.equals(sUserResultList_Item, rhs.sUserResultList_Item)) return false;
		return true;
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(sUserResultList_Item)
		.toHashCode();
	}


}