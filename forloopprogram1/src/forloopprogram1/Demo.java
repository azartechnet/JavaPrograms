package forloopprogram1;

import java.util.Scanner;

public class Demo
{
  int i,n;
  int fact=1;
  Scanner g=new Scanner(System.in);
  void get1()
  {
	  System.out.println("Enter the n value is:");
	  n=g.nextInt();
	  for(i=1;i<=n;i++)
	  {
		  fact=fact*i;
		  System.out.println("Fact value is:"+fact);
	  }
	  
  }
  void get2()
  {
	  
  }
  
	public static void main(String[] args) 
	{
		Demo g=new Demo();
		g.get1();

	}

}
