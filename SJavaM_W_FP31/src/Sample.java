
public class Sample {

	
	void get1()
	{
		try
		{
		int a=10/0;
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check"+t);
		}
		System.out.println("Normal");
	}
	
	public static void main(String[] args) {
	
		Sample d1=new Sample();
		d1.get1();

	}

}
