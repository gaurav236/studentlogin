package com.tesla.studentlogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tesla.studentlogin.model.Student;
import com.tesla.studentlogin.service.Studentservice;

@RestController
public class Studentcontroller<id> {
	@Autowired
	Studentservice st;

	@PostMapping(value = "/stu")
	public String saveData(@RequestBody Student s) {
		if (s == null) {
			return "please send valid data";
		} else {
			String msg = st.savestudent(s);
			return msg;
		}

	}

	@GetMapping(value = "/stu/{id}")
	public Student getStudent(@PathVariable int id) {
		Student s = st.getStudentData(id);
		return s;

	}

	@GetMapping(value = "stul")
	public List<Student> getStudentslist() {
		List<Student> ls = st.getlist();
		return ls;

	}
}
