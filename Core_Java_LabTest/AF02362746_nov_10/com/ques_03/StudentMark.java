package com.ques_03;

import java.util.Arrays;
//import Scanner class
import java.util.Scanner;

//declare class
public class StudentMark {

	//declare main method
	public static void main(String arg[]) {
		
		//declare variables
		int num;
		
		//create Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of student marks you want to enter");
		
		//taking input from user
		num = sc.nextInt();
		
		//declare array
		int arr1[] = new int[num];
		
		System.out.println("Enter "+num+" student marks");
		
		// taking marks form user using for loop
		for(int i = 0; i < num; i++) {
			arr1[i] = sc.nextInt();
		}
		// end of for loop
		//sorting marks
		Arrays.sort(arr1);
		
		// printing marks with rank
		//for loop
		for(int i = num-1; i >= 0; i--) {
			System.out.println((num-i)+" rank student marks is:- "+arr1[i]);
		}
		//end of for loop
		
	}
	//end of main method
}
//end of class