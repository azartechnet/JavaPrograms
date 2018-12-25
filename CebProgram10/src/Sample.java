
interface b
{
	int a=10;
	public void get();
}
interface c 
{
	int b=20;
	public void m2();
}
	
class D implements c,b
{
	public void get()
	{
	  System.out.println("Value is:"+a);
	}
	public void m2()
	{
		System.out.println("value is:"+b);
	}
	void input()
	{
		System.out.println("inside class d");
	}
}

public class Sample 
{

	public static void main(String[] args)
	{
		D f1=new D();
		f1.get();
		f1.m2();
		f1.input();

	}

}
