package a;

abstract class Foo
{
	abstract void goo();
	public void g1()
	{
	System.out.println("welcome normal method...");	
	}
}
 class D extends Foo
{
	public void goo()
	{
		System.out.println("abstract welcome");
	}
	
}


public class Demo 
{

	public static void main(String[] args) 
	{
	  D h=new D();
	  h.g1();
	  h.goo();

	}

}
