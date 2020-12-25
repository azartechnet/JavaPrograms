import java.util.Scanner;

public class Sample {

	int a[]=new int[5];
	int i,n;
	Scanner sc1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		n=sc1.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the array value is::");
			a[i]=sc1.nextInt();
		}
		for(i=0;i<=n;i++)
		{
			System.out.println("Your array value is::"+a[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Sample d1=new Sample();
		d1.get1();

	}

}
