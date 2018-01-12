import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo 
{
  void g17()throws IOException
  {
	  try
	  {
		  String uname="niit";
		  FileOutputStream fos=new FileOutputStream("D:\\sample1.txt");
		  byte s[]=uname.getBytes();
		  fos.write(s);
		  System.out.println("InsertSucess!!!");
	  }
	  catch(FileNotFoundException t)
	  {
		  
	  }
  }
}
class Demo
{
	public static void main(String as[])
	{
		FileWriterDemo g=new FileWriterDemo();
		g.g17();
	}
}