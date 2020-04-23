package dglpgpthread;

class ThreadDemo extends Thread
{
	public void run()
	{
		System.out.println("Welcome to threadProcess");
		ThreadProcess1();
	}
	void ThreadProcess1()
	{
		System.out.println("Welcome to threadProcess-1");
	}
}


public class Sample {

	public static void main(String[] args)
	{
		
       ThreadDemo t1=new ThreadDemo();//to creating thread object for an thread class
       t1.start();//to starting a thread process
	}

}
