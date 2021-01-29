
public class Sample {

	void get1()
	{
		try
		{
		String s1=null;
		
		System.out.println(s1.length());
		}
		catch(NullPointerException r)
		{
			System.out.println("Value is not found");
		}
		finally
		{
			System.out.println("finallyblock");
		}
	}
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();

	}

}
