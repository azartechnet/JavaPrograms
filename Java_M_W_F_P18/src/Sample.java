import java.util.Scanner;

class B
{
	int productid;
	Scanner sc1=new Scanner(System.in);
	public void get1()
	{
		System.out.println("Enter the productid::");
		productid=sc1.nextInt();
	}
}
class D extends B
{
	public void get2()
	{
		System.out.println("Your ProductId is::"+productid);
	}
}
class D1 extends D
{
	
}
public class Sample {

	public static void main(String[] args) {
		
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
