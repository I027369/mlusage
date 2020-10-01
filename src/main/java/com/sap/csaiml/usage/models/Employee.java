package com.sap.csaiml.usage.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Employee {
	
	@Id
	@Column(name ="id", unique=true)
	private long id;
	@Column(name ="firstName")
	private String firstName;
	@Column(name ="lastName")
	private String lastName;
	@Column(name ="email")
	private String email;
	@Column(name ="contact")
	private String contact;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(long id, String firstName, String lastName, String email, String contact) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", contact=" + contact + "]";
	}
	
	
	
	
}
