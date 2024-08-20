package com.tesla.studentlogin.service;

import com.tesla.studentlogin.model.Student;

public interface Studentservice {

	public String savestudent(Student s);

	public Student getStudentData(int id);

}
