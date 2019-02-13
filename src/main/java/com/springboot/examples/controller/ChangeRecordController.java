package com.springboot.examples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.examples.model.ChangeRecord;
import com.springboot.examples.service.ChangeService;

@Controller
public class ChangeRecordController {
	@Autowired
	ChangeService changeService;
	
//	@GetMapping(value="/save")
//	public String save() {
//		boolean result = changeService.save();
//		return "psuccess";
//	}
	
	@GetMapping(value="/savenew")
	public String savenew() {
		boolean result = changeService.savenew();
		return "psuccess";
	}
	
	@GetMapping(value="/fetch")
	public String fetch(@RequestParam(name="changeId") int changeId) {
		changeService.getReviewerComment(changeId);
		return "psuccess";
	}
	@GetMapping(value="/fetchLocation")
	public String fetchLocation(@RequestParam(name="changeId") int changeId) {
		changeService.fetchLocation(changeId);
		return "psuccess";
	}
	
	@GetMapping(value="/update")
	public String update(@RequestParam(name="changeId") int changeId) {
		ChangeRecord changeRecord = new ChangeRecord();
		changeRecord.setChangeId(changeId);
		changeService.update(changeRecord);
		return "psuccess";
	}
}