class B
{
	void get1()
	{
		System.out.println("get1 fun-1");
	}
	
}
class D extends B
{
	void get1()
	{
		System.out.println("get1 fun-2");
	}
}


public class Sample {

	public static void main(String[] args) {
		
		B r1=new B();
		D r2=new D();
		
		B ref;
		ref=r1;
		ref.get1();
		
		ref=r2;
		ref.get1();

	}

}
