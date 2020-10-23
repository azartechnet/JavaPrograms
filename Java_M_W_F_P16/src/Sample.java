import java.util.Scanner;

public class Sample {

	int productid[]=new int[10];
	int i,n;
	Scanner sc1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		n=sc1.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the value is::");
			productid[i]=sc1.nextInt();
			//System.out.println("Your value is::"+productid[i]);
		}
		
		
	}
	void display()
	{
		for(i=0;i<=n;i++)
		{
			System.out.println("Your value is::"+productid[0]);
		}
	}
	public static void main(String[] args) {
		
		
		Sample s1=new Sample();
		s1.get1();
        s1.display();
        
	}

}
