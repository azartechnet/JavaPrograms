
interface B
{
   int a=200;
	
    void g1();
    
    
	
}
interface A extends B
{
	void g2();
}
 class Sample implements A
{
	public void g1()
	{
		System.out.println("Welcome to NIIT-1"+a);
	}

	public void g2()
	{
		
		System.out.println("Welcome to NIIT-2"+a);
	}
}




public class Demo {

	public static void main(String[] args)
	{
		Sample h=new Sample();
		
		h.g1();
		h.g2();

	}

}
