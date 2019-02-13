package com.springboot.examples.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mail_confg")
public class MailConfig  implements Serializable{
	private static final long serialVersionUID = 6705912821070629822L;
	@Id
	@Column(name="mail_tmplt_nm")
	private String mailTemplateName;

	@Column(name="to_addr")
	private String toAddress;
	
	@Column(name="cc_addr")
	private String ccAddress;
	
	@Column(name="bcc_addr")
	private String bccAddress;
	
}
