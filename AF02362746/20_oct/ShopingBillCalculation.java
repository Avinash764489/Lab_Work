//WAP to calculate shoping bill with discounts

//import Scanner class
import java.util.Scanner;
//create a class
class ShopingBillCalculation{
	//creating bill method to calculate total
	static void bill(int qty){
		int total = qty*540;
		System.out.println("Total amount :- "+total);
		if(total>=2000)
			discount(total);
		else
			System.out.println("Sorry you are not eligible for discount");
	}
	//create discount method to calculate total amount with discount
	static void discount(int total){
		int sum = (total/10)*9;
		System.out.println("Your total amount with discount is :- "+sum);
	}


	public static void main(String arg[]){
		//creating Scanner class object
		Scanner sc = new Scanner(System.in);


		//declearing variable
		int qty;

		//taking input of quentity he/she purchase from user
		System.out.println("Price of one bulb is Rs 540");
		System.out.println("Enter quentity of bulb you want to purchase");
		qty = sc.nextInt();

		bill(qty);
	}
}
