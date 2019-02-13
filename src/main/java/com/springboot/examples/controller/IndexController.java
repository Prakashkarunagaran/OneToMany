package com.springboot.examples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.examples.service.CustomerService;
@Controller
public class IndexController {
	@Autowired
	CustomerService customerService;
//	@Autowired
//	PurchaseService purchaseService;
	
	/*
	 * @GetMapping(value="/purchaseOrder") public String purchaseOrder(Model model)
	 * {
	 * 
	 * //make a purchase order.. Actually you have to take input from UI in a Master
	 * detail form. // Sent everything as json and capture in controller.
	 * 
	 * PurchaseOrder purchaseOrder = new PurchaseOrder(1001, new Date(), 4567);
	 * 
	 * OrderItem item1= new OrderItem(new OrderItemId(1001, 1), 2, 40.00); OrderItem
	 * item2= new OrderItem(new OrderItemId(1001, 2), 5, 6.00); OrderItem item3= new
	 * OrderItem(new OrderItemId(1001, 3), 12, 50.00);
	 * 
	 * //set both side of the relation. item1.setPurchaseOrder(purchaseOrder);
	 * item2.setPurchaseOrder(purchaseOrder); item3.setPurchaseOrder(purchaseOrder);
	 * 
	 * purchaseOrder.getItems().add(item1); purchaseOrder.getItems().add(item2);
	 * purchaseOrder.getItems().add(item3);
	 * 
	 * boolean result = purchaseService.makePurchaseOrder(purchaseOrder); if(result)
	 * model.addAttribute("msg", "Purchase order make successfull"); else
	 * model.addAttribute("msg", "Error occured"); return "psuccess"; }
	 */
	
	
	
	
//	@GetMapping(value="/save")
//	public String save() {
//		//make a purchase order..   Actually you have to take input from UI in a Master detail form.
//									// Sent everything as json and capture in controller.
//		boolean result = purchaseService.save();
//
//		return "psuccess";
//	}
//	
//	@GetMapping(value="/savenew")
//	public String savenew() {
//		boolean result = purchaseService.savenew();
//		return "psuccess";
//	}
//	
//	@GetMapping(value="/update")
//	public String update(PolicyTO policyTO) {
//		ChangeRecord changeRecord = new ChangeRecord();
//		changeRecord.setChangeId(1);
//		purchaseService.update(changeRecord);
//		return "psuccess";
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping(value="/savecr")
	public String index() {
		
		

//		consumes="application/json", produces="application/json"
//			System.out.println( "-->"+customerService.saveChangeRecord());
//			System.out.println( "-->"+customerService.saveChangeRecordAction());
		
		return "index";
	}
	@GetMapping(value="/")
	public String index1() {
		
		

//		consumes="application/json", produces="application/json"
//			System.out.println( "-->"+customerService.saveChangeRecord());
//			System.out.println( "-->"+customerService.saveChangeRecordAction());
		
		return "index";
	}
}
