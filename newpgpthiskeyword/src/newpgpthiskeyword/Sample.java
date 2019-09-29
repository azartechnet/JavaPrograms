package newpgpthiskeyword;
class A
{

	int n1;
	String n2;
	void g1(int n1,String n2)
	{
		this.n1=n1;
		this.n2=n2;
		System.out.println("String"+n1+" "+n2);
	}
	void g2()
	{
		System.out.println(n1+""+n2);
	}
	
}
public class Sample {

	public static void main(String[] args) {
		
		A f1=new A();
		f1.g1(10,"niit");
		f1.g2();

	}

}
