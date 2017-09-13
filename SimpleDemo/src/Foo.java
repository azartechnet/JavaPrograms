import java.util.Scanner;

public class Foo
{
	int prdid;//class variable
	float avg;
	String name;
	Scanner g=new Scanner(System.in);
	void g1()
	{
		
		System.out.println("Enter the value is:\n");
		prdid=g.nextInt();
		avg=g.nextFloat();
		name=g.next();
		
	}
	void g2()
	{
		System.out.println("Result is:\n"+prdid+""+avg+""+name);
	}
	
}
class Demo
{
	public static void main(String[] args)
	{
		Foo f=new Foo();
		f.g1();
		f.g2();
		

	}

}
