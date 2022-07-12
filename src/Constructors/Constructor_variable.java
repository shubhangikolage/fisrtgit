package Constructors;

public class Constructor_variable {


	// example of user defined constructor
	
		String city="Pune"; // variable declaration manualy
		
		
		// use of constructor --> to initiazite variable
		
		String name;// variable declration
		
		public Constructor_variable ()// user defined constructor--> without parameters
		{
			name="Velocity";// used to initialize variable "name"
		}
		
		
		
		public static void main(String[] args)
		{

			display1();
			
			Constructor_variable c2= new Constructor_variable();
			c2.display();

		}
		
		public void display()
		{
			System.out.println("I am non static display method");
			System.out.println("My city name is "+city);
			System.out.println("My name is "+name);
		}
		
		public static void display1()
		{
			System.out.println("I am  static display1 method");
		}

	}


