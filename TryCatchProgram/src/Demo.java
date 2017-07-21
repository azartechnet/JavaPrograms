import java.lang.*;
public class Demo 
{
 void g1()
 {
	try
	 {
		 int price=100/0;
		
	 }
	 catch(Exception t)
	 {
		 System.out.println("please check your input");
		 
	 }
	 System.out.println("Normal flow...");
 }
}
class Demo1
{
	public static void main(String[] args) 
	
	{
		Demo g=new Demo();
		g.g1();

	}

}
