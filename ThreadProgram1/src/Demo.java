
public class Demo extends Thread  
{
  	public void run()
  	{
  		try
  		{
  	    	
  		Thread.sleep(100000);	
  	   System.out.println("ThreadPrity:::"+currentThread().getPriority());
  		System.out.println("CurrentThread:::"+currentThread().getName());
  		}
  		catch(Exception t)
  		{
  			System.out.println(t);
  		}
  		
  	}
  	synchronized void get() throws InterruptedException
		{
			
				System.out.println("Wait block IN");
				wait(5000);
				System.out.println("Wait block OUT");
				notify();
				System.out.println("NOTIFY OUT");
			
		}
}
class Demo1
{

	public static void main(String[] args) throws InterruptedException 
	{
	Demo t1=new Demo();
	Demo t2=new Demo();
	t1.start();
	t1.join(5000);
	t1.setName("NIIT-KARUR");
	t1.setPriority(Thread.NORM_PRIORITY);
	t2.start();
	
	t2.setName("NIIT-DGL");
    t2.setPriority(Thread.MAX_PRIORITY);
    t1.get();
	}

}
