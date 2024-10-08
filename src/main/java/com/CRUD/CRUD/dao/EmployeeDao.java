package com.CRUD.CRUD.dao;

import java.util.List;

import com.CRUD.CRUD.model.Employee;

public interface EmployeeDao {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);

}
