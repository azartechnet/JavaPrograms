
public class Program1 
{
	int a=100,c;
   void get1()
   {
	   try
	   {
	   System.out.println("Exception In");
	   c=a/0;
	   }
	   catch(ArithmeticException r)
	   {
		   System.out.println("PleaseCheck");
	   }
	   System.out.println("Exception Out");
   }
    
  
}
class Demo
{
	public static void main(String[] args) 
	{
		Program1 g1=new Program1();
		g1.get1();

	}

}
