import java.util.Scanner;

class B
{
	int empid;
	String empname;
	Scanner sc1=new Scanner(System.in);
	public void get1()
	{
		System.out.println("Enter the empid and empname::");
		empid=sc1.nextInt();
		empname=sc1.next();
	}
}
class D1 extends B
{
	public void get2()
	{
		System.out.println("Your empid is::"+empid);
	}
}
class D2 extends B
{
	public void get3()
	{
		System.out.println("Your empname is::"+empname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
    D1 d1=new D1();		
	D2 d2=new D2();
	d1.get1();
	d1.get2();
	d2.get1();
	d2.get3();

	}

}
