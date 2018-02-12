import java.util.*;

public class Foo
{
	int a;
	float f1;
	String name;
	Scanner g=new Scanner(System.in);
   void get1()
   {
	  
	   System.out.println("Enter the value is:");
	   a=g.nextInt();
	   f1=g.nextFloat();
	   name=g.nextLine();
   }
   void get2()
   {
	   System.out.println("Your Data is"+a+""+f1+""+name);
   }
	public static void main(String[] args)
	{
		Foo h=new Foo();
		h.get1();
		h.get2();

	}

}
