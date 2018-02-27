import java.util.Scanner;

public class Demo 
{
 
  	
  int sal,age,n;
  Scanner g=new Scanner(System.in);
  void g1()
  {
	System.out.println("Enter the value is:\n");
	age=g.nextInt();
	
  }
  void g2()
  {
	if(age>=60)
	{
		System.out.println("Enter the salary is:\n");
		sal=g.nextInt();
		if(sal>=20000)
		{
			System.out.println("Your > 20000");
		}
		else
		{
			System.out.println("Your < 20000");
		}
	}
	else
	{
		System.out.println("Your age is low");
	}
  }
}
class Foo
{
	public static void main(String[] args)
	{
		
		Demo h=new Demo();
		h.g1();
		h.g2();

	}

}
