package a;

import java.io.FileOutputStream;
import java.util.Scanner;

public class DemoFileWrite 
{
  String uname;
  Scanner g=new Scanner(System.in);
  void input()
  {
	  try
	  {
	  FileOutputStream fos=new FileOutputStream("D:\\sample.txt");	  
	  System.out.println("Enter the String value is:\n");
	  uname=g.nextLine();
	  byte s[]=uname.getBytes();
	  fos.write(s);
	  System.out.println("Inserted!!!");
	  }
	  catch(Exception t)
	  {
		  System.out.println(t);
	  }
  }
}
class Demo1
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DemoFileWrite g1=new DemoFileWrite();
		g1.input();

	}

}
