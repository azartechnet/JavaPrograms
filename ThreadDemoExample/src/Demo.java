import java.util.Scanner;

public class Demo extends Thread
{
	
	String uname;
	Scanner g1=new Scanner(System.in);
  public void run()
  {
	  try
	  {
		  System.out.println("Enter the value is:::");
		  uname=g1.next();
	  Thread.sleep(3000);
	  System.out.println("Display output::"+uname);
	  
	  }
	  catch(InterruptedException r)
	  {
		  System.out.println(r);
	  }
  }
  void run1()
  {
	  System.out.println("Normal method");
  }
}
class Foo
{
	public static void main(String[] args) 
	{
		Demo t1=new Demo();
		t1.start();
		t1.run1();

	}

}
