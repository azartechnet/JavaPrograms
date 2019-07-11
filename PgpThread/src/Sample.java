import java.util.Scanner;

public class Sample implements Runnable
{

	
	int age;
	Scanner d1=new Scanner(System.in);
	public void run()
	{
		try
		{
		System.out.println("run methodIN");
		Thread.sleep(2000);
		System.out.println("Enter the value is:");
		age=d1.nextInt();
		System.out.println("Age is:"+age);
		}
		catch(InterruptedException r)
		{
			System.out.println(r);
		}
		finally
		{
			System.out.println("Welcome");
		}
	}
	
	
}

class Sam
{
	public static void main(String[] args)
	{
		Sample s1=new Sample();
		Thread t1=new Thread(s1);
		//s1.start();
		//s1.run();
		t1.start();

	}

}
