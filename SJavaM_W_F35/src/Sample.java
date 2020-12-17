
public class Sample {

	
	void get1()
	{
		try
		{
		int a=10/0;
		System.out.println(a);
		}
		catch(ArithmeticException r)
		{
			System.out.println("Please check your modules"+r);
		}
	}
	
	void get2()
	{
		System.out.println("Normal function");
	}
	void get3()
	{
		try
		{
		String s1=null;
		System.out.println(s1.length());
		}
		catch(NullPointerException t)
		{
			System.out.println("Please string");
		}
		finally
		{
			System.out.println("finally block");
		}
	}
	public static void main(String[] args) {
		
		Sample d1=new Sample();
		d1.get1();
		d1.get2();
		d1.get3();
	}

}
