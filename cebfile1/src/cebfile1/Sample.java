package cebfile1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class Sample
{
   void input()throws IOException,FileNotFoundException
   {
	   String name;
	   Scanner a=new Scanner(System.in);
	   FileOutputStream fos=new FileOutputStream("F:\\abc1.txt");
	   System.out.println("enter ur name");
	   name=a.next();
	   byte b[]=name.getBytes();
	   fos.write(b);
	 
	   System.out.println("Inserted..");
	   
   }
}

class Demo
{
	
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		Sample s1=new Sample();
		s1.input();

	}

}
