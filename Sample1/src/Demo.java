import java.util.Scanner;

public class Demo
{
	int prid;
	String pname;
	Scanner g1=new Scanner(System.in);
	 void get1()
	 {
		System.out.println("Enter the details:\n");
		prid=g1.nextInt();
		pname=g1.next();
		
	 }
	 void get2()
	 {
		System.out.println(""+prid+""+pname);
	 }
}
class Demo1
{
	public static void main(String as[]) 
	{
       Demo g=new Demo();
       g.get1();
       g.get2();
	}

}
