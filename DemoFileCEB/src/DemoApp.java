
import java.io.*;
import java.util.Scanner;

public class DemoApp 
{
	
	String uname;
	  Scanner f1=new Scanner(System.in);
  public void get1()throws IOException
  {
	  
	  try
	  {
		 FileInputStream fis=new FileInputStream("F:\\d1.txt");
		 //FileOutputStream fos=new FileOutputStream("F:\\d2.txt");
		 FileInputStream fis1=new FileInputStream("F:\\d2.txt");
		 SequenceInputStream sis=new SequenceInputStream(fis,fis1);
		 
		 int i;
		 while((i=sis.read())!=-1)
		 {
			System.out.print((char)i);
			 //fos.write((byte)i);
		 }
		  
	  }
	  catch(Exception t)
	  {
		  
	  }
  }
}
class MainDemo
{
	public static void main(String as[]) throws IOException
	{
		DemoApp g=new DemoApp();
	    g.get1();
	}
}
