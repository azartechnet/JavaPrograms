
public class ThreadDemo extends Thread
{
	public void run()
	{
		System.out.println("threadmethod");
	}
}
class Demo
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadDemo t1=new ThreadDemo();
		t1.start();

	}

}
