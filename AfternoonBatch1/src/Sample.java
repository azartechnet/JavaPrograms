import java.util.Scanner;

public class Sample
{

	int a;
	Scanner g=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter the value is:\n");
		a=g.nextInt();
		
		System.out.println("Value is:\n"+a);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Sample g1=new Sample();
		g1.get();

	}

}
