package controlStatements;

public class elseIf_study {

	public static void main(String[] args) {
		// if city==Pune then welcome to pune 
        //elseif city==Osmanabad then welcome to osmanabad
		//elseif city== Latur then welcome to latur
	    //else "you are not in maharashtra"
		
		 String city ="Mumbai";
		 
		 if(city=="Pune")
		 {
			 System.out.println(" Welcome To Pune..");
		 }
		 else if (city=="Osmanabad") 
		 {
			System.out.println(" Welcome To Osmanabad..");
		}
		 else if (city=="Latur") 
		 {
		 System.out.println(" Welcome To Latur..");
			
		}
	
		 else {
			System.out.println("You Are Not In Maharashtra");
		}
	
	}

}
