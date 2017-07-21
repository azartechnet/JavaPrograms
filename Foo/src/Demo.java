import java.util.Scanner;

public class Demo 
{
 int a,b,c;
 float c1;
 String name;
 Scanner h=new Scanner(System.in);
 void get1()
 {
	 System.out.println("Enter the a and b value is:\n");
	 a=h.nextInt();
	 b=h.nextInt();
	 System.out.println("Enter the float value is:\n");
	 c1=h.nextFloat();
	 System.out.println("Enter the name is:\n");
	 name=h.next();
 }
 void get2()
 {
	 c=a*b;
	 System.out.println("Mul is:\n"+c);
	 System.out.println("float is:\n"+c1+"Your name is:\n"+name);
	
 }
}
class Demo1
{
	public static void main(String[] args)
	{
		Demo g=new Demo();
		g.get1();
		g.get2();

	}

}
