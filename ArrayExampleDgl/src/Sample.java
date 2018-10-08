import java.util.Scanner;

public class Sample 
{
	
	int pid[]=new int[20];//declaration for one-dim-array
	int i,n;
	Scanner f=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value is:\n");
		n=f.nextInt();
		
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the array value is:\n");
			pid[i]=f.nextInt();
		}
		for(i=0;i<=n;i++)
		{
			System.out.println("Array Value is:\n"+pid[i]);
		}
	}
	
}
class Foo
{
   public static void main(String as[])
   {
	   Sample h=new Sample();
	   h.input();
   }
}
