
public class Sample extends Thread 
{
	public void run()
	{
		System.out.println("ThreadName is:"+currentThread().getName());
		System.out.println("ThreadPrty is:"+currentThread().getPriority());
	}
}
	

	
class Demo
{
	
	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		Sample s2=new Sample();
		
		
		s1.setName("NIIT");
		s1.setPriority(Thread.MIN_PRIORITY);
		s2.setPriority(Thread.MAX_PRIORITY);
		s1.start();
	
		s2.start();
		

	}

}
