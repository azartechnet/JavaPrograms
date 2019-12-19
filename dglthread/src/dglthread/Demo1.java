package dglthread;

import java.util.Scanner;

class Foo1 implements Runnable
{
	int a;
	Scanner f=new Scanner(System.in);
	public void run()
	{
		try
		{
		 // System.out.println("Enter the value is");	
	      
	      System.out.println("Now We entered the values");
	      Thread.sleep(10000);	
	      a=f.nextInt();
	      System.out.println("Your value is:"+a);
		}
		catch(InterruptedException r)
		{
			
		}
	}

}
public class Demo1 {

	public static void main(String[] args)
	{
		Foo1 t1=new Foo1();
		Thread m1=new Thread(t1);
		
		m1.start();

	}

}
