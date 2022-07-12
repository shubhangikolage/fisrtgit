package interfaceStudy;

public class daughter implements father,mother {

	
	
	public static void main(String[] args) {
      daughter d = new daughter(); // creating object 
      d.care(); // calling care method
      d.cash(); //calling cash method
      d.love();
	}

	@Override
	public void care() {

System.out.println("hi im from care method from daughter");		
	}

	@Override
	public void cash() {
System.out.println("hi im from cash merthod from daughter");		
	}

	@Override
	public void love() {
		father.super.love();  // multiple inheritnce
		mother.super.love(); // multiple inheritance
		father.house(); // static method call == classname.methodname
		mother.house();
	}

}
