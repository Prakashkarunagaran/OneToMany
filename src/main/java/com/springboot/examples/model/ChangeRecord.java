package com.springboot.examples.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chng_rec")
public class ChangeRecord implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "chng_id")
	private int changeId;
	
	@Column(name = "chng_nm")
	private String changeName;
	
	@Column(name = "chng_proc_txt")
	private String changeProcedure;
	
	@Column(name = "rlbk_proc_txt")
	private String rollbackProcedure;
	
	@Column(name = "chng_type_cd")
	private int changeTypeCode;
	
	@Column(name = "chng_type_othr_txt")
	private String changeTypeOther;
	
	@Column(name = "chng_loc_cd")
	private int locationCode;
	
	@Column(name = "eot_txt")
	private String evidenceOfText;
	
	@Column(name = "test_req_ind")
	private boolean testIndicator;
	
	@Column(name = "approval_ind")
	private boolean approvalIndicator;
	
	@Column(name = "impct_confg_id")
	private int impactConfigId;
	
	@Column(name = "impct_confg_othr_txt")
	private String impactConfigOtherText;
	
	@Column(name = "chng_stts_cd")
	private int changeStatusCode;
	
	@Column(name = "crtd_dt")
	private Date createdDate;
	
	@Column(name = "impl_dt")
	private Date implementedDate;
	
	@Column(name = "assgnd_role_cd")
	private int assignedRoleCode;

	@Column(name = "tstng_proc_txt")
	private String testingProcedure;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="chng_id")
	Set<ChangeResourceAction> changeActions = new HashSet<>();
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="changeRecord")
	Location location;
	
	public ChangeRecord() {

	}

	public ChangeRecord(
//			int changeId, 
			String changeName, String changeProcedure, String rollbackProcedure,
			int changeTypeCode, String changeTypeOther, int locationCode, String evidenceOfText, boolean testIndicator,
			boolean approvalIndicator, int impactConfigId, String impactConfigOtherText, int changeStatusCode,
			Date createdDate, Date implementedDate, int assignedRoleCode, String testingProcedure) {
		super();
//		this.changeId = changeId;
		this.changeName = changeName;
		this.changeProcedure = changeProcedure;
		this.rollbackProcedure = rollbackProcedure;
		this.changeTypeCode = changeTypeCode;
		this.changeTypeOther = changeTypeOther;
		this.locationCode = locationCode;
		this.evidenceOfText = evidenceOfText;
		this.testIndicator = testIndicator;
		this.approvalIndicator = approvalIndicator;
		this.impactConfigId = impactConfigId;
		this.impactConfigOtherText = impactConfigOtherText;
		this.changeStatusCode = changeStatusCode;
		this.createdDate = createdDate;
		this.implementedDate = implementedDate;
		this.assignedRoleCode = assignedRoleCode;
		this.testingProcedure = testingProcedure;
	}

	public Set<ChangeResourceAction> getChangeActions() {
		return changeActions;
	}

	public void setChangeActions(Set<ChangeResourceAction> changeActions) {
		this.changeActions = changeActions;
	}

	public int getChangeId() {
		return changeId;
	}

	public void setChangeId(int changeId) {
		this.changeId = changeId;
	}

	public String getChangeName() {
		return changeName;
	}

	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}

	public String getChangeProcedure() {
		return changeProcedure;
	}

	public void setChangeProcedure(String changeProcedure) {
		this.changeProcedure = changeProcedure;
	}

	public String getRollbackProcedure() {
		return rollbackProcedure;
	}

	public void setRollbackProcedure(String rollbackProcedure) {
		this.rollbackProcedure = rollbackProcedure;
	}

	public int getChangeTypeCode() {
		return changeTypeCode;
	}

	public void setChangeTypeCode(int changeTypeCode) {
		this.changeTypeCode = changeTypeCode;
	}

	public String getChangeTypeOther() {
		return changeTypeOther;
	}

	public void setChangeTypeOther(String changeTypeOther) {
		this.changeTypeOther = changeTypeOther;
	}

	public int getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(int locationCode) {
		this.locationCode = locationCode;
	}

	public String getEvidenceOfText() {
		return evidenceOfText;
	}

	public void setEvidenceOfText(String evidenceOfText) {
		this.evidenceOfText = evidenceOfText;
	}

	public boolean isTestIndicator() {
		return testIndicator;
	}

	public void setTestIndicator(boolean testIndicator) {
		this.testIndicator = testIndicator;
	}

	public boolean isApprovalIndicator() {
		return approvalIndicator;
	}

	public void setApprovalIndicator(boolean approvalIndicator) {
		this.approvalIndicator = approvalIndicator;
	}

	public int getImpactConfigId() {
		return impactConfigId;
	}

	public void setImpactConfigId(int impactConfigId) {
		this.impactConfigId = impactConfigId;
	}

	public String getImpactConfigOtherText() {
		return impactConfigOtherText;
	}

	public void setImpactConfigOtherText(String impactConfigOtherText) {
		this.impactConfigOtherText = impactConfigOtherText;
	}

	public int getChangeStatusCode() {
		return changeStatusCode;
	}

	public void setChangeStatusCode(int changeStatusCode) {
		this.changeStatusCode = changeStatusCode;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getImplementedDate() {
		return implementedDate;
	}

	public void setImplementedDate(Date implementedDate) {
		this.implementedDate = implementedDate;
	}

	public int getAssignedRoleCode() {
		return assignedRoleCode;
	}

	public void setAssignedRoleCode(int assignedRoleCode) {
		this.assignedRoleCode = assignedRoleCode;
	}

	public String getTestingProcedure() {
		return testingProcedure;
	}

	public void setTestingProcedure(String testingProcedure) {
		this.testingProcedure = testingProcedure;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "ChangeRecord [changeId=" + changeId + ", changeName=" + changeName + ", changeProcedure="
				+ changeProcedure + ", rollbackProcedure=" + rollbackProcedure + ", changeTypeCode=" + changeTypeCode
				+ ", changeTypeOther=" + changeTypeOther + ", locationCode=" + locationCode + ", evidenceOfText="
				+ evidenceOfText + ", testIndicator=" + testIndicator + ", approvalIndicator=" + approvalIndicator
				+ ", impactConfigId=" + impactConfigId + ", impactConfigOtherText=" + impactConfigOtherText
				+ ", changeStatusCode=" + changeStatusCode + ", createdDate=" + createdDate + ", implementedDate="
				+ implementedDate + ", assignedRoleCode=" + assignedRoleCode + ", testingProcedure=" + testingProcedure
				+ ", changeActions=" + changeActions + ", location=" + location + "]";
	}


}