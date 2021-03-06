package com.ailk.openbilling.persistence.imsxdr.entity;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import com.ailk.easyframe.web.common.annotation.Sdl;
import com.ailk.easyframe.sdl.sdlbuffer.CsdlStructObject;
import com.ailk.easyframe.sdl.sdlbuffer.MemberTypeInfo;
import javax.xml.bind.annotation.XmlTransient;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.builder.HashCodeBuilder;
import com.ailk.easyframe.web.common.dal.IComplexEntity;
import java.util.List;
import jef.codegen.support.NotModified;
/**
 * This class is generated automatically by Asiainfo-Linkage EasyFrame.
 * 
 */
@NotModified
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"gsu","measureId"})
@Sdl(module="MXdr")
public class SGsuValue extends CsdlStructObject implements IComplexEntity{

	public final static String COL_GSU = "GSU";
	public final static String COL_MEASURE_ID = "MEASURE_ID";
	public final static int IDX_GSU = 0;
	public final static int IDX_MEASURE_ID = 1;

	/**
	 * 
	 */
	@XmlElement(name="gsu")
	@Sdl
	private long gsu;

	/**
	 * 
	 */
	@XmlElement(name="measureId")
	@Sdl
	private int measureId;

	public void setGsu(long obj){
		this.gsu = obj;
		onFieldSet(0, obj);
	}

	public long getGsu(){
		return gsu;
	}

	public void setMeasureId(int obj){
		this.measureId = obj;
		onFieldSet(1, obj);
	}

	public int getMeasureId(){
		return measureId;
	}

	public List<MemberTypeInfo> getMemberInfoList(){
		return memberTypeInfoList;
	}

	public SGsuValue(){
		m_llMarkers = new long[1]; // used marker
		m_llUsedMarkers = new long[1]; // used marker
		fieldNum = 2; 
		markerNum = 1; 
	}

	/**
	 * 创建copy方法
	 */
	public SGsuValue(SGsuValue arg0){
		copy(arg0);
	}

	public void copy(final SGsuValue rhs){
		if (rhs == null)return;
		this.m_llMarker = rhs.m_llMarker;
		this.m_llUsedMarker = rhs.m_llUsedMarker;
		this.fieldNum = rhs.fieldNum;
		this.markerNum = rhs.markerNum;
		for (int i = 0; i < markerNum; i++) {
			m_llMarkers[i] = rhs.m_llMarkers[i];
			m_llUsedMarkers[i] = rhs.m_llUsedMarkers[i];
		}
		gsu = rhs.gsu;
		measureId = rhs.measureId;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		SGsuValue rhs=(SGsuValue)rhs0;
		if(!ObjectUtils.equals(gsu, rhs.gsu)) return false;
		if(!ObjectUtils.equals(measureId, rhs.measureId)) return false;
		return true;
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(gsu)
		.append(measureId)
		.toHashCode();
	}


protected static java.util.List<MemberTypeInfo> memberTypeInfoList = new java.util.ArrayList<MemberTypeInfo>(2);
public static final long BITS_ALL_MARKER = 0x2L;
public static final long BITS_NOT_NULL_MARKER = 0x0L;
public static final String SZ_TYPE_NAME = "com.ailk.openbilling.persistence.imsxdr.entity.SGsuValue";
@XmlTransient
@Expose(deserialize = false, serialize = false)
protected long m_llMarker = 0l; // null marker
@XmlTransient
@Expose(deserialize = false, serialize = false)
protected long m_llUsedMarker = 0l; // used marker

static{
	memberTypeInfoList.add(MemberTypeInfo.get(SGsuValue.class, "GSU", 0, long.class));
	memberTypeInfoList.add(MemberTypeInfo.get(SGsuValue.class, "MEASURE_ID", 1, int.class));
}

}