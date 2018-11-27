import java.io.*;

public class Sample 
{
	
  String n="niit";	
	
  void writeData()throws IOException,FileNotFoundException
  {
	  //FileOutputStream fos1=new FileOutputStream("D:\\v1.txt");
	  //FileOutputStream fos2=new FileOutputStream("D:\\v2.txt");
	  FileInputStream fis1=new FileInputStream("D:\\v1.txt");
	  FileInputStream fis2=new FileInputStream("D:\\v2.txt");
	  FileOutputStream fos3=new FileOutputStream("D:\\v3.txt");
	  SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
	  //byte f[]=n.getBytes();
	  
	  //fos1.write(f);
	  //fos2.write(f);
	  
	  int i;
	  while((i=sis.read())!=-1)
	  {
		  //fos3.write((byte)i);
		  System.out.print((char)i);
		  
	  }
	  
	  
	  //System.out.println("TwoFileInsertedIn AnotherFile..");
	  
	  
	  
  }
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Sample g=new Sample();
		g.writeData();

	}

}
