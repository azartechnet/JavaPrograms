import java.util.Scanner;

public class DemoApp 
{
	
	int n;
	
	int a[]=new int[5];
	
	Scanner scan=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the n value is::");
		n=scan.nextInt();//n=3
	}
	void disp()
	{
		for(int i=0;i<=n;i++)
		{
			System.out.println("Enter the ArrayValue is:::");
			a[i]=scan.nextInt();
		}
		for(int i=0;i<=n;i++)
		{
			System.out.println("Array value is::"+a[i]);
		}
		
	}
	

	public static void main(String[] args) 
	{
		DemoApp h=new DemoApp();
		h.input();
		h.disp();

	}

}
