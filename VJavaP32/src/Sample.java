import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Scanner;

class Demo
{
	String name;
	Scanner sc=new Scanner(System.in);
	void writeData()throws IOException
	{
		try
		{
		System.out.println("Enter the String value is::");
		name=sc.next();
		FileOutputStream fos=new FileOutputStream("E:\\f1.txt");
		byte s[]=name.getBytes();
		fos.write(s);
		System.out.println("File is Inserted..");
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	
	}
	void readData()throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("E:\\f1.txt");
			FileOutputStream fos=new FileOutputStream("E:\\f2.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				//System.out.print((char)i);
				fos.write((byte)i);
			}
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	void sequenceread() throws IOException
	{
		try
		{
			FileInputStream fis1=new FileInputStream("E:\\f1.txt");
			FileInputStream fis2=new FileInputStream("E:\\f2.txt");
			FileOutputStream fos1=new FileOutputStream("E:\\f3.txt");
			SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
			int i;
			while((i=sis.read())!=-1)
			{
				//System.out.print((char)i);
				fos1.write((byte)i);
			}
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	
}

public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo d1=new Demo();
		//d1.writeData();
		//d1.readData();
		d1.sequenceread();

	}

}
