package ifelsestatement;

import java.util.Scanner;

public class Demo 
{
	int sal;
	Scanner h=new Scanner(System.in);
	void h1()
	{
		System.out.println("Enter the salary is:\n");
		sal=h.nextInt();
		if(sal>20000)//if(s%2==0)-->check odd or even
		{
			System.out.println("Your salary is>20000:\n"+sal);
		}
		else
		{
			System.out.println("Your salary is<20000:\n"+sal);
		}
	}
}
class Foo
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Demo j=new Demo();
      j.h1();
	}

}
