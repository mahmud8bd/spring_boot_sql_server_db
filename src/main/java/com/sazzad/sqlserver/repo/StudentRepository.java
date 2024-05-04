package com.sazzad.sqlserver.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sazzad.sqlserver.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
