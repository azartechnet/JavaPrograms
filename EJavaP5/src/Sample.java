import java.util.Scanner;

public class Sample {

	String cname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		int categoryid;
		System.out.println("Enter the categoryId and Cname::");
		categoryid=sc.nextInt();
		cname=sc.next();
		System.out.println("This is input method.."+categoryid);
	}
	void view()
	{
		System.out.println("This is view method..\n"+cname);
	}
	
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.input();
		s1.view();

	}

}
