package inheritanceStudy;

public class CmpnyMngEmpMultilevl {

	public static void main(String[] args) {
           System.out.println("..welcome to our company..");
		Company c=new Company(); //supermost class
		c.lift(); //calling company own non static properties
		Company.canteen(); //calling own static peoperties
		System.out.println("----------------------");
		
		System.out.println("..welcome to manager area..");
		Manager m= new Manager(); //super class
		m.cabin();   // calling  its own non ststic properties
		Manager.rule(); //calling its own static propets
		
		System.out.println("----------------------");
		System.out.println("..welcome to employee area..");
		Employee e = new Employee();
		e.mobile();
		Employee.bike();
		Employee.canteen(); //calling supermost class properties
		Employee.rule();//calling super class properits
		e.cabin(); //calling super class properties
		e.lift();//calling supermost class properties
		
	}
	
	

}
