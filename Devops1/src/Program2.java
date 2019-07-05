import java.util.Scanner;

import java.lang.*;

public class Program2 
{
  
	int reverse=0; 
	int n;
	Scanner s1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is:");
		n=s1.nextInt();
	}
	void get2()
	{
		
		while (n != 0)
		   {
		      reverse = reverse * 10;
		      reverse = reverse + n%10;
		      n       = n/10;
		   }
		System.out.println("Resvers Number is:"+reverse);
	}
	
	
	public static void main(String[] args) 
	{
	
		System.out.println("MainIN");
		Program2 g1=new Program2();
		g1.get1();
		g1.get2();
		System.out.println("MainOUT");
   
	}

}
