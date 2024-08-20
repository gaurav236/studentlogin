package com.tesla.studentlogin.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tesla.studentlogin.model.Student;
import com.tesla.studentlogin.repository.StudentRepository;
import com.tesla.studentlogin.service.Studentservice;

@Service
public class Studentserviceimpl implements Studentservice {
	@Autowired
	StudentRepository sd;

	@Override
	public String savestudent(Student s) {
		Student msg = sd.save(s);
		return "Student data added";
	}

	@Override
	public Student getStudentData(int id) {
		Optional<Student> s = sd.findById(id);
		Student st = s.get();
		return st;
	}

	@Override
	public List<Student> getlist() {
		List<Student> l = (List<Student>) sd.findAll();
		return l;
	}

}
