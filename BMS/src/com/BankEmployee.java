package com;

public class BankEmployee {
	
	int empId;
	String empName;
	String branchName;
	String dept;
	double salary;
	boolean permanentCheck;
	
	public BankEmployee(int id,String Name,String Branch,String dept,double salary,boolean permanentCheck){
		this.empId=id;
		this.empName=Name;
		this.branchName=Branch;
		this.dept=dept;
		this.salary=salary;
		this.permanentCheck=permanentCheck;	
		
	}
		
		public void setEmpId(int id) {
			this.empId=id;
		}
		public int getEmpId() {
			return empId;
		}
		
		public void setEmpName(String empName) {
			this.empName=empName;
			
		}
		public String getEmpName() {
			return empName;
		}
		public void getBranchName(String BranchName) {
			this.branchName=BranchName;
			
		}
		public String setBranchName() {
			return branchName;
		}
		public void setDept(String dept) {
			this.dept=dept;
			
		}
		public String getDept() {
			return dept;
		}
		public void setSalary(double salary) {
			this.salary=salary;
			
		}
		public double getSalary() {
			return salary;
		}
		public void setPermanentCheck(boolean permanentCheck) {
			this.permanentCheck=permanentCheck;
			
		}
		public boolean getPermanentCheckt() {
			return permanentCheck;
		}

}
