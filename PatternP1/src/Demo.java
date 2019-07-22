import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		
		
		String s1="niit";
		
		Pattern p1=Pattern.compile(s1);
		
		String s2=p1.pattern();
		
		System.out.println(s2);
		

	}

}
