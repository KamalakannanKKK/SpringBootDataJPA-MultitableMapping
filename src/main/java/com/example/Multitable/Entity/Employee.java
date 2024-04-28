package com.example.Multitable.Entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id;
	private String employeeName;
	private String employeeCode;
	private String designation;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addressId")
	private Address address;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bankAccountListId")
	private BankAccount bankAccount;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="employeeId")
	private Set<ContactNumber> contactNumber;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="projectId")
	private Project project;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	

	public Set<ContactNumber> getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Set<ContactNumber> contactNumber) {
		this.contactNumber = contactNumber;
	}


	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	
	public Employee(long id, String employeeName, String employeeCode, String designation, Address address,
			BankAccount bankAccount, Set<ContactNumber> contactNumber, Project project) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeCode = employeeCode;
		this.designation = designation;
		this.address = address;
		this.bankAccount = bankAccount;
		this.contactNumber = contactNumber;
		this.project = project;
	}

	public Employee() {
		super();
		
	}
	
	
	
}
