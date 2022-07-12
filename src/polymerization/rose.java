package polymerization;

public class rose {

	public static void main(String[] args) {
		rose r =new rose();
		r.flower(1);
		r.flower(3, 9);
		r.flower(1, 3, 5);

	}
public void flower(int a)
{
System.out.println("i have 1 rose");	
}
public void flower (int a,int b)
{
	System.out.println("i have 2 roses ");
	}
public void flower(int a,int b,int c)
{
	System.out.println("i have 3 roses");
	}
}
