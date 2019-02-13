package com.springboot.examples.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "config_item")
public class ConfigItem implements Serializable{
	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@Column(name = "ci_id")
	private int configItemId;
	
	@Column(name = "ci_nm")
	private String configItemName;
	
}
