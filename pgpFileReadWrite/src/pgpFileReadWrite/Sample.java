package pgpFileReadWrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Sample 
{
	
   
   void input()
   {
	   try
	   {
		   FileInputStream fin=new FileInputStream("D:\\f1.txt");
		   FileInputStream fos=new FileInputStream("D:\\f2.txt");
		   SequenceInputStream sis=new SequenceInputStream(fin,fos);
		   FileOutputStream fos1=new FileOutputStream("D:\\f3.txt");
		   
		   int i=0;
		   while((i=sis.read())!=-1)
		   {
			   fos1.write((byte)i);
		   }
		   
		   System.out.println("Inserted..");
	   }
	   catch(Exception t)
	   {
		   
	   }
   }
   
}

class Demo
{
	public static void main(String[] args) 
	{
		Sample d1=new Sample();
		d1.input();

	}

}
