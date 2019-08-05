import java.text.DecimalFormat;
import java.util.Scanner;

public class TestCase 
{
	 
			
		    
		    static final double PI = Math.PI; 
         
		    static double findArea(int r) 
		    {
		       double c;
			   String f;
		       c=(float) (PI * Math.pow(r, 2))
		    		   ;
		      
		       return c;
		    } 
		           
		    // Driver method 
		    public static void main(String[] args)  
		    { 
		        System.out.format("Area is %3.2f ",findArea(18)); 
		    } 

		       
	
}

