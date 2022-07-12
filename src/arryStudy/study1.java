package arryStudy;


public class study1 {

	public static void main(String[] args) {
       //array declaration
		String name[]=new String[4];
		
		//array iniationation
			name[0]="shubhz";	
			name[1]="rani";
			name[2]="xyz";
			name[3]="abc";
			
			//usage
			System.out.println(name[0]);
			System.out.println(name[2]);
			System.out.println("==============");
			
			//using for loop-static
			for(int i=0;i<=3;i++)
			{
				System.out.println(name[i]);
			} 
			System.out.println("============");
			//using dynamic method
			//maxindex=length-1;
			
			for(int i=0;i<=name.length-1;i++)
			{
				System.out.println(name[i]);
			}
			
			
	}

}
