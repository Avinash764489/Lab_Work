package com.ques3;
//declare class
public class PiggiBank {
	public float amount;
	//declare method
	public void addAmount(){
		
		setAmount(50);
	}
	//end of method
	
	//declare method
	public void addAmount(float add){
		
		setAmount(this.amount, add);
	}
	//end of method
	
	//declare method
	public void display() {
		System.out.println(toString());
	}
	//end of method
	
	//override toString predefine method
	@Override
	public String toString() {
		return "Your PiggiBank amount= " + amount ;
	}

	//set amount
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	//set amount
	public void setAmount(float amount, float add) {
		this.amount = amount+add;
	}
}
//end of class
