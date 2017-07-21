import java.util.Scanner;

public class Demo 
{
  int a;
  float f1;
  String name;
  Scanner g=new Scanner(System.in);
  void m1()
  {
	  System.out.println("Enter the a value is:\n");
	  a=g.nextInt();
	  f1=g.nextFloat();
	  name=g.next();
  }
  void m2()
  {
	  System.out.println("Display Your Data..."+a+"float value is.."+f1+"String name"+name);
  }
}
class Demo1
{
	public static void main(String[] args) 
	{
		Demo g=new Demo();
		g.m1();
		g.m2();

	}

}
