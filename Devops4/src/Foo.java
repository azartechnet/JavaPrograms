import java.util.Scanner;

public class Foo
{

   int a[]=new int[5];	
   int i,n;
   Scanner s1=new Scanner(System.in);
   void f1()
   {
	   System.out.println("Enter the n value is:");
	   n=s1.nextInt();//n=4
   }
   void f2()
   {
	   for(i=0;i<=n;i++)
	   {
		   System.out.println("Enter the array value is:");
		   a[i]=s1.nextInt();
	   }
	   for(i=0;i<=n;i++)
	   {
		   System.out.println("Value is:"+a[i]);
	   }
   }
	
	
	public static void main(String[] args) {
		

		
		Foo g1=new Foo();
		g1.f1();
		g1.f2();
		
	}

}
