
public class Demo 
{
public void get1(int a, int b)
{
	System.out.println(a+""+b);
}
public void get1(String s1, int b1)
{
	System.out.println(s1+""+b1);
}
public void get1(int u1,int v1, int z1)
{
	System.out.println(u1+""+v1+""+z1);
}
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.get1(1, 2, 3);
		d.get1(100, 300);
		d.get1("hello", 100);
		
	
	}

}
