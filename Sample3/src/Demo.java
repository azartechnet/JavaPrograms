
public class Demo
{
 	
  void g1(String uname)
  {
	  System.out.println("method-1"+uname);
  }
  void g2(int a1)
  {
	  System.out.println("method-2"+a1);
  }
}
class Demo1
{
	public static void main(String[] args) 
	{
		
           Demo h=new Demo();
           h.g1("admin");
           h.g2(12);
	}

}
