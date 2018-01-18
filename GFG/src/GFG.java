import java.io.IOException;
import java.util.Scanner;

public class GFG {

	public static void main(String[] args) {
	    int n,sq,sum = 0;
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a number:");
	    n = scan.nextInt();
	  
	    sq = n * n; //find square of the n
	    //calculating the sum of square
	    while(sq > 0)
	    {
	       sum = sum + sq % 10;
	       sq = sq / 10;
	    }
	   if(sum == n) //check sum and number
	      System.out.println(n+" is a neon number.");
	   else
	      System.out.println(n+" is not a neon number."); 
	  }

}
