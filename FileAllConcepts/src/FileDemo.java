import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Scanner;

public class FileDemo 
{
	
  	//String uname="azar";
	String uname;
	Scanner g=new Scanner(System.in);
  void input() throws IOException
  {
	  try
	  {
	   /*FileOutputStream fos=new FileOutputStream("d:\\a1.txt");
		  uname=g.next();
         byte s[]=uname.getBytes();
        fos.write(s);
	   System.out.println("Inserted..");*/
	   FileInputStream fis=new FileInputStream("d:\\a1.txt");
	    FileInputStream fis1=new FileInputStream("d:\\a7.txt");
	   SequenceInputStream sis=new SequenceInputStream(fis, fis1);
	   FileOutputStream fos1=new FileOutputStream("d:\\a8.txt");
	   int i;
	   while((i=sis.read())!=-1)
	   {
		  // System.out.print((char)i);
		   fos1.write((byte)i);
	   }
	   
	   
	  }
	  catch(FileNotFoundException r)
	  {
		  
	  }
	
  }
}
class Demo1
{
	public static void main(String[] args) throws IOException 
	{
		FileDemo g1=new FileDemo();
		g1.input();

	}

}
