
public class Sample {

	public static void main(String[] args) 
	{
	
		int s=0;
		int p=1;
        for(int i=1;i<=5;i++)
        {
        	if(i%2==0)
        	{
        		p=p*i;
        		System.out.println("Even Value is:"+i);
        		
        	}
        	else
        	{
        		s=s+i;
        		System.out.println("Odd Value is:"+i);
        		
        	}
        }
        System.out.println("Product of Even:"+p);
        System.out.println("Sum of Odd:"+s);
	}

}
