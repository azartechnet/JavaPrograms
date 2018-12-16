

  
	 
public class Demo 
{
	enum employee{a,b};
	void get()
	{
	//	String name[]={"aa","bb"};
		
		
		
		
		for (employee g : employee.values())
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
