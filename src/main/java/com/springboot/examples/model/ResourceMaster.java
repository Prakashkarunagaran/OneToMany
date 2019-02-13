package com.springboot.examples.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "res_mstr")
public class ResourceMaster implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@Column(name = "res_id")
	private int resourceId;
	
	@Column(name = "res_frst_nm")
	private String firstName;
	
	@Column(name = "res_mid_nm")
	private String middleName;
	
	@Column(name = "res_lst_nm")
	private String lastName;
	
	@Column(name = "res_alias_nm")
	private String alias;
	
	@Column(name = "res_emp_num")
	private String employeeNo;
	
	@Column(name = "res_loc_cd")
	private int locationCode;
	
	@Column(name = "res_role_cd")
	private int roleCode;

	@Column(name = "htc_mail_addr")
	private String htcMailAddress;
	
	@Column(name = "sf_mail_addr")
	private String sfMailAddress;
	
}