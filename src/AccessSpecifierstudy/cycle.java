package AccessSpecifierstudy;

public class cycle {

	 private String gear ="oil";
	public int p=98;
	protected int o=78;
	int y=45;
	 
	
	private void tyre()
	{
		System.out.println(" im private method from cycle class");
	}
	
	void horn()
	{
		System.out.println(" im default method from cycle classs");
	}
	protected void air()
	{
		System.out.println(" im protected method from cycle class");
		
	}
}
