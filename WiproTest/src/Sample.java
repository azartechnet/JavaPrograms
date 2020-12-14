
public class Sample 
{ 


	static void printcommon(String str1, String str2) 
	{ 
		int a1 = 0, a2 = 0; 
		for (int i = 0; i < str1.length(); i++) 
		{ 

			
			int ch = (str1.charAt(i)) - 'a'; 

		
			a1 = a1 | (1 << ch); 
		} 
		for (int i = 0; i < str2.length(); i++) 
		{ 

			
			int ch = (str2.charAt(i)) - 'a'; 

		
			a2 = a2 | (1 << ch); 
		} 

		
		int ans = a1 & a2; 

		int i = 0; 
		while (i < 26) 
		{ 
			if (ans % 2 == 1) 
			{ 
				System.out.print((char) ('a' + i));
				
			} 
			ans = ans / 2; 
			i++; 
			//System.out.println(ans);
		} 
		//System.out.println(ans+1);
	} 
	

	
	public static void main(String[] args) 
	{ 
		String str1 = "Testcase"; 
		String str2 = "Test"; 

		printcommon(str1, str2); 
	} 
} 


