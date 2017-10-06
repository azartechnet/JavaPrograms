import java.util.Scanner;

public class Foo 
{
	int pid;
	String pname;
	float avg;
	Scanner g=new Scanner(System.in);
  void f1()
  {
	  System.out.println("Enter the value is:\n");
	  pid=g.nextInt();
	  pname=g.next();
	  avg=g.nextFloat();
  }
  void f2()
  {
	  System.out.println("Result is:\n"+pid+""+pname+""+avg);
  }
}
class Demo
{
	public static void main(String[] args)
	{
		
      Foo h=new Foo();
      h.f1();
      h.f2();
	}

}
