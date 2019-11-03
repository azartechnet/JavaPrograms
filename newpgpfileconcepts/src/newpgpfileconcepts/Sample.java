package newpgpfileconcepts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Foo
{
   void get()throws IOException
   {
	   try
	   {
		   
		   FileOutputStream fos=new FileOutputStream("E:\\d1.txt");
		   String name="niit";
		   byte s[]=name.getBytes();
		   fos.write(s);
		   System.out.println("Inserted..");
	   }
	   catch(FileNotFoundException r)
	   {
		System.out.println(r);   
	   }
   }
}
public class Sample {

	public static void main(String[] args) throws IOException 
	{
	 Foo f1=new Foo();
	 f1.get();

	}

}
