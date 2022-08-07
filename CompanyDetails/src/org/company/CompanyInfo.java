package org.company;

public class CompanyInfo {
	private void companyName() {
		
System.out.println("Company Name: Zoho");
	}
	private void companyId() {
		
		System.out.println("Company ID: 123");
	}
	private void companyAddress() {
		System.out.println("Company Address: Chennai");	

	}
	public static void main(String[] args) {
		
		CompanyInfo com = new CompanyInfo();
		com.companyName();
		com.companyId();
		com.companyAddress();
	}
}
