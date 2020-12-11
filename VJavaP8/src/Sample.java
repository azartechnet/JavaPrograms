import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		String exp;
		Scanner e1=new Scanner(System.in);
		System.out.println("Enter the value is::");
		exp=e1.next();
		switch(exp)
		{
		case "azar":
			System.out.println("Case-1");
			break;
		case "mohan":
			System.out.println("Case-2");
			break;
	    default:
	    	System.out.println("default");
	    	break;
		}

	}

}
