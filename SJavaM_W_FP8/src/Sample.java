import java.util.Scanner;

public class Sample {

	int i,n;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even"+i);
			}
			else
			{
				System.out.println("Odd"+i);
			}
				
			//System.out.println("I value is::"+i);
		}
	}
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();

	}

}
