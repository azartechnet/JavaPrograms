package newpgpcustomException;

public class CustomException extends Exception
{
	
   int pid=200;
   void get1()
   {
	   try
	   {
   if(pid==200)
   {
	   throw new CustomException();
   }
   else
   {
	   System.out.println("else block");
   }
	   }
	   catch(CustomException r)
	   {
		   System.out.println("ExceptionSucess");
	   }
   }
}
