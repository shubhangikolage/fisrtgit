package interfaceStudy;
//multiple inheritance using interface i.e. father ,mother super class .daughter -child class
public interface mother {
	
void cash();


  default void love()     // default keyword if vwev want to give body to abstact method
{
	  
	System.out.println("im default method from mother interface ");  
	  
	}
  
  
  //method as static
    static void house()
    {
    	System.out.println("mothers home");
    }
}
