import java.util.Scanner;

public class Sample {

	int productid[][]=new int[2][2];
	int i,j,m,n;
	Scanner sc1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		n=sc1.nextInt();
		m=sc1.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("I value is::"+i+"\t"+"J Value is:"+j);
			}
		}
	}
	
	public static void main(String[] args) {
	
		Sample s1=new Sample();
		s1.get1();

	}

}
