
public class Demo 
{
	

	Demo()//default Cons..
	{
		
		System.out.println("Default cons...");
	}
	Demo(int a)//param cons..
	{
		System.out.println("param cons"+a);
		
	}
//	void get1()
//	{
//		System.out.println("welcome");
//	}
	 
	public static void main(String[] args) 
	{
		new Demo();
		
		new Demo(100);
		
		//t1.get1();

	}

}
