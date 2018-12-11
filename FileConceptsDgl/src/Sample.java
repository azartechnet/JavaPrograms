import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Sample 
{

	String uname="niit";
	
	void get1()
	{
		try
		{
		//FileOutputStream fos=new FileOutputStream("d:\\g1.txt");
		FileInputStream fis=new FileInputStream("d:\\g1.txt");
		//byte h[]=uname.getBytes();
		//fos.write(h);
		int i=0;
		while((i=fis.read())!=-1)
		{
		  System.out.print((char)i);	
		}
		System.out.println("Inserted..");
		}
		catch(Exception r)
		{
			System.out.println(r);
		}
	}
	public static void main(String[] args) 
	{
		Sample h=new Sample();
		h.get1();

	}

}
