package com.employeedetails.emp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	@Value("7004")
	private Integer id;
	@Value("Archita")
	private String ename;
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + "]";
	}
	
	
	

}
