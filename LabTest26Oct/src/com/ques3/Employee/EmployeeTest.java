package com.ques3.Employee;
//declaring class
public class EmployeeTest {


	//declaring instance variable
	String eid, ename, edepartment, esalary;
	//Declaring method
		public void getDetails(String id, String name, String dept, String salary){
			
			//assign all values
			eid = id;
			ename = name;
			edepartment = dept;
			esalary = salary;
		}
		//ends of method
		
		//declare method
		public void printDetails(){
			//print all details
			System.out.println("Deatils of Employee");
			System.out.println("Id = "+eid);
			System.out.println("Name = "+ename);
			System.out.println("Department = "+edepartment);
			System.out.println("Salary = "+esalary);
			
		}
		//ends of method
	}
	//ends of class
