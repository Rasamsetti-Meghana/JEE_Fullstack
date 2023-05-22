package com.generics;

class Employee {
	private int empId;
	private String empName;
	private double salary;
	
	public Employee(int empId, String empName, double salary){
		super();
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	@Override
	public String toString(){
		return "Employee [empId=" + empId+ ", empName=" + empName +", salary=" + salary+"]";
	}
	public int getEmpId(){
		return empId;
	}
	public void setEmpName(String empName){
		this.empName=empName;
	}
	public double getSalary(double salary){
    return salary;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	@Override
	public int compareTo(Employee o) {
		if(empId==o.empId)
			return 0;
		else if(empId<o.empId)
			return 1;
		else return -1;
	}
{
	
}

}
