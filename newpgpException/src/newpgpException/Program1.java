package newpgpException;

import java.util.Scanner;

class Demo
{
	void process()throws Exception
	{
		int pid;
		Scanner sc=new Scanner(System.in);
		try
		{
			
		//int a=10/0;//Exception
			String str1=null;
			System.out.println(str1.length());
		}
		catch(ArithmeticException r)
		{
		System.out.println(r);
		}
		catch(NullPointerException r1)
		{
			System.out.println("Please check String");
		}
		finally
		{
		System.out.println("Enter the Integer value is:");
	    pid=sc.nextInt();
	    System.out.println("Your id is:"+pid);
		}
	}
}




public class Program1 {

	public static void main(String[] args) throws Exception {
		
		Demo f1=new Demo();
		f1.process();

	}

}
