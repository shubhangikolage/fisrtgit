package interfaceStudy;

public interface father {

	
	
	
	 void care();  // incomplete method
	
	void cash();  //incomplete method
	
	 default void love()         // default method used in interface after java 8 version
	 {
		 System.out.println("hi im love method from father  interface");
	 }
	
	//method as static
	 static void house()
	 {
		 System.out.println("fathers home");
	 }
}
