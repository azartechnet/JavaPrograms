import java.util.*;

public class Foo 
{
  int a;
  float f;
  String name;
  Scanner g=new Scanner(System.in);
  void get1()
  {
	  System.out.println("Enter the value is:\n");
	  a=g.nextInt();
	  f=g.nextFloat();
	  name=g.next();
  }
  void dis()
  {
	  System.out.println("Result is:\n"+a+""+f+""+name);
  }
}
class Demo3
{
	public static void main(String sa[])
	{
		Foo h=new Foo();
		h.get1();
		h.dis();
	}
}
