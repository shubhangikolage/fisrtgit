package mockPractise;

 
public class variableStudy {
    int a=100;//global variable
    int b=55;
    static int d=150;//static variable
    
	public static void main(String[] args) {
		variableStudy r =new variableStudy();
		r.run();//call local variable
		int sum=r.a+r.b;//calling non static global varoiableewq	
		System.out.println(sum);
		
	}
public void run()
{
	char c='s';//local variable
	System.out.println("value of char is: "+c);
	}
}
