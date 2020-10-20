import java.util.Scanner;

public class Sample {

	//instance variable
	int empid,salary;
	String ename;
	Scanner sc1=new Scanner(System.in);
	
	void inputProcess()
	{
		try
		{
		System.out.println("Enter the empid::");
		empid=sc1.nextInt();
		System.out.println("Enter the ename::");
		ename=sc1.next();
		System.out.println("Enter the salary is::");
		salary=sc1.nextInt();
		}
		catch(Exception t)
		{
			System.out.println("please check your input"+t);
		}
	}
	void displayProcess()
	{
		System.out.println("YourDetails is::");
		System.out.println(empid+"\t"+ename+"\t"+salary);
		
	}
	void showProcess(int empage)//Argument passing
	{
		System.out.println("Employee Age is::"+empage);
	}
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		
		s1.inputProcess();
		s1.displayProcess();
		s1.showProcess(23);

	}

}
