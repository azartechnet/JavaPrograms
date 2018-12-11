import java.io.DataInputStream;
import java.io.IOException;

public class Sample
{

  int a1;
  float f1;
  String name;
  char c;
  DataInputStream dis=new DataInputStream(System.in);
  void get1() throws  IOException
  {
	  System.out.println("Enter the value is:\n");
	  a1=Integer.parseInt(dis.readLine());
	  f1=Float.parseFloat(dis.readLine());
	  name=dis.readLine();
	  c=dis.readLine().charAt(0);
	  
  }
  void display()
  {
	  System.out.println(""+a1+""+f1+""+name+""+c);
  }
}
class Demo
{
	
	public static void main(String[] args) throws IOException
	{
		Sample s1=new Sample();
		s1.get1();
		s1.display();

	}

}
