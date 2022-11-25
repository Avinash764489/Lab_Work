package question3;

import java.util.Scanner;

public class Manager extends Member {

	private String specialization, deparetment;
	
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String name, address, specialization, department;
		int age;
		double salary;
		long number;
		
		System.out.println("Enter Manager details");
		System.out.println("Enter name");
		name = sc.nextLine();
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter phone number");
		number = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter address");
		address = sc.nextLine();
		System.out.println("Enter department");
		department = sc.nextLine();
		System.out.println("Enter specialization ");
		specialization = sc.nextLine();
		System.out.println("Enter Salary");
		salary = sc.nextDouble();
		
		Manager mem = new Manager();
		mem.employ_details(name, age, number, address, salary);
		mem.data(department, specialization);
		
		mem.display();
		mem.print();
		
	}
	
	public void data(String department, String specialization) {
		setDeparetment(department);
		setSpecialization(specialization);
		
	}
	
	public void print() {
		System.out.println("Department :- "+getDeparetment());
		System.out.println("Specialization :- "+getSpecialization());
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getDeparetment() {
		return deparetment;
	}

	public void setDeparetment(String deparetment) {
		this.deparetment = deparetment;
	}
}
