
public class Sample extends Thread
{

	int i;
	public void run()
	{
		try
		{
			
			for(i=0;i<3;i++)
			{
			   System.out.println("ForloopIn");
			   Thread.sleep(20000);
			   System.out.println("ForloopOut");
			}
		}
		catch(InterruptedException r)
		{
			System.out.println(r);
		}
	}
	
	
	public static void main(String[] args) 
	{
	
		Sample s1=new Sample();
		s1.start();

	}

}
