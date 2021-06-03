package com;

import java.util.ArrayList;

public abstract class Operations {

	ArrayList<Customer> customerList = new ArrayList<Customer>(); 
	
	ArrayList<Account> accountList = new ArrayList<Account>(); 
	
	abstract public ArrayList<Customer> getCustomerList();
		
	
	abstract public void setCustomerList(ArrayList<Customer> customerList);
	
	abstract public ArrayList<Account> getAccountList();
	
	abstract public void setAccountList(ArrayList<Account> accountList);
	
	abstract public boolean addCustomer(Customer customer);
	
	abstract public ArrayList<Account> calculate(Customer customer);
	
}
