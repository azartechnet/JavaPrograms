
import java.util.*;
public class Demo
{

	int i,n;
	Scanner g=new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter the n value is:\n");
		n=g.nextInt();
		for(int i=0;i<=n;i++)
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
class Foo
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Demo j1=new Demo();
		j1.input();

	}

}
