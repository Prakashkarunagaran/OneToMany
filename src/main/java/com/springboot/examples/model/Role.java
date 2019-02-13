package com.springboot.examples.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@Column(name = "role_cd")
	private long roleId;
	
	@Column(name = "role_nm")
	private String roleName;
	
}
