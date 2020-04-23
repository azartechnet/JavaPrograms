package dglnewpgpthread4;

class Demo extends Thread
{
	synchronized void get1()throws InterruptedException
	{
		System.out.println("get1Inside");
		wait(10000);
		System.out.println("get1Outside");
	}
	synchronized void get2()
	{
		System.out.println("get2Inside");
		notify();
		System.out.println("get2Outside");
	}
}




public class Sample {

	public static void main(String[] args) throws InterruptedException {
		

		Demo t1=new Demo();
		t1.get1();
		t1.get2();
		
		
	}

}
