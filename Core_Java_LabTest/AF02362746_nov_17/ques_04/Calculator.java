package ques_04;

//import Scanner class
import java.util.Scanner;

//declare class
public class Calculator {

	
	//declare method for addition
	public static void add(float num1, float num2) {
		
		//calculation
		float sum = num1+num2;
		System.out.println("Sum of two number is "+sum);
	}
	//end of method
	
	//declare method for subtraction
	public static void sub(float num1, float num2) {
		
		//calculation
		float sum = num1-num2;
		System.out.println("Subtraction of two number is "+sum);
	}
	//end of method
	
	//declare method for multiplication
	public static void mul(float num1, float num2) {
		
		//calculation
		float sum = num1*num2;
		System.out.println("Multiplication of two number is "+sum);
	}
	//end of method
	
	//declare method for division
	public static void div(float num1, float num2) {
		
		//calculation
		float sum = num1/num2;
		System.out.println("Division of two number is "+sum);
	}
	//end of method

	//declare main method
	public static void main(String arg[]) {
		
		//declare variables
		int choice, ch;
		float num1, num2;
		
		//create Scanner class object
		//declare try block to check exception
		try(Scanner sc = new Scanner(System.in);) {
			
			//taking input from user
			System.out.println("Enter first number");
			num1 = sc.nextFloat();
			System.out.println("Enter second number");
			num2 = sc.nextFloat();
			
			if(num1 < 1 || num2 < 1) {
				//throw an exception
				throw new InputCheckException("Invalid number");
			}else {
				
				System.out.println("Add :- 1");
				System.out.println("Subtract :- 2");
				System.out.println("Multiplication :- 3");
				System.out.println("Division :- 4");
				System.out.println("Exit :- 0");
				System.out.println("Enter your choice");
				choice = sc.nextInt();
				
				//declare switch
				switch(choice) {
				
				//starting cases
				case 1: add(num1, num2);
					break;
					
				case 2: sub(num1, num2);
					break;
				
				case 3: mul(num1, num2);
					break;
				
				case 4: div(num1, num2);
					break;
				
				default: System.out.println("Your choice is not valid");
				}
				//end of switch
			}
			//end of try block
			//declare catch block
			}catch(Exception e){
				System.out.println(e.getMessage());
				
			}
		//end of catch block
			
		
	}
	//end of main method
}
//end of class
