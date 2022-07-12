package methodStudy;


public class nonstatic {

	public static void main(String[] args) {
		//non static display method from same class  
		nonstatic obj=new nonstatic();   //ClassName Object=new ClasssName(); 
		obj.display();                   //object.MethodName();
		 
		// Non static running method from another class
		NonStatAnotherclass run=new NonStatAnotherclass();
		run.running();
		
	}

	public void display()
	{
	System.out.println("hii..im non static method in same nonstatic class..");	
	}
}
