package inheritanceStudy;

public class motherChildBabyHiearchicl {

	public static void main(String[] args) {
    Mother m =new Mother();//super class
    m.nature();
    Mother.care();
		System.out.println("-------------------");
		
	Child c= new Child(); //sub class 1
	c.dependant();
	Child.career();
	c.nature();   // calling super class properties
	System.out.println("-------------------");
	
	baby b =new baby(); // sub class 2
	baby.cry();
	b.sleep();
	b.nature();//calling superclass properties
	}

}
