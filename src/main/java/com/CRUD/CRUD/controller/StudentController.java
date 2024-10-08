package com.CRUD.CRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.CRUD.CRUD.model.Student;
import com.CRUD.CRUD.service.StudentService;
@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@GetMapping("/student")
	public List<Student>get(){
		return studentService.get();
	}
	@PostMapping("/student")
	public Student save(@RequestBody Student studentObj) {
		studentService.save(studentObj);
		return studentObj;
	}
	@GetMapping("/student/{id}")
	public Student get(@PathVariable int id) {
		Student studentObj=studentService.get(id);
		if(studentObj==null) {
			throw new RuntimeException("Student with id: "+id+" is not found");
		}
		return studentObj;
	}
	@DeleteMapping("/student/{id}")
	public String delete(@PathVariable int id) {
		studentService.delete(id);
		return "Student has been deleted with id: "+id;
	}
	@PutMapping("/student")
	public Student update(@RequestBody Student studentObj) {
		studentService.save(studentObj);
		return studentObj;
	}
}