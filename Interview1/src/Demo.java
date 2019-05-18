
public class Demo 
{
  final int a=100;
  void input()
  {
	  a++;
	  System.out.println("BaseClass"+a);
  }
  
  
}
class D extends Demo
{
	//int a=400;
	void dis()
	{
		//int a=300;
		System.out.println("DerviedClass"+super.a);
		System.out.println("final"+a);
	}
	
}
class Sample
{
	public static void main(String ar[])
	{
		//Demo f1=new Demo();
		System.out.println("MainIN");
		//f1.input();
		D f2=new D();
		f2.input();
		f2.dis();
		System.out.println("MainOUT");
	}
}
