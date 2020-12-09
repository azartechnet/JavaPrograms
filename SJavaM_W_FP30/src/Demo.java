import java.util.Locale;

public class Demo {

	public static void main(String[] args) {
		//Locale locale=Locale.getDefault();  
		//Locale locale=new Locale("fr","FR");//for the specific locale  
		  
		//Locale locale=new Locale("cn","CHN");
		
		Locale locale=new Locale("de","de");
		System.out.println(locale.getDisplayCountry());  
		System.out.println(locale.getDisplayLanguage());  
		System.out.println(locale.getDisplayName());  
		System.out.println(locale.getISO3Country());  
		System.out.println(locale.getISO3Language());  
		System.out.println(locale.getLanguage());  
		System.out.println(locale.getCountry());  
		      
		}  

	}


