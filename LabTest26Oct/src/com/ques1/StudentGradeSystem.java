//WAP in java to check student is eligible for exam or not.
package com.ques1;

//importing Scanner class
import java.util.Scanner;
//Declaring class
public class StudentGradeSystem {

	
	//Declaring check method to check his/her eligibility.
	static void check(int num1, int num2){
		float percent = (num2*100)/num1;
		System.out.println("Your attendence percentage is :- "+percent+"%");
		if(percent >= 75)
			System.out.println("Congratulations.... You are qualify for exam");
		else
			System.out.println("Sorry You are not qualify for exam");
	}

	
	public static void main(String arg[]){
		//creating Scanner class object
		Scanner sc = new Scanner(System.in);


		//Declaring variable
		int num1, num2;

		//taking inputs numbers from user
		System.out.println("Enter Total no of classes");
		num1 = sc.nextInt();
		System.out.println("Enter number of classes you addend");
		num2 = sc.nextInt();


		check(num1,num2);
	}
}