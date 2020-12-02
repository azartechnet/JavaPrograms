class B
{
	int a=100;//global variable
	void get1()
	{
		System.out.println("Baseclass is::"+a);
	}
}
class D extends B
{
	void get2()
	{
		int a=200;//local variable
		System.out.println("Dervied class is::"+super.a);
	}
}



public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
