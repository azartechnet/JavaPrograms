class B
{
	public void show()
	{
		System.out.println("This is Baseclass");
	}
}
class D1 extends B
{
	public void show()
	{
		System.out.println("This is dervied-1 class");
	}
}
class D2 extends B
{
   public void show()
   {
	   System.out.println("This is dervied-2 class");
   }
}
public class Sample {

	public static void main(String[] args) {
		
		B f1=new B();
		D1 f2=new D1();
		
		B ref;
		ref=f1;
		ref.show();
		
		D1 ref1;
		ref1=f2;
		ref1.show();

	}

}
