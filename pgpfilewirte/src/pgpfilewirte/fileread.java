package pgpfilewirte;

import java.io.FileInputStream;
import java.io.IOException;

public class fileread 
{

  	
  void input()throws IOException
  {
	try
	{
		FileInputStream fis=new FileInputStream("A:\\f1.txt");
		
		int i=0;
		
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		
	}
	catch(Exception t)
	{
		System.out.println(t);
	}
	
  }
	
}
class Foo
{
	public static void main(String[] args) throws IOException
	{
		
       fileread g=new fileread();
       g.input();
	}

}
