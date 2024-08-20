package com.tesla.studentlogin.service;

import java.util.List;

import com.tesla.studentlogin.model.Student;

public interface Studentservice {

	public String savestudent(Student s);

	public Student getStudentData(int id);

	public List<Student> getlist();

}
