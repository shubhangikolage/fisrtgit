package loops;

public class forPrac {

	public static void main(String[] args) {
    // to print * pattern
		
		for(int i=1; i<=4;i++)   // for rows
		{
		for(int j=1;j<=i;j++)  // for columns
		{
			System.out.print("*");
		}
		System.out.println();
	
	    }
		System.out.println(" reverse order");
      //  to print * pattern in reverse order started from 4
		for( int m=1;m<=4;m++)
		{
			for(int n=4;n>=m;n--)
			{
			System.out.print("*");
			}
			System.out.println();
		}	
	      } 

            }
