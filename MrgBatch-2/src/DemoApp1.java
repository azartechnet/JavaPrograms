import java.util.*;

public class DemoApp1 
{
	String uname,pass;//variable decl
	int age;
	Scanner g1=new Scanner(System.in);//runtime getting an input
	void input()
	{
		System.out.println("Enter the value is:IN");
		uname=g1.next();//admin
		pass=g1.next();//admin
		System.out.println("Before if Cond:IN");
		//admin."admin"&&admin."admin" (or) false
		if(uname.equals("admin")&&pass.equals("admin"))
		{
			System.out.println("Enter the age is:");
			age=g1.nextInt();
			System.out.println("LoginSucess!!"+age);
		}
		else
		{
			System.out.println("LoginFail!!");
		}
		System.out.println("after if Cond:OUT");
		
	}
	void disp()
	{
	  System.out.println("Your Name is:"+uname+"Your Pass is:"+pass);	
	}
 
}
class View
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		DemoApp1 h=new DemoApp1();
		h.input();
		
		h.disp();
		

	}

}
