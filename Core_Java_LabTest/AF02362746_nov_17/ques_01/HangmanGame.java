package ques_01;

//importing Scanner class
import java.util.Scanner;

//declare class
public class HangmanGame {
	
	public static void main(String arg[]) {
	
		//declare variables
		int num, num2, len;
		String str1, str2;
		
		//declare Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//taking input from user
		System.out.println("Enter the length of array");
		num = sc.nextInt();
		
		//declare an String type array
		String arr[] = new String[num];
		
		//Initializing values in array
		System.out.println("Enter "+num+" String type elements");
		for(int i = 0; i < num; i++) {
			arr[i] = sc.next();
		}
		
		System.out.println("enter any number between 1 to "+num );
		num2 = sc.nextInt();
		
		//taking random string
		str1 = arr[num2-1].toLowerCase();
		
		//length of random string
		len = str1.length();
		
		System.out.println("Enter a string of length "+len+" you want to guess");
		for(int i = 0; i < len; i++) {
			System.out.print("-");
			
		}
		//taking input from user
		System.out.println();
		str2 = sc.next().toLowerCase();
		
		//check both the string is match or not
		if(str1.equals(str2)) {
			System.out.println("Congratulation you win this game");
		}else {
			System.out.println("Sorry you loose this game");
			System.out.println("Your string doesn't match");
		}
	}
	//end of method
}
//end of class