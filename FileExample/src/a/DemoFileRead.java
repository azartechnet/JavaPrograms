package a;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoFileRead
{
	
   void display()throws IOException
   {
	   try
	   {
	    FileInputStream fis=new FileInputStream("D:\\sample.txt");
	    int u;
	    while((u=fis.read())!=-1)//-1EOF
	    {
	    	System.out.print((char)u);//typcasting
	    }
	   }
	   catch(FileNotFoundException t)
	   {
		   System.out.print(t);
	   }
   }
	
	public static void main(String[] args) throws IOException 
	{
		DemoFileRead h=new DemoFileRead();
		h.display();

	}

}
