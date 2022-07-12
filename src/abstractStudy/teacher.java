package abstractStudy;

public class teacher extends student         // teacher=abstract class
{

	public static void main(String[] args) {
   teacher t= new teacher();  // object of concrete class
	t.marksheet();  // calling its own method
	t.test();  // now its become is own method
	t.assignment();
	t.marks();
	}
	
  public void marksheet()       //its own method
  {
	  System.out.println("students marksheet");
  }
  
  @Override
public void test()         //method of student class completed here
{
System.out.println(" hi..im from student class");	
}
   
}
