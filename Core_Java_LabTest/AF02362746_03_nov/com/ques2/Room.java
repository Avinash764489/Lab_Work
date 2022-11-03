package com.ques2;

//import Scanner class
import java.util.Scanner;

//declare class
public class Room {
	
	//declare variables
	private int room_no;
	private String room_type;
	private boolean acfacility;
	private float room_area;
	private float room_price;
	
	//declare constructor
	public Room( ) {
		setRoom_no(23);
		setRoom_type("standerd");
		setAcfacility(false);
		setRoom_area(1000.0f);
		setRoom_price(2000.00f);
	}
	//end of constructor
	
	//create scanner class object
	Scanner sc = new Scanner(System.in);
	
	//declare constructor for set values
	public Room(int roomNo,String roomType, float roomPrice, boolean acFacility, float roomArea) {
		setRoom_no(roomNo);
		setRoom_type(roomType);
		setRoom_price(roomPrice);
		setAcfacility(acFacility);
		setRoom_area(roomArea);
	}
	
	//override toString predefine method
	@Override
	public String toString() {
		return "Room room_no=" + room_no + ", room_type=" + room_type + ", acfacility=" + acfacility + ", room_area="
				+ room_area + ", room_price=" + room_price ;
	}
	
	
	//declare method
	public void booking() {
		System.out.println("Enter Rs"+this.room_price+" for booking room");
		int amount = sc.nextInt();
		if(amount >= this.room_price) {
			System.out.println("Congratulation ...... Your room is booked");
			System.out.println(toString());
		}else {
			System.out.println("Sorry your room is not booked due to less amount you pay");
		}
		
	}
	//end of method
	
	//getter and setter
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public boolean isAcfacility() {
		return acfacility;
	}
	public void setAcfacility(boolean acfacility) {
		this.acfacility = acfacility;
	}
	
	public void setRoom_area(float room_area) {
		this.room_area = room_area;
	}
	public float getRoom_price() {
		return room_price;
	}
	//method overloading
	public void setRoom_price(float room_prices) {
		this.room_price += room_prices ;
	}
	//method overloading
	public void setRoom_price(float room_price, float discount) {
		this.room_price -= (room_price*discount/100);
	}
}
