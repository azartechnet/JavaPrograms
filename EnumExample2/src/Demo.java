

  
	 
public class Demo 
{
	enum employee{raja,mohan};
	void get()
	{
	//	String name[]={"aa","bb"};
						
		for (employee g : employee.values())//for each statement
		{
			System.out.println("Value is:"+g);
		}
		
		
	}
	
	public static void main(String[] args)
	{
	   Demo h=new Demo();
	   h.get();
		
	}

}
