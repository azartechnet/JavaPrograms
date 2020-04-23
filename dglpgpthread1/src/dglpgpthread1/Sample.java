package dglpgpthread1;

class Demo extends Thread
{
	public void run()
	{
		try
		{
		for(int i=0;i<=5;i++)
		{
			System.out.println("RunIn"+i);
			Thread.sleep(20000);
			System.out.println("RunOut"+i);
		}
		}
		catch(InterruptedException r)
		{
			
		}
	}
}



public class Sample {

	public static void main(String[] args) {
		

		Demo t1=new Demo();
		t1.start();
		
	}

}
