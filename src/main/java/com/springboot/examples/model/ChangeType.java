package com.springboot.examples.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chng_type")
public class ChangeType implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@Column(name = "chng_type_cd")
	private int changeTypeCode;
	
	@Column(name = "chng_type_nm")
	private String changeTypeName;
	
}
