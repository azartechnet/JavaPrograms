import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample 
{
 	
  void get1()throws IOException
  {
	try
	{
    String uname="azar";		
    FileOutputStream fos=new FileOutputStream("z:\\ss.txt");
    byte f[]=uname.getBytes();
    fos.write(f);
    System.out.println("FileInserted..");
	}
	catch(FileNotFoundException r)
	{
		System.out.println(r);
	}
	finally
	{
		System.out.println("Finally");
		//To close the resource
	
	//	fos.close();
	}
    
  }
}
class Foo
{
	public static void main(String[] args) throws IOException 
	{
		Sample f1=new Sample();
		f1.get1();

	}

}
