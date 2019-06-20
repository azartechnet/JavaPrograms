package dglapp1;

public class Foo 
{
   String name="niit";//class or instance variable
	void input()
	{
		int d1=100;//local variable
		System.out.println("welcome to method-1"+d1);
	}
	void input1(float f1)
	{
		System.out.println("welcome to method-2"+name);
	}
	
	
}

class Demo
{
	
	public static void main(String[] args)
	{
	
		Foo g1=new Foo();//creating object
		g1.input();
		g1.input1(2.3f);//function arguments
		System.out.println("welcome to niit");

	}

}
