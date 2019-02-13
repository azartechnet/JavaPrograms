package assertion;
import java.util.*;
public class validateage {
	public static void main(String arg[])
	{
		int age;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter ur age:");
		age=obj.nextInt();
		assert(age>0)&&(age<130);
		System.out.println("entered age:"+age);
	}

}
