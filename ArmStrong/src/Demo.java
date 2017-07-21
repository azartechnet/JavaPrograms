import java.util.Scanner;

public class Demo
{
  int n;
  int reverse=0;
  Scanner g=new Scanner(System.in);
  void g1()
  {
	  System.out.println("Enter the n value is:\n");
	  n=g.nextInt();
  }
  void g2()
  {
	  while (n != 0)
	   {
	      reverse = reverse * 10;
	      reverse = reverse + n%10;
	      n       = n/10;
	   } 
	  System.out.println("Your value is:\n"+reverse);
  }
}
class Demo1
{
	public static void main(String[] args)
	{
		Demo g=new Demo();
		g.g1();
		g.g2();

	}

}
