
public class Sample 
{

	int a=100;//class variable
	void g1()
	{
		int b=300;//local variable
		System.out.println("welcome"+a+"****"+b);
	}
	void g2()
	{
		
		
		System.out.println("noted"+a);
	}
}
class Demo1
{
	
	public static void main(String dd[])
	{
		Sample g1=new Sample();//object created
		g1.g1();
		g1.g2();

	}

}
