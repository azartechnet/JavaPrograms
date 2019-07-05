import java.util.Scanner;

public class Demo 
{

	int i,n;
	int pid[]=new int[10];
	Scanner d=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the n value is:");
		n=d.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the array value is:");
			pid[i]=d.nextInt();
		}
		for(i=0;i<=n;i++)
		{
			System.out.println("I value is:"+pid[i]);
		}
	}
	public static void main(String[] args) 
	{
		Demo f1=new Demo();
		f1.input();

	}

}
