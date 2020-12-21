import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Sample {

	void writeData() throws IOException
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("E:\\f1.txt");
			String str="hai";
			byte s[]=str.getBytes();
			fos.write(s);
			System.out.println("FileInserted..");
			
		}
		catch(FileNotFoundException r)
		{
			System.out.println(r);
		}
	}
	void readData() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("E:\\f1.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException r)
		{
			System.out.println(r);
		}
	}
	void moreWrite() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("E:\\f1.txt");
			FileOutputStream fos=new FileOutputStream("E:\\f2.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				fos.write((byte)i);
			}
		}
		catch(FileNotFoundException r)
		{
			System.out.println(r);
		}
	}
	void sequenceRead() throws IOException
	{
		try
		{
			FileInputStream fis1=new FileInputStream("E:\\f1.txt");
			FileInputStream fis2=new FileInputStream("E:\\f2.txt");
			SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
			int i;
			while((i=sis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException r)
		{
			System.out.println(r);
		}
	}
	void sequenceWrite() throws IOException
	{
		try
		{
			FileInputStream fis1=new FileInputStream("E:\\f1.txt");
			FileInputStream fis2=new FileInputStream("E:\\f2.txt");
			FileOutputStream fos2=new FileOutputStream("E:\\f3.txt");
			SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
			int i;
			while((i=sis.read())!=-1)
			{
				fos2.write((byte)i);
			}
		}
		catch(FileNotFoundException r)
		{
			System.out.println(r);
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		
		Sample f1=new Sample();
		//f1.writeData();
		//f1.readData();
		//f1.moreWrite();
		//f1.sequenceRead();
		f1.sequenceWrite();

	}

}
