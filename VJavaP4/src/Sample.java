
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
    void logical()
    {
    	int a2=10,b2=30;
    	System.out.println("LogicalAND::"+((a2<b2)&&(b2>a2)));
    	System.out.println("LogicalOR::"+((a2<b2)||(b2<a2)));
    	System.out.println("LogicalNOT::"+!(a2<b2));
    }
    void bitwise()
    {
    	int a=2,b=3;
    	System.out.println("BitWiseAND::"+(a&b));
    	System.out.println("BitWiseOR::"+(a|b));
    	System.out.println("Compls::"+(~a));
    	System.out.println("XOR::"+(a^b));
    }
    void shiftOperator()
    {
    	int h1=1;
    	System.out.println("Leftshift::"+(h1<<1));
    	System.out.println("RightShit::"+(h1>>1));
    }
	public static void main(String[] args) {
		
		Sample d1=new Sample();
		//d1.arithmatic();
		//d1.relation();
		//d1.logical();
		//d1.bitwise();
		//d1.shiftOperator();
		
	}

}
