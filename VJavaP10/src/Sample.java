import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		
		int i,n,fact=1;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the n value is::");
		n=sc1.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			//System.out.println(i);
		}
		System.out.println(fact);
		
	}

}
