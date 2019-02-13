package com.springboot.examples.to;

import java.util.Date;

public class ChangeRecordTo {
	
		private long changeId;
		private String changeName;
		private String changeTypeName;
		private String locationName;
		private boolean testIndicator;
		private boolean approvalIndicator;
		private String configItemName;
		private String changeStatusName;
		private Date createdDate;
		private Date implementedDate;		
		private String roleName;
		private int roleCode;
		
		private String createrName;
		private String reviewerName;

		public ChangeRecordTo(long changeId, String changeName, String changeTypeName, String locationName,
				boolean testIndicator, boolean approvalIndicator, String configItemName,String changeStatusName, Date createdDate,
				Date implementedDate,  String roleName , int roleCode) {
			super();
			this.changeId = changeId;
			this.changeName = changeName;
			this.changeTypeName = changeTypeName;
			this.locationName = locationName;
			this.testIndicator = testIndicator;
			this.approvalIndicator = approvalIndicator;
			this.configItemName = configItemName;
			this.createdDate = createdDate;
			this.implementedDate = implementedDate;
			this.changeStatusName = changeStatusName;
			this.roleName = roleName;
			this.roleCode = roleCode;
		}

}
