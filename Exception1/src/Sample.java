
public class Sample
{
   
	void input()
	{
		try
		{
		int a=10/0;
		String uname=null;
		
		System.out.println("String len"+uname.length());//null poiter exception
		}
		catch(Exception r)
		{
			System.out.println("Please"+r);
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("Normal program..");
	}
	
	public static void main(String[] args)
	{
		Sample d1=new Sample();
		d1.input();

	}

}
