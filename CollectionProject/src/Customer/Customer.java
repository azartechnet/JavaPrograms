package Customer;

import java.util.*;


public class Customer 
{
   public String cusName;
   public int cusId,age;
  
   Scanner h=new Scanner(System.in);
   public static HashSet<String> hs=new HashSet<>();
   public static ArrayList<Integer> as=new ArrayList<>();
   public void addCustomer()
   {
	   System.out.println("Enter the Customer Details:\n");
	   for(int i=0;i<2;i++)
	   {
	   System.out.println("Enter the Customer:");
	   cusName=h.next();
	   System.out.println("Enter the CusId:");
	   cusId=h.nextInt();
	   System.out.println("Enter the Age:");
	   age=h.nextInt();
	  
	   hs.add(cusName);
	   as.add(cusId);
	   as.add(age);
	   }
	   System.out.println("Your Name:"+hs);
	   System.out.println("Your CustomerId and Age"+as);
	   
	  
	   
	   
	     
	     
	    
	  
   }
   
}
