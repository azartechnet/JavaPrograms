
public class FirstProgram1 
{
  
	int a=100;//class or instance variable 
	void get1()
	{
		int b=200;//local variable
		System.out.println("Method one"+a);
	}
	void get2()
	{
		int c=400;
		System.out.println("Method two"+a+"aweeq"+c);
	}
	
	
	
	public static void main(String as[]) 
	{
		
		FirstProgram1 f1=new FirstProgram1();
		
		System.out.println("IN");
		
		f1.get1();
		f1.get2();
		System.out.println("OUT");
		
		//to display a data
		System.out.println("MainMethod");
		

	}

}
