
public class Sample implements Runnable
{
   @Override
public void run()
   {
	
	   try
	   {
	   System.out.println("Current Thread Name is:\n"+Thread.currentThread().getName());	   
	    Thread.sleep(3000);	   
	   System.out.println("welcome to niit");
	   }
	   catch(InterruptedException r)
	   {
		   System.out.println(r);
	   }
	
   }
}
class Demo
{
	public static void main(String[] args) 
	{
	   System.out.println("MainFunction");
	   Sample t1=new Sample();
	   Thread t2=new Thread(t1);
	   t2.start();
	}

}
