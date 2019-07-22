package pgpfilewirte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Sample 
{
	
 
  Scanner j1=new Scanner(System.in);
  void input()throws IOException
  {
	  try
	  {
	  FileOutputStream fos=new FileOutputStream("D:\\f1.txt");
	  
	 // String g1="niit";
	  
	  
	  String g1;
	  
	  System.out.println("Enter the string");
	  g1=j1.next();
	  
	  byte s[]=g1.getBytes();//syntax
	  
	  fos.write(s);
	  
	  System.out.println("Inserted..");
	  
	  
	  }
	  catch(FileNotFoundException t)
	  {
		  
	  }
  }
}


class Demo
{
	
	public static void main(String[] args) throws IOException
	{
	 
		 Sample f1=new Sample();
		 f1.input();

	}

}
