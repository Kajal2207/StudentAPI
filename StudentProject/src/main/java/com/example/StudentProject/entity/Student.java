package com.example.StudentProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Student {
	

	    @Id
	    String stud_id;

	    @Column(name = "stud_name")
	    String stud_name;

	    @Column(name = "stud_age")
	    String stud_age;

	    @Column(name = "stud_class")
	    String stud_class;

	    
	    public Student() {
	    }


		@Override
		public String toString() {
			return "Students [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_age=" + stud_age
					+ ", stud_class=" + stud_class + "]";
		}


		public Student(String stud_id, String stud_name, String stud_age, String stud_class) {
			super();
			this.stud_id = stud_id;
			this.stud_name = stud_name;
			this.stud_age = stud_age;
			this.stud_class = stud_class;
		}


		public String getStud_id() {
			return stud_id;
		}


		public void setStud_id(String stud_id) {
			this.stud_id = stud_id;
		}


		public String getStud_name() {
			return stud_name;
		}


		public void setStud_name(String stud_name) {
			this.stud_name = stud_name;
		}


		public String getStud_age() {
			return stud_age;
		}


		public void setStud_age(String stud_age) {
			this.stud_age = stud_age;
		}


		public String getStud_class() {
			return stud_class;
		}


		public void setStud_class(String stud_class) {
			this.stud_class = stud_class;
		}

	    

	}	


