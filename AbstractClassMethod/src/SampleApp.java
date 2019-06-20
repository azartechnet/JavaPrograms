
abstract class Demo
{
	abstract void input();
	void get1()
	{
		System.out.println("Welcome to normal method");
	}
}




public class SampleApp extends Demo
{
	public void input()
	{
		System.out.println("welcome to first abstract method...");
	}
	
	
	

	public static void main(String[] args) 
	{

          //SampleApp f1=new SampleApp();
		  Demo f1=new SampleApp();//referce type
          f1.input();
          f1.get1();

	}

}
