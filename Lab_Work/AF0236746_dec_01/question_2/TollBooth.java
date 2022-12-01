package question_2;

//declare class and extends thread
class vehicles1 extends Thread{
	
	//declare thread
	public void run() { 
		System.out.println("Vehicles no. 1 Starts journey");
		System.out.println("Vehicles no. 1 Arrive at the Tollbooth");
		System.out.println("Vehicles no. 1 Enter the Tollbooth");
		System.out.println("Vehicles no. 1 Exit from Tollbooth");
		System.out.println("Vehicles no. 1 Cross the bridge");
	}
	//end of thread
}
//end of class

//declare class and extends thread
class vehicles2 extends Thread{
	
	//declare thread
	public void run() { 
		System.out.println("Vehicles no. 2 Starts journey");
		System.out.println("Vehicles no. 2 Arrive at the Tollbooth");
		System.out.println("Vehicles no. 2 Enter the Tollbooth");
		System.out.println("Vehicles no. 2 Exit from Tollbooth");
		System.out.println("Vehicles no. 2 Cross the bridge");
	}
	//end of thread
}
//end of class

//declare class and extends thread
class vehicles3 extends Thread{
	
	//declare thread
	public void run() { 
		System.out.println("Vehicles no. 3 Starts journey");
		System.out.println("Vehicles no. 3 Arrive at the Tollbooth");
		System.out.println("Vehicles no. 3 Enter the Tollbooth");
		System.out.println("Vehicles no. 3 Exit from Tollbooth");
		System.out.println("Vehicles no. 3 Cross the bridge");
	}
	//end of thread
}
//end of class

//declare class and extends thread
class vehicles4 extends Thread{
	
	//declare thread
	public void run() { 
		System.out.println("Vehicles no. 4 Starts journey");
		System.out.println("Vehicles no. 4 Arrive at the Tollbooth");
		System.out.println("Vehicles no. 4 Enter the Tollbooth");
		System.out.println("Vehicles no. 4 Exit from Tollbooth");
		System.out.println("Vehicles no. 4 Cross the bridge");
	}
	//end of thread
}
//end of class

//declare class and extends thread
class vehicles5 extends Thread{
	
	//declare thread
	public void run() { 
		System.out.println("Vehicles no. 5 Starts journey");
		System.out.println("Vehicles no. 5 Arrive at the Tollbooth");
		System.out.println("Vehicles no. 5 Enter the Tollbooth");
		System.out.println("Vehicles no. 5 Exit from Tollbooth");
		System.out.println("Vehicles no. 5 Cross the bridge");
	}
	//end of thread
}
//end of class


//declare class
public class TollBooth {

	//declare main method
	public static void main(String arg[]) {
		
		//declare class instances
		vehicles1 v1 = new vehicles1();
		vehicles2 v2 = new vehicles2();
		vehicles3 v3 = new vehicles3();
		vehicles4 v4 = new vehicles4();
		vehicles5 v5 = new vehicles5();
		
		//start thread
		v1.start();
		v2.start();
		v3.start();
		v4.start();
		v5.start();
	}
	//end of main method
}
//end of class
