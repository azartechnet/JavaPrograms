import java.util.Scanner;

public class Sample1 
{
 
	int i,n;
	Scanner f1=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the n value is:");
		n=f1.nextInt();
		
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
			System.out.println("Even"+i);
			}
			else
			{
				System.out.println("Odd"+i);
			}
		}
	}
	
}
class Demo
{
	public static void main(String[] args) 
	{
		
         Sample1 g1=new Sample1();
          g1.input();
	}

}
