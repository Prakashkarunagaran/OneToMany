package com.springboot.examples.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "chng_stts")
@NamedQuery(name = "ChangeStatus.findAll", query="select cs from ChangeStatus cs order by cs.changeStatusCode")
public class ChangeStatus  implements Serializable{
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@Column(name="chng_stts_cd")
	private int changeStatusCode;
	
	@Column(name="chng_stts_nm")
	private String changeStatusName;
	
	
}
