
public class Sample extends Thread
{
	
	public void get()
	{
		try
		{
		  for(int i=0;i<=5;i++)
		  {
		  System.out.println("In"+i);	
		  Thread.sleep(3000);
		  System.out.println("Out"+i);
		  }
		}
		catch(InterruptedException r)
		{
			
		}
	}

	public static void main(String[] args)
	{
		Sample t1=new Sample();;
		//t1.start();
		t1.get();

	}

}
