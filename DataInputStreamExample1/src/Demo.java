import java.io.DataInputStream;
import java.io.IOException;

public class Demo
{
	int pid;
	String name;
	float f1;
	DataInputStream g=new DataInputStream(System.in);
	void g1() throws  IOException
	{
		System.out.println("Enter the value is:\n");
		pid=Integer.parseInt(g.readLine());
		name=g.readLine();
		f1=Float.parseFloat(g.readLine());
	}
	void dis()
	{
		System.out.println("Result is:\n"+pid+""+name+""+f1);
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Demo j=new Demo();
		j.g1();
		j.dis();

	}

}
