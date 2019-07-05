package k1program3;

import java.util.Scanner;

public class SampleApp1 
{
	int pid;
	Scanner f1=new Scanner(System.in);
   void input()
   {
	   System.out.println("Enter the value is:");
	   pid=f1.nextInt();
	   
	   if(pid==101)
	   {
		   System.out.println("Pid value True");
	   }
	   else
	   {
		   System.out.println("Pid value False");
	   }
	   
   }
}

class Demo
{
	public static void main(String[] args) 
	{
		
         SampleApp1 g1=new SampleApp1();
        		 g1.input();
	}

}
