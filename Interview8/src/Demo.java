import java.io.FileInputStream;

public class Demo 
{
	 int b1;
	 int a=10,d;
  void get()
  {
	  try(FileInputStream fis=new FileInputStream("F:\\a.txt"))//Java7 concepts
	  {
	  int c=a/0;
	 
	  System.out.println("***"+c);
	  
	    d=c;
	 // String name="null";
	  
	  System.out.println("Normal flow");//action-1
	  }
	  catch(Exception t)
	  {
		  System.out.println("Error"+t);
	  }
	  /*finally
	  {
		  //All resources will closing here
		  System.out.println("Finally block");
	  }*/
	  
  }
  void get1()
  {
	 // int c;
	//  int v=10/0;
	  System.out.println(d);
	  System.out.println(b1);
  }
  
}
class Sample
{
	public static void main(String[] args) 
	{
	Demo f1=new Demo();
	f1.get();
	f1.get1();

	}

}
