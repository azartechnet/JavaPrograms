
public class Demo 
{
  void m1(int d1,float d2)
  {
	  System.out.println(""+d1+""+d2);
  }
  void m2(String name)
  {
	  System.out.println(name);
  }
	
}
class Foo
{
	public static void main(String[] args)
	{
		Demo g1=new Demo();
	    g1.m1(300,3.5f);	
	    g1.m2("niit");

	}

}
