import java.util.Scanner;

public class ArrayIndexvalue {

	public static void main(String[] args)
	{
		
           int a[]=new int[5];
           
           int n=5,i;
           
           int k;
           Scanner g1=new Scanner(System.in);
           
           for(i=0;i<5;i++)
           {
        	   System.out.println("Enter the Array value is:");
        	   a[i]=g1.nextInt();
           }
           System.out.println("Enter the index value is:");
           k=g1.nextInt();
           
           for(i=0;i<5;i++)
           {
        	   if(k==i)
        	   {
        		   System.out.println("Found"+a[i]);
        	   }
        	  /* else
        	   {
        		   System.out.println("Not Found");
        	   }*/
           }
	}

}
