import java.util.Scanner;

public class Demo1 
{
  String uname,pass;
  Scanner g=new Scanner(System.in);
  void get1()
  {
	  
	  System.out.println("Enter the value is:\n");
	  uname=g.next();
	  pass=g.next();
  }
  void get2()
  {
	  if(uname.equals("admin")&&pass.equals("admin"))
	  {
		  System.out.println("LoginSuces!!");
		  
	  }
	  else
	  {
		  System.out.println("LoginFail!!");
	  }
  }
}
class Sample
{
	
	public static void main(String[] args) 
	{
		Demo1 g=new Demo1();
		g.get1();
		g.get2();

	}

}
