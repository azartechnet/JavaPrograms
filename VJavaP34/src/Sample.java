
public class Sample implements Runnable
{
	
	public void run()
	{
		System.out.println("This is thread method");
	}

	public static void main(String[] args) {
		
		Sample f1=new Sample();
	    Thread t1=new Thread(f1);
	    t1.start();

	}

}
