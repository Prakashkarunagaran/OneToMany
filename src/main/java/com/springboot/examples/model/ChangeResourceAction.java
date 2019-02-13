package com.springboot.examples.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "chng_res_actn")
public class ChangeResourceAction{
	@EmbeddedId
	private ChangeResourceActionId changeResourceActionId;
		
	@ManyToOne
	@MapsId("changeId")
	@JoinColumn(name="chng_id")
	ChangeRecord changeRecord;
	
	
	@Column(name="chng_actn_res_id")
	private int changeActionResId;

	@Column(name = "rvwr_cmnt_txt")
	private String reviewerComment;
	
	@Column(name = "apprvr_cmnt_txt")
	private String approverComment;
	
	@Column(name = "closr_cmnt_txt")
	private String closureComment;

	@Column(name = "tstng_cmnt_txt")
	private String testingResult;
	
	

	public ChangeResourceAction() {
		
	}

	public ChangeResourceAction(ChangeResourceActionId changeResourceActionId, int changeActionResId,
			String reviewerComment, String approverComment, String closureComment, String testingResult) {
		super();
		this.changeResourceActionId = changeResourceActionId;
		this.changeActionResId = changeActionResId;
		this.reviewerComment = reviewerComment;
		this.approverComment = approverComment;
		this.closureComment = closureComment;
		this.testingResult = testingResult;
	}

	public ChangeResourceActionId getChangeResourceActionId() {
		return changeResourceActionId;
	}

	public void setChangeResourceActionId(ChangeResourceActionId changeResourceActionId) {
		this.changeResourceActionId = changeResourceActionId;
	}

	public int getChangeActionResId() {
		return changeActionResId;
	}

	public void setChangeActionResId(int changeActionResId) {
		this.changeActionResId = changeActionResId;
	}

	public String getReviewerComment() {
		return reviewerComment;
	}

	public void setReviewerComment(String reviewerComment) {
		this.reviewerComment = reviewerComment;
	}

	public String getApproverComment() {
		return approverComment;
	}

	public void setApproverComment(String approverComment) {
		this.approverComment = approverComment;
	}

	public String getClosureComment() {
		return closureComment;
	}

	public void setClosureComment(String closureComment) {
		this.closureComment = closureComment;
	}

	public String getTestingResult() {
		return testingResult;
	}

	public void setTestingResult(String testingResult) {
		this.testingResult = testingResult;
	}

	public ChangeRecord getChangeRecord() {
		return changeRecord;
	}

	public void setChangeRecord(ChangeRecord changeRecord) {
		this.changeRecord = changeRecord;
	}

	@Override
	public String toString() {
		return "ChangeResourceAction [changeResourceActionId=" + changeResourceActionId + ", changeActionResId="
				+ changeActionResId + ", reviewerComment=" + reviewerComment + ", approverComment=" + approverComment
				+ ", closureComment=" + closureComment + ", testingResult=" + testingResult + "]";
	}

	
}