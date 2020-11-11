import java.util.Scanner;

public class Sample {

	int employeeid[]=new int[5];
	int i,n;
	Scanner s1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		n=s1.nextInt();
		
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the Array value is::");
			employeeid[i]=s1.nextInt();
		}
	}
	void display()
	{
		for(i=0;i<=n;i++)
		{
		System.out.println("Array value is::"+employeeid[i]);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();
		s1.display();

	}

}
