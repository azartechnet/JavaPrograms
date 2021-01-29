
public class MainDemo {
	
	 public void get(int amount) throws ExceptionDemo
	    {
	    	int sal=2000;
	    	if((sal-amount)>500)
	    	{
	    		throw new ExceptionDemo();
	    	}
	    	else
	    	{
	    		System.out.println("SuccfullyCredited");
	    	}
	    }
	public static void main(String[] args) throws ExceptionDemo {
		 MainDemo b=new MainDemo();
         b.get(1000);

	}

}
