import java.util.Scanner;

public class Demo 
{
	int a;
	float f1;
	String uname;
	Scanner s1=new Scanner(System.in);
   void input()
   {
	   System.out.println("Enter the value is:\n");
	   a=s1.nextInt();
	   f1=s1.nextFloat();
	   uname=s1.next();
   }
   void display()
   {
	   System.out.println("Result is:\n"+a+""+f1+""+uname);
   }
}
class Sample
{
	public static void main(String[] args) {
		
		Demo g1=new Demo();
		g1.input();
		g1.display();

	}

}
