import java.util.Scanner;

public class Sample {
	
	
	int employeeid[][]=new int[2][2];
	int i,n,m,j;
    Scanner s1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the Value::");
		n=s1.nextInt();
		m=s1.nextInt();
	}
	void get2()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the array value is::");
				employeeid[i][j]=s1.nextInt();
				
			}
		}
		
		
	}
	void display()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Your value is::"+employeeid[i][j]);
				
			}
		}
	}
    
  
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		
		s1.get1();
		s1.get2();
		s1.display();

	}

}
