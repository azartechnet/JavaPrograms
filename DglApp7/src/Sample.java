import java.util.Scanner;

public class Sample 
{

  int tot,p1,p2,p3,amt,cal;
  Scanner sc1=new Scanner(System.in);
  void get1()
  {
	 System.out.println("Enter the product prices:");
	 p1=sc1.nextInt();
	 p2=sc1.nextInt();
	 p3=sc1.nextInt();
	 
	 tot=p1+p2+p3;
  }
	
  void cal()
  {
	  if(tot>600&&tot<900)
	  {
		  System.out.println("Enter the discount amount:");
		  amt=sc1.nextInt();
		  if(amt==500)
		  {
			  
			  cal=tot-amt;
			  System.out.println("Your Total amount is:"+cal);
		  }
		  else
		  {
			  cal=tot-amt;
			  System.out.println("Your Total amount is:"+cal);
		  }
		  
		  
	  }
	  else
	  {
		  System.out.println("Your Total amount is:"+tot+"No discount");
	  }
  }
}
class Foo
{
	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		s1.get1();
		s1.cal();

	}

}
