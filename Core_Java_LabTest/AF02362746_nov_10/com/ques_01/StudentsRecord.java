package com.ques_01;
//import Scanner class
import java.util.Scanner;

//declare class
public class StudentsRecord {

	//declare main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variable
		int num;
		
		//create scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of records of students you want to store");
		
		//taking input from user
		num = sc.nextInt();
		
		//declare String type array
		String str[] = new String[num];
		//  taking input from user of students name
		for(int i = 0; i < num; i++) {
			System.out.println("Enter "+(i+1)+" student name");
			str[i] = sc.next();
		}
		// print all students name	
		for(int i = 0; i < num; i++)
			System.out.println((i+1)+" Student name is: - "+str[i]);
	}
	//end of main method 
}
//end of class