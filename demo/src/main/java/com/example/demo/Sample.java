package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Sample {
	private int salary;
	private String name;
	private String department;
	@Autowired
//	@Qualifier("lap")
	private Laptop laptop;
	
	public Sample() {
		super();
		System.out.println("Obj Created");
	}
	
	public int getSalary() {
		return salary;
	}	

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void show() {
		System.out.println("Showing.........");
		laptop.compile();
	}

}
