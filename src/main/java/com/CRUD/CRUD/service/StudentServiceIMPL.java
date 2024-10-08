package com.CRUD.CRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRUD.CRUD.dao.StudentDao;
import com.CRUD.CRUD.model.Student;

import jakarta.transaction.Transactional;

@Service
public class StudentServiceIMPL implements StudentService{
	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	@Override
	public List<Student> get(){
		return studentDao.get();
	}
	@Transactional
	@Override
	public Student get(int id) {
		return studentDao.get(id);
	}
	@Transactional
	@Override
	public void save(Student student) {
		 studentDao.save(student);
	}
	@Transactional
	@Override
	public void delete(int id) {
		studentDao.delete(id);
	}
}

