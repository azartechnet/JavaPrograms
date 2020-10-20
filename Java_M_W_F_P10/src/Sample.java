import java.util.Scanner;

public class Sample {

    //int num=10;
	int num;
	Scanner sc1=new Scanner(System.in);
	void process()
	{
		System.out.println("Enter the number is::");
		num=sc1.nextInt();
		if(num%2==0)
		{
			System.out.println("Even"+num);
		}
		else
		{
			System.out.println("Odd"+num);
		}
	}
	
	
}
class Demo
{
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.process();
	

	}

}
