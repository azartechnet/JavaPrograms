package a;

import java.util.Scanner;

public class SwitchCaseExample1 
{
  int s;
  Scanner g=new Scanner(System.in);
  void g1()
  {
	  System.out.println("Enter the value is:\n");
	  s=g.nextInt();
	  switch(s)
	  {
	  case 1:
		  System.out.println("Case-1");
		  break;
	  case 2:
		  System.out.println("Case-2");
		  break;
	  default:
		  System.out.println("default case");
		  break;
	  }
  }
}
class Demo
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SwitchCaseExample1 h=new SwitchCaseExample1();
		h.g1();

	}

}
