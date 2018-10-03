import java.util.Scanner;

public class Sample 
{
	int a;
	float f1;
	String name;
	Scanner g=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is:\n");
		a=g.nextInt();//10
		f1=g.nextFloat();//2.4
		
		name=g.next();//azar
		System.out.println("Result is:\n"+a+""+f1+""+name);
	}
}
class Demo
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample g=new Sample();
		g.get1();

	}

}
