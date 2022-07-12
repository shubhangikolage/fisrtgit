package arryStudy;

import interfaceStudy.implementationClass;
import interfaceStudy.interfaceTest;
import practise.forStudy;

public class charArray {

	public static void main(String[] args) {
      //a,b,c,d
		char c[]=new char[4];
		c[0]='A';
		c[1]='B';
		c[2]='C';
		c[3]='D';
		System.out.println(c[0]);
		System.out.println(	c[1]);
         System.out.println(c[2]);
         System.out.println(c[3]);
         System.out.println("======static method======");
       //using for loop-static method
         
	
	for(int i=0;i<=3;i++)
	{
		System.out.println(c[i]);
	
		
	}
	System.out.println("====dynamic loop======");
	for(int j=0;j<=c.length-1;j++)
	{
		System.out.println(c[j]);
	}
	
	}
}
	
	
	


