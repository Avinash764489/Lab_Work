//WAP to Identify who is younger and older

//import Scanner class
import java.util.Scanner;
//create a class
class IdentifyYoungestAndOldest{

	//create identify method to find who is younger and older
	static void identify(float num1, float num2, float num3){

		//if_else
		if(num1>num2 && num1>num3)
			System.out.println("Oldest is :- "+num1);
		else if(num2>num3)
			System.out.println("Oldest is :- "+num2);
		else
			System.out.println("Oldest is :- "+num3);

		//end if_else

		//if_else
		if(num1<num2 && num1<num3)
			System.out.println("Youngest is :- "+num1);
		else if(num2<num3)
			System.out.println("Youngest number is :- "+num2);
		else
			System.out.println("Youngest number is :- "+num3);
		//end if_else
	}


	public static void main(String arg[]){
		
		//creating Scanner class object
		Scanner sc = new Scanner(System.in);


		//declearing variable
		float age1, age2, age3;

		//taking input from user
		System.out.println("Enter first person age");
		age1 = sc.nextInt();
		System.out.println("Enter second person age");
		age2 = sc.nextInt();
		System.out.println("Enter third person age");
		age3 = sc.nextInt();

		identify(age1, age2, age3);
	}
}