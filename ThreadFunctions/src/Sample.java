
public class Sample implements Runnable
{

	
	public void run()
	{
		System.out.println("Welcome to Thread Method..");
	}
	
	void get()
	{
		System.out.println("welcome to process..");
	}
	
	public static void main(String[] args) 
	{
		
		Sample obj1=new Sample();
		Sample obj2=new Sample();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
		obj1.get();

	}

}
