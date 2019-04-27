
class B
{
	int a=100;
	void get()
	{
		System.out.println("BaseClass"+a);
	}
}
class D extends B
{
	void get1()
	{
		int a=200;
		System.out.println("DerivedClass"+a);
		System.out.println("DerivedBaseClass"+super.a);
	}
}


public class Demo {

	public static void main(String[] args) {
	

		  D f1=new D();
		  f1.get();
		  f1.get1();
	}

}
