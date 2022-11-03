package com.ques2;

//import Scanner class
import java.util.Scanner;

//declare class
public class HotelMain {
	//declare main method
	public static void main(String []arg) {
		//declare variable
		String room_type;
		boolean room_facility;
		int room_no;
		float room_area, discount;
		float room_price = 6000;
		//create Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Fresh Hotel");
			//taking input from user
			System.out.println("Enter the room type you want (standerd/luxury)");
			room_type = sc.next().toLowerCase();
			//declare switch case
			switch(room_type) {
			case "standerd" : {
				//create Room class object
				Room room = new Room();
				System.out.println("Enter ac facility if you want (true/false)");
				room_facility = sc.nextBoolean();
				
				if(room_facility == true) {
					//call method of Room class
				room.setAcfacility(room_facility);
				//call method of Room class
				room.setRoom_price(500);
				}else {
					//call method of Room class
					room.setAcfacility(room_facility);
					
				}
				//call method of Room class
				room.booking();
				break;
			}
			case "luxury":{
				//taking input from user
				System.out.println("Enter room number");
				room_no = sc.nextInt();
				System.out.println("Enter room area");
				room_area = sc.nextFloat();
				room_price = 6000;
				//create Room class object
				Room room1 = new Room(room_no, room_type, room_price, true, room_area);
				System.out.println("Enter the discount coupon you have in percent(%)");
				discount = sc.nextFloat();
				//call method of Room class
				room1.setRoom_price(room_price, discount);
				//call method of Room class
				room1.booking();
			}
			}
			//end of switch case
		}
	//end of main method
}
//end of class
