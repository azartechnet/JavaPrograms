import java.util.Scanner;

class B
{
	int productid;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		productid=sc.nextInt();
	}
}
class D extends B
{
	void get2()
	{
		System.out.println("Your productid is::"+productid);
	}
}


public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
