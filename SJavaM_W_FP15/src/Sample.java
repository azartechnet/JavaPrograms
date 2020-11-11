import java.util.Scanner;

public class Sample {

	
	void get1(int a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample f1=new Sample();
		System.out.println("Enter the value is::");
		int s1;
		Scanner sc1=new Scanner(System.in);
		s1=sc1.nextInt();
		f1.get1(s1);

	}

}
