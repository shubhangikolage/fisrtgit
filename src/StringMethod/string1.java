package StringMethod;

public class string1 {

	public static void main(String[] args) {
 String branch ="computer";
 String  stream="engg";
 String stream1="ENGG";
 String stream2="engg";
 
      // lenght() method
      System.out.println("=====length of=======");
       System.out.println(branch.length());
       int a =branch.length();
       System.out.println("length of branch= "+a );
       
       //toUpperCase()method
       System.out.println("===toUpperCase===");
      System.out.println(stream.toUpperCase());
      String up=stream.toUpperCase();
      System.out.println(up);
 
      //toLowerCase()method
      System.out.println("====toLowerCase===");
      System.out.println(up.toLowerCase());
     String lw=up.toLowerCase();
       System.out.println(lw);
       
       //equals() method
       System.out.println("===equals() method===");
       System.out.println(stream.equals(stream1));
       System.out.println(stream1.equals(stream2));
       System.out.println(stream.equals(stream2));
       System.out.println(stream==stream2); //==operatror used to denote memory location i.e stream,stream2 object denoted single data
       
       //equalsIgnoreCase() method
       System.out.println("==equalsIgnoreCase() method==");
       System.out.println(stream1.equalsIgnoreCase(stream2) );
       System.out.println(branch.equalsIgnoreCase(stream2));
       
       //contains() method
       System.out.println("===contains() method===");
       System.out.println(stream.contains("g"));
       System.out.println(stream.contains("s"));
       
       //isEmpty() method
       String say="hello";
       String svk =""; //empty
       String b=" ";
       //String c=null;
       System.out.println("===isEmpty() method==");
    System.out.println(say.isEmpty());
    System.out.println(svk.isEmpty());
    System.out.println(b.isEmpty());
   // System.out.println(c.isEmpty()); //NullPointerException

       //blank() METHOD
    System.out.println("===blank() method==");
       System.out.println(say.isBlank());
       System.out.println(svk.isBlank());
       System.out.println(b.isBlank());
       
       //charAt() method
       System.out.println("==charAt() method==");
       char c=say.charAt(3);//hello
       System.out.println(c);
      // char o=svk.charAt(1);
       //System.out.println(o);//stringIndexOutOfBoundry
       
       //endsWith
       System.out.println("===endsWith====");
       String wife="shubhangi";
       String hubby="suraj";
       System.out.println("==endsWith===");
       
	boolean h=hubby.endsWith("S");//false
       System.out.println(h);
   	boolean h1=hubby.endsWith("raj");
       System.out.println(h1); //true
       
       //startWith() method
       System.out.println("==startWith() method===");
       boolean w1=wife.startsWith("ubh");
       boolean w2=wife.startsWith("shubh");
        System.out.println(w1);
       System.out.println(w2);

     //substring method use
      System.out.println("===substring==");
       
       String fullname="shubhangi suraj pawar";
       
      String f =fullname.substring(3);
      System.out.println(f);
      String f1 =fullname.substring(10);
      System.out.println(f1);      //suraj pawar

      ////concat method study
     System.out.println("==concat method=====");
       System.out.println(wife.concat(hubby));
       
		//indexOf method use
		String state="Maharashtra";
		
		System.out.println(state.indexOf('a'));
		System.out.println(state.indexOf('a', 4));
		System.out.println(state.lastIndexOf('a'));
		
		System.out.println("====================");
		
		//replace method use
		
		String tal="Pune Mumbai Nagpur";

		System.out.println(tal.replace('P', 'M'));
		
		System.out.println(tal.replace("Pu", "Ku"));
		
		System.out.println(tal.replaceAll(" ", "x"));
		
		

	}

}
