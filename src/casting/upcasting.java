package casting;

public class upcasting {

	public static void main(String[] args) {
father f=new father(); // object of father class--> new keyword denote object of which class
		f.car();
		f.bike();
		daughter d=new daughter();//obj of daughter class
		d.car();
		d.bike();
		d.uniform();
		System.out.println("----upcasting-----");
		
		//upcasting
   father f1=new daughter();// object of daughter upcasting the father class
		//where father is datatype i.e. class datatype
		f1.car();
		f1.bike();
	}

}
