import java.util.Scanner;

public class Sample {

	int productid;
	Scanner sc1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		productid=sc1.nextInt();
		if(productid==1001)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("NotEqual");
		}
	}
	
	public static void main(String[] args) {
		
		Sample f1=new Sample();
		f1.get1();

	}

}
