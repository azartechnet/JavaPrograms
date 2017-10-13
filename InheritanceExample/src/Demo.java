import java.util.Scanner;

class B
{
	
	int pid;
	Scanner g=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is:\n");
		pid=g.nextInt();
	}
}
class D extends B
{
	String uname;
	void get2()
	{
		System.out.println("Enter the uname is:\n");
		uname=g.next();
		System.out.println("Your Pid is:\n"+pid+"Your name is:\n"+uname);
	}
	
}



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D h=new D();
		h.get1();
		h.get2();

	}

}
