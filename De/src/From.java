
public class From 
{
	int x=100;//class or instant variable
	public void get1()
	{
		String uname="niit";//local variable
		System.out.println("Method-1"+x+""+uname);
	}
	public void get2()
	{
		System.out.println("Method-2"+x);
	}
	public static void main(String df[]) 
	{
		System.out.println("welcome to niit");
		
		From g1=new From();
		g1.get1();
		g1.get2();

	}

}
