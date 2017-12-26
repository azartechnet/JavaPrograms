import java.util.Scanner;

public class DemoApp 
{
  int exp;
  Scanner g=new Scanner(System.in);
  void b1()
  {
	System.out.println("Enter the choice is:");
	System.out.println("1.Enter the addproduct is:");
	System.out.println("2.View the products is:");
	exp=g.nextInt();
	switch(exp)
	{
	case 1:
		inp1();
		break;
	case 2:
		inp2();
		break;
    default:
    	System.out.println("Enter correct Opt...");
    	break;
	}
  }

  void inp1()
  {
	  System.out.println("Welcome to niit-1");
  }
  void inp2()
  {
	  System.out.println("Welcome to niit-2");
  }
}
class Demo
{
	public static void main(String as[])
	{
	  DemoApp j=new DemoApp();
	  j.b1();
	}
}
