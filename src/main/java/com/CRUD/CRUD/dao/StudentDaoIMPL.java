package com.CRUD.CRUD.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CRUD.CRUD.model.Student;

import jakarta.persistence.EntityManager;


@Repository
public class StudentDaoIMPL implements StudentDao {
	
	@Autowired
	private EntityManager entityManager;
	
	public List<Student>get(){
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Student>query=currentSession.createQuery("from Student",Student.class);
		List<Student>list=query.getResultList();
		return list;
	}
	
	public Student get(int id) {
		Session currentSession=entityManager.unwrap(Session.class);
		Student studentobj= currentSession.get(Student.class,id);
		return studentobj;
	}

	@SuppressWarnings("deprecation")
	public void save(Student student) {
		Session currentSession=entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(student);
	}

	@SuppressWarnings("deprecation")
	public void delete(int id) {
		Session currentSession=entityManager.unwrap(Session.class);
		Student studentobj= currentSession.get(Student.class,id);
		currentSession.delete(studentobj);
	}

}
