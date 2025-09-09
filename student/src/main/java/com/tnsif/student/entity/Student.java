package com.tnsif.student.entity;

// Importing JPA annotations for mapping this class with database table
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Marks this class as an Entity, meaning Hibernate/JPA will map it to a database table
@Entity
public class Student {
	
	// @Id specifies the primary key column of the table
	@Id
	@Column(name = "id") // maps this field to 'id' column in the database
	private int id;
	
	@Column(name = "name") // maps this field to 'name' column in the database
	private String name;
	
	@Column(name = "rollnumber") // maps this field to 'rollnumber' column in the database
	private String rollNumber;
	
	@Column(name = "department") // maps this field to 'department' column in the database
	private String department;
	
	@Column(name = "email") // maps this field to 'email' column in the database
	private String email;
	
	@Column(name = "year") // maps this field to 'year' column in the database
	private int year;
	
	// Default constructor (required by JPA)
	public Student() {
		super();
	}
	
	// Getters and Setters (used for accessing and modifying private fields)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {  // Setter for 'name'
		this.name = name;
	}
	
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
	
	// toString() is overridden to display student details in readable format
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNumber=" + rollNumber 
				+ ", department=" + department + ", email=" + email + ", year=" + year + "]";
	}
}
