package dglpgpthread2;


class Demo extends Thread
{
	public void run()
	{
		System.out.println("CurrentThread"+currentThread().getName());
		System.out.println("CurrentPriority"+currentThread().getPriority());
	}
}


public class Sample {

	public static void main(String[] args) {
	
		Demo t1=new Demo();
		Demo t2=new Demo();
		t1.start();
		t2.start();
		t1.setName("NIIT");
		t1.setPriority(t1.MAX_PRIORITY);
		System.out.println("Thread is isAlive::"+t1.isAlive());
		System.out.println("Thread is Destory::"+t1.isInterrupted());
		System.out.println("After Thread isInterrupted::"+t1.isAlive());
	}

}
