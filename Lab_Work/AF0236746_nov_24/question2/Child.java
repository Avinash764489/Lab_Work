package question2;

//declare class and extend other class
public class Child extends Parent{

	//declare method
	public void prints() {
		System.out.println("This is child class");
		//call parent class print method
		super.prints();
	}
	//end of method
	
	//declare main method
	public static void main(String arg[]) {
		
		//declare parent class method
		Parent obj1 = new Parent();
		//call parent class print method with parent class object
		obj1.prints();
		
		//declare child class method
		Child obj2 = new Child();
		//call child class print method with child class object
		//call parent class print method with child class object
		obj2.prints();	
	}
	//end of main method
}
//end of class
