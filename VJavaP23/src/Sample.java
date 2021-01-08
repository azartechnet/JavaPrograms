class B
{
	int a1=100;
	void get1()
	{
		System.out.println("Baseclass value is:"+a1);
	}
}
class D extends B
{
	void get2()
	{
		int a1=200;
		System.out.println("Derviedclas::"+super.a1);
	}
}


public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
