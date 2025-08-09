package com.tnsif.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.student.entity.Student;
import com.tnsif.student.repository.StudentRepository;

@Service
public class StudentService {
		@Autowired
		private StudentRepository repo;

		public List<Student>listAll(){
			return repo.findAll();
		}

		public void save(Student s) {
			repo.save(s);
		}
		public Student  get(Integer id) {
			return repo.findById(id).get();
		}
		public void  delete(Integer id) {
			repo.deleteById(id);
		}
		public void update(Student s) {
			repo.save(s);
		}
}
