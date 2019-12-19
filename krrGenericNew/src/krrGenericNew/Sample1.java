package krrGenericNew;

class GenericMethod
{
//	public <T> T get1(T t)
//	{
//		return t;
//	}
	public <T> void get1(T t)
	{
		System.out.println(t);
	}
}





public class Sample1 {

	public static void main(String as[])
	{
		GenericMethod g1=new GenericMethod();
		
		//System.out.println(g1.get1(100));
		
		//System.out.println(g1.get1("niit"));
		
		g1.get1(100);
		
		g1.get1("niit");
	}
	
}
