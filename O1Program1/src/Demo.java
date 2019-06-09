import java.util.Scanner;

public class Demo 
{

  int age,sal,bns;
  Scanner f1=new Scanner(System.in);
  void get()
  {
	  System.out.println("Enter the value is:");
	  age=f1.nextInt();
  }
  void get2()
  {
	  if(age>=18)
	  {
		 System.out.println("Enter the Salary is");
		 sal=f1.nextInt();
		 if(sal>=20000)
		 {
			 bns=sal+500;
			 System.out.println("Your salary is:"+bns);
		 }
		 else
		 {
			 bns=sal+1000;
			 System.out.println("Your salary is:"+bns);
			 
		 }
	  }
	  else
	  {
		  System.out.println("Your age is low:"+age);
	  }
		  
  }
}
class Sample
{
	public static void main(String[] args) 
	{
		Demo f1=new Demo();
		f1.get();
		f1.get2();

	}

}
