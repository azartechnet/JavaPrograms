package switchcaseprogram;

import java.util.Scanner;

public class Sample
{
	int n;
	Scanner f=new Scanner(System.in);
  void h1()
  {
	  System.out.println("Enter the n value is:\n");
	  n=f.nextInt();
	  
	  switch(n)
	  {
	  case 1:
		  System.out.println("case-1");
		  break;
	  case 2:
		  System.out.println("case-2");
		  break;
		  
	  default:
		  System.out.println("Default case");
		  break;
	  }
  }

	public static void main(String as[])
	{
		Sample j=new Sample();
		j.h1();
		
		
	}
}
