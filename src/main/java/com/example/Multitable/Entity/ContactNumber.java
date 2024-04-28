package com.example.Multitable.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ContactNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private long contactNumber;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public ContactNumber(long id, long contactNumber) {
		super();
		this.id = id;
		this.contactNumber = contactNumber;
	}

	public ContactNumber() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
