import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Scanner;

public class DemoFileWrite 
{
	
	String name;
	Scanner k=new Scanner(System.in);
	void writeData()throws IOException
	{
		try
		{
		FileOutputStream g=new FileOutputStream("D:\\f1.txt");
	    System.out.println("Enter the file Concepts..");
	    name=k.next();
	    byte s[]=name.getBytes();
	    g.write(s);
	    System.out.println("Your File to be inserted..");
	    
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	void readData() throws IOException
	{
		int i;
		try
		{
			FileInputStream g1=new FileInputStream("D:\\f1.txt");
			//FileOutputStream g3=new FileOutputStream("D:\\f2.txt");
			FileInputStream g4=new FileInputStream("D:\\f2.txt");
			SequenceInputStream sis=new SequenceInputStream(g1, g4);
			FileOutputStream g5=new FileOutputStream("D:\\f3.txt");
			while((i=sis.read())!=-1)
			{
			//System.out.print((char)i);
				g5.write((byte)i);
				
			}
		}
		catch(FileNotFoundException t)
		{
		 System.out.println(t);	
		}
	}
	
}
class Demo
{
	public static void main(String[] args) throws IOException 
	{
	DemoFileWrite g=new DemoFileWrite();
	//g.writeData();
	g.readData();

	}

}
