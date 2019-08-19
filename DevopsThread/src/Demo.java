
public class Demo extends Thread 
{
	public void run()
	{
		try
		{
			for(int i=0;i<=4;i++)
			{
				System.out.println("loopEnter"+i);
				Thread.sleep(2000);
				System.out.println("loopOut"+i);
				
			}
			System.out.println("CurrentThreadName"+currentThread().getName());
			System.out.println("CurrentThreadPrity"+currentThread().getPriority());
		}
		catch(InterruptedException t)
		{
			
		}
	}
}

class Foo
{
	public static void main(String[] args) 
	{
	  
		Demo f1=new Demo();
		Demo f2=new Demo();
		f1.start();
		f2.start();
		
		try
		{
			System.out.println("JoinIN");
			
			//f1.join(3000);
			f1.join();
			
			System.out.println("JoinOUT");
			
		}
		catch(InterruptedException t)
		{
			
		}

	}

}
