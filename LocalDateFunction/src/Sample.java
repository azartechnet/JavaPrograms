import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Sample
{

	public static void main(String[] args) 
	{
		DateFormat dt=DateFormat.getDateInstance(DateFormat.LONG,new Locale("tn","TN"));
		
		String f=dt.format(new Date());
				
				System.out.println(f);

	}

}
