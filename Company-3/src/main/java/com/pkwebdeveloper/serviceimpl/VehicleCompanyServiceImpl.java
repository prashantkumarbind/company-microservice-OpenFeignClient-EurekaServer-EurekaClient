package com.pkwebdeveloper.serviceimpl;

import org.springframework.stereotype.Controller;

import com.pkwebdeveloper.entity.VehicleCompany;
import com.pkwebdeveloper.service.VehicleCompanyService;


@Controller
public class VehicleCompanyServiceImpl implements VehicleCompanyService{

	@Override
	public VehicleCompany getVehicleCompanyObject() {
		   VehicleCompany ob1 = new VehicleCompany();
		return ob1;
	}

		
}
