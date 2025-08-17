package com.tnsif.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "rollnumber")
	private String rollNumber;
	@Column(name = "department")
	private String department;
	@Column(name = "email")
	private String email;
	@Column(name = "year")
	private int year;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNumber=" + rollNumber + ", department=" + department
				+ ", email=" + email + ", year=" + year + "]";
	}
	public void setName(String name) {
		this.name=name;
		
	}
	
	
}
