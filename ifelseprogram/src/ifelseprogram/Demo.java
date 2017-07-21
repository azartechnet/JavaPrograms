package ifelseprogram;

import java.util.Scanner;

public class Demo
{
  String uname,pass;
  Scanner g=new Scanner(System.in);
  void g1()
  {
	  System.out.println("Enter the value is:\n");
	  uname=g.next();
	  pass=g.next();
  }
  void g2()
  {
	  if(uname.equals("admin")&&pass.equals("admin"))
	  {
		  System.out.println("LoginSucess!!!");
	  }
	  else
	  {
		  System.out.println("LoginFail!!!");
	  }
  }
}
class Sample
{
	public static void main(String[] args) 
	{
		Demo g=new Demo();
		g.g1();
		g.g2();

	}

}
