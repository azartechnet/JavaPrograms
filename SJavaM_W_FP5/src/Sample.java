
public class Sample {

	void arithmeticOperators()
	{
		int a=20,b=5;
		System.out.println("Addition::"+(a+b));
		System.out.println("Multiplcation::"+(a*b));
		System.out.println("Module::"+(a%b));
		
	}
	void relationalOperator()
	{
		int a=20,b=3;
		System.out.println("Lessthan::"+(a<b));
		System.out.println("Greaterthan::"+(a>b));
		System.out.println("Equal::"+(a==b));
	}
	void logicalOperator()
	{
		int a=40,b=2;
		System.out.println("LogicalAND"+((a>b)&&(b<a)));
		System.out.println("LogicalOR"+((a>b)||(b>a)));
		System.out.println("LogicalNOT"+(!(a>b)));
	}
	void bitwiseOperator()
	{
		int a=2,b=3;
		System.out.println("BitwiseAND"+(a&b));
		System.out.println("BitWiseOR"+(a|b));
	}
	public static void main(String[] args) {
		
		Sample d1=new Sample();
		//d1.arithmeticOperators();
        //d1.relationalOperator();
        //d1.logicalOperator();
        d1.bitwiseOperator();
	}

}
