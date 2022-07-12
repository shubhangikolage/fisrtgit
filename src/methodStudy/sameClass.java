package methodStudy;

import myclass.testclass;

public class sameClass {

	public static void main(String[] args) 
	{

		display(); //static regular method call from same class i.e sameClass
		run();     //static regular method call from same class i.e sameClass
		
	    anotherClass.test();
	   //to call static method from other class we have to provide thas classname.method name	
	}

	public static void display()
	{
		System.out.println(" hii.. This is display method from same class.");
	}
	
	public static void run()
	{
		System.out.println(" hii.. This is run method from same class.");
	}
	
}
