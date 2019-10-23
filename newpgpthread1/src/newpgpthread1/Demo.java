package newpgpthread1;

public class Demo implements Runnable
{
 public void run()
  {
	  try
	  {
	   /*System.out.println("runIN");
	   Thread.sleep(20000);	  
	   System.out.println("runOut");*/
		  
	  for(int i=0;i<=5;i++)
	  {
		  System.out.println("Waiting..");
		  Thread.sleep(10000);
		  System.out.println("I value is"+i);
	  }
		  
	  }
	  catch(InterruptedException r)
	  {
		  
	  }
  }
 
}
class Sample
{
	public static void main(String as[])
	{
		Demo t1=new Demo();//thread object-1
		Thread f1=new Thread(t1);
		f1.start();
	}
}
