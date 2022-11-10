//WAP in java to find common elements of 2 different array
package com.ques_02;

//import Scanner class
import java.util.Scanner;

//declare class
public class CommonElement {

	//declare main method
	public static void main(String arg[]) {
		
		//declare variables
		int num;
		
		//create Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of integers in both arrays want to store");
		
		//taking input from user
		num = sc.nextInt();
		
		//declare array
		int arr1[] = new int[num];
		int arr2[] = new int[num];
		
		System.out.println("Enter "+num+" elements of first array");
		
		// taking input from user to fill the array
		for(int i = 0; i < num; i++) {
			arr1[i] = sc.nextInt();
		}
		// taking input from user to fill the array
		System.out.println("Enter "+num+" elements of second array");
		for(int i = 0; i < num; i++) {
			arr2[i] = sc.nextInt();
		}
		
		//finding common element
		System.out.println("..........................");
		System.out.println("Common elements of two different arrays are");
		//outer for loop
		for(int i = 0; i < num; i++) {
			// inner for loop
			for(int j = 0; j < num; j++) {
				// if statement
				if(arr1[i] == arr2[j]) {
					//print all common elements
					System.out.print(arr1[i]+", ");
					break;
				}
				//end of if
			}
			//end of inner for loop
		}
		//end of outer for loop
	}
	//end of main method
}
//end of class