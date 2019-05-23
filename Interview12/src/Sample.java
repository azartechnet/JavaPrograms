
public class Sample extends Thread
{
	public void run()
	{
	System.out.println("ThreadName"+Thread.currentThread().getName());
	System.out.println("Priority is:"+Thread.currentThread().getPriority());
    //System.out.println(getName());		
 	//System.out.println("****"+getName());
	
	}
}

class Demo
{
	public static void main(String[] args) 
	{
		Sample t1=new Sample();
		Sample t2=new Sample();
		t1.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.setName("NIIT");
		t2.start();
  
	}

}
