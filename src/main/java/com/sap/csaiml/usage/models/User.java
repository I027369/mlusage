package com.sap.csaiml.usage.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class User {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="id", unique=true)
	private long id;
	
	@Column(name ="username")
	private String userName;
	
	@Column(name ="password")
	private String password;
	
	@Column(name ="enabled")
	private boolean enabled;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long id, String username, String password, boolean enabled) {
		super();
		this.id = id;
		this.userName = username;
		this.password = password;
		this.enabled = enabled;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + userName + ", password=" + password + ", enabled=" + enabled + "]";
	}


	
}
