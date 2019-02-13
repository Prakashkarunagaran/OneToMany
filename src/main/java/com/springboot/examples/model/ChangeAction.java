package com.springboot.examples.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chng_actn")
public class ChangeAction  implements Serializable{
																						
	private static final long serialVersionUID = -8604179817870356817L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="chng_actn_cd")
	private int changeActionCode;
	
	@Column(name="chng_actn_nm")
	private String changeActionName;

	@Column(name="chng_role_cd")
	private int changeRoleCode;
	
	
	
}