
public class ThreadExample extends Thread
{

	public void run()
	{
		System.out.println("ThreadPri"+currentThread().getPriority());
		System.out.println("ThreadName is:"+currentThread().getName());
	}
	public static void main(String[] args) 
	{
		ThreadExample t1=new ThreadExample();
		ThreadExample t2=new ThreadExample();
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setName("Azar");
		t2.start();
		
	}

}
