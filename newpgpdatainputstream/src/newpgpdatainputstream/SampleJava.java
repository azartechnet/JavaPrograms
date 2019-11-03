package newpgpdatainputstream;

import java.io.DataInputStream;
import java.io.IOException;

public class SampleJava 
{

	int a;
	float f1;
	String name;
	DataInputStream dis=new DataInputStream(System.in);
	void get1()throws IOException
	{
		System.out.println("Enter the Integer value is:");
		a=Integer.parseInt(dis.readLine());
		System.out.println("Enter the Float value is:");
		f1=Float.parseFloat(dis.readLine());
		System.out.println("Enter the String value is:");
		name=dis.readLine();
	}
	void display()
	{
		System.out.println("Integervalue is"+a);
		System.out.println("FloatValue is"+f1);
		System.out.println("Stringvalue is"+name);
	}
	
	
	public static void main(String[] args) throws IOException
	{
		
		
          SampleJava f1=new SampleJava();
          f1.get1();
          f1.display();
	}

}
