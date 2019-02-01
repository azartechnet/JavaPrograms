package userdefinedexception;

import java.util.Scanner;

public class AException {
	int age;
	Scanner s=new Scanner(System.in);
	
	void get()throws AgeException
	{
		try
		{
			System.out.println("entr age");
			age=s.nextInt();
			if(age<18)
			{
				
				System.out.println("you are not eligible");
				
				
			}
			else
			{
				System.out.println("welcome");
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid age");
		}
	}

	public static void main(String[] args)throws AgeException {
	
            AException a1=new AException();
            a1.get();
            
	}

}
class AgeException extends Exception
{
	public AgeException(String s1)
	{
		super(s1);
		
	}
}
