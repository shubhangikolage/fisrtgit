package inheritanceStudy;

public class CompnyEmpSingleLevel {

	public static void main(String[] args) {
       System.out.println("--welcome to company class--");
		Company c =new Company();
		c.lift();
		Company.canteen();
		
		System.out.println("--welcome to employee class--");
		Employee e= new Employee();
		e.mobile();
		Employee.bike();
		e.lift();
		Employee.canteen();
		
	}

}
