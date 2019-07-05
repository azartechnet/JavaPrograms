
abstract class Demo
{
	abstract void input();
	void get1()
	{
		System.out.println("Welcome to normal method");
	}
}
abstract class Demo12
{
	abstract void input1();
}


public class SampleApp extends Demo
{
	public void input()
	{
		System.out.println("welcome to first abstract method...");
	}
	
}

class SampleApps extends Demo12
{
	public void input1()
	{
		System.out.println("Welcome to 2nd Abstractclass");
	}
}


	
class Foo
{
	public static void main(String[] args) 
	{

          //SampleApp f1=new SampleApp();
		  Demo f1=new SampleApp();//referce type
		  Demo12 f2=new SampleApps();//factory method
          f1.input();
          f1.get1();
          f2.input1();

	}

}
