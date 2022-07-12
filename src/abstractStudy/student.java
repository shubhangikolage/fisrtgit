package abstractStudy;

public abstract class student  {

	public static void main(String[] args) {

		//student student= new student(); // object creation of abstract class wont possible
		
		
		
	}
  public void assignment()            //complete method
  {
	  System.out.println(" i completed my assignment");
  }
  
  
	public abstract void test(); // incomplete method
	
	public void marks()
	{
		System.out.println("i got 80 marks");
	}
	
}
