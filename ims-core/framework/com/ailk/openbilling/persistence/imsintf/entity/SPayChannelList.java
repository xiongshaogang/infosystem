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
@XmlType(propOrder={"sPayChannelList_Item"})
public class SPayChannelList implements IComplexEntity{


	@XmlElement(name="sPayChannelList_Item")
	private SPayChannel[] sPayChannelList_Item;

	public void setSPayChannelList_Item(SPayChannel[] obj){
		this.sPayChannelList_Item = obj;
	}

	public SPayChannel[] getSPayChannelList_Item(){
		return sPayChannelList_Item;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		SPayChannelList rhs=(SPayChannelList)rhs0;
		if(!ObjectUtils.equals(sPayChannelList_Item, rhs.sPayChannelList_Item)) return false;
		return true;
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(sPayChannelList_Item)
		.toHashCode();
	}


}