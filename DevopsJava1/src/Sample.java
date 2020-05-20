import java.util.Scanner;

class Demo
{
	int employeeid;
	Scanner sc=new Scanner(System.in);
	void fun1()
	{
		System.out.println("Enter the employeeId is:");
		employeeid=sc.nextInt();
	}
	void fun2()
	{
		System.out.println("YourEmployeeId::"+employeeid);
	}
}




public class Sample {

	public static void main(String[] args) {
		
		System.out.println("MainFunction");
		
		Demo d1=new Demo();
		d1.fun1();
		d1.fun2();

	}

}
