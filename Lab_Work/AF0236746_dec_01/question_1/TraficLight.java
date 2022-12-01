package question_1;

//declare class and extends thread class
public class TraficLight extends Thread {

	//declare thread
	public void run() {
		
		//infinite for loop
		for(int i=1;i>0;i=1) {
			System.out.println("Red Light");
			System.out.println("3");
			
			//try catch block to throw exception
			try {
				
				//declare inner for loop
				for(int j = 1; j < 4; j++) {
					
					//thread sleep for 1 secound per round
					Thread.sleep(1000);
					System.out.println(3-j);
				}
				//end of inner for loop
				
				System.out.println("Green Light");
				System.out.println("5");
				
				//declare inner for loop
				for(int j = 1; j < 6; j++) {
					
					//thread sleep for 1 secound per round
					Thread.sleep(1000);
					System.out.println(5-j);
				}
				//end of inner for loop
				
				System.out.println("Yellow Light");
				System.out.println("2");
				//declare inner for loop
				for(int j = 1; j < 3; j++) {
					
					//thread sleep for 1 second per round
					Thread.sleep(1000);
					System.out.println(2-j);
				}
				//end of inner for loop
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	//end of thread
	
	//declare main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare class instance
		TraficLight tl = new TraficLight();
		//start thread
		tl.start();
	}
	//end of main method

}
//end of class
