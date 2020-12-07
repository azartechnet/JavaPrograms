
public class Sample {
	
	void arithmatic()
	{
		int a=10,b=2;
		
		System.out.println("Add::"+(a+b));
		System.out.println("Sub::"+(a-b));
		System.out.println("Mul::"+(a*b));
	}
	void relation()
	{
		int a1=10,b1=20;
		System.out.println("Greater::"+(a1>b1));
		System.out.println("Lessthan::"+(a1<b1));
		System.out.println("EqualTo::"+(a1==b1));
	}

	public static void main(String[] args) {
		
		Sample d1=new Sample();
		//d1.arithmatic();
		d1.relation();
		
	}

}
