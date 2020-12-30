class Demo2 implements Runnable
{
  public void run()//process1
  {
	
		  for(int i=0;i<=2;i++)
		  {
			  System.out.println("I value is::"+i);
		  }
		  process1();
  }
  public void process1()
  {
	  System.out.println("Process-1 is Calling..");
  }
  
}
public class Demo1 {

	public static void main(String[] args) {
		
		Demo2 t1=new Demo2();
		Thread s1=new Thread(t1);
		s1.start();//To start the thread
		
		Demo2 t2=new Demo2();
		Thread s2=new Thread(t2);
		s2.start();

	}

}

