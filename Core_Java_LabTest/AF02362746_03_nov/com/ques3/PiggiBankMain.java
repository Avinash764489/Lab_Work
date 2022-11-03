package com.ques3;
//import Scanner class
import java.util.Scanner;

//declare class
public class PiggiBankMain {
	//declare main method
	public static void main(String arg[]) {
		PiggiBank obj = new PiggiBank();
		//declare instance variable
		int choice;
		float amount;
		String ch;
		//create Scanner class object
		Scanner sc = new Scanner(System.in);
		//declare do_while loop
		do {
			System.out.println("Enter your choice");
			System.out.println("If you want to add no money then enter (no)");
			System.out.println("If you want to add money then enter (add)");
			System.out.println("If you want to display your saving amount then enter (display)");
			//taking input from user
			ch = sc.next().toLowerCase();
			//declare switch 
			switch(ch) {
			case "no":{
				//call method of PiggiBank class
				obj.addAmount();
				break;
			}
			
			case "add":{
				System.out.println("Enter amount you want to add");
				//take input from user
				amount = sc.nextFloat();
				//call method of PiggiBank class
				obj.addAmount(amount);
				break;
			}
			
			case "display":{
				//call method of PiggiBank class
				obj.display();
				break;
			}
			default: 
				System.out.println("Enter a valid choice");
			}
			//end of switch
			
			System.out.println("You want to see choice again if yes then press (1) otherwise press (0)");
			//take input from user
			choice = sc.nextInt();
		}while(choice==1);
		//end of do_while loop
		
		//call method of PiggiBank class
		obj.display();
	}
	//end of main method
	
}
//end of class
