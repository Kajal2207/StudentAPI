package com.example.StudentProject.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.StudentProject.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory sessionFactory;

	public boolean saveStudent(Student student) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		boolean add = false;
		if (student != null) {
			System.out.println(student);
			session.save(student);
			transaction.commit();
			add = true;
			session.close();
		}
		return add;
	}

	public List<Student> getAllStudent() {
		Session session = sessionFactory.openSession();
		List listStudent = session.createCriteria(Student.class).list();
		return listStudent;
	}

	public String studentDelete(String id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Student student = session.get(Student.class, id);
		session.delete(student);
		transaction.commit();
		session.close();
		return "Student Deleted";
	}

	public String studentUpdate(Student student) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(student);
		transaction.commit();
		session.close();

		return "Student Updated";

	}

}
