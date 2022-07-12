package controlStatements;

public class swtchcs4 {

	public static void main(String[] args) {
        //grade A= you got 75%
		//grade B=you got 60%
		//grade C= you got 45%
		//grade D=sorry you are failed
		char grade='B';
	
		switch(grade)
		{
			case'A':
			System.out.println("you got 75%");
			break; 
			case 'B':
				System.out.println("you got 60%");
			break;
			case 'C':
			System.out.println("you got 45%");
			break;
			case 'D':
				System.out.println("soory you are failed");
			break;
			default:
				System.out.println("please enter grade betn A-D");
			break;	
		}
	}

}
