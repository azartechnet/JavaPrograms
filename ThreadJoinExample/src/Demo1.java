
public class Demo1 extends Thread
{
/*	public void run()
	{
		try
		{
		for(int i=0;i<5;i++)
		{
			System.out.println("SleepIN"+i);
			Thread.sleep(3000);
			System.out.println("SleepOUT"+i);
		}
		 }
		catch(Exception g)
		{
			System.out.println(g);
		}
	}*/
	
	synchronized void get1()
	{
		try
		{
			System.out.println("Wait IN");
	        wait(300000);	
	       System.out.println("Wait OUT");
		System.out.println("MethodIN");
		notify();
		System.out.println("MethodOUT");
		}
		catch(Exception t)
		{
			
		}
		
	}
}
class Foo
{
	public static void main(String[] args) 
	{
		Demo1 t1=new Demo1();
        //Demo1 t2=new Demo1();
      //  t1.start();
        t1.get1();

	}

}
