
public class Sample
{
	int a=10;
  void get()
  {
	  System.out.println("BaseClass value is:\n"+a);
  }
}
class D extends Sample
{
	void inheritance()
	{
		System.out.println("Dervied value is:\n"+a);
	}
}
class Demo
{
	public static void main(String as[])
	{
		D f=new D();
		f.get();
		f.inheritance();
	}
}
