package com.pkwebdeveloper.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.pkwebdeveloper.entity.Company;

@FeignClient(url="http://localhost:8172", value="FoodCompany")
public interface OpenFeignClientCompanyForFoodCompany {

	
		@GetMapping("/foodcompany")
		public Company getFoodCompanyObjectByUsingOpenFeignClientCloud();
}
