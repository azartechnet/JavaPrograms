import java.util.Scanner;

public class Sample 
{

  int a;
  Scanner s1=new Scanner(System.in);
  void input()
  {
	  System.out.println("Enter the value is:");
	  a=s1.nextInt();
	  if(a%2==0)
	  {
		  System.out.println("Even"+a);
	  }
	  else
	  {
		  System.out.println("Odd"+a);
	  }
  }
	
	
}

class Demo
{
	public static void main(String[] args) 
	{
		
      Sample sf=new Sample();
      sf.input();
	}

}
