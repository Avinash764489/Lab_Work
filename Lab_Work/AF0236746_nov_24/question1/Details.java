package question1;

//importing Scanner class
import java.util.Scanner;

//declare class
public class Details {

	//declare variables
	private String first_name, last_name, course, student_id, department, designation, employee_id;
	private double salary;
	private int age;
	
	//declare Scanner class
	Scanner sc = new Scanner(System.in);
	
	
	//declare method and initializing values
	public void student_details() {
		System.out.println("Enter Student id");
		setStudent_id(sc.next());
		System.out.println("Enter Student first name");
		setFirst_name(sc.next());
		System.out.println("Enter Student last name");
		setLast_name(sc.next());
		System.out.println("Enter Student age");
		setAge(sc.nextInt());
		System.out.println("Enter Student course");
		setCourse(sc.next());
	}
	//end of method
	
	//declare method and initializing values
		public void employee_details() {
			System.out.println("Enter Employee id");
			setEmployee_id(sc.next());
			System.out.println("Enter Employee first name");
			setFirst_name(sc.next());
			System.out.println("Enter Employee last name");
			setLast_name(sc.next());
			System.out.println("Enter Employee age");
			setAge(sc.nextInt());
			System.out.println("Enter Employee salary");
			setSalary(sc.nextDouble());
			System.out.println("Enter Employee department");
			setDepartment(sc.next());
			System.out.println("Enter Employee designation");
			setDesignation(sc.next());
			
		}
		//end of method

		//display all student details
		//declare method
		public void stuDisplay() {
			System.out.println("-*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
			System.out.println("Student Details are :- ");
			System.out.println("Student id :- "+getStudent_id());
			System.out.println("First name :- "+getFirst_name());
			System.out.println("Last name :- "+getLast_name());
			System.out.println("Age :- "+getAge());
			System.out.println("Course :- "+getCourse());
			
			
		}
		//end of method
		
		//display all employee details
		//declare method
		public void empDisplay() {
			System.out.println("-*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
			System.out.println("Employee Details are :- ");
			System.out.println("Employee id :- "+getEmployee_id());
			System.out.println("First name :- "+getFirst_name());
			System.out.println("Last name :- "+getLast_name());
			System.out.println("Age :- "+getAge());
			System.out.println("Salary :- "+getSalary());
			System.out.println("Department :- "+getDepartment());
			System.out.println("Designation :- "+getDesignation());
			
			
		}
		//end of method
		

		//getter and setter
	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String getStudent_id() {
		return student_id;
	}


	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	//end of getter and setter
	
	
}
//end of class
