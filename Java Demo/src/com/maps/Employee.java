package com.maps;

public class Employee {
             int empId;
             String empName;
             double salary;
             public Employee(int empId, String empName, double salary) {
                    super();
                    this.empId = empId;
                    this.empName = empName;
                    this.salary = salary;
             }
             public int getEmpId() {
                    return empId;
             }
             public void setEmpId(int empId) {
                    this.empId = empId;
             }
             public String getEmpName() {
                    return empName;
             }
             public void setEmpName(String empName) {
                    this.empName = empName;
             }
             public double getSalary() {
                    return salary;
             }
             public void setSalary(double salary) {
                    this.salary = salary;
             }
             @Override
             public String toString() {
                    return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
             }
//           @Override
//           public int compareTo(Employee o) {
//                  // TODO Auto-generated method stub
//                  if(empId == o.empId) 
//                        return 0;
//                        else if(empId>o.empId) {
//                               return -1;
//                        }
//                  else
//                        return 1;
//           }
             
}
