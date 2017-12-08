
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;



public class Demo 
{
	
	String uname,pass;
	int age;
	//Scanner s=new Scanner(System.in);
	DataInputStream g1=new DataInputStream(System.in);
   void g1() throws IOException
   {
	   //runtime input
	   System.out.println("Enter the input");
	   uname=g1.readLine();
	   pass=g1.readLine();
	   age=Integer.parseInt(g1.readLine());
   }
   void g2()
   {
	   if(uname.equals("admin")&&pass.equals("admin"))
	   {
		   System.out.println("LoginSucess!"+age);
	   }
	   else
	   {
		   System.out.println("LoginFail!!");
	   }
   }
}
class Demo1
{

	public static void main(String[] args) throws IOException
	{
		Demo g=new Demo();
		g.g1();
		g.g2();

	}

}
