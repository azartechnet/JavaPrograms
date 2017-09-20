import java.util.Scanner;

public class Demo 
{
	int age,sal,dis;
	Scanner g=new Scanner(System.in);
	void p1()
	{
		System.out.println("Enter the value is:\n");
		age=g.nextInt();
	}
	void p2()
	{
		if(age>=60)
		{
			System.out.println("Enter the salary is;\n");
			sal=g.nextInt();
			if(sal>20000)
			{
				dis=sal-2000;
				System.out.println("Your salary is:\n"+dis);
			}
			else
			{
				dis=sal+2000;
				System.out.println("Your salary is:\n"+dis);
			}
		}
		else
		{		
			System.out.println("Your not elig...");
		}
	}
}
class Vio
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo g1=new Demo();
		g1.p1();
		g1.p2();

	}

}
