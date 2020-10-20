import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		int i,j,n;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the n value is::");
		n=sc1.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.print("\n");
		}
		
		/*for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.print("\n");
		}
*/
	}

}
