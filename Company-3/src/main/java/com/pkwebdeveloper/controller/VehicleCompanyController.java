package com.pkwebdeveloper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pkwebdeveloper.entity.VehicleCompany;
import com.pkwebdeveloper.service.VehicleCompanyService;


@RestController
public class VehicleCompanyController {

	@Autowired
	VehicleCompanyService companyService;
	
	
		@GetMapping("/vehiclecompany")
		public VehicleCompany getVehicleCompanyObject() {
			   return companyService.getVehicleCompanyObject();
		}
}
