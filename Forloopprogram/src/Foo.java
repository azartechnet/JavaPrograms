import java.util.Scanner;

public class Foo
{
  int n,i;
  Scanner g1=new Scanner(System.in);
  void f1()
  {
	  System.out.println("Enter the n value is:\n");
	  n=g1.nextInt();
	  for(i=0;i<=n;i++)
	  {
		  System.out.println("I value is:\n"+i);
	  }
  }
}
class Demo
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo h=new Foo();
		h.f1();

	}

}
