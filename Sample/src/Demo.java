
public class Demo
{
	int b=200;
  void get1()
  {
	  int a=100;
	  System.out.println("Method-1"+a+""+b);
  }
  void get2()
  {
	  System.out.println("Method-2"+b);
  }
}
class Demo1
{
	public static void main(String[] args)
	{
		
           Demo g=new Demo();
           g.get1();
           g.get2();
	}

}
