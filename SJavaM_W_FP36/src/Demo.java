
public class Demo extends Thread {

	int i;
	public void run()
	{
	   try
	   {
		   for(i=0;i<=1;i++)
		   {
			  System.out.println("Waiting");
			  Thread.sleep(10000);
			  System.out.println("I value is::"+i);
		   }
		   System.out.println("ThreadName::"+currentThread().getName());
		   System.out.println("PriorityName::"+currentThread().getPriority());
	   }
	   catch(InterruptedException r)
	   {
		   System.out.println(r);
	   }
	}
	
	
	
	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.start();
		t1.setName("abi");
		t1.setPriority(Thread.MAX_PRIORITY);
		
	

	}

}
