package com.springboot.examples.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name = "chng_res_actn")
public class ChangeResourceActionId  implements Serializable{
																						
	private static final long serialVersionUID = -624089158379230174L;

//	@Column(name="chng_id")
	private int changeId;
	
	@Column(name="chng_actn_cd")
	private int changeActionCode;

	@Column(name="chng_actn_tstmp")
	private Timestamp changeActionDate;

	public ChangeResourceActionId() {
		
	}

	public ChangeResourceActionId(
//			int changeId,
			int changeActionCode, Timestamp changeActionDate) {
//		this.changeId = changeId;
		this.changeActionCode = changeActionCode;
		this.changeActionDate = changeActionDate;
	}

	public int getChangeActionCode() {
		return changeActionCode;
	}

	public void setChangeActionCode(int changeActionCode) {
		this.changeActionCode = changeActionCode;
	}

	public Timestamp getChangeActionDate() {
		return changeActionDate;
	}

	public void setChangeActionDate(Timestamp changeActionDate) {
		this.changeActionDate = changeActionDate;
	}

	@Override
	public String toString() {
		return "ChangeResourceActionId [changeActionCode=" + changeActionCode + ", changeActionDate=" + changeActionDate
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + changeActionCode;
		result = prime * result + ((changeActionDate == null) ? 0 : changeActionDate.hashCode());
		result = prime * result + changeId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChangeResourceActionId other = (ChangeResourceActionId) obj;
		if (changeActionCode != other.changeActionCode)
			return false;
		if (changeActionDate == null) {
			if (other.changeActionDate != null)
				return false;
		} else if (!changeActionDate.equals(other.changeActionDate))
			return false;
		if (changeId != other.changeId)
			return false;
		return true;
	}
	

	
}