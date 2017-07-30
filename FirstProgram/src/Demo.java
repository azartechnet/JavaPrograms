import java.util.Scanner;

public class Demo 
{
	int productid;
	String prdname;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
	System.out.println("Enter the value is:\n");
	productid=sc.nextInt();
	prdname=sc.next();
	}
	void get2()
	{
		System.out.println("Your data is:\n"+productid+""+prdname);
	}
}
class Demo1
{
	public static void main(String args[]) 
	{
		
     Demo h=new Demo();
     h.get1();
     h.get2();
	}

}
