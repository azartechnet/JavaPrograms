package forloop;

import java.util.Scanner;

public class Demo
{
  int n,i;
  Scanner g=new Scanner(System.in);
  void f1()
  {
	  System.out.println("Enter the n value is:\n");
	  n=g.nextInt();
  }
  void f2()
  {
	  for(i=0;i<n;i++)
	  {
		 if(i%2==0)
		 {
			 System.out.println("Even"+i);
		 }
		 else
		 {
			 System.out.println("Odd"+i);
		 }
	  }
  }
}
class Demo1
{
	public static void main(String[] args) 
	{
	Demo g=new Demo();
	g.f1();
	g.f2();

	}

}
