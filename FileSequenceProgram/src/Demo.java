import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Demo 
{
  void get1()
  {
	try
	{
		FileInputStream f1=new FileInputStream("F:\\abc.txt");
		FileInputStream f2=new FileInputStream("F:\\abc1.txt");
		//FileOutputStream f3=new FileOutputStream("F:\\abb.txt");
		SequenceInputStream sq=new SequenceInputStream(f1, f2);
		int i;
		while((i=sq.read())!=-1)
		{
			System.out.print((char)i);
			//f3.write((byte)i);
		}
	}
	catch(Exception t)
	{
		
	}
	  
  }
  
}
class Demo1
{
	public static void main(String as[])
	{
		Demo g=new Demo();
		g.get1();
	}
}
