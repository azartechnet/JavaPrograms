import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo 
{
   String name;
  Scanner g=new Scanner(System.in);
  void g1()throws IOException
  {
	  try(FileOutputStream g1=new FileOutputStream("A:\\a1.txt"))
	  {
	    System.out.println("Enter the value is:\n");
	    name=g.next();
	    byte d[]=name.getBytes();
	    g1.write(d);
	    System.out.println("Insert Sucess!!!");
	    
	    
	  }
	  catch(FileNotFoundException t)
	  {
		  System.out.println("Check Your value is"+t);
	  }
	 
  }
  
	
  
}
class Sample
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		Demo s=new Demo();
		s.g1();

	}

}
