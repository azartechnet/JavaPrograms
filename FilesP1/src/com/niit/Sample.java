package com.niit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Scanner;

public class Sample 
{
	String name;
	Scanner s1=new Scanner(System.in);
	
	void get1()throws IOException
	{
		try
		{
			//FileOutputStream fos=new FileOutputStream("E:\\f1.txt");
			
			
			//System.out.println("Enter the name is:");
			
			//name=s1.next();
			
//			byte d[]=name.getBytes();
//			
//			fos.write(d);
//			
//			System.out.println("Inserted..");
			
			FileInputStream fis1=new FileInputStream("E:\\f1.txt");
			FileInputStream fis2=new FileInputStream("E:\\f2.txt");
			
			SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
			
			//FileOutputStream f2=new FileOutputStream("E:\\f2.txt");
			
			int i;
			
			while((i=sis.read())!=-1)
           {
	          System.out.print((char)i);
	        //  f2.write((byte)i);
           }
			
			
			
		}
		catch(FileNotFoundException r)
		{
			
		}
	}

	public static void main(String[] args) throws IOException {
		
		Sample t1=new Sample();
		
		t1.get1();
		

	}

}
