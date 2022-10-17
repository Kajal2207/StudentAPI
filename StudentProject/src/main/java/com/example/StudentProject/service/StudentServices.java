package com.example.StudentProject.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentProject.dao.StudentDao;
import com.example.StudentProject.entity.Student;

@Service
public class StudentServices {
	
	 @Autowired
	    StudentDao studentDao;

	    

	    	    public List<Student> getAllStudent() {
			List<Student> allStudent = studentDao.getAllStudent();
			return allStudent;
	    }

	    
	    public  boolean  saveStudent(Student student) {
	    			boolean saveStudent = studentDao.saveStudent(student);
	    			return saveStudent;
	    }
	    
	    
	    public String studentDelete(String id) {
			String studentDelete = studentDao.studentDelete(id);
			return studentDelete;
	    }
	

		public String studentUpdate(Student student) {
			String studentUpdate = studentDao.studentUpdate(student);
			return studentUpdate;
		}

}
