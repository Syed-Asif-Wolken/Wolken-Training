package com.wolken.bank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
			
	@GetMapping("get-debit")
	String getDebit() {
		log.info("getDebit() is called");
		return "Debit Data";
	}
	
	@GetMapping("get-credit")
	String getCredit() {
		log.info("getCredit() is called");
		return "Credit Data";
	}
	
	@GetMapping("get-current")
	String getCurrent() {
		log.info("getCurrent() is called");
		return "Current Data";
	}
	
	@GetMapping("get-savings")
	String getSavings() {
		log.info("getSavings() is called");
		return "Savings Data";
	}
}
