package com.springboot.examples.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.examples.model.MailConfig;

@Repository
public interface MailConfigRepository extends CrudRepository<MailConfig, Long> {
	@Query("SELECT mc.toAddress FROM MailConfig mc WHERE mc.mailTemplateName = ?1")
	String getToAddress(String templateName);
	
	@Query("SELECT mc.ccAddress FROM MailConfig mc WHERE mc.mailTemplateName = ?1")
	String getCcAddress(String templateName);
	
	@Query("SELECT mc.bccAddress FROM MailConfig mc WHERE mc.mailTemplateName = ?1")
	String getBccAddress(String templateName);
}
