
public class Sample
{

	
	void get1()
	{
		try
		{
		int a=100/2;
		//String name=null;//nullpointer
		String s1="niit";//output=4
		System.out.println("welcome to Method-1");
		System.out.println("CheckExceptions"+s1.length());
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check input.."+t);
		}
		catch(NullPointerException r)
		{
			System.out.println("Check"+r);
		}
		finally
		{
			System.out.println("FinallyBlock");
		}
		
	}
	void get2()
	{
		System.out.println("Method-2");
	}
}

class Demo
{
	public static void main(String[] args) 
	{
		Sample f1=new Sample();
		f1.get1();
		f1.get2();

	}

}
