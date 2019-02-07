import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest 
{

	public static void main(String[] args) 
	{
	  Pattern p=Pattern.compile("a*b");
	  Matcher m=p.matcher("b");
	  boolean b=m.matches();
	  System.out.println(b);

	}

}
