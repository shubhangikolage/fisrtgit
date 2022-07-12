package controlStatements;

public class nestedIfStudy {

	public static void main(String[] args) {
        //if atm pin is correct then please enter amount
		//else please enter correct atm pin
		
		int pin=2072;
		int amt=10000;
		
		if(pin==2072)
		{
			System.out.println("enter correct amount=");
			    if(amt==10000)
				
			     {
				System.out.println("transaction succesful..");
			      }
			    
			else
			{
				System.out.println("");
			}
			    
		}
		
		else{
			System.out.println("enter correct pin");
		}
		
		
		
		
		
		
		
		
		
		}

}
