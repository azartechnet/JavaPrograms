import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample
{
	
   String u="azar";
   
   void writeData() throws IOException,FileNotFoundException
   {
	 FileOutputStream fos=new FileOutputStream("D:\\p1.txt");
	 byte d[]=u.getBytes();
	 fos.write(d);
	 System.out.println("Inserted..");
	 
   }
   void viewData()throws IOException,FileNotFoundException
   {
	   FileInputStream fis=new FileInputStream("D:\\p1.txt");
	   int i;
	   while((i=fis.read())!=-1)
	   {
		   System.out.print((char)i);
	   }
   }
   
}
class Demo
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		Sample f1=new Sample();
		f1.writeData();
        f1.viewData();
	}

}
