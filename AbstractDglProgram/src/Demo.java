
abstract class S1
{
	int p=10;
	public void g1()
	{
		System.out.println("Welcome to Normal Method..");
	}
	abstract public void g2();
}
abstract class S2
{
	abstract public void g3();
}
class D1 extends S2
{
	public void g3()
	{
		System.out.println("ThridMethod..");
	}
}

class D extends S1
{

	@Override
	public void g2()
	{ 
		
		System.out.println("Welcome to Abstract Method is...");
		
		
		
	}
	
}



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		S1 g=new D();//Base class ref to Dervied Class
		
		S2 h1=new D1();
		
		//D s=new D();
		
		g.g1();
		g.g2();
		
		h1.g3();
				

	}

}
