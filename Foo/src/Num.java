import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s1=sc.nextLine();
		//System.out.println(s1.charAt(0));
		String s2=new StringBuffer(s1).reverse().toString();
		if(s1.equals(s2))
		{
			System.out.println("palindrome");
			
		}
		else
			System.out.println("not palindrome");
		//System.out.println(s2);
		
	}

}
