import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {


		int i,n,j=0,j1=1;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the n value is::");
		n=sc1.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				
				j=j+i;
			System.out.println("Even::"+j);
			}
			else
			{
				j1=j1*i;
				System.out.println("Odd::"+j1);
			}
			
		}
		//System.out.println(j);

	}

}
