import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo 
{
  void get1()throws IOException
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
