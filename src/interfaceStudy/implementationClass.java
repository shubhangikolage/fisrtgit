package interfaceStudy;

public class implementationClass implements interfaceTest {

	public static void main(String[] args) {
implementationClass i= new implementationClass();
i.add();
i.sub();   
	System.out.println(a);
	//a=a+1;  cant update a value bcz its static & final 
		
	}

	@Override
	public void add() {
System.out.println("add");		
	}

	@Override
	public void sub() {
System.out.println("sub");		
	}

}
