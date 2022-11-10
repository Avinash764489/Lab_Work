package com.ques_05;


//declare class
public class CarModel {
	
	//declare enum for constant
	//declare constant car name and model
	enum model{
		TATA(2020),
		MAHINDRA(2019),
		NISSAN(2015),
		HYUNDAI(2023),
		AUDI(2017),
		VOLVO(2022),
		JEEP(2019);
		int i;
		model(int i){
			this.i = i;
		}};
		
	//declare main method
	public static void main(String arg[]) {
		
			
		//print all the car brands and its model using for-each loop
		for(model mod:model.values()) {
			System.out.println(mod+" car and its model is:- "+mod.i);
		}
	}
	//end of main method
}
//end of class