import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sample {

	public static void main(String[] args) 
	{
		//greedy quantifier
	  Pattern p=Pattern.compile("g+");
	  Matcher m=p.matcher("google");
	  
	   /*reluctant quantifier
	  Pattern p=Pattern.compile("g+?");
	  Matcher m=p.matcher("google");
	  
	  //possessivie quanifer
	   Pattern p=Pattern.compile("g++");
	  Matcher m=p.matcher("google");
	   */
	  
	  while(m.find())
	  {
		  System.out.println("pattern found from"+(m.start())+"to"+(m.end()-1));
	  }

	}

}
