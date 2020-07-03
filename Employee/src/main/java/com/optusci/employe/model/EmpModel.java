package com.optusci.employe.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmpModel {
	@Id
	private int empId;
	private String name;
	private String department;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	@Override
	public String toString() {
		return "EmpModel [empId=" + empId + ", name=" + name + ", department=" + department + "]";
	}
	

}
