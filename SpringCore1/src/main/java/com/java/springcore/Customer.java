package com.java.springcore;

public class Customer {

	
	private int custID;
	private String custName;
	private String custContact;
	private Address custAddresses;
	
	public Customer(int custID, String custName, String custContact, Address custAddresses) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.custContact = custContact;
		this.custAddresses = custAddresses;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustContact() {
		return custContact;
	}
	public void setCustContact(String custContact) {
		this.custContact = custContact;
	}
	public Address getCustAddresses() {
		return custAddresses;
	}
	public void setCustAddresses(Address custAddresses) {
		this.custAddresses = custAddresses;
	}
	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", custName=" + custName + ", custContact=" + custContact
				+ ", custAddresses=" + custAddresses + "]";
	}
	
}
