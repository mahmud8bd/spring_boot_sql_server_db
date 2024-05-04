package com.sazzad.sqlserver.service;

import java.util.List;
import java.util.Optional;

import com.sazzad.sqlserver.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Optional<Student> getStudentById(Long id);
	Student createOrUpdateStudent(Student student);
	void deleteStudentById(Long id);
}
