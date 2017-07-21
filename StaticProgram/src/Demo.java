
public class Demo
{
	int a1,b;
	static int a=10;
	Demo()
	{
		a++;
		System.out.println("value is:\n"+a);
	}
	
	void get(int a1,int b)
	{
		this.a1=a1;
		this.b=b;
		System.out.println("Display in normal Method"+a1+""+b);
	}
	
	
	void dis()
	{
		System.out.println("display another method:\n"+a1+""+b);
	}
}
class Sample
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new Demo();
		new Demo();
		new Demo();
		Demo g1=new Demo();
		g1.get(10,20);
		g1.dis();

	}

}
