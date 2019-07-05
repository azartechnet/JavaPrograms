
public class Demo
{
  void ss(String name,int s1)
  {
	  System.out.println(""+name+""+s1);
  }
  void ss(int s2)
  {
	  System.out.println(""+s2);
  }
}
class Sample
{
	public static void main(String[] args) 
	{
		Demo g=new Demo();
		g.ss("niit",33 );
		g.ss(44);

	}

}
