
public class Demo 
{
	
	void get1()
	{
		System.out.println("Method-1");
	}
	void get2()
	{
		System.out.println("Method-2");
	}
	
	
	
}


class Demo1
{

	public static void main(String[] args)
	{
	
		
		System.out.println("MainIN");
		
		Demo d1=new Demo();
		d1.get1();
		d1.get2();
		System.out.println("MainOUT");

	}

}
