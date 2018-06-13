
public class Demo 
{

	void patter1()
	{
		int i, j, k;
	    for(i=1;i<=5;i++)
	    {
	    	//System.out.print("i value is"+i);
	        for(j=i;j<5;j++)
	        {
	        	//System.out.print("j value is"+j);
	           System.out.print(" ");
	        }
	        for(k=1;k<(i*2);k++)
	        {
	        	//System.out.print("k value is"+k);
	               System.out.print("*");
	        }
	    	//System.out.print("OuterLoop");
	        System.out.print("\n");
	    }	
	}
	void empty()
	{
		System.out.println("\n");
	}
	void pattern2()
	{
		 int i, j, k;
		    for(i=5;i>=1;i--)
		    {
		        for(j=5;j>i;j--)
		        {
		        	System.out.print(" ");
		        }
		        for(k=1;k<(i*2);k++)
		        {
		        	  System.out.print("*");
		        }
		        System.out.print("\n");
		    }

	}
	
	public static void main(String[] args) 
	{
		Demo g=new Demo();
		g.patter1();
		g.empty();
		g.pattern2();

	}

}
