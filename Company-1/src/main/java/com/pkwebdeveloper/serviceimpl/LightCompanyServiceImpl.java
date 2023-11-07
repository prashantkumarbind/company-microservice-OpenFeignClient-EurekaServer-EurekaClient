package com.pkwebdeveloper.serviceimpl;

import org.springframework.stereotype.Component;

import com.pkwebdeveloper.entity.LightCompany;
import com.pkwebdeveloper.service.LightCompanyService;

@Component
public class LightCompanyServiceImpl implements LightCompanyService{

	@Override
	public LightCompany getLightCompanyObject() {
		   LightCompany light = new LightCompany();
		   return light;
	}

		
}
