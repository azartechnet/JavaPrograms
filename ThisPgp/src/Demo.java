
public class Demo 
{
	int a,b;

	void p1(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("FirstMethod is::"+a+""+b);
	}
	void p2()
	{
		System.out.println("SecondMethod is::"+a+""+b);
	}
	
	
	public static void main(String[] args)
	{
		Demo g1=new Demo();
		g1.p1(300,400);
		g1.p2();

	}

}
