package com.ques3.details;

//importing EmployeeTest under employee package
import com.ques3.Employee.EmployeeTest;

//import Scanner class
import java.util.Scanner;

//declaring class
public class Employee {


	//declaring main method
	public static void main(String arg[]) {
		
		//declaring variables
		String id, name, dept, salary; 
		//create Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//taking input from user
		System.out.println("Enter Employee id");
		id = sc.next();
		System.out.println("Enter Employee name");
		name = sc.next();
		System.out.println("Enter Employee department");
		dept = sc.next();
		System.out.println("Enter Employee salary");
		salary = sc.next();
		
		//create EmployeeTest object
		EmployeeTest obj = new EmployeeTest();
		obj.getDetails(id, name, dept, salary);
		obj.printDetails();
	}

}

