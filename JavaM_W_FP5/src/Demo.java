
public class Demo {
  int a=10,b=20,c;
	
	void get1()
	{
		c=a+b;
	}
	void get2()
	{
		System.out.println("Result is ::"+c);
	}
	public static void main(String[] args) {
		
		
		Demo d1=new Demo();
		d1.get1();
		d1.get2();

	}

}
