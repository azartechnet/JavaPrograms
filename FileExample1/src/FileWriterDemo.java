import java.io.FileWriter;

public class FileWriterDemo 
{
	
	void g1()
	{
   try(FileWriter fw=new FileWriter("D:\\sample2.txt"))
   {
	   
	   fw.write("hai");
	   System.out.println("FileSucess!!!");
   }
   catch(Exception t)
   {
	   System.out.println(t);
   }
	}
}
