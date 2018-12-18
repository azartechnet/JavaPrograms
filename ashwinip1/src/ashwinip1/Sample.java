package ashwinip1;

import java.util.Scanner;

public class Sample 
{

	int a;
	float f1;
	String name;
	Scanner g=new Scanner(System.in);
	void get()
	{

	  System.out.println("Enter the value is:");
	  a=g.nextInt();
	  f1=g.nextFloat();
	  name=g.next();
	}
	
	void get1()
	{
		System.out.println(a+""+f1+""+name);
	}
	void dis()
	{
		if(a%2==0)
		{
		   System.out.println("Even");	
		}
		else
		{
			System.out.println("Odd");
		}
	}
	void looping()
	{
		for(int i=0;i<=a;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("welcome to niit");
		Sample s1=new Sample();
		s1.get();
		s1.get1();
		s1.dis();
		s1.looping();

	}

}
