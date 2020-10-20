package switchcaseprogram;

import java.util.Scanner;

public class Sample
{
	int n;
	String c;
	Scanner f=new Scanner(System.in);
  void h1()
  {
	  System.out.println("Enter the n value is:\n");
	  //n=f.nextInt();
	  c=f.next();
	  
	  switch(c)
	  {
	  case "a":
		  int a;
		  System.out.println("Enter the a value is::");
		  a=f.nextInt();
		  if(a%2==0)
		  {
			  System.out.println("Even"+a);
		  }
		  else
		  {
			  System.out.println("Odd"+a);
		  }
		  break;
	  case "b":
		  System.out.println("case-2");
		  break;
		  
	  default:
		  System.out.println("Default case");
		  break;
	  }
  }

	public static void main(String as[])
	{
		Sample J=new Sample();
		J.h1();
		
		
	}
}
