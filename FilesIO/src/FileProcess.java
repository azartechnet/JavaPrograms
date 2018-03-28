import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileProcess
{
	String name;
	Scanner g=new Scanner(System.in);
   void fileOutputStream()
   {
	  try
	  {
	 /* System.out.println("Enter the name is:\n");
	  name=g.next();
	  FileOutputStream fos=new FileOutputStream("F:\\abc.txt");
	  byte s[]=name.getBytes();
	  fos.write(s);
	  System.out.println("File Inserted Sucess!!!");*/
		  FileInputStream fis=new FileInputStream("F:\\abc.txt");
		  FileOutputStream fos=new FileOutputStream("F:\\abc1.txt");
		  int i;
	    while((i=fis.read())!=-1)
		  {
			 //System.out.print((char)i);
			  fos.write((byte)i);
	  }
	  }
	  catch(Exception g)
	  {
		  System.out.println(g);
	  }
   }
}
class Demo
{
	public static void main(String as[])
	{
		FileProcess h=new FileProcess();
		h.fileOutputStream();
	}
}
