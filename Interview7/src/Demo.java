import java.io.DataInputStream;
import java.io.IOException;

public class Demo
{

	int j1;
	float f1;
	String s1="niit";
	DataInputStream dis=new DataInputStream(System.in);

   void input()throws IOException
   {
	   System.out.println("Enter the value is:");
	   j1=Integer.parseInt(dis.readLine());
	   f1=Float.parseFloat(dis.readLine());
	   s1=dis.readLine();
   }
   void dis()
   {
	   System.out.println("Result is:\n"+j1+""+f1+""+s1);
   }
}
class Foo
{
	public static void main(String as[])throws IOException
	{
		Demo g1=new Demo();
		g1.input();
		g1.dis();
				
	}
}
