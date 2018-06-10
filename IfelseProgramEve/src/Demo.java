import java.util.Scanner;

public class Demo
{

	int a;
	Scanner f=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		a=f.nextInt();
	}
	void get2()
	{
		if(a%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
	
	public static void main(String[] args)
	{
		Demo k=new Demo();
		k.get1();
		k.get2();

	}

}
