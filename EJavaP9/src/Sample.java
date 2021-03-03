import java.util.Scanner;

class Demo
{
    int i,n;
	Scanner s1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n value is:");
		n=s1.nextInt();
		for(i=5;i>=1;--i)
		{
			System.out.println("I value is::"+i);
		}
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
