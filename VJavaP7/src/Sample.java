import java.util.Scanner;

public class Sample {

	int age,sal,bns;
	Scanner sc1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		age=sc1.nextInt();
		if(age>=61)
		{
			System.out.println("Enter the salary is::");
			sal=sc1.nextInt();
			if(sal>=20000)
			{
				bns=sal+500;
				System.out.println("Your salary is::"+bns);
			}
			else
			{
				bns=sal+1000;
				System.out.println("Your salary is::"+bns);
			}
		}
		else
		{
             System.out.println("Age is low");			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Sample t1=new Sample();
		t1.get1();
	}

}
