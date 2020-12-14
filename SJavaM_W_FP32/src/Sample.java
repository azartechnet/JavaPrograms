
public class Sample {

	
	void get1()
	{
		try
		{
			//String n="hai";
			String n=null;
			System.out.println("Value is::"+n.length());
		}
		catch(NullPointerException t)
		{
			System.out.println("Please check your value");
		}
	}
	
	public static void main(String[] args) {
		
		
		Sample f1=new Sample();
		f1.get1();

	}

}
