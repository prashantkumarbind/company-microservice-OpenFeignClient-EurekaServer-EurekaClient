package com.pkwebdeveloper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pkwebdeveloper.entity.LightCompany;
import com.pkwebdeveloper.service.LightCompanyService;

@RestController
public class LightCompanyController {

	@Autowired
	LightCompanyService companyService;
	
	
	@GetMapping("/lightcompany")
	public LightCompany getObject() {
		   return companyService.getLightCompanyObject();
	}
}
