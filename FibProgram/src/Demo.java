import java.util.Scanner;

public class Demo
{
	int n, first = 0, second = 1, next, c;
	  
	  Scanner g=new Scanner(System.in);
	  void g1()
	  {
		  System.out.println("Enter the n value is:\n");
		  n=g.nextInt();
	  }
	  void cal()
	  {
		  for ( c = 0 ; c < n ; c++ )
		   {
		      if ( c <= 1 )
		         next = c;
		      else
		      {
		         next = first + second;
		         first = second;
		         second = next;
		      }
		     System.out.println(next);
		   }
	  }
	public static void main(String[] args)
	{
		Demo g2=new Demo();
		g2.g1();
		g2.cal();

	}

}
