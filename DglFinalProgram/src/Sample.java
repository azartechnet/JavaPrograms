
import java.util.*;
 public class Sample 
{
 final int p=100;
 
	 //Scanner g=new Scanner(System.in);
   void get1()
   {
	 
	   
	  
	  // p=g.nextInt();//p=g;
	  System.out.println("Base Class is:\n"+p);
   }
	
}
class D extends Sample
{
	  
	void get2()
	{
		//p++;
		
		System.out.println("Dervied Class is:\n"+p);
	}
}
class Demo
{
	

	public static void main(String[] args)
	{
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
