package newpgpgenericclass;

class Sample<A>
{
	private A a;
	
	void get1(A a)
	{
		this.a=a;
	}
	A display()
	{
		//System.out.println(a);
		return a;
	}
}



public class Demo {

	public static void main(String[] args) {
		
		Sample<Integer>g1=new Sample<Integer>();
		g1.get1(100);
		System.out.println(g1.display());
		//g1.display();
		Sample<String>g2=new Sample<String>();
		g2.get1("niit");
		//g2.display();
		System.out.println(g2.display());

	}

}
