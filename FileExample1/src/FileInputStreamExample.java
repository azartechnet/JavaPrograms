import java.io.FileInputStream;

public class FileInputStreamExample 
{
   void g2()
   {
	   try
	   {
		   FileInputStream fis=new FileInputStream("D:\\sample1.txt");
		   int i;
		   while((i=fis.read())!=-1)
		   {
			   System.out.print((char)i);
		   }
		   
	   }
	   catch(Exception t)
	   {
		   
	   }
   }
}
