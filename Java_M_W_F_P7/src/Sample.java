import java.io.DataInputStream;
import java.io.IOException;

public class Sample {

	int empid;
	String empname;
	DataInputStream d1=new DataInputStream(System.in);
	void input()throws IOException
	{
		System.out.println("Enter the empid..");
		empid=Integer.parseInt(d1.readLine());
		empname=d1.readLine();
	}
	void display()
	{
		System.out.println("Data is::"+empid+""+empname);
	}
	
	public static void main(String[] args) throws IOException {
		
		
		Sample s1=new Sample();
		s1.input();
		s1.display();

	}

}
