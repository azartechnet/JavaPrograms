package dglthread;

import java.util.Scanner;

class Foo extends Thread
{
	int a;
	Scanner f=new Scanner(System.in);
//	public void run()
//	{
//		try
//		{
//		 // System.out.println("Enter the value is");	
//	      
//	      System.out.println("Now We entered the values");
//	      Thread.sleep(10000);
//	      
//	      a=f.nextInt();
//	      System.out.println("Your value is:"+a);
//		}
//		catch(InterruptedException r)
//		{
//			
//		}
//	}
	
	public void run()
	{
		try
		{
			if(Thread.currentThread().getName().equals("thread1"))
			{
				fun1();
			}
			else if(Thread.currentThread().getName().equals("thread2"))
			{
				fun2();
			}
		}
		catch(Exception r)
		{
			
		}
	}
	
	void fun1()
	{
		System.out.println("welcome to normal method-1");
	}
	void fun2()
	{
		System.out.println("welcome to normal method-2");
	}
}





public class Demo {

	public static void main(String as[]) 
	{
		
         Foo t1=new Foo();
         Foo t2=new Foo();
         t1.setName("thread1");
         
         t2.setName("thread2");
         //To creating Multiple thread
         t1.start();
         
         t1.setName("thread1");
         
         t2.setName("thread2");
         
         t2.start();
	}

}
