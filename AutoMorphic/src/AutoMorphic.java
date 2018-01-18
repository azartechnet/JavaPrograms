import java.util.Scanner;

public class AutoMorphic 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
         System.out.println("Enter any number");
         int num  = s.nextInt();
         int square = num* num;
         System.out.println(" Given Number : "  + num ) ;
         System.out.println("  Its Square is " + square) ;
         if( num == (square%100) || num  == (square%10) ) 
                      System.out.println(num  +"is Automorphic");
        else
                     System.out.println(num  +"is  not Automorphic");

	}

}
