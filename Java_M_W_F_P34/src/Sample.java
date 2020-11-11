class Demo extends Thread
{
	public void run()
	{
		System.out.println("Run the thread method.."+Thread.currentThread().getName());
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Demo t2=new Demo();
		t1.setName("azar");
		t1.start();
	    t2.start();

	}

}


