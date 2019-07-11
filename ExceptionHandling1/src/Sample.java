
public class Sample 
{

	void get()
	{
		try
		{
		int a=100/2;
			//int a[]=new int[2];
		System.out.println("welcome to "+a);
		}
		catch(ArithmeticException r)
		{
			System.out.println("Please"+r);
		}
		//System.out.println("welcome");
		finally
		{
		process();
		}
	}
	void process()
	{
		System.out.println("welcome to process");
	}
	
	public static void main(String[] args) 
	{
		
Sample g1=new Sample();
g1.get();
	}

}
