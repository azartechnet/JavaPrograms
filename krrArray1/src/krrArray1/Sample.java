package krrArray1;

import java.util.Scanner;

public class Sample 
{
	
  int a[] =new int[10];	
  int i,n;
  Scanner f=new Scanner(System.in);
  void get1()
  {
	  System.out.println("Enter the n value is:");
	  n=f.nextInt();
	  for(int i=0;i<n;i++)
	  {
	  System.out.println("Enter the array value is:");
	  a[i]=f.nextInt();
	  }
	  for(int i=0;i<n;i++)
	  {
	  System.out.println("Value is:"+a[i]);
	 
	  }
	  
  }
  public static void main(String as[])
  {
	  Sample g=new Sample();
	  g.get1();
  }
  
}
