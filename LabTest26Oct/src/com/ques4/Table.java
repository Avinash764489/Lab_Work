//WAP to print table of a number
package com.ques4;

//import scanner class
import java.util.Scanner;

//declaring class 
public class Table {
	//declaring method
	static void table(int num) {
		System.out.println("Table of "+num+" is :- ");
		//declaration of for loop
		for(int i=1; i<=10; i++) {
			System.out.println(i+" * "+num+" = "+(i*num));
		}
		//ends of loop
	}
	//ends of method
	
	//Deceleration of main method
	public static void main(String arg[]) {
		
		//deceleration of variable
		int num;
		
		//deceleration of Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to find its table");
		//taking input from user
		num = sc.nextInt();
		
		//calling table method
		table(num);
	}

}
