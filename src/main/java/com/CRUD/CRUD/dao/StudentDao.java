package com.CRUD.CRUD.dao;

import java.util.List;

import com.CRUD.CRUD.model.Student;

public interface StudentDao {

	List<Student> get();
	
	Student get(int id);

	void save(Student student);

	void delete(int id);

}
