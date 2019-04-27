
interface I1
{
	int a=100;
	void get1(int a1,int b1);//only public or abstract Acess 
}
interface I2 //extends I1
{
	void get3();
}

class Demo implements I1,I2
{
	int a1,b1;
	public void get1(int a1,int b1)
	{
		this.a1=a1;
		this.b1=b1;
		System.out.println("Welcome to Interface"+a);
		System.out.println("Argument Passing to"+a1+""+b1);
	}
	public void get3()
	{
		System.out.println("Welcome to Interface3");
		System.out.println("Argument Passing to Interface3"+a1+""+b1);
	}
	void get2()
	{
		System.out.println("NormalMethod..");
	}
}

public class Sample {

	public static void main(String[] args) {
		
		
		Demo d1=new Demo();
		
		d1.get1(10,20);
		d1.get2();
		d1.get3();

	}

}
