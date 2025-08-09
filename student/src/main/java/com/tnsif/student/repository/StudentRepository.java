package com.tnsif.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	
}
