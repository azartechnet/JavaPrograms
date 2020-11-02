import java.util.Scanner;

public class Sample {

	int productid;
	String pname;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		productid=sc.nextInt();
		if(productid==1001)
		{
			System.out.println("Enter the ProductName::");
			pname=sc.next();
			System.out.println("YourProductId is::"+productid+""+pname);
		}
		else
		{
			System.out.println("YourProductid is not equal");
		}
	}
	void get2()
	{
		String uname,pass;
		System.out.println("Enter the username and password::");
		uname=sc.next();
		pass=sc.next();
		if(uname.equals("admin")&&pass.equals("admin"))
		{
			System.out.println("LoginSucess..");
		}
		else
		{
			System.out.println("LoginFail..");
		}
	}
	void get3()
	{
		int age,sal,bns;
		System.out.println("Enter the age is::");
		age=sc. nextInt();
		if(age>=61)
		{
			System.out.println("Enter the salary is::");
			sal=sc.nextInt();
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
			System.out.println("Your age is low..");
		}
	}
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		//s1.get1();
		//s1.get2();
		s1.get3();

	}

}
