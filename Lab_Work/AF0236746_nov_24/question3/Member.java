package question3;


public class Member {

	private String name, Address;
	private int age;
	private double salary;
	private long mobile_number;
	
	
	public void employ_details(String name, int age, long mobile_number, String address, double salary){
		
		setName(name);
		setAge(age);
		setMobile_number(mobile_number);
		setAddress(address);
		setSalary(salary);
	}
	
	public void display() {
		System.out.println("Name :- "+getName());
		System.out.println("Age :- "+getAge());
		System.out.println("Mobile number :- "+getMobile_number());
		System.out.println("Address :- "+getAddress());
		System.out.println("Salary :- "+getSalary());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
}
