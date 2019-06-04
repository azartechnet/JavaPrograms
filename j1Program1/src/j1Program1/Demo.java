package j1Program1;

import java.util.Scanner;

public class Demo 
{

  int age;//class or instance variables
  Scanner s1=new Scanner(System.in);
  void input()
  {
	  System.out.println("Enter the age is:");
	  age=s1.nextInt();
  }
  void dis()
  {
	  if(age>=18)
	  {
		  System.out.println("Age is > 18");
	  }
	  else
	  {
		  System.out.println("Age is < 18");
	  }
  }
}

class Sample
{
	public static void main(String[] args)
	{
		Demo f1=new Demo();
		f1.input();
		f1.dis();

	}

}
