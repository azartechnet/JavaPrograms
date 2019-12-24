
class Sample extends Thread {
	int n=10;
	  public void run()
	  {
	    try
	    {
	       for(int i=0;i<=n;i++)
	       {
	           System.out.println("I value is"+i);
	           Thread.sleep(10000);
	           System.out.println(currentThread().getPriority());
	       }
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
	  t1.start();
	  t1.setPriority(Thread.MAX_PRIORITY);
  }
}
