import java.util.Scanner;

public class Sample {

	int exp;
	Scanner sc1=new Scanner(System.in);
	
	void get1()
	{
	  System.out.println("Enter the exp::");
	  exp=sc1.nextInt();
	  switch(exp)
	  {
	  case 1:
		  System.out.println("Case-1");
		  break;
	  case 2:
		  System.out.println("Case-2");
		  break;
	  case 3:
		  System.out.println("Case-3");
		  break;
	  default:
		  System.out.println("default case");
		  break;
	  }
	}
	
	public static void main(String[] args) {
		
		Sample s=new Sample();
		s.get1();

	}

}
