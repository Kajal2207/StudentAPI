package com.example.StudentProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentProject.entity.Student;
import com.example.StudentProject.service.StudentServices;

@RestController
public class StudentController {

	@Autowired
	StudentServices studentService;

	
	@PostMapping("/students")
	public boolean saveStudent(@RequestBody Student student) {
		boolean studentSave = studentService.saveStudent(student);
		return studentSave;
	}

	@GetMapping("/getAllStudent")
	public List<Student> getAllStudent() {
		List<Student> allStudent = studentService.getAllStudent();
		return allStudent;
	}
	@DeleteMapping("/studentDelete/{id}")
	public String studentDelete(@PathVariable String id) {
		String studentDelete = studentService.studentDelete(id);
		return studentDelete;
		
	}
	
	
	@PutMapping("/studentUpdate")
	public String studentUpdate(@RequestBody Student student) {
		String studentUpdate = studentService.studentUpdate(student);
		return studentUpdate;
		
	}
	

}
