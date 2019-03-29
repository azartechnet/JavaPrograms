
public class Demo<T>
{
	
	private T t;
	
	
	
	public void setValue(T t)
	{
		this.t=t;
	}
	public void get()
	{
		//return t;
		
		System.out.println("Integer/String"+t);
	}
	
	

	public static void main(String[] args)
	{
		Demo<Integer>h1=new Demo<Integer>();
		
		Demo<String>h2=new Demo<String>();
		
		//h1.get2(100);
		
		 h1.setValue(100);
		 
		 h2.setValue("niit");
		 
		 h1.get();
		 
		 h2.get();
		
		//System.out.println("Value is:\n"+h1.get());
		

	}

}
