import java.util.*;

public class Foo {

	int empid;
	String empname;
	Scanner s1=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid::");
		empid=s1.nextInt();
		System.out.println("Enter the empname::");
		empname=s1.next();
	}
	void display()
	{
		System.out.println("Result is::"+empid+""+empname);
	}
	
	public static void main(String[] args) {
	
		Foo f1=new Foo();
		f1.input();
		f1.display();

	}

}
