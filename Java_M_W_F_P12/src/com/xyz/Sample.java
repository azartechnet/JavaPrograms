package com.xyz;

public class Sample {

	
	void input()
	{
		int i=0;
		while(i<=5)
		{
			System.out.println("I value is::"+i);
			i++;
		}
	}
	void get1()
	{
		for(int i=0;i<=5;)
		{
			System.out.println("for loop is::"+i);
			i++;
			
		}
	}
	void get2()
	{
		int i=0;
		do
		{
			System.out.println("I value is::"+i);
			i=i+1;
		}
		while(i<=5);
	}
	
	public static void main(String[] args) {
		
		Sample d1=new Sample();
	   // d1.input();
		//d1.get1();
		d1.get2();
	}

}
