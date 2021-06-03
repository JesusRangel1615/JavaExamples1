package com;

public class Account{

	double amountToPay; 
	Customer customer;
	
	public Account() {}
	
	public Account(Customer customer, double amountToPay) {
		this.customer = customer; 
		this.amountToPay = amountToPay;
	}
	
	public double getAmountToPay() {
		return amountToPay;
	}
	
	public Customer getCustomer() {
		return customer; 
	}
	
	public void setAmountToPay(double amountToPay) {
		this.amountToPay = amountToPay;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer; 
	}
	
}
