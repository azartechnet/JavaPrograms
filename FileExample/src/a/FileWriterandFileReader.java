package a;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterandFileReader
{
	
	void FileWriter1()throws IOException
	{
		try(FileWriter fw=new FileWriter("D:\\sample2.txt"))
		{
			
			fw.write("hi");
			System.out.println("FileInserted SUcess!!");
			//fw.close();
			
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	void FileReader1() throws IOException
	{
		try
		{
		FileReader fr=new FileReader("D:\\sample.txt");
		char s[]=new char[10];
		fr.read(s);
		for(char d:s)
		{
			System.out.print(d);
		}
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
  public static void main(String as[]) throws IOException
  {
	  FileWriterandFileReader h=new FileWriterandFileReader();
	  h.FileReader1();
	  h.FileWriter1();
  }
}
