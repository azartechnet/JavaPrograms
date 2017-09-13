import java.util.Scanner;

public class Demo 
{
	int a,b,c;
	 Scanner f=new Scanner(System.in);
	 void g1()
	 {
		 System.out.println("Enter the value is:\n");
		 a=f.nextInt();
		 b=f.nextInt();
		 c=a*b;
		 System.out.println("Result is:\n"+c);
	 }
}

class Demo1
{

	public static void main(String[] args) 
	{
		Demo h=new Demo();
		h.g1();

	}

}
