import java.util.Scanner;

public class Sample {

	
	int p1,p2,p3,tot,bns;
	//int pp[]=new int[5];
	//pp[0]
	//pp[1]
	//pp[2]
	Scanner sc1=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the ProductPrice::");
		p1=sc1.nextInt();
		p2=sc1.nextInt();
		p3=sc1.nextInt();
		tot=p1+p2+p3;
	}
	void billing()
	{
		if(tot>=900)
		{
			bns=tot-200;
			System.out.println("Your ProductPrices is::"+bns);
					
		}
		else
		{
			bns=tot-100;
			System.out.println("Your ProductPrices is::"+bns);
		}
	}
	void switchcaseprocess()
	{
		char exp;
		System.out.println("Enter the expression::");
		exp=sc1.next().charAt(0);
		switch(exp)
		{
		case 'a':
			System.out.println("case-a");
			break;
		case 'b':
			System.out.println("case-b");
			break;
	    default:
	    	System.out.println("default block");
	    	break;
		}
	}
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		//s1.input();
		//s1.billing();
		s1.switchcaseprocess();

	}

}
