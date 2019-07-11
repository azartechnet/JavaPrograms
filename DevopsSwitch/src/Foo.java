import java.util.Scanner;

public class Foo 
{
	
  // int i;
	//char s;
	String n;
   Scanner s1=new Scanner(System.in);
   void input()
   {
	   System.out.println("Enter the i value..");
	 //  i=s1.nextInt();
	 //  s=s1.next().charAt(0);
	   n=s1.next();
	   switch(n)
	   {
	   case "azar":
		   int a;
		   System.out.println("Enter the value is:");
		   a=s1.nextInt();
		  
		   if(a%2==0)
		   {
			 System.out.println("Even");  
		   }
		   else
		   {
			   System.out.println("odd");  
		   }
		   break;
	   case "niit":
		   System.out.println("Case-2");
		   break;
	   default:
		   System.out.println("Default");
		   break;
	   }
   }
	
}


class Demo
{

	public static void main(String[] args) {
	
		
		Foo g1=new Foo();
		g1.input();

	}

}
