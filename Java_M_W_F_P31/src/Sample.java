
public class Sample {

	
	void get1()
	{
		try
		{
		int a=10/0;
		System.out.println("Result is:"+a);
		}
		catch(ArithmeticException r)
		{
			System.out.println("Please check.."+r);
		}
	}
	void get2()
	{
		System.out.println("normal application");
	}
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();
		s1.get2();

	}

}
