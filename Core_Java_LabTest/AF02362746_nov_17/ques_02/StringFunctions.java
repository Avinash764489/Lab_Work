package ques_02;

//importing Scanner class
import java.util.Scanner;

//declare class
public class StringFunctions {

	//declare main method
	public static void main(String arg[]) {
		
		//declare variables
		String str;
		
		//declare Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//first second string predefine method
		System.out.println("Enter a string");
		str = sc.nextLine().trim();
		System.out.println("Second method is trim()");
		
		// second string predefine method
		System.out.println("Second method is toLowerCese()");
		System.out.println(str.toLowerCase());
		
		// third string predefine method
		System.out.println("Second method is toUpperCese()");
		System.out.println(str.toUpperCase());
		
		// fourth string predefine method
		System.out.println("Second method is length()");
		System.out.println(str.length());
		
		//fifth string predefine method
		System.out.println("Second method is charAt(0)");
		System.out.println(str.charAt(0));
		
	}
}
