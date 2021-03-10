
public class Sample {

	public static void main(String[] args) {
		
		
		int n=123;
		int reverse=0; 
		while (n != 0)
		   {
		      reverse = reverse * 10;
		      reverse = reverse + n%10;
		      n       = n/10;
		   }
		System.out.println("Resverse Number is::"+reverse);

	}

}
