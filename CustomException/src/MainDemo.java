
public class MainDemo 
{
    public void get(int amount) throws ExceptionDemo
    {
    	int sal=400;
    	if((sal-amount)<1000)
    	{
    		throw new ExceptionDemo();
    	}
    	else
    	{
    		System.out.println("SuccfullyCredited");
    	}
    }
	public static void main(String[] args) throws ExceptionDemo
	{
		
          MainDemo b=new MainDemo();
          b.get(1000);
	}

}
