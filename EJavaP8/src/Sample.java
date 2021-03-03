import java.util.Scanner;

class Demo
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	void get2()
	{
		if(a>b)
		{
			System.out.println("A is big.."+a);
		}
		else
		{
			System.out.println("B is big.."+b);
		}
	}
	void get3()
	{
	    int age,sal,bns;
	    System.out.println("Enter the value is::");
	    age=sc.nextInt();
	    if(age>=60)
	    {
	    	System.out.println("Enter the Salary is::");
	    	sal=sc.nextInt();
	    	if(sal>=20000)
	    	{
	    		bns=sal+500;
	    		System.out.println("Your Salary is::"+bns);
	    	}
	    	else
	    	{
	    		bns=sal+1000;
	    		System.out.println("Your Salary is::"+bns);
	    	}
	    }
	    else
	    {
	    	System.out.println("Age is low");
	    }
	}
	void get4()
	{
		int exp;
		System.out.println("Enter the exp::");
		exp=sc.nextInt();
		switch(exp)
		{
		case 1:
			System.out.println("This is case-1");
			break;
		case 2:
			System.out.println("This is case-2");
			break;
		default:
			System.out.println("This is default case..");
			break;
		}
		
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		//f1.get1();
		//f1.get2();
		//f1.get3();
		f1.get4();

	}

}
