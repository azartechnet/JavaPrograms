package newpgpthread2;

class Sample extends Thread
{
	public void run()
	{
		System.out.println("Current thread name"+currentThread().getName());
		System.out.println("Current thread priority"+currentThread().getPriority());
	}
}



public class Demo {

	public static void main(String[] args)
	{
		
		Sample t1=new Sample();
		Sample t2=new Sample();
		t1.start();//Thread-0
		t2.start();//Thread-1
		t2.setName("Niit");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);

	}

}
