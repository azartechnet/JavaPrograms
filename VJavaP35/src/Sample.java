class Demo extends Thread
{
	public void run()
	{
		try
		{
		System.out.println("RunIN");
		System.out.println("CurrentThreadName::"+currentThread().getName());
		System.out.println("CurrentThreadPrity::"+currentThread().getPriority());
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("Waiting for I value....");
			Thread.sleep(1000);
			System.out.println("Sleep::"+i);
		}
		System.out.println("RunOUT");
		//process();
		}
		catch(InterruptedException t)
		{
			
		}
		
	}
//	void process()
//	{
//		System.out.println("CurrentThreadName::"+currentThread().getName());
//		
//		Demo t2=new Demo();
//		t2.start();
//		
//	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.start();
		Demo t2=new Demo();
		t2.start();
		t1.setName("mohamed");
        t1.setPriority(Thread.MAX_PRIORITY);
	}

}
