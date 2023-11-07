package com.pkwebdeveloper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pkwebdeveloper.entity.Company;
import com.pkwebdeveloper.service.OpenFeignClientCompanyForFoodCompany;
import com.pkwebdeveloper.service.OpenFeignClientCompanyForLightCompany;
import com.pkwebdeveloper.service.OpenFeignClientCompanyForVehicleCompany;



@RestController
public class HeadController {

	
		@Autowired
		OpenFeignClientCompanyForVehicleCompany clientCompanyForVehicleCompany;
		
		@Autowired
		OpenFeignClientCompanyForFoodCompany clientCompanyForFoodCompany;
		
		@Autowired
		OpenFeignClientCompanyForLightCompany openFeignClientCompany;
			
		@Autowired
		RestTemplate restTemplate;
		
		/***************************use of the RestTemplate Class exchange method******************/
		
		@GetMapping("/light1")
		public Company returnLightCompanyObject1() {
			   	ResponseEntity<Company> lightcompany =	restTemplate.exchange("http://localhost:8171/lightcompany", HttpMethod.GET, null, Company.class);
			    return lightcompany.getBody();
		}
		
		@GetMapping("/food1")
		public Company returnFoodCompanyObject1() {
			   ResponseEntity<Company> entity = restTemplate.exchange("http://localhost:8172/foodcompany", HttpMethod.GET, null, Company.class);
			   return entity.getBody();
		}
		
		@GetMapping("/vehicle1")
		public Company returnVehicleCompanyObject1() {
			   ResponseEntity<Company> entity = restTemplate.exchange("http://localhost:8173/vehiclecompany", HttpMethod.GET, null, Company.class);
			   return entity.getBody();
		}
		
		/****************************Use of the RestTemplate class get,delete,put,post,etc method*************************/
		
		@GetMapping("/light2")
		public Company returnLightCompanyObject2() {
			
			   Company  company = restTemplate.getForObject("http://localhost:8171/lightcompany", Company.class);
			   return company;
		}
		
		@GetMapping("/food2")
		public Company returnFoodCompanyObject2() {
			
			   Company  company = restTemplate.getForObject("http://localhost:8172/foodcompany", Company.class);
			   return company;
		}
		
		@GetMapping("/vehicle2")
		public Company returnVehicleCompanyObject2() {
			
			   Company  company = restTemplate.getForObject("http://localhost:8173/vehiclecompany", Company.class);
			   return company;
		}
		
		/*************** use of the cloud Open Feign Dependency Concept******************/
		
		@GetMapping("/light3")
		public Company useOpenFeignClientConcept() {
			   Company company = openFeignClientCompany.getObjectByUsingOpenFeignClientCloud();
			   return company;
		}
		
		@GetMapping("/food3")
		public Company useOpenFeignClientConceptForGetFoodCompanyObject() {
			   Company company =  clientCompanyForFoodCompany.getFoodCompanyObjectByUsingOpenFeignClientCloud();
			   return company;
			   
		}
		
		@GetMapping("/vehicle3")
		public Company returnVehicleClassObjectByUsingVehicleConcept() {
			   Company company = clientCompanyForVehicleCompany.getVehicleObjectByUsingOpenFeignClientConcept();
			   return company;
		}
}
