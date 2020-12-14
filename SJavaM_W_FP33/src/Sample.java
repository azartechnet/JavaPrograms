import java.util.InputMismatchException;
import java.util.Scanner;

class Demo
{
	int a;
	Scanner sc=new Scanner(System.in);
   void input()
   {
	   try
	   {
	   System.out.println("Enter the value is::");
	   a=sc.nextInt();
	   System.out.println(a);
	   
	   }
	   catch(InputMismatchException r)
	   {
		   System.out.println("Please check your Input");
	   }
	 //  get1();
   }
   void get1()
   {
	  System.out.println("get1 modules");   
   }
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.input();
		f1.get1();

	}

}
