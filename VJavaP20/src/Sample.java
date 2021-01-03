

class Demo implements B1
{
	public void get1()
	{
		System.out.println("This get1 function..");
	}
	public void display()
	{
		System.out.println("This display function..");
	}
	void get2()
	{
		System.out.println("Hai");
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.display();
		f1.get2();

	}

}
