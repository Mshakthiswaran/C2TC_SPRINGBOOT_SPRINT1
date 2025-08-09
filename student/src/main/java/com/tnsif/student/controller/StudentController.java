package com.tnsif.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.student.entity.Student;
import com.tnsif.student.service.StudentService;

import jakarta.persistence.NoResultException;

@RestController
public class StudentController {
	@Autowired
	private StudentService s;
	@GetMapping("/StudentService")
	public List<Student> list(){
		return s.listAll();
	}
	@PostMapping("/StudentService")
	public void add(@RequestBody Student s1) {
		s.save(s1);
	}
	
	@GetMapping("/StudentService/{id}")
	public ResponseEntity<Student> get(@PathVariable Integer id){
		try {
			Student s2 = s.get(id);
			return new ResponseEntity<Student>(s2,HttpStatus.OK);
		}catch(NoResultException e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/StudentService/{id}")
	public void delete(@PathVariable Integer id) {
		s.delete(id);
	}
	
	@PutMapping("/StudentService/{id}")
	public ResponseEntity<Student> update(@PathVariable Integer id,@RequestBody Student update){
		try {
			Student exist = s.get(id);
			exist.setName(update.getName());
			exist.setDepartment(update.getDepartment());
			exist.setEmail(update.getEmail());
			exist.setRollNumber(update.getRollNumber());
			exist.setYear(update.getYear());
			s.update(exist);
			return new ResponseEntity<Student>(exist,HttpStatus.OK);
		}catch(NoResultException e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	
}
