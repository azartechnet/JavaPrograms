
public class Demo
{

  int i=100;
	void get1()
	{
		
		System.out.println("BaseClass"+i);
	}
}
class D extends Demo
{
	void get2()
	{ 
	    i=200;
		System.out.println("Dervied class"+super.i);
	}
}
class Demo1
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		D g=new D();
		g.get1();
		g.get2();

	}

}
