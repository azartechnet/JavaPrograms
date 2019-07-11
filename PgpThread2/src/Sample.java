
public class Sample extends Thread 
{
	public void run()
	{
		try
		{
			System.out.println("ThreadProcessIN");
			Thread.sleep(10000);
			System.out.println("ThreadProcessOUT"+currentThread().getName()+""+currentThread().getPriority());
			
		}
		catch(InterruptedException r)
		{
			System.out.println(r);
		}
	}
}

class Demo
{
	public static void main(String[] args) 
	{
		Sample t1=new Sample();
		t1.start();
		Sample t2=new Sample();
		t2.start();
		t1.setName("niitdgl");
		t2.setName("niitkrr");
		t1.setPriority(Thread.MAX_PRIORITY);

	}

}
