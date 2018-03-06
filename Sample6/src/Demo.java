import java.util.Scanner;

public class Demo 
{
	
	int a;//class or instance variable
	int b,v;
	Scanner k=new Scanner(System.in);
	void g1()
	{
		
		
		System.out.println("Enter the value is:\n");
		a=k.nextInt();
		b=k.nextInt();
		//System.out.println("Your value is:\n"+a+""+b);
	}
	void g2()
	{
		v=a*b;
		System.out.println("welcome to"+v);
	}

	public static void main(String as[])
	{
		Demo g=new Demo();
		
		g.g1();
		g.g2();

	}

}
