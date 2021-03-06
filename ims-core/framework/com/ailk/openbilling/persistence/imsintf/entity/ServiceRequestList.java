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
@XmlType(propOrder={"serviceRequest_Item"})
public class ServiceRequestList implements IComplexEntity{


	@XmlElement(name="serviceRequest_Item")
	private ServiceRequest[] serviceRequest_Item;

	public void setServiceRequest_Item(ServiceRequest[] obj){
		this.serviceRequest_Item = obj;
	}

	public ServiceRequest[] getServiceRequest_Item(){
		return serviceRequest_Item;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		ServiceRequestList rhs=(ServiceRequestList)rhs0;
		if(!ObjectUtils.equals(serviceRequest_Item, rhs.serviceRequest_Item)) return false;
		return true;
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(serviceRequest_Item)
		.toHashCode();
	}


}