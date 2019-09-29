package newpgpinheritance1;

class B
{
	int a=100;
	void get1()
	{
		System.out.println("Baseclass");
	}
}
class D extends B
{
	void get2()
	{
		System.out.println("welcome"+a);
	}
}
public class Sample 
{

	public static void main(String[] args) 
	{
		
		D f1=new D();
		f1.get1();
		f1.get2();
		

	}

}
