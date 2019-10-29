package newpgpfileconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

class Demo
{
  	void get1()throws IOException
  	{
  		try
  		{
  		FileInputStream fis=new FileInputStream("E:\\d1.txt");
  		FileInputStream fis1=new FileInputStream("E:\\d2.txt");
  		SequenceInputStream sis=new SequenceInputStream(fis,fis1);
  		FileOutputStream fos=new FileOutputStream("E:\\d3.txt");
  		int i=0;
  		while((i=sis.read())!=-1)
  		{
  		 	//System.out.print((char)i);
  			fos.write((byte)i);
  		}
  		}
  		catch(FileNotFoundException r)
  		{
  			
  		}
  	}
}
public class Sample2 {

	public static void main(String[] args) throws IOException 
	{
	
          Demo f1=new Demo();
          f1.get1();
	}

}
