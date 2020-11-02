class B1
{
	 int a=100;
	public void get1()
	{
	  
	   System.out.println("BaseClass::"+a);
	}
}
class D1 extends B1
{
	public void get2()
	{
	     int  a=200;
		System.out.println("Dervied class::"+super.a);
	}
}

public class Sample {

	public static void main(String[] args) {
		
		D1 f1=new D1();
		f1.get1();
		f1.get2();

	}

}
