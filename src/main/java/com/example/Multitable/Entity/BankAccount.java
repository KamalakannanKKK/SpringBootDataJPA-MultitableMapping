package com.example.Multitable.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BankAccount {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private long bankAccoutnumber;
	private String bankName;
	private String IFSCcode;
	private String branchName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getBankAccoutnumber() {
		return bankAccoutnumber;
	}
	public void setBankAccoutnumber(long bankAccoutnumber) {
		this.bankAccoutnumber = bankAccoutnumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIFSCcode() {
		return IFSCcode;
	}
	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public BankAccount(int id, long bankAccoutnumber, String bankName, String iFSCcode, String branchName) {
		super();
		this.id = id;
		this.bankAccoutnumber = bankAccoutnumber;
		this.bankName = bankName;
		IFSCcode = iFSCcode;
		this.branchName = branchName;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
