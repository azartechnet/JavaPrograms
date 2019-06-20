
public class Sample 
{

	void input()
	{
		try
		{
		int a=10/0;
		String name=null;
		System.out.println(a);
		System.out.println(name.length());
		}
		catch(ArithmeticException r)
		{
			System.out.println("please check"+r);
		}
		finally
		{
			System.out.println("Finally block");
		}
	}
	
	public static void main(String[] args) 
	{
	
       Sample s1=new Sample();
       s1.input();
	}

}
