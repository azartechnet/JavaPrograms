import java.util.Scanner;

public class Demo 
{
   String uname;
   Scanner g=new Scanner(System.in);
   public void g1()
   {
	System.out.println("Enter the value is:");
	uname=g.nextLine();
   }
   public void process()
   {
	   if(uname.equals("admin"))
	   {
		   System.out.println("LoginSucess!!!");
	   }
	   else
	   {
		   System.out.println("LoginFail!!!");
	   }
   }
}
class Demo1
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.g1();
		d.process();

	}

}
