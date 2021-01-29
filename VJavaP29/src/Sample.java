
public class Sample {

	void get1()
	{
		try
		{
		int a=10/0;
		System.out.println("Result is::"+a);
		}
		catch(ArithmeticException t)
		{
			System.out.println("please check the value"+t);
		}
	}
	void get2()
	{
		System.out.println("Normal Function");
	}
	
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();
		s1.get2();

	}

}
