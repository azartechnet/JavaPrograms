package a;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;



public class SequenceRead
{
   void display() throws IOException
   {
	   try
	   {
		   FileInputStream fis1=new FileInputStream("D:\\sample.txt");
		   FileInputStream fis2=new FileInputStream("D:\\sample1.txt");
		   
		   SequenceInputStream sis=new SequenceInputStream(fis1, fis2);
		   
		   int i;
		   
		   while((i=sis.read())!=-1)
		   {
			   System.out.print((char)i);
		   }
		   
	   }
	   catch(FileNotFoundException t)
	   {
		   
	   }
   }
	public static void main(String[] args) throws IOException 
	{
		SequenceRead g=new SequenceRead();
		g.display();

	}

}
