package controlStatements;

public class switchcs2 {

	
	public static void main(String[] args) {
     //day 1=monday
	 //day 2=tuesday
	//day 3=wednesday
	//day 4=thrusday
	//day 5=friday
	//day 6=saturday
	//day 7=sunday
		
		int day=2;
		switch (day) 
		{
		case 1: 
		    
        System.out.println("Today is monday.. ");	
             
		break;
		case 2:
		     
			System.out.println("Today is tuesday..");
		      
		break;
		case 3:
		
			System.err.println("Today is wednesday");
		
		break;
		case 4:
		
			System.err.println("Today is thrusday ");
		
		break;
		case 5:
		
			System.err.println("Today is friday");
		
		break;
		case 6:
		
			System.err.println("Today is saturday");
		
		break;
		case 7:
		
			System.err.println("Today is sunday");
		
		break;
		
		default:
			System.out.println("please enter days from 1-7");
		}
			
}
}