import java.util.Scanner;

public class Sample {

	
	int productid[]=new int[5];
	int i,n;
	Scanner sc1=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the n value is::");
		n=sc1.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the array value is::");
			productid[i]=sc1.nextInt();
			System.out.println("Your array value is:"+productid[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.input();
		

	}

}
