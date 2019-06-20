abstract class AmountCredit
{
	abstract void credit();
	
	
}
abstract class AmountDebit
{
	
	abstract void debit();
	
}

class Demo1 extends AmountCredit
{
	public void credit()
	{
		System.out.println("welcome to credit");
	}

	
}
class Demo2 extends AmountDebit
{
	public void debit()
	{
		System.out.println("welcome to debit");
	}

	
}
 class SampleApp2 
 {

	public static void main(String[] args) 
	{
	
		AmountCredit f1=new Demo1();//factory method
		f1.credit();
		AmountDebit f2=new Demo2();//factory method
		f2.debit();

	}

}
