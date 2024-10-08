package com.CRUD.CRUD.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.CRUD.CRUD.dao.EmployeeDao;
import com.CRUD.CRUD.model.Employee;
@Service
public class EmployeeServiceIMPL implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	@Transactional
	@Override
	public List<Employee> get() {
		return employeeDao.get();
	}
	@Transactional
	@Override
	public Employee get(int id) {
		return employeeDao.get(id);
	}
	@Transactional
	@Override
	public void save(Employee employee) {
		employeeDao.save(employee);
	}
	@Transactional
	@Override
	public void delete(int id) {
		employeeDao.delete(id);
	}
}
