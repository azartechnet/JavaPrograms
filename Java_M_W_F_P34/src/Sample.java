class Demo extends Thread
{
	public void run()
	{
		System.out.println("Run the thread method.."+Thread.currentThread().getName());
		System.out.println("Your Priority::"+Thread.currentThread().getPriority());
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Demo t2=new Demo();
		t1.setName("azar");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
	    t2.start();

	}

}


