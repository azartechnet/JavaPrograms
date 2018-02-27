
public class Demo 
{
   
	String name="niit";//class or instance variable
	void g1()
	{
		int a=100;//local variable
		
		
		System.out.println("welcome to niit"+a+"your name"+name);
	}
	void g2()
	{
		System.out.println("welcome"+name);
	}
	
	
	public static void main(String as[])
	{
	
		Demo h=new Demo();//object creation
		h.g1();
		h.g2();

	}

}
