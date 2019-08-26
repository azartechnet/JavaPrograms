import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class FileIO 
{
	
	void input()
	{
	  try
	  {
		   FileOutputStream fos=new FileOutputStream("D:\\d3.txt");
		  FileInputStream fis1=new FileInputStream("D:\\d1.txt");
		  FileInputStream fis2=new FileInputStream("D:\\d2.txt");
		  SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		 // String name="niit";
		 // byte s[]=name.getBytes();
		 // fos.write(s);
		  //System.out.println("Inserted..");
		  
		  int i=0;
		  while((i=sis.read())!=-1)
		  {
			  //System.out.print((char)i);
			  fos.write((byte)i);
		  }
		  
	  }
	  catch(Exception r)
	  {
		  System.out.println(r);
	  }
	}
}
class Demo
{
	public static void main(String[] args) {

		FileIO f1=new FileIO();
		f1.input();
	}

}
