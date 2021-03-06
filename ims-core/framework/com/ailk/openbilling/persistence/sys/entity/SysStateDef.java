package com.ailk.openbilling.persistence.sys.entity;

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
import jef.codegen.support.NotModified;
/**
 * This class was generated by EasyFrame according to the table in database.
 * You need to modify the type of primary key field, to the strategy your own.
 * 
 */
@NotModified
@Entity
@Table(schema="sd",name="SYS_STATE_DEF")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"sts","stsType","name","description"})
public class SysStateDef extends DataObject{


	/**
	 * Exclusive identification of status, for identifying different status in-table-relation

service status:
0-Close;
1-Active;
2-Suspend

resource status:
	 */
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Id
	@Column(name="STS",precision=10,columnDefinition="NUMBER",nullable=false)
	@XmlElement(name="sts")
	private Integer sts;

	/**
	 * status types
1.  user life cycle status
2.  business service status
	 */
	@Column(name="STS_TYPE",precision=8,columnDefinition="NUMBER")
	@XmlElement(name="stsType")
	private Integer stsType;

	/**
	 * name
	 */
	@Column(name="NAME",columnDefinition="Varchar",length=256,nullable=false)
	@XmlElement(name="name")
	private String name;

	/**
	 * Description in-table-relation
	 */
	@Column(name="DESCRIPTION",columnDefinition="Varchar",length=1024)
	@XmlElement(name="description")
	private String description;

	public void setSts(Integer obj){
		this.sts = obj;
	}

	public Integer getSts(){
		return sts;
	}

	public void setStsType(Integer obj){
		this.stsType = obj;
	}

	public Integer getStsType(){
		return stsType;
	}

	public void setName(String obj){
		this.name = obj;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String obj){
		this.description = obj;
	}

	public String getDescription(){
		return description;
	}

	public SysStateDef(){
	}

	public SysStateDef(Integer sts){
		this.sts = sts;
	}

	public boolean equals(final Object rhs0){
		if (rhs0 == null)return false;
		SysStateDef rhs=(SysStateDef)rhs0;
		if(!ObjectUtils.equals(sts, rhs.sts)) return false;
		return super.isEquals(rhs);
	}

	public int hashCode(){
		return new HashCodeBuilder()
		.append(sts)
		.append(super.getHashCode())
		.toHashCode();
	}


public enum Field implements jef.database.Field{sts,stsType,name,description}
}