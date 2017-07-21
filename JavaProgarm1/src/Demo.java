import java.util.Scanner;

public class Demo
{
	
	/*String name;*/
	int salary;
	Scanner g1=new Scanner(System.in);//Reading the data
	void get()
	{
		
		
		System.out.println("Enter the value is:\n");
		/*name=g1.next();*/
		salary=g1.nextInt();
	}
	void get2()
	{
		if(salary>40000)
		{
		System.out.println("True block");
		}
		else
		{
			System.out.println("false block");
		}
		/*System.out.println("Your value is:\n"+name+"Your Salary is:\n"+salary);*/
	}

}
class Demo1
{
	

	public static void main(String[] args)
	{
		
       Demo g=new Demo();
       
       g.get();
       g.get2();
	}

}
