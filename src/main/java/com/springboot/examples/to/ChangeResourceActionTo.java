package com.springboot.examples.to;

import java.sql.Timestamp;
import java.util.Date;

public class ChangeResourceActionTo {
	
	private int changeId;
	private String changeActionName;
	private String firstName;
	private String middleName;
	private String lastName;
	private Date changeActionDate;
	private String reviewerComment;
	private String approverComment;
	private String closureComment;
	private String comment;
	private int changeActionCode;
	
	public ChangeResourceActionTo(int changeId, String changeActionName, String firstName, String middleName, String lastName,Date changeActionDate,
			String reviewerComment, String approverComment, String closureComment , int changeActionCode) {
		super();
		this.changeId = changeId;
		this.changeActionName = changeActionName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.changeActionDate = (Timestamp) changeActionDate;
		this.reviewerComment = reviewerComment;
		this.approverComment = approverComment;
		this.closureComment = closureComment;
		this.changeActionCode = changeActionCode;
	}
	
	public ChangeResourceActionTo(int changeId, Date changeActionDate, String comment) {
		super();
		this.changeId = changeId;
		this.changeActionDate = (Timestamp) changeActionDate;
		this.comment = comment;
	}
		
}
