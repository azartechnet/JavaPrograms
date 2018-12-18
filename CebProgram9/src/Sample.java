
public class Sample 
{
	int a=100;
	void bmethod1()
	{
		System.out.println(""+a);
	}
}

class D extends Sample
{
	void dmethod1()
	{
		System.out.println(""+a);
	}
}



class Demo
{
	public static void main(String[] args) 
	{
		D g1=new D();
		g1.bmethod1();
		g1.dmethod1();

	}

}
