package krrLoop1;

import java.util.Scanner;

public class Demo 
{

 int n,i,rev=0;
 Scanner g=new Scanner(System.in);
  void get1()
  {
	  System.out.println("Enter the n value is:\n");
	  n=g.nextInt();
	  while (n != 0)
	   {
	      rev = rev * 10;
	      rev = rev + n%10;
	      n       = n/10;
	   }
	  System.out.println(rev);
	  
  }
}
class Sample
{
	public static void main(String as[])
	{
		Demo h=new Demo();
		h.get1();
	}
}
