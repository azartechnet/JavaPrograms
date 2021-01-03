class Demo
{
	void get1(int a1,int b2)
	{
		System.out.println(""+a1+""+b2);
	}
	void get1(String name)
	{
		System.out.println(""+name);
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1("Azar");
		f1.get1(100,200);

	}

}
