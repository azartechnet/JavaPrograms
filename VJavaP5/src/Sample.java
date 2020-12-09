import java.util.Scanner;

public class Sample {

	int productid;
	String pname;
	Scanner sc1=new Scanner(System.in);//syntax
	void input()
	{
		System.out.println("Enter the value is::");
		productid=sc1.nextInt();
		pname=sc1.next();
	}
	void display()
	{
		System.out.println("Your data is::"+productid+""+pname);
	}
	public static void main(String[] args) {
		
		Sample f1=new Sample();
		f1.input();
		f1.display();

	}

}
