import java.util.Scanner;

public class Foo1 
{
  String pname;
  int pid,dis;
  int pprice,pprice1;;
  Scanner g=new Scanner(System.in);
  public void g1()
  {
	  System.out.println("Enter the pname");
	  pname=g.next();
	  System.out.println("Enter the pid");
	  pid=g.nextInt();
	  System.out.println("Enter the prices");
	  pprice=g.nextInt();
	  
	  
  }
  public void process()
  {
	  if(pprice>500)
	  {
		  System.out.println("Enter the discount");
		  dis=g.nextInt();
		  if(dis==100)
		  {
			  
			  pprice1=pprice-dis;
			  
			  System.out.println("Your Product Prices with discount:"+pprice1);
		  }
		  else
		  {
			  System.out.println("Your Product less No discount:"+pprice);
		  }
	  }
	  else
	  {
		  System.out.println("Buy product More get Discount 100RS");
	  }
  }
}
class Foo
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Foo1 j=new Foo1();
		j.g1();
		j.process();

	}

}
