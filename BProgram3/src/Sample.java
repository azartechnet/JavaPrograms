import java.util.Scanner;

public class Sample 
{
	
	int sal;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value is:");
		sal=sc.nextInt();
		
		if(sal>=20000)
		{
			System.out.println("TrueBlock");
		}
		else
		{
			System.out.println("FlaseBlock");
		}
	}
	void loopingProcess()
	{
		int n=2;
		int m=10;
		for(int i=0;i<=m;i++)
		{
			if(i%n==0)
			{
				System.out.println("I value is Even"+i);
			}
			else
			{
				System.out.println("I value is Odd"+i);
			}
		}
	}
	
	
}

class MainClass
{
	public static void main(String[] args) {
	
		Sample f1=new Sample();
		f1.input();
		f1.loopingProcess();

	}

}
