import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo 
{
	
	//String name="niit";
	
	void input()throws IOException
	{
		try
		{
			//FileOutputStream fos=new FileOutputStream("F:\\k1.txt");
			//byte s[]=name.getBytes();
			//fos.write(s);
			
			FileInputStream fis=new FileInputStream("F:\\k1.txt");
			FileOutputStream fos=new FileOutputStream("F:\\k2.txt");
			int i=0;
			
			while((i=fis.read())!=-1)
			{
				//System.out.print((char)i);
				fos.write((byte)i);
			}
			
		//	System.out.println("FileInserted...");
		}
		catch(FileNotFoundException r)
		{
			System.out.println(r);
		}
	}
}

class Foo
{
	public static void main(String[] args) throws IOException 
	{
		Demo f1=new Demo();
		f1.input();

	}

}
