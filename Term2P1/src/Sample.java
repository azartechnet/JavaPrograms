import java.io.DataInputStream;
import java.io.IOException;

public class Sample 
{
	
   int pid;
   float f1;
   String name;
   DataInputStream dis=new DataInputStream(System.in);
   void get1()throws IOException
   {
	   
	   System.out.println("Enter the value is:");
	   pid=Integer.parseInt(dis.readLine());
	   
	 
   }
   void get2() throws  IOException
   {
	   System.out.println("Enter the Float and String");
	   f1=Float.parseFloat(dis.readLine());
	   name=dis.readLine();
	   
   }
   void display()
   {
	   System.out.println("Integer is:"+pid);
	   System.out.println("Float is:"+f1+"String is"+name);
   }
}

class Demo
{
	public static void main(String[] args) throws IOException 
	{
	    
        Sample k1=new Sample();
        k1.get1();
        k1.get2();
        k1.display();
	}

}
