
public class Sample extends Thread
{

  public void run()
  {
	  try
	  {
	  System.out.println("InsideIN");
	  Thread.sleep(10000);
	  System.out.println("welcome to thread..");
	  System.out.println("CurrentThreadName is:"+currentThread().getName());
	  System.out.println("CurrentThreadPriority is:"+currentThread().getPriority());
	  }
	  catch(InterruptedException r)
	  {
		  
	  }
  }
 void get1()
 {
	 System.out.println("Normal method..");
 }
	
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		Sample s2=new Sample();
		s1.start();
		s2.start();
        s2.setPriority(MAX_PRIORITY);
        s2.setName("NIIT");
        s1.get1();
	}

}
