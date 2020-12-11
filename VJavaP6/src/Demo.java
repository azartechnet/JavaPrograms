import java.util.Scanner;

public class Demo {
	int a;
	Scanner sc1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		a=sc1.nextInt();
		if(a%2==0)
		{
			System.out.println("Even"+a);
		}
		else
		{
			System.out.println("Odd"+a);
		}
	}
	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
