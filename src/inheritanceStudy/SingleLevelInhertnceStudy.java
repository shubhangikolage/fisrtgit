package inheritanceStudy;

public class SingleLevelInhertnceStudy {

	public static void main(String[] args) {
     Mother m=new Mother(); //creating object for mother class
   m.nature();
   Mother.care();
   
   Child c=new Child();   
   Child.career(); //call child  static property
   c.dependant();
   c.nature();  //inheritate properties from mother class
   Child.care(); //inheritance mothers class properties
   
   
	}

}
