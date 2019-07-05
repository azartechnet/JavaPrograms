package k1program2;

import java.util.Scanner;

public class Sample 
{
  int pid;
  String pname;
  float f1;
  Scanner d1=new Scanner(System.in);	
  void f1()
  {
	  System.out.println("Enter the value is:");
	  pid=d1.nextInt();
	  pname=d1.next();
	  f1=d1.nextFloat();
  }
  void dis()
  {
	  System.out.println(pid);
	  System.out.println(pname);
	  System.out.println(f1);
  }
}
class Foo
{
	public static void main(String ar[])
	{
		Sample k1=new Sample();
		k1.f1();
		k1.dis();
	}
}
