import java.util.Scanner;

public class Sample {

	
	int categoryid[][]=new int[2][2];
	int i,j,n,m;
	Scanner sc1=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value is::");
		n=sc1.nextInt();
		m=sc1.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the Array value is::");
				categoryid[i][j]=sc1.nextInt();
			}
		}
		
	}
	void display()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Your array value is::"+categoryid[i][j]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		
             Sample d1=new Sample();
             d1.input();
             d1.display();
	}

}
