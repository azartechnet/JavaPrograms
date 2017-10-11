import java.io.DataInputStream;
import java.io.IOException;

public class Demo
{
	int a;
	float f1;
	String name;
	char g1;
	DataInputStream dis=new DataInputStream(System.in);
	void g1() throws  IOException
	{
		System.out.println("Enter the value is:\n");
		a=Integer.parseInt(dis.readLine());
		f1=Float.parseFloat(dis.readLine());
		name=dis.readLine();
		g1=dis.readLine().charAt(0);
		
		
	}
	void g2()
	{
		System.out.println(a);
		System.out.println(f1);
		System.out.println(name);
		System.out.println(g1);
		
	}
}

class Foo
{
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		Demo j=new Demo();
		j.g1();
		j.g2();

	}

}
