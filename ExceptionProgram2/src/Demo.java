
public class Demo 
{

	public static void main(String[] args)
	{
		try
		{
			String uname=null;
			System.out.println(""+uname.length());
		}
		catch(NullPointerException y)
		{
			System.out.println(y);
		}
		
      finally
      {
    	  System.out.println("finally block");
      }
	}

}
