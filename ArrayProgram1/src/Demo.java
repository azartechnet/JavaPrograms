import java.util.Scanner;

public class Demo
{
 
	
  int pid[]=new int[5];//array declaration
  int n,i;
  Scanner g=new Scanner(System.in);
  void get1()
  {
	  System.out.println("Enter the value is:\n");
	  n=g.nextInt();
	  
  }
  void get2()
  {
	  for(i=0;i<=n;i++)
	  {
		  System.out.println("Enter the Array value is:\n");
		  pid[i]=g.nextInt();
		  System.out.println("Array value is:\n"+pid[i]);
	  }
  }
}
class Foo
{
	public static void main(String[] args) 
	{
		Demo h=new Demo();
		h.get1();
		h.get2();

	}

}
