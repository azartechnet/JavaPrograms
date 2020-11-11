import java.util.Scanner;

class Demo extends Thread
{int empid;
	public void run()
	{
		System.out.println("Run is working..");
		get1();
	}
	void get1()
	{
		try
		{
	    System.out.println("loading..");
		Thread.sleep(10000);
		
		System.out.println("Enter the Value is::");
		
		Scanner sc1=new Scanner(System.in);
		empid=sc1.nextInt();
		get2();
		}
		catch(InterruptedException r)
		{
			System.out.println(r);
		}
	}
	void get2()
	{
		System.out.println("Your Result is::"+empid);
	}
}



public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.start();

	}

}
