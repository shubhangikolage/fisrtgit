package loops;

public class reverseNum {

	public static void main(String[] args) {
    //reverse number  5432->2345
		int rem;
		int num=5432;
		int rev=0;
		while (num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}

}
