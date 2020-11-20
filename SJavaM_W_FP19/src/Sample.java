import java.util.Scanner;

interface B1
{
	int productid=1001;
	void get1();
}
interface B2 extends B1
{
	int categoryid=2002;
	void get2();
}
class D implements B2
{
	String uname;
	Scanner sc1=new Scanner(System.in);
	public void get1()
	{
		System.out.println("Enter the username::");
		uname=sc1.next();
		System.out.println("your result is::"+uname);
	}
	public void get2()
	{
		System.out.println("This is interface-2"+categoryid);
	}
}


public class Sample {

	public static void main(String[] args) {
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
