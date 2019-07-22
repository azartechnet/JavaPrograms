
public class Demo
{

  int i=100;
  int a=10;
	void get1()
	{
		
		System.out.println("BaseClass"+i);
	}
}
class D extends Demo
{
	int b=20;
	void get2()
	{ 
	    //i=200;
		
		System.out.println("Dervied class"+i);
	}
}
class D1 extends D
{
	void get3()
	{
		int c=a*b;
		System.out.println(c);
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
