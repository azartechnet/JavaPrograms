class Demo implements Runnable
{
	public void run()
	{
		System.out.println("Run the thread method.."+Thread.currentThread());
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo d1=new Demo();
		Thread t1=new Thread(d1);
	    Thread t2=new Thread(d1);
		t1.start();
	    t2.start();

	}

}
