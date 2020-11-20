import java.util.Scanner;

class B
{
	String empname;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the empname is::");
		empname=sc.next();
	}
}
class D extends B
{
	void get2()
	{
		System.out.println("Your empname is::"+empname);
	}
}



public class Demo {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();
	}

}
