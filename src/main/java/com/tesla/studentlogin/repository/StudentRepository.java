package com.tesla.studentlogin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tesla.studentlogin.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
