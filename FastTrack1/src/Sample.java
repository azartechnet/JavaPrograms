
public class Sample 
{

	int age=19;//class variable
	void input(String email)//Method-1
	{
		System.out.println("Method one"+age+"YourEmail id is:"+email);
	}
	void process()
	{
		String name="niit";
		System.out.println("Method two"+name);
	}
}
class Demo
{
	public static void main(String as[]) 
	{
	
		System.out.println("welcome");
		Sample s1=new Sample();//object creation
		s1.input("admin@gmail.com");//invoke the method using object
		s1.process();

	}

}
