package controlStatements;

public class switchcs3 {

	public static void main(String[] args) {
    //month=1; jan      //month =4; april
	//month=2; feb	    //month =5;may
	//month=3; march    //month =6; june
    // month=7; july      //month=8;august
	//month =9;september   //month=10; october
		// month=11; nov //month=12; dec
		 String month="xyz";
		 switch (month) {
		case "jan":
			System.out.println("welcome to january month");
			break;

		case "feb":
			System.out.println("welcome to february month");
			break;

		case "mar":
			System.out.println("welcome to march month");
			break;
		case "apr":
			System.out.println("welcome to april month");
			break;
		case "may":
			System.out.println("welcome to may month");
			break;
		case "jun":
			System.out.println("welcome to june month");
			break;
		case "jul":
			System.out.println("welcome to jully month");
			break;
		case "aug":
			System.out.println("welcome to auguast month");
			break;
		case "sep":
			System.out.println("welcome to september month");
			break;
		case "oct":
			System.out.println("welcome to octomber month");
			break;
		case "nov":
			System.out.println("welcome to november month");
			break;
		case "dec":
			System.out.println("welcome to december month");
			break;
			
			
			
			default:
			{
			System.out.println("plase enter month betwn jan to dec");	
			}
			break;
		 }
	}

}
