import java.io.DataInputStream;
import java.io.IOException;

public class Sample {

	int empid;
	String empname;
	DataInputStream dis=new DataInputStream(System.in);
	void get1() throws  IOException
	{
		System.out.println("Enter the empid::");
		empid=Integer.parseInt(dis.readLine());
		empname=dis.readLine();
	}
	void display()
	{
		System.out.println("Your value is::"+empid+""+empname);
	}
	
	public static void main(String[] args) throws IOException {
		

		Sample s1=new Sample();
		s1.get1();
		s1.display();
		
	}

}
