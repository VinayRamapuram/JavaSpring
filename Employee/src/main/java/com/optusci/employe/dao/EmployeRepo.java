package com.optusci.employe.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.optusci.employe.model.EmpModel;

public interface EmployeRepo extends CrudRepository<EmpModel, Integer>{
	
	List<EmpModel> findByName(String name);	
	
	List<EmpModel> findByDepartment(String name);	
	
	@Query("from EmpModel where department=?1 order by name")
	List<EmpModel> findByDepartmentSorted(String name);

}
