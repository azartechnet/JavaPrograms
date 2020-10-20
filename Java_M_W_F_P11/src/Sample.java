import java.util.Scanner;

public class Sample {

	int n;
	Scanner sc1=new Scanner(System.in);
	void loop()
	{
		System.out.println("Enter the n value is::");
		n=sc1.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.println("I value is::"+i);
		}
	}
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.loop();

	}

}
