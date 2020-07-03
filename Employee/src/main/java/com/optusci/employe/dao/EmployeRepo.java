package com.optusci.employe.dao;

import org.springframework.data.repository.CrudRepository;

import com.optusci.employe.model.EmpModel;

public interface EmployeRepo extends CrudRepository<EmpModel, Integer>{
	

}
