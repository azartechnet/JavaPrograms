import java.util.Scanner;

public class Demo extends Thread
{
  int sal;
  Scanner s=new Scanner(System.in);
  public void run()
  {
	  try
	  {
      System.out.println("Inside run method");		  
	  Thread.sleep(5000);
	  System.out.println("Enter the value is:\n");
	  sal=s.nextInt();
	  System.out.println("Your salary is:\n"+sal);
	  System.out.println("Your Priority is:\n"+currentThread().getPriority());
	  System.out.println("Your Thread Name is:\n"+currentThread().getName());
	  }
	  catch(InterruptedException t)
	  {
		  
	  }
  }
}
class Sample
{
	public static void main(String as[])
	{
		Demo t1=new Demo();
		Demo t2=new Demo();
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		t2.setPriority(Thread.NORM_PRIORITY);
		//t1.setName("ThreadOne");
	}
}
