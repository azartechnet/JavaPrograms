
import java.util.*;
public class Demo 
{
	
	int a[]=new int[5];
 
	 int i,n,k;
	Scanner f=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter the value is:\n");
		n=f.nextInt();
		
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the array value is:\n");
			a[i]=f.nextInt();
		}
		
		System.out.println("Enter the index value is:\n");
		k=f.nextInt();
		
		for(i=0;i<=n;i++)
		{
			if(i==k)
			{
				System.out.println("Array value is:\n"+a[i]);
				
				
			}
			/*else
			{
				System.out.println("NotFound...");
			}*/
		}
		
	}
	
	
   public static void main(String as[])
   {
	   Demo j=new Demo();
	   j.get();
   }
}
