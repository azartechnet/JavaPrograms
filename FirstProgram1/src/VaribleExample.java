
public class VaribleExample
{
   String name="niit";//class variable
   void f1()
   {
	   int f=30;//local variable
	   System.out.println("Integer value is:\n"+f);
   }
   void f2()
   {
	   System.out.println("String value is:\n"+name);
   }
}
class Demo1
{
	public static void main(String as[])
	{
		VaribleExample g=new VaribleExample();
		g.f1();
		g.f2();
	}
}
