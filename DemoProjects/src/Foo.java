import java.util.Scanner;

public class Foo 
{

    String uname,pass;
    int age;
    Scanner g1=new Scanner(System.in);
	void g1()
	{
		System.out.println("Enter the value is:\n");
		uname=g1.next();
		pass=g1.next();
	}
	void g2()
	{
		if(uname.equals("admin")&&pass.equals("admin"))
		{
			System.out.println("Login Sucess!!");
			System.out.println("Enter the age is:\n");
			age=g1.nextInt();
			System.out.println("Your Age is:\n"+age);
		}
		else
		{
			System.out.println("LoginFail!!!");
		}
	}
}
class Goo
{
	public static void main(String[] args) 
	{
		
      Foo j=new Foo();
      j.g1();
      j.g2();
      
	}

}
