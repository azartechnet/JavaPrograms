
public class Sample {

	void demo(int a1,int b1)
	{
		System.out.println("Your value is::"+a1+""+b1);
	}
	void demo(String name,int c1)
	{
		System.out.println("Your value is::"+name+""+c1);
	}
	public static void main(String[] args) {
		
		Sample d1=new Sample();
		d1.demo(100,200);
		d1.demo("Azar",23);

	}

}
