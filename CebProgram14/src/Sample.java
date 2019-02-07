
interface n1
{
	public void get();//only declartion
	int a=100;
}
class F1 implements n1
{
	public void get()
	{
		System.out.println("welcome to methods..");
	}
	void get1()
	{
		System.out.println("welcome to normal method..");
	}
}



public class Sample 
{

	public static void main(String[] args)
	{
		F1 g=new F1();
		g.get();
		g.get1();

	}

}
