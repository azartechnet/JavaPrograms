import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		//String name="mohamed";
//		String name=new String("mohamed");
//		System.out.println(name);
//		System.out.println(name.length());
//		System.out.println(name.charAt(2));
		
		
		String uname;
		String pass;
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the String value is:");
		
		uname=s1.next();
		pass=s1.next();
		
		if(uname.equals("admin")&&pass.equals("admin"))
		{
			System.out.println("LoginSucess");
		}
		else
		{
			System.out.println("LoginFail");
		}

	}

}
