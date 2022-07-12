package arryStudy;



public class multidimensnArray {

	public static void main(String[] args) {
String name[][]=new String [2][2];//array  creation
name[0][0]="my";
name[0][1]="name";
name[1][0]="is";
name[1][1]	="shubhangi";

for(int i=0;i<2;i++)
{
	for(int j=0;j<2;j++)
	{
		System.out.print(name[i][j] +" ");
	}
	System.out.println();
	}

	}

}
