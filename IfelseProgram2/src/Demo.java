import java.util.Scanner;

public class Demo 
{
  int salary,bns;
  Scanner g1=new Scanner(System.in);
  void f1()
  {
	  System.out.println("Enter the salary is:\n");
	  salary=g1.nextInt();
  }
  void f2()
  {
	  if(salary>30000)
	  {
		  bns=salary-2000;
		  System.out.println("Yoursalary is:\n"+bns);
	  }
	  else
	  {
		  bns=salary+2000;
		  System.out.println("Your salary is:\n"+bns);
	  }
  }
}
class Joo
{
	public static void main(String[] args)
	{
		Demo h=new Demo();
		h.f1();
		h.f2();

	}

}
