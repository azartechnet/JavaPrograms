class Demo extends Thread
{
	public void run()
	{
		System.out.println("This is a Thread");
		process2();
	}
	void process2()
	{
		System.out.println("This is a Process2");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.start();

	}

}
