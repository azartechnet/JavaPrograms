
public class Sample 
{
  void g1()//function 1
  {
	System.out.println("Method1");  
  }
  void g2()//function 2
  {
	  System.out.println("Method2");
  }
}

class Demo
{

	public static void main(String as[]) 
	{
       Sample h=new Sample();
       h.g1();
       h.g2();

	}

}
