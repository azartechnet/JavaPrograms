
public class Demo implements Runnable
{
	
	public void run()
	{
		try
		{
		System.out.println("IN");
		Thread.sleep(5000);
		System.out.println("OUT");
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
	}
	void g2()
	{
		System.out.println("welcome-2");
	}
}
class Foo
{
	public static void main(String[] args)
	{
		Demo h=new Demo();
		Thread j1=new Thread(h);
		j1.start();
		h.g2();

	}

}
