import java.util.Scanner;

public class Sample {

	int age,salary,bns;
	Scanner sc1=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the age is::");
		age=sc1.nextInt();
		if(age>=61)
		{
			System.out.println("Enter the salary is::");
			salary=sc1.nextInt();
			if(salary>=20000)
			{
				bns=salary+500;
				System.out.println("Your salary is::"+bns);
			}
			else
			{
				bns=salary+1000;
				System.out.println("Your Salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Age is low");
		}
	}
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.input();

	}

}
