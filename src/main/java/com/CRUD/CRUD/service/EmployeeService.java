package com.CRUD.CRUD.service;

import java.util.List;

import com.CRUD.CRUD.model.Employee;

public interface EmployeeService {
	List<Employee> get();
	Employee get(int id);
	void save(Employee employee);
	void delete(int id);
}
