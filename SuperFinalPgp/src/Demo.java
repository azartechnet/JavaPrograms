

 class B
  {
   int a=100;
  final void g1()
  {
	  System.out.println("welcome-1::"+a);
  }
}
class D1 extends B
{
	void g2()
	{
		 int a=200;
		System.out.println("welcome-2::"+super.a);
	}
}





public class Demo 
{

	public static void main(String[] args) 
	{
       D1 g=new D1();
       g.g1();
       g.g2();
 
	}

}
