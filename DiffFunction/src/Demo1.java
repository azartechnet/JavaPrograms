
public class Demo1 
{
  void p1(int s1)
  {
	  int c1;
	  c1=s1;
	  System.out.println(""+c1);
  }
  void p2(String name,float f1)
  {
	  System.out.println(""+name+""+f1);
  }
}
class Demo2
{
	public static void main(String as[])
	{
		Demo1 g=new Demo1();
		g.p1(10);
		g.p2("azar",3.4f);
		
	}
}
