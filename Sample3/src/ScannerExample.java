import java.util.Scanner;

public class ScannerExample 
{
	int pid;
	float avg;
	String uname;
	Scanner g=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value is:\n");
		pid=g.nextInt();
		avg=g.nextFloat();
		uname=g.next();
	}
	void display()
	{
		System.out.println("Result is:\n"+pid+""+avg+""+uname);
	}
}
class Demo2
{
	public static void main(String[] args) 
	{
		ScannerExample h=new ScannerExample();
		h.input();
		h.display();

	}

}
