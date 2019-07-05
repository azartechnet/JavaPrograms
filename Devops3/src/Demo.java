import java.util.Scanner;

public class Demo 
{
	
   int a;
   float f1;
   Scanner d1=new Scanner(System.in);
   void fun1()
   {
	   System.out.println("Enter the value is:");
	   a=d1.nextInt();
	   f1=d1.nextFloat();
   }
   void fun2()
   {
	   System.out.println("welcome to niit krr"+a+""+f1);
   }
	public static void main(String[] args)
	{
		
		Demo f1=new Demo();
		f1.fun1();
		f1.fun2();
		

	}

}
