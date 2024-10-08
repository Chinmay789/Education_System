package com.CRUD.CRUD.service;

import java.util.List;
import com.CRUD.CRUD.model.Student;

public interface StudentService {
	List<Student> get();
	Student get(int id);
	void save(Student student);
	void delete(int id);
}
