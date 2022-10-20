//WAP to make a calculator
//import Scanner class
import java.util.Scanner;
//create a class
class SquareAndCube{
	static void choicess(int num1, int choice){
		switch(choice){
		case 1:square(num1);
			break;
		case 2:cube(num1);
			break;
		case 3:check(num1);
			break;
		case 5:System.exit(0);
			break;
		default: System.out.println("Wrong input");
		}
	}

	//create square method to find square
	static void square(int num1){
		System.out.println("Square of "+num1+" is :- "+(num1*num1));
	}

	//create cube method to find cube
	static void cube(int num1){
		System.out.println("Cube of "+num1+" is :- "+(num1*num1*num1));
	}

	//create check method to check number is even or odd
	static void check(int num1){
		if(num1%2 == 0)
			System.out.println(num1+" is even");
		else
			System.out.println(num1+" is odd");
	}

	public static void main(String arg[]){

		//creating Scanner class object
		Scanner sc = new Scanner(System.in);


		//declearing variable
		int choice, num1;

		//taking 2 numbers from user
		System.out.println("Enter number");
		num1 = sc.nextInt();

		System.out.println("Press the key according to your choicess");
		System.out.println("1. Square");
		System.out.println("2. Cube");
		System.out.println("3. Check even or odd");
		System.out.println("5. Exit");
		System.out.println("Enter your choicess");
		choice = sc.nextInt();
		choicess(num1,choice);
	}
}