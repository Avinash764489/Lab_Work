package com.ques1;

//import Scanner class
import java.util.Scanner;

//declare class
public class Dimond {


//declare main method
static void pattern(int num) {
	
	//declare for outer loop
	for(int i = 1; i <= num; i++) {
		//declare inner loop
		for(int j = num; j >= 1; j--) {
			System.out.print(" ");
			if(i==j)
				//if condition match its break loop
				break;
			//end if
			
		}
		//declare inner loop
		for(int j = 1; j <= num; j++) {
			
			System.out.print("* ");
			if(i==j)
				//if condition match its break loop
				break;
			//end if
		}
		
		//end of inner loop
		System.out.println();
	}
	//end of outer loop
	
			//declare for outer loop
			for(int i = 1; i <= num-1; i++) {
				//declare inner loop
				for(int j = 1; j <= num; j++) {
					System.out.print(" ");
					if(i+1==j)
						//if condition match its break loop
						break;
					//end if
					
				}
				//declare inner loop
				for(int j = num-1; j >= 1; j--) {
					
					System.out.print("* ");
					if(i==j)
						//if condition match its break loop
						break;
					//end if
				}
				
				//end of inner loop
				System.out.println();
			}
			//end of outer loop
			
			
}



static void pros(int num) {
//declare for outer loop
for(int i = 1; i <= num; i++) {
	
	//end of inner loop
	System.out.println();
}
//end of outer loop
}

//declare main method
public static void main(String arg[]) {
//create Scanner class object
Scanner sc = new Scanner(System.in);
System.out.println("Enter row you want to print the pattern");
//taking input from user
int num = sc.nextInt();
pattern(num);
}
//end of main method
}
//end of class