
//To identified the to create Multiple thread 
class Demo extends Thread
{
   public void run()
   {
	   System.out.println("CurrentThreadName"+currentThread().getName());
   }
}
public class Foo {

	public static void main(String[] args) {
		
		
		Demo t1=new Demo();
		Demo t2=new Demo();
		t1.start();
		t1.setName("Mohamed");
		t2.start();

	}

}
