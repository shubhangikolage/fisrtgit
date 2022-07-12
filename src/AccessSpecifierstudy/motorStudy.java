package AccessSpecifierstudy;

public class motorStudy {
 int a=10;
 protected int b=45;
 public int c=50;
 private String name ="rani";

 
	public static void main(String[] args) {		
      motorStudy m= new motorStudy();
      m.run();
      cycle u= new cycle(); // object of cycle class
      u.horn(); //call default method from cycle class
      u.air(); // call protected from cycle class
	}
  public void run()    // non static method
{
	int q=a+b;
	System.out.println(q);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(name);


	}
  
  
}
