
public class AgeException extends Exception
{
	public AgeException() 
	{
   System.out.println("Invalid value for age");
  	}
AgeException(String msg) 
{
   		 super(msg);
	}
}


