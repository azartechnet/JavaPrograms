package cebprogram1;

import java.util.Scanner;

public class Demo 
{
    int a,b,c;//class or instance variable
    float f1;
    String uname;
    Scanner s1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is:\n");
		a=s1.nextInt();
		b=s1.nextInt();
		f1=s1.nextFloat();
		uname=s1.next();
		c=a*b;
	}
	void get2()
	{
		
		System.out.println("Your Integer value is:"+a);
		System.out.println("Your Float value is:"+f1);
		System.out.println("Your String value is:"+uname);
		System.out.println("Your calculation value is:"+c);
		
	}
	
	public static void main(String as[])
	{
		
		Demo f=new Demo();//object creation
		f.get1();
		f.get2();
	

	}

}
