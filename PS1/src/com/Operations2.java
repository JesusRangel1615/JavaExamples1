package com;

import java.util.ArrayList;

public class Operations2 extends Operations {
	
	@Override
	public ArrayList<Customer> getCustomerList() {
		System.out.print("get customer");
		return customerList;
	}

	@Override
	public boolean addCustomer(Customer customer) {
		return customerList.contains(customer);
		
	}
	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList; 
	}
	
	public ArrayList<Account> getAccountList(){
		return accountList;
	}
	
	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList; 
	}

	@Override
	public ArrayList<Account> calculate(Customer customer) {

		int bill; 
		
		if(customer.getType()=="3g" && customer.getPlanType() == 1){
			bill = 30 * 50; 
		}else if(customer.getType()=="3g" && customer.getPlanType() == 2) {
			bill = 30 * 75; 
		}else if(customer.getType()=="4g" && customer.getPlanType() == 1) {
			bill = 30 * 70; 
		}else{
			bill = 30 * 100; 
		}
		System.out.print(bill);
		
		Account account = new Account(customer, bill);
		
		accountList.add(account);
					
		return accountList; 
	}

}
