package a;

import java.util.Scanner;

public class Demo 
{
	int i,n;
	int fact=1;
	Scanner g=new Scanner(System.in);
   void g1()
   {
	   System.out.println("Enter the value is:\n");
	   n=g.nextInt();
   }
   void g2()
   {
	   for(i=1;i<=n;i++)
	   {
		   //System.out.println("I value is:\n"+i);
		   fact=fact*i;
	   }
	   System.out.println("factorial is:\n"+fact);
   }
	public static void main(String[] args) 
	{
		Demo g=new Demo();
		g.g1();
		g.g2();

	}

}
