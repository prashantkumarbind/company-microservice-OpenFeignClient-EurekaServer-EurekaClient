package com.pkwebdeveloper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pkwebdeveloper.entity.FoodCompany;
import com.pkwebdeveloper.service.FoodCompanyService;

@RestController
public class FoodCompanyController {

	@Autowired
	FoodCompanyService companyService;
	
		     
		@GetMapping("/foodcompany")
		public FoodCompany getObject() {
			   
			   return companyService.getFoodCompanyObject();
			 
		}
}
