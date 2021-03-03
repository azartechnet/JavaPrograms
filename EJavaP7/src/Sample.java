class Demo
{
	void ArithmeticOperators()
	{
		int a=10,b=2;
		System.out.println("Add is::"+(a+b));
		System.out.println("Sub is::"+(a-b));
		System.out.println("Div is::"+(a/b));
		System.out.println("Mul is::"+(a%b));
	}
	void AssigmentOperator()
	{
		int a1=10,b1=2;
		System.out.println("ComplexAdd::"+(a1+=b1));
	}
	void RelationOperator()
	{
		int a2=100,b2=50;
		System.out.println("Equal is::"+(a2==b2));
		System.out.println("Not Equal is::"+(a2!=b2));
		System.out.println("Lessthan is::"+(a2<b2));
		System.out.println("Greater than is::"+(a2>b2));
	}
	void LogicalOperator()
	{
		int a3=100,b3=50;
		System.out.println("LogicalAND::"+((a3>b3)&&(b3<a3)));
		System.out.println("LogicalOR::"+((a3<b3)||(b3<a3)));
		System.out.println("LogicalNOT::"+(!(a3>b3)));
	}
	void BitWiseOperator()
	{
		int a4=2,b4=3;
		System.out.println("BitWiseAnd::"+(a4&b4));
		System.out.println("BitWiseOr::"+(a4|b4));
		System.out.println("LeftShit::"+(a4<<1));
		System.out.println("RightShit::"+(a4>>4));
		System.out.println("XOR::"+(a4^b4));
	}
}


public class Sample {

	public static void main(String[] args) {
	
		Demo f1=new Demo();
		//f1.ArithmeticOperators();
        //f1.AssigmentOperator();
        //f1.RelationOperator();
        //f1.LogicalOperator();
        f1.BitWiseOperator();
	}

}
