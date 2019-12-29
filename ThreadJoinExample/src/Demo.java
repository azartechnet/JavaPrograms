
public class Demo extends Thread 
{
public  void run()
  {
	 try
	 {
	  for(int i=0;i<=5;i++)
	  {
		 System.out.println("IN");
		 Thread.sleep(5000);
	     System.out.println("I value is:\n"+i);
	  }
	 }
	 catch(Exception t)
	 {
		 System.out.println(t);
	 }
  }
}
class Sample
{
	public static void main(String[] args) 
	{
		
      Demo t1=new Demo();
      Demo t2=new Demo();
      t1.start();
      try
      {
      System.out.println("JoinIN");
      t1.join(10000);
      System.out.println("JoinOut");
      }
      catch(InterruptedException t)
      {
    	  System.out.println(t);
      }
      System.out.println("t2 started");
      t2.start();
      System.out.println("t2 ended..");
	}

}
