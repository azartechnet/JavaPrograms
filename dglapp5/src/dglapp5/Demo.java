package dglapp5;

import java.util.Scanner;

public class Demo
{

	int a;
	float f1;
	String name;
	Scanner sc=new Scanner(System.in);//Reading an input
	void p1()
	{
		System.out.println("Enter the value is:");
		a=sc.nextInt();
		f1=sc.nextFloat();
		name=sc.next();
	}
	void p2()
	{
		System.out.println("Integer value is:"+a);
		
		System.out.println("Floating value is:"+f1);
		
		System.out.println("String value is:"+name);
	}
	
	
}


class Foo
{
	public static void main(String[] args) 
	{
		
       Demo f1=new Demo();
       f1.p1();
       f1.p2();
	}

}
