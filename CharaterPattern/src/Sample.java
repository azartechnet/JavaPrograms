import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample {

	public static void main(String[] args) {

		//Pattern p1=Pattern.compile("[a-zA-Z]");
		
		Pattern p2=Pattern.compile("[a-zA-Z]et");
		
		//Matcher m1=p1.matcher("aAzZ");
		Matcher m1=p2.matcher("Aet");
		
		boolean my=m1.matches();
		
		if(my)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		

	}

}
