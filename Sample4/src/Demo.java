import java.util.Scanner;

class Sample
{
	
	String uname;
	int age;
	float avg;
	Scanner g=new Scanner(System.in);
	void g1()
	{
	System.out.println("Enter the value is:");
    uname=g.next();
    age=g.nextInt();
    avg=g.nextFloat();
	}
	void g2()
	{
		System.out.println("Display your value is:"+uname);
		System.out.println("Display your value is:"+age);
		System.out.println("Display your value is:"+avg);
	}
}





public class Demo 
{

	public static void main(String[] args) 
	{
	  Sample g=new Sample();
	  g.g1();
	  g.g2();
	}

}
