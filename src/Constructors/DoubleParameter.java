package Constructors;

    public class DoubleParameter {
    int x=10;
    int y=30;
	public DoubleParameter(int m,int n)          	
	{                                      
	    int	mul=x*m*n;
	    int div=m/n;
		System.out.println(" multiplication is "+mul);
		System.out.println(" division is "+div);
	}

	
	public static void main(String[] args) {
		DoubleParameter d=  new DoubleParameter(20,5); //always put parameter in object creation
				d.math();
		
		
		
	}

	public void math()
	{
		int add=x+y;
		System.out.println(" addition is "+add);
		}
	
	
	
	
}
