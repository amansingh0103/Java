package com.Hibernet.Dams;

import com.maven.Hibernetwithmaven.dao.StudentDao;
import com.maven.Hibernetwithmaven.model.Student;

public class App {

	public static void main(String[] args) {
	      StudentDao studentDao = new StudentDao();   
	       
	        //insert values
	        Student student = new Student(1, "Suraj", "Suryawanshi", "surajs@gmail.com");
	        Student student1 = new Student(2, "Priya", "Sharma", "priyas@gmail.com");
	        Student student2 = new Student(3,"Vinayak", "Suryawanshi", "vinayaks@gmail.com");
	       
	        //save values
	        studentDao.saveStudent(student);
	        studentDao.saveStudent(student1);
	        studentDao.saveStudent(student2);
	       
	       
	        studentDao.getStudent(1);
	        studentDao.loadStudent(2);
	        studentDao.getStudentById(3);
	}
}

	


