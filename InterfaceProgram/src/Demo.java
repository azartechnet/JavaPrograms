



interface b1
{
	void get1();
}
interface b2 extends b1
{
	void get2();
	
}
public class Demo implements b2 
{
  public void get1()
  {
	  System.out.println("interface-1");
  }
  public void get2()
  {
	  System.out.println("interface-2");
  }
}
class Demo1
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Demo g=new Demo();
		g.get1();
		g.get2();

	}

}
