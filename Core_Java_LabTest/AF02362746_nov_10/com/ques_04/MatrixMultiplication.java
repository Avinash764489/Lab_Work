//WAP in java to multiply two matrix 

package com.ques_04;

//import Scanner class
import java.util.Scanner;

//declare class
public class MatrixMultiplication {

	//declare main method
	public static void main(String arg[]) {
		
		//declare variables
		int num;
		
		//create Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and column you want to create in matrix");
		
		//taking input from user
		num = sc.nextInt();
		
		//declare array
		int arr1[][] = new int[num][num];
		int arr2[][] = new int[num][num];
		int arr3[][] = new int[num][num];
		
		System.out.println("Enter "+(num*num)+" of first matrix");
		
		// taking elements form user using for loop
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++)
			arr1[i][j] = sc.nextInt();
		}
		//end of for loop
		
		System.out.println("Enter "+(num*num)+" of second matrix");
		// taking elements form user using for loop
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++)
			arr2[i][j] = sc.nextInt();
		}
		//end of for loop
		
		//multiplying and printing multiplication of 2 matrices
		//outer for loop
		for(int i=0;i<num;i++){
			//inner for loop 
			for(int j=0;j<num;j++){
				//inner for loop
				arr3[i][j]=0;    
				for(int k=0;k<num;k++)      
				{      
					arr3[i][j]+=arr1[i][k]*arr2[k][j];      
				}
				//end of inner loop
				//print matrix
				System.out.print(arr3[i][j]+" ");
			}
			//end of inner loop
			System.out.println();
		}
		//end of outer loop
		
		
	}
	//end of main method
}
//end of class
