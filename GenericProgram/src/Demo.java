
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
		
		System.out.println(""+t);
	}
	
	

	public static void main(String[] args)
	{
		Demo<Integer>h1=new Demo<Integer>();
		
		//h1.get2(100);
		
		 h1.setValue(100);
		 
		 h1.get();
		
		//System.out.println("Value is:\n"+h1.get());
		

	}

}
