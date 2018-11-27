import javax.swing.text.html.HTMLDocument.Iterator;

public class Demo extends Thread 
{ 
  @Override
public void run() 
{
   System.out.println("Current ThreadName:"+Thread.currentThread().getName());
   System.out.println("Current ThreadPriority:"+getPriority());
} 
  void get1()throws InterruptedException
  {
	  Thread.sleep(3000);
	  System.out.println("welcome normal method..");
  }
}

class Sample
{
	public static void main(String[] args) throws InterruptedException
	{
		Demo t1=new Demo();
		t1.start();
		Demo t2=new Demo();
		t2.start();
		//t2.stop();
		t1.setName("niit");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.get1();

	}

}
