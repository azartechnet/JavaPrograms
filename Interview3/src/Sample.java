
interface b1
{
	 int a=100;
	public void get1();
}
interface b2 extends b1
{
	public void get2();
}
class Sample1 implements b2
{

	public void get1()
	{
		System.out.println("InterfaceProcess-1");
		
	}
	public void get2()
	{
		System.out.println("Interface-2");
	}
	
}


public class Sample
{

	public static void main(String as[])
	{
		System.out.println("MainMethods");
		Sample1 g1=new Sample1();
		g1.get1();
		g1.get2();

	}

}
