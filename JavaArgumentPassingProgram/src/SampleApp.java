
public class SampleApp
{

	void g1(int a1)
	{
		int s1=a1;
		System.out.println("value is::"+s1);
	}
	void g2(String name,int b1)
	{
		System.out.println(""+name+""+b1);
	}
	
	
	public static void main(String[] args) 
	{
		SampleApp g=new SampleApp();
		g.g1(100);
		g.g2("niit",40);

	}

}
