abstract class Demo
{
	abstract void get1();
	void get2()
	{
		System.out.println("Normal Function...");
	}
}
class Foo extends Demo
{
	public void get1()
	{
		System.out.println("AbstractFunction");
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Foo f1=new Foo();
		f1.get1();
		f1.get2();

	}

}
