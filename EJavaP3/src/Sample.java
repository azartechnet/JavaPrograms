import java.util.Scanner;

class Demo
{
	int productid;
	String pname;
	char s;
	Scanner sc1=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value is::");
		productid=sc1.nextInt();
		pname=sc1.next();
		s=sc1.next().charAt(0);
	}
	void display()
	{
		System.out.println("Your value is::"+productid+"\nProductName is::"+pname);
	}
}



public class Sample {

	
	public static void main(String[] args) {
		Demo f1=new Demo();
		f1.input();
		f1.display();

	}

}
