package newpgpstatements;

import java.util.Scanner;

public class Sample 
{
	int a;
	Scanner d1=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value is:");
		a=d1.nextInt();
	}
	void stmt()
	{
		if(a==100)
		{
			System.out.println("TrueBlock"+a);
		}
		else
		{
			System.out.println("FalseBlock"+a);
		}
	}
}


class Demo
{
	public static void main(String[] args) 
	{
		
     Sample s1=new Sample();
     s1.input();
     s1.stmt();
	}

}
