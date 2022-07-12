package arryStudy;

public class intArray {

	public static void main(String[] args) {
     	//1,2,3
     	int a[]=new int[3];
        a[0]=1;
     	a[1]=2;
     	a[2]=3;
     System.out.println(a[0]);
     System.out.println(a[1]);
     System.out.println(a[2]);
     System.out.println("===static for loop===");
   //static for loop
     for(int i=0;i<=2;i++)
     {
    	 System.out.println(a[i]);
     }
     System.out.println("===dynamic for loop===");
     for(int j=0;j<=a.length-1;j++)
     {
    	 System.out.println(a[j]);
     }
     
	}

}
