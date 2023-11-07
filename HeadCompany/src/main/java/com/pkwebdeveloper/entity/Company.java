package com.pkwebdeveloper.entity;

import org.springframework.beans.factory.annotation.Value;

public class Company {

	
	private String companyName;	
	private String companyAddress;	
	private int companyRegistrationNo;	
	private String companyfManager;	
	private String companyWork;
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public int getCompanyRegistrationNo() {
		return companyRegistrationNo;
	}
	public void setCompanyRegistrationNo(int companyRegistrationNo) {
		this.companyRegistrationNo = companyRegistrationNo;
	}
	public String getCompanyfManager() {
		return companyfManager;
	}
	public void setCompanyfManager(String companyfManager) {
		this.companyfManager = companyfManager;
	}
	public String getCompanyWork() {
		return companyWork;
	}
	public void setCompanyWork(String companyWork) {
		this.companyWork = companyWork;
	}
	
	
}
