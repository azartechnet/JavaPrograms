import java.util.Scanner;

public class Roo 
{
	
  int s1,s2,c1;	
  Scanner d1=new Scanner(System.in);	//getting input runtime 
  void j1()
  {
	  System.out.println("Enter the value is:\n");
	  s1=d1.nextInt();//read the input as integer
	  s2=d1.nextInt();
	  c1=s1*s2;
	  System.out.println("Your value is:::\n"+c1);//display input
  }
}

class Demo
{
	
	public static void main(String[] args)
	{
		Roo g1=new Roo();
		g1.j1();
		

	}

}
