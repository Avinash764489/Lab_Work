//wap to print IT Companies tag lines
package com.ques2;

//import Scanner class
import java.util.Scanner;
//declaring class
public class ITCompaniesTagsLines {

	//Declaring printTags to show the tags
	static void printTags(String abbr){
		System.out.print(abbr+" tag line is :- ");
		//declaring switch case
		switch(abbr){
		case "accenture" -> System.out.println("New Applied Now");
		case "tcs" -> System.out.println("Building On Belief");
		case "infosys" -> System.out.println("Navigate Your Next");
		case "wipro" -> System.out.println("Spirit of Wipro");
		case "capgemini" -> System.out.println("People matter, results count Avaya - Avaya");
		case "deloitte" -> System.out.println("We change more");
		default-> System.out.println("Wrong input");
		}
		//ends of switch case
	}
	//ends of method

	public static void main(String arg[]){
		//creating Scanner class object
		Scanner sc = new Scanner(System.in);


		//Declaring variable
		String stringTags;

		//taking input from user choice
		System.out.println("Enter name of IT Companirs (accenture, tcs, infosys, wipro, capgemini, deloitte)");
		stringTags = sc.next().toLowerCase();
		printTags(stringTags);
	}
	//ends of main method
}
//ends of class
