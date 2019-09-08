package sumofdigits;

import java.util.Scanner;

public class Sample {

	
	int n,sum=0,rem;
	Scanner d1=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the n value is:");
		n=d1.nextInt();
		
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}
	
	
	
	public static void main(String[] args) {
	

		Sample f1=new Sample();
		f1.input();
	}

}
