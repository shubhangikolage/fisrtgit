package methodStudy;

public class MathsOperations {

	public static void main(String[] args) {
         add();       //calling method from same class
         
         MathsOperations s1=new MathsOperations(); //create object for non static method
		 s1.sub();   //calling non static method from same class
		 
		 MathsOperation1.mul(40, 10); //static method from another class i.e MathsOperation1
		 
		 MathsOperation1 s2=new MathsOperation1();
		 s2.div(60,10);
		 
		 
	
		 
	}
   public static void add()//no parameter
 {
	  int a=100;
	  int b=599;
	  int sum =a+b;
	  System.out.println("Addition is "+sum);
 }
 
 public void sub()
 {
	 int a=799;
	 int b=500;
	 int substaction=a-b;
	 System.out.println("substraction is "+substaction);
 }
 
 
 
 
 
 
 
 
 
 
}
