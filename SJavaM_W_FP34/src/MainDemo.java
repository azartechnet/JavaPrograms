
public class MainDemo {
	public void get(int amount) throws Abi 
    {
    	int sal=2000;
    	if((sal-amount)>500)
    	{
    		throw new Abi();
    	}
    	else
    	{
    		System.out.println("SuccfullyCredited");
    	}
    }
	public static void main(String[] args) throws Abi {
		
		MainDemo g1=new MainDemo();
	    g1.get(1000);

	}

}
