import java.util.Scanner;

class Demo 
{

	void get1()//function-1
	{
		try
		{
		int a=10/2;
		System.out.println(a);
		String s1=null;
		System.out.println("length::"+s1.length());
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check your Application");
		}
		catch(NullPointerException t1)
		{
			System.out.println("Please check your String value");
		}
		finally
		{
			System.out.println("finally block");
		}
	}
	void get2()
	{
		int productid;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the productid::");
		productid=sc.nextInt();
		System.out.println("Your Productid is::"+productid);
	}
	public static void main(String as[]) {
		
		System.out.println("MainIn");
		Demo d1=new Demo();
		d1.get1();
		d1.get2();
	    System.out.println("MainOut");

	}

}
