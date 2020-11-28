package a;

abstract class Foo
{
	abstract void goo();//abstract method
	int a=100;
	public void g1()//normal method
	{
	System.out.println("welcome normal method...");	
	}
}
 class D extends Foo
{
	public void goo()//To define the abstract method
	{
		System.out.println("abstract welcome"+a);
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
