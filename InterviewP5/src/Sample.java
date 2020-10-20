import java.util.Scanner;

public class Sample {

	
	Scanner sc=new Scanner(System.in);
	int n;
	void factvalue()
	{
		int fact=1;
		
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factvalue is::"+fact);
	}
	void OddEven()
	{
		for(int i=0;i<=5;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even"+i);
			}
			else
			{
				System.out.println("Odd"+i);
			}
			//System.out.println("I value is::"+i);
		}
	}
   void whileProcess()
   {
	   int i=0;
	   System.out.println("Enter the n value is::");
	   n=sc.nextInt();
	   while(i<=n)
	   {
		 System.out.println("I value is::"+i);
		// i++;
		 ++i;
		 System.out.println("++ i value is::"+i);
	   }
   }
   void dowhileloop()
   {
	   int i=0;
	   System.out.println("Enter the n value is::");
	   n=sc.nextInt();
	   do
	   {
		   System.out.println("I value is::"+i);
		   i=i+1;
	   }while(i<=n);
   }
   
   void whilelogicProcess()
   {
	   int reverse=0; 
	   System.out.println("Enter the n value is::");
	   n=sc.nextInt();
	   while (n != 0)
	      {
	         reverse = reverse * 10;
	         reverse = reverse + n%10;
	         n       = n/10;
	      }
	   System.out.println("Reverse::"+reverse);
   }
	
	public static void main(String[] args) {
		
		
		Sample f1=new Sample();
		//f1.factvalue();
		//f1.OddEven();
		//f1.whileProcess();
		//f1.dowhileloop();
		f1.whilelogicProcess();
		

	}

}
