
public class Demo extends Thread
{

  void get1()
  {
	  System.out.println("NormalMethod..");
  }
  public void run()
  {
//	  try
//	  {
      //System.out.println("welcomeIN");
	  //Thread.sleep(10000);
	  //System.out.println("welcomeOUT");
	  }
//	  catch(InterruptedException r)
//	  {
//		  
//	  }
  }
  
	
}
class Demo1
{
	public static void main(String[] args)
	{
		
		Demo t1=new Demo();
		t1.start();

	}

}
