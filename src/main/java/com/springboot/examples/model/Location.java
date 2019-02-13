package com.springboot.examples.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="loc_cd")
public class Location implements Serializable{
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@Column(name="loc_cd")
	private int locationCode;
	
	@Column(name="loc_type_nm")
	private String locationType;
	
	@Column(name="loc_nm")
	private String locationName;
	
	@OneToOne
	@JoinColumn(name="chng_loc_cd")
	ChangeRecord changeRecord;

	public int getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(int locationCode) {
		this.locationCode = locationCode;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public ChangeRecord getChangeRecord() {
		return changeRecord;
	}

	public void setChangeRecord(ChangeRecord changeRecord) {
		this.changeRecord = changeRecord;
	}

	@Override
	public String toString() {
		return "Location [locationCode=" + locationCode + ", locationType=" + locationType + ", locationName="
				+ locationName + ", changeRecord=" + changeRecord + "]";
	}
	
	
}