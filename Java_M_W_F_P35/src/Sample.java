import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Sample {

	
	void get1()
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("E:\\s1.txt");
			String u1="mohamed";
			byte b[]=u1.getBytes();
			fos.write(b);
			System.out.println("FileInserted..");
		}
		catch(Exception t)
		{
			
		}
	}
	void get2()
	{
		try
		{
			FileInputStream fis=new FileInputStream("E:\\s1.txt");
			FileOutputStream fos1=new FileOutputStream("E:\\s2.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				//System.out.print((char)i);
				fos1.write((byte)i);
			}
		}
		catch(Exception t)
		{
			
		}
	}
	void get3()
	{
		try
		{
			FileInputStream f1=new FileInputStream("E:\\s1.txt");
			FileInputStream f2=new FileInputStream("E:\\s2.txt");
			SequenceInputStream sis=new SequenceInputStream(f1,f2);
			int i;
			while((i=sis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(Exception r)
		{
			
		}
	}
	
	public static void main(String[] args) {
		
		Sample f1=new Sample();
		//f1.get1();
        //f1.get2();
		f1.get3();
	}

}
