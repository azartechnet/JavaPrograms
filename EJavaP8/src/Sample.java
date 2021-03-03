import java.util.Scanner;

class Demo
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	void get2()
	{
		if(a>b)
		{
			System.out.println("A is big.."+a);
		}
		else
		{
			System.out.println("B is big.."+b);
		}
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
