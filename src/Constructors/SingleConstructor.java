package Constructors;

public class SingleConstructor {

	int a;
	int b;
	public SingleConstructor(int x)          //single parameter constructor
	{
        a=x;		
        System.out.println("value of a is "+a);
		
	}
         public SingleConstructor(int x, int y)
      {
        	 a=x;
        	 b=y;
        	 System.out.println("value of a"+a);
        	 System.out.println("value of b "+b);
	}
	
	public static void main(String[] args) {
		 SingleConstructor s=new SingleConstructor (100); 
		 SingleConstructor s1 = new SingleConstructor(100, 50);
		//CONSTRUCTOR CALLING
		s.parameter();                       // PARAMETER METHOD  CALL
		
	}

	public void parameter ()
	{
	System.out.println("hi im single parameter constructor..");
	}
}
