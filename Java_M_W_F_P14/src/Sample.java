
public class Sample {

	void get1()
	{
		try
		{
		String name="mohamed";
		
		System.out.println("NullPointerException"+name.length());
		}
		catch(NullPointerException t)
		{
			System.out.println("Please check your"+t);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample d1=new Sample();
		d1.get1();

	}

}
