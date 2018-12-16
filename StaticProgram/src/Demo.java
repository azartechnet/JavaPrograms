
public class Demo
{
	 static int a=10;
	
	void demo1()
	{
		System.out.println("Before Static Value is:"+a);
		a++;
		System.out.println("After Static Value is:"+a);
	}
	/*static void get1()
	{
	a++;	
	}*/
	
}
class Sample
{
	public static void main(String[] args)
	{
	
		Demo g1=new Demo();
		Demo g2=new Demo();
		g1.demo1();
		g2.demo1();

	}

}
