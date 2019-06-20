
public class Demo1
{
	static int a=10;
	static void get1()
	{
		//static int a=10;
		a++;
		System.out.println(a);
	}
	
	
	public static void main(String[] args) 
	{
	
		Demo1 g1=new Demo1();
		Demo1 g2=new Demo1();
		g1.get1();
		g2.get1();

	}

}
