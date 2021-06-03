package com;


public class Customer {
	
	String Username; 
	int ConnectionId; 
	String type; 
	int planType; 

	public Customer(String Username, int ConnectionId, String type, int planType) {
		this.Username = Username; 
		this.ConnectionId = ConnectionId; 
		this.type = type; 
		this.planType = planType; 
	}
	
	public void setPlanType(int planType){
		this.planType = planType; 
	}
	
	public int getPlanType() {
		return planType; 
	}
	
	public void setType(String type) {
		this.type = type; 
	}
	
	public String getType() {
		return type; 
	}
	
	public String getUserName() {
		return Username;
	}
	
	public int getConnectionId() {
		return ConnectionId; 
	}
	
	public void setUserName(String Username) {
		this.Username = Username; 
	}
	
	public void setConnectionId(int ConnectionId) {
		this.ConnectionId = ConnectionId;
	}
	
	@Override
	public String toString() {
	  return "Username " + Username + " ConnectionId " + ConnectionId + 
			  " Type " + type + " PlanType " + planType;
	}

	
	
}
