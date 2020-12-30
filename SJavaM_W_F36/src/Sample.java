class Demo extends Thread
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
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.start();//To start the thread
		Demo t2=new Demo();
		t2.start();

	}

}
