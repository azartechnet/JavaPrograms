import java.util.Scanner;

public class Demo 
{
	 int a;
	 Scanner g=new Scanner(System.in);
	 void p1()
	 {
		 System.out.println("Enter the value is:\n");
		 a=g.nextInt();
	 }
	 void p2()
	 {
		 if(a%2==0)
		 {
			 System.out.println("Even"+a);
		 }
		 else
		 {
			 System.out.println("Odd"+a);
		 }
	 }
}
class Foo
{
	public static void main(String[] args) 
	{

		Demo j=new Demo();
		j.p1();
		j.p2();

	}

}
