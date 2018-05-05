import java.util.Scanner;

public class Demo extends Thread
{

	public void run()
	{
		Scanner scn=new Scanner(System.in);
		try
		{
			System.out.println("Enter the value is::");
			sleep(3000);
			System.out.println("Please given input");
			String name=scn.next();
			System.out.println("Your name is::"+name);
		}
		catch(InterruptedException t)
		{
			
		}
	}
	
	public static void main(String[] args) 
	{
		Demo t1=new Demo();
		//Demo t2=new Demo();
		t1.start();
		//t2.start();
		

	}

}
