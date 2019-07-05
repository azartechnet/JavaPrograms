import java.io.FileOutputStream;

public class Sample 
{
  
 void get1()
 {
  	 
 try(FileOutputStream fos=new FileOutputStream("D:\\f1.txt"))
 {
	String name="azar";
	byte s[]=name.getBytes();
	fos.write(s);
	System.out.println("FileInserted!!!");
 }
 catch(Exception t)
 {
	 System.out.println(t);
 }
// finally
// {
//	 fos.close();
// }
 
 }


	public static void main(String[] args) 
	{
		Sample h=new Sample();
		h.get1();

	}

}
