
public class Sample implements Runnable
{
	
	
	public void run()//pre define
	{
		try
		{
		System.out.println("welcome to thread-In");
		Thread.sleep(20000);
		System.out.println("welcome to thread-Out");
		}
		catch(InterruptedException r)
		{
			System.out.println(r);
		}
	}
	void input()
	{
		System.out.println("Welcome to Normal Method");
	}

	public static void main(String[] args) {
		
		Sample s=new Sample();
		Thread t1=new Thread(s);
		t1.start();//to strat thread to creating thread object
		s.input();

	}

}
