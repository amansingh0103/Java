package com.maven.Hibernetwithmaven.model;
//

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

//configuring maven with hibernet sql
//Annotations

@Entity //Identify Table Name
@Table(name="student")

public class Student {

	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	
//create attributes
	
//Variables With Data Types
@Column(name="id")
private long id;
@Column(name="firstname")
private String firstname;
@Column(name="lastname")
 private String lastname;
@Column(name="email")
private String email;

//default constructor
	
public Student() {
		super();
	}



@Override
public String toString() {
	return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
}



//create parameterized construtor
public Student(long id, String firstname, String lastname, String email) {
super();
this.id = id;
this.firstname = firstname;
this.lastname = lastname;
this.email = email;
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub

}
//Create getters and setters for id
public long getId() {
		return id;
	}
public void setId(long id) {
		this.id = id;
	}
//Create getters and setters for firstname
public String getFirstname() {
		return firstname;
	}
public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
//Create getters and setters for lastname
public String getLastname() {
		return lastname;
	}
public void setLastname(String lastname) {
		this.lastname = lastname;
	}
//Create getters and setters for email
public String getEmail() {
		return email;
	}
public void setEmail(String email) {
		this.email = email;
	}
}

