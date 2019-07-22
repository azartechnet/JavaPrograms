class B
{
  int a=10;	
  void get1()
  {
	  System.out.println("BaseClass is:"+a);
  }
}
class D extends B
{
	void get2()
	{
		System.out.println("Derviedclass"+a);
	}
}
public class Demo {

	public static void main(String ar[]) 
	{
		
          D g1=new D();
          g1.get1();
          g1.get2();
	}

}
