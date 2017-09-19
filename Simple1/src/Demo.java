import java.util.Scanner;

public class Demo 
{
  float a;
  float b,c;
  String name;
  Scanner g=new Scanner(System.in);
  Scanner g1=new Scanner(System.in);
  void operation()
  {
	  System.out.println("Enter the value a and b:\n");
	  a=g.nextFloat();
	  b=g.nextFloat();
	  c=a*b;
  }
  void display()
  {
	  System.out.println("Result is:\n"+c);
	  System.out.println("Enter the string value is:\n");
	  name=g1.nextLine();
	  System.out.println("YourString is:\n"+name);
  }
}
class Foo
{
  public static void main(String as[])
  {
	 Demo h=new Demo();
	 h.operation();
	 h.display();
  }
}
