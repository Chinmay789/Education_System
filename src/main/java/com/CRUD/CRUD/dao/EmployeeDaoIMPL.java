package com.CRUD.CRUD.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CRUD.CRUD.model.Employee;

import jakarta.persistence.EntityManager;


@Repository
public class EmployeeDaoIMPL implements EmployeeDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> get() {
		Session currentSession= entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		Session currentSession= entityManager.unwrap(Session.class);
		Employee employeeObj= currentSession.get(Employee.class,id);
		return employeeObj;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void save(Employee employee) {
		Session currentSession=entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(employee);
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void delete(int id) {
			Session currentSession=entityManager.unwrap(Session.class);
			Employee employeeObj= currentSession.get(Employee.class,id);
			currentSession.delete(employeeObj);
	}

}
