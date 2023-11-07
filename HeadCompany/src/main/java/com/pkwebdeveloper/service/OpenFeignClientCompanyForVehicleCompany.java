package com.pkwebdeveloper.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.pkwebdeveloper.entity.Company;

@FeignClient(url="http://localhost:8173", value="VehicleCompany")
public interface OpenFeignClientCompanyForVehicleCompany {

		  @GetMapping("/vehiclecompany")
		  public Company getVehicleObjectByUsingOpenFeignClientConcept();
}
