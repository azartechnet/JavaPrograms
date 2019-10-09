import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Sample
{

	public static void main(String[] args) 
	{
		DateFormat dt=DateFormat.getDateInstance(DateFormat.FULL,new Locale("de","DE"));
		
		String f=dt.format(new Date());
				
				System.out.println(f);

	}

}
