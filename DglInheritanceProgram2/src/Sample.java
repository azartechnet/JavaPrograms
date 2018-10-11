
public class Sample 
{
	int p=100;
  void input1()
  {
	  System.out.println("Welcome to Base Class..");
  }
}
class D1 extends Sample
{
	void input2()
	{
		System.out.println("Welcome to D1 Class"+p);
	}
}
class D2 extends Sample
{
	void input3()
	{
		System.out.println("Welcome to D2 Class"+p);
	}
}
class Demo
{
	public static void main(String as[])
	{
		D2 h1=new D2();
		D1 h2=new D1();
		h1.input1();
		h1.input3();
		h2.input2();
	}
}
