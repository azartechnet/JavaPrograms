import java.io.DataInputStream;
import java.io.IOException;

public class Demo 
{
	int pid;
	float f1;
	String uname;
	DataInputStream g=new DataInputStream(System.in);
	void get1() throws  IOException
	{
		System.out.println("Enter the value is:\n");
		pid=Integer.parseInt(g.readLine());
		f1=Float.parseFloat(g.readLine());
		uname=g.readLine();
	}
	void get2()
	{
		System.out.println("Your value is:\n"+pid+""+f1+""+uname);
	}
}
class Sample
{
	
	public static void main(String[] args) throws IOException
	{
	  Demo g1=new Demo();
	  g1.get1();
	  g1.get2();

	}

}
