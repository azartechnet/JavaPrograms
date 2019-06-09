
public class Sample
{
	void get()
	{
		try
		{
			int b=100/0;
		}
		catch(Exception r)
		{
			System.out.println(r);
		}
		finally 
		{
			System.out.println("finally block");
		}
	}
}
class Sample1
{
	public static void main(String[] args) 
	{
	
Sample f1=new Sample();
f1.get();
	}

}
