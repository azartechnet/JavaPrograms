
interface B
{
	int a=300;//only variable assign
	String uname="niit";
	void g1();//only method declartion
	
}
interface B1 extends B
{
	void h1();
}
public class Demo implements B1
{

	@Override
	public void g1() 
	{
		System.out.println("welcome"+a);
		
	}
	void g2()
	{
		System.out.println("Normal method...");
	}
	@Override
	public void h1() 
	{
		
	System.out.println("welcome secd interface"+uname);	
	}

}
class Sample
{
	public static void main(String as[])
	{
		Demo g1=new Demo();
		g1.g1();
		g1.g2();
		g1.h1();
	}
}
