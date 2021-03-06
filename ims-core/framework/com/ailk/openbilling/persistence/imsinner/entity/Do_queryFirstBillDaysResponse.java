package com.ailk.openbilling.persistence.imsinner.entity;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlElement;
import com.ailk.openbilling.persistence.imsintf.entity.BaseResponse;
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
@XmlType(propOrder={"firstBillDays","cycleUnits"})
public class Do_queryFirstBillDaysResponse extends BaseResponse implements IComplexEntity{


	@XmlElement(name="firstBillDays")
	private FirstBillDays firstBillDays;

	@XmlElement(name="cycleUnits")
	private CycleUnits cycleUnits;

	public void setFirstBillDays(FirstBillDays obj){
		this.firstBillDays = obj;
	}

	public FirstBillDays getFirstBillDays(){
		return firstBillDays;
	}

	public void setCycleUnits(CycleUnits obj){
		this.cycleUnits = obj;
	}

	public CycleUnits getCycleUnits(){
		return cycleUnits;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		Do_queryFirstBillDaysResponse rhs=(Do_queryFirstBillDaysResponse)rhs0;
		if(!ObjectUtils.equals(firstBillDays, rhs.firstBillDays)) return false;
		if(!ObjectUtils.equals(cycleUnits, rhs.cycleUnits)) return false;
		return true;
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(firstBillDays)
		.append(cycleUnits)
		.toHashCode();
	}


}