import java.util.Scanner;


class Argument{
	
		public static void main(String args[]) 
		{
			
		String string;
		String word;
		Scanner sc1=new Scanner(System.in);
		string=sc1.next();
		word=sc1.next();
		String temp[] = string.split(" ");
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
		if (string.equals(temp[i]))
		count++;
		}
		
		System.out.println(count);
		}
	
}

