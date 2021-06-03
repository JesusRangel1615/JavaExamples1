package com;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Customer Jorch = new Customer("Jorch", 1, "4g", 2); 
		
		Customer Liz = new Customer("Liz", 2, "3g", 1);
		
		Customer Peter = new Customer("Peter", 4, "3g", 2);

		
		//System.out.println("Username: " + Jorch.getUserName() + " ConnectionId= " + Jorch.getConnectionId() + " Type= " + Jorch.getType() + " PlanType= " + Jorch.getPlanType()+"\n");		
		//Account AccountJorch = new Account(Jorch, 500);
		//AccountJorch.setCustomer(Liz);
		//System.out.println("Amount to Pay: " + AccountJorch.getAmountToPay() + " Customer: " + AccountJorch.getCustomer());
		
		ArrayList<Customer> customerList = new ArrayList<Customer>(); 
		//ArrayList<Account> accountList = new ArrayList<Account>(); 

		
	Operations2 op = new Operations2 ();
		
		if(op.addCustomer(Jorch) == false) {
			customerList.add(Jorch);
			
			customerList.add(Liz);
			
			customerList.add(Peter);
			
			
		}
		
		for(int i=0;i<customerList.size();i++) {
			System.out.print(customerList.get(i));
			System.out.print(" Amount to Pay ");
			op.calculate(Peter);
			System.out.print("\n");

		}
	}
}