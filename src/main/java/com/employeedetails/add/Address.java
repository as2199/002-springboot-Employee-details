package com.employeedetails.add;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.employeedetails.emp.Employee;

@Component("add")
public class Address {
	
	@Value("Mancherial")
	private String vname;
	@Value("Hyderabad")
	private String city;
	
	@Autowired
	private Employee employee;

	@Override
	public String toString() {
		return "Address [vname=" + vname + ", city=" + city + ", employee=" + employee + "]";
	}
	
		

}
