
class Sample extends Thread {
	int n=10;
	  public void run()
	  {
	    try
	    {
	      // for(int i=0;i<=n;i++)
	       //{
	         //  System.out.println("I value is"+i);
	           Thread.sleep(5000);
	           System.out.println(currentThread().getName());
	           System.out.println(currentThread().getPriority());
	       //}
	    }
	    catch(InterruptedException r)
	    {
	   
	    }
	  } 
}
class Foo
{
  public static void main(String as[])
  {
	  Sample t1=new Sample();
	  Sample t2=new Sample();
	  
	  t1.start();
	  t2.start();
	  t1.setName("niit");
	 // t1.setPriority(Thread.MAX_PRIORITY);
  }
}
