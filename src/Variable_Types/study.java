package Variable_Types;


     public class study {
	int p=500;           // declaration & intialition non static global variable
    static int q=900;    //declare and assign value to static global variable


	public static void main(String[] args) {
		
     study s = new study();    // object creation
	 s.test();
		run();
		
		  //// USAGE of global variable///
		System.out.println("....USAGE OF GLOBAL VARIABLES......");
		System.out.println(" value of p is "+s.p); // call non-static variable in static method
		System.out.println(" value of q is "+q); // call static variable in static method
		
	}
	
	public void test()   // create non-static  class
	{
		int sum=700-q;     //call static global variable in non static method is fine.
		int mul=4*p;       //call non static global variable in non static method is ok..
		
		System.out.println("value of sum is=  "+sum);
		System.out.println("value of mul is=  "+mul);
	}
	
	public static void  run()    //create  static method
	{
		int  div=q/3;  //static global variable in static method is okk..
		//int add=p+400; //can't take non-static global variable in static method
		
		System.out.println("division is ="+div);
	}
	
	
	
	
}
