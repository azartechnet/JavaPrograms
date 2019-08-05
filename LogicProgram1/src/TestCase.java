import java.util.Scanner;
import java.math.*;
public class TestCase 
{
 public static void main(String[] args) { 
	int n, temp;
    int max=0,min=0;
     Scanner s=new Scanner(System.in);
     System.out.print("Enter no. of elements you want in array:");
     n = s.nextInt();
     int a[] = new int[n];
     System.out.println("Enter all the elements:");
     for (int i = 0; i < n; i++) 
     {
         a[i] = s.nextInt();
     }
     for(int i=0; i<a.length;i++ ) {
      if(a[i]>max) 
      {
          max = a[i];
    	  System.out.println(max);
    	  if(a[i]<min)
    	  {
           min=a[i];
           System.out.println("Min"+min);
    	  }
    	  else
    	  {
    		  System.out.println();
    	  }
      }
     
      //System.out.println("Min"+min);
     }
    
  }
}
